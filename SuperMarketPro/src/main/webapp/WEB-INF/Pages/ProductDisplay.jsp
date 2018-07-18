<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@include file="Header.jsp"%>
 <c:forEach items="${productList}" var="product">
 <div class="row">
    <div class="col-sm-6 col-md-4">
        <div class="thumbnail">
        <h4> 
         Post Thumbnail List <span class="label label-info info"> 
           <span data-toggle="tooltip" title="Bootstrap version">3.0.3
           </span>
        </h4>
        <img src="<c:url value="//webapp//images//${product.productId}.jpg"/>" width="150" height="150"
        alt="Image not Supported"> 
        <a href="/totalProductInfo/${product.productId}" > click for large</a>
        <div class="clearfix"></div>
    </div>
 </div>
</c:forEach>
</body>
</html>