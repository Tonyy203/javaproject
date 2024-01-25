package devmaster.edu.vn.servlet;

import java.io.I0Exception;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.servletException;
import javax.servlet.annotation.WebServlet;
import javax.serviet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import devmaster.edu.vn.beans.Product;
import devmaster.edu.vn.conn.ConnectionUtils;
import devmaster.edu.vn.utils.ProductUtils;

@WebServlet("/productlist")
public class ProductlistServlet extends HttpServlet {
     private static final long serialVersionUID = 1L;
     public ProductlistServlet() {
          super();
     }
     protected void doGet (HttpServletRequest request,
HttpServletResponse response)
    		          throws ServletException, I0Exception {
    		       Connection conn=null;
    		       String errorString = null;
    		       List<Product> list = null;
    		       try {
    		            conn = ConnectionUtils.getMSSQLConnection();
    		             try {
    		                  list = ProductUtils.queryProduct(conn);
    		             } catch (SQLException e) {
    		                  e.printStackTrace();
    		                  errorString = e.getMessage();
    		             }
    		             
    		             request.setAttribute("errorstring", errorString);
    		             request.setAttribute("productist", list);
    		             
    		             RequestDispatcher dispatcher = request.getServletContext()
    		            		 .getRequestDispatcher("/WEB-INF/views/productlist.jsp");
    		             dispatcher.forward(request, response);
    	           } catch (ClassNotFoundException | SQLException e1) {
    	        	   el. printStackTrace();
    	        	   errorString = e1.getMessage();
    	        	   RequestDispatcher dispatcher = request.getServletContext()
    	        	              .getRequestDispatcher("/WEB-INF/views/request.jsp");
    	        	   request.setAttribute("errorstring", errorString);
    	        	   dispatcher.forward(request, response);
    	           }
     }
     protected void doPost(HttpServletRequest request, HttpServletResponse response)
    		            throws ServletException, I0Exception {
    		       // TODO Auto-generated method stub
    		       doGet(request, response);
     }
}


     
