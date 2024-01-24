package devmaster.edu.vn.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class SearchAccount
 */
public class SearchAccount extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchAccount() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

protected void doPost(HttpServletRequest request,
HttpServletResponse response) throws ServletException,
I0Exception {
          response.setContentType(CONTENT_TYPE);
          PrintWriter out = response.getWriter(); // Write to client
                  //Lấy dū liêu khi submit form từ UserAccount
          String phone request.getParameter("Phone");
          out.println("<html><head><meta charset='UTF-8'>title>InputForm</title/head>");
          out.println("body style= 'text-align:center'>");
          out.println("<h1> KÊT QUÁ TÌM KIÉM </h1>");
          out.printIn("<form action= 'SearchAccount'method= 'post'>");
          out.println("<p> Input phone: ");
          out.printIn("input type=text name= 'phone' value="
+ phone + ",/"");
          out.print1n("<p> <input type='submit'
value= 'Search' />");
          out.printIn("(form)");

