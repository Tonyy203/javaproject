<%@ page language= "java" contentType="text/html; charset=UTF-8"
  pageEncoding= "UTF-8"%>
< !DOCTYPE html>
<html>
   <head>
      <meta charset= "UTF-8">
      <title>Home Page</title>
      <link href=beta1/dist/css/bootstrap.min.css" rel= "stylesheet">
   </head>
   <body>
           <jsp:include page="_header.jsp"></jsp:include>
           <jsp:include page="_navTop.jsp"></jsp:include>
           <section class= "container border my-2"_style="min-height:150px">
                 <h1 class="text-center my-5">
                       Welcome to HOMEPAGE
                 </h1>
           </section>
           <jsp:include page="_footer.jsp"></jsp:include>
   </body>
 </html>
