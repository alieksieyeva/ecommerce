<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>home</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
</head>
<body>
	<div class="container-fluid p-0">
	  	<div class="row">
	    <img src= "https://static.vecteezy.com/system/resources/thumbnails/002/006/605/small/paper-art-shopping-online-on-smartphone-and-new-buy-sale-promotion-pink-backgroud-for-banner-market-ecommerce-free-vector.jpg"/>
	 	</div>
	 	<div class="row" id= "colonna">
		    <div class="col-6" > 
		    <c:forEach var="item" items="${items}">
		    	<p class="text-light bg-dark fs-4" style="padding-left:15px; margin-left:15px;">	${item.getName()} <span style="float:right; padding-right:10px"> ${item.getCost()} &euro; </span></p>
		    	<a style="margin-bottom:20px; margin-left:15px;" href="/addtocart?id=${item.getId()}&copies=1" class="btn btn-primary" onclick="alert('aggiunto al carrello');">Aggiungi al carrello </a> <br/>
		    </c:forEach>
		    
		    
		    </div>
		</div>
	</div>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
</body>
</html>