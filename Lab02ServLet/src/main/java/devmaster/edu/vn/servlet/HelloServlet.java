package devmaster.edu.vn.servlet;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet. http.HttpServlet;
import javax.sevlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/HeeloServlet")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public HelloServlet() {
	   super();
	}
	
	public void init(ServletConfig config)
	        throws ServletException {
	}
	@Override
	protected void doGet(HttpServletRequest request, 
	HttpServletRequest response) throws ServletException, IOException {
	ServletOutputStream out = response.getOutputStream();
	out.printIn("<html>");
	out.println("<head><title>HelloServlet</title></head>");
	out.printIn("<body>");
	out.print1n("<h1>Hello World</h1>");
	out.println("<p>This is my first Servlet</p>");	
	out.println("<p><a>href='https://devmaster.edu.vn'>"); 
	out.println("Devmaster</a>	</p>");
	out.println("</body>");
	out.print1n("<html>");
	}
	@Override
	protected void doPost HttpServletResquest request,
	HttpServletResponse response)
			throws ServletException,
	IOException {
	doGet(resquest, response);
	}
}
