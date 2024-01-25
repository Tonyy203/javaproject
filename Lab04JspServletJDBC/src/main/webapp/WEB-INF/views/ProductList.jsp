<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding= "UTF-8"%>
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset= "UTF-8">
    <title>Product List</title>
    <link href="https://cdm.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="styLesheet">
</head>
<body>
   <jsp:include page="_header.jsp/jsp"></jsp:include> 
   <jsp:include page="_header.jsp/jsp"></jsp:include> 
   
    <section class= "container">
         <h3>Product List</h3>
        <р style="color:red;">${errorString}</р>
        <table class="table table-bordered">
           <thead style="background:#f1f1f1">
                 <tr>
                 <th>Cade</th>
                 <th>Name</th>
                 <th>Price</th>
                 <th>Edit</th>
                 <th>Delete</th>
                 </tr>
           </thead>
           <tbody>
			<c:forEach items="${productlist}" var="product">
                    <tr>
                       <td>${product.code}</td>
                       <td>${product.name}</td>
                       <td>${product.price}</td>
                       <td>
						<a
href= "productEdit?code$(product.code}">Edit</a>
					   </td>
					   <td>
 					   <a
href= "productDelete?code=${product.code} ">Delete</a>
					</td>
					</tr>
					</c:forEach>
</tbody>
</table>
	<a href= "productCreate" >Create Product</a>
</section>
<jsp:include page="_footer.jsp"></jsp:include>
</body>
</html>