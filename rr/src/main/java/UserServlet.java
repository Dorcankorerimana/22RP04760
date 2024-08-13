
import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/saveUser")
public class UserServlet extends HttpServlet {
  
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        String userInput = request.getParameter("userInput");
        

        Cookie dorcasnkoreriman = new Cookie("userInfo", userInput);
        dorcasnkoreriman .setMaxAge(60*60*24*7); // Set cookie to expire in one week
        response.addCookie(dorcasnkoreriman );
        
        // Redirect back to the index.jsp page
        response.sendRedirect("work.jsp");
    }
}
