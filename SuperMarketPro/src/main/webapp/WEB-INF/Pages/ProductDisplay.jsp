<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@include file="Header.jsp"%>
 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 <c:forEach items="${productList}" var="product">
 <div class="row">
    <div class="col-sm-6 col-md-4">
        <div class="thumbnail">
        <h4> 
         Post Thumbnail List <span class="label label-info info"> 
           <span data-toggle="tooltip" title="Bootstrap version">3.0.3
           </span>
        </h4>
        <img src="<c:url value="webapp/images/${product.productId}.jpg"/>" width="150" height="150"
        alt="Image not Supported"> 
        <a href="/totalProductInfo/${product.productId}" > click for large</a>
        <div class="clearfix"></div>
    </div>
 </div>
</c:forEach>
</body>
</html> --%>
<html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<head>
<%@ include file="Header.jsp" %>
<!-- <link
	href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<script
	src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script
	src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
 -->	<link rel="stylesheet" href="<c:url value="resources/css/productdisplay.css"></c:url>">
</head>
<body>

<c:forEach items="${productList}" var="product">
	<div class="col-md-3">
		<figure class="card card-product">
			<div class="img-wrap">
				<img src="<c:url value="/resources/images/${product.productId}.jpg"/>">
			
			</div>
			<figcaption class="info-wrap">
				<h6 class="title text-dots">
					${product.productName}
					${product.productDesc}
				</h6>
				<div class="action-wrap">
					<a href="totalProductInfo/${product.productId}" class="btn btn-primary btn-sm float-right"> View Product </a>
					<div class="price-wrap h5">
						Rs.${product.price}
					</div>
					<!-- price-wra
				</div>
				<!-- action-wrap -->
			</figcaption>
		</figure>
	</div>
</c:forEach>
</body>

</html>