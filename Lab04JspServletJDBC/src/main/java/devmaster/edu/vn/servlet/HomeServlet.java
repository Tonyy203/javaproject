package devmaster.edu.vn.servlet;

import javax.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/home")
public class HomeServlet extends HttpServlet {
     private static final long serialVersionUID = 1L;
     
    public HomeServlet() {
       super();
    }
     protected void doGet (HttpServletRequest request , 
HttpServletResponse response)
     				throws ServletException, IOException {
          RequestDispatcher disServletContext =
          this.getServletContext().getRequestDispatcher("/WEB-INF/views/homeView.jsp");
                                            
          dispatcher.forward(reqquest, response);
     }
     protexted void doPost(HttpServletResponse request,
HttpServletResponse protected response)
                throws ServletException, IOException {
          doGet (request, response);
     }
}
