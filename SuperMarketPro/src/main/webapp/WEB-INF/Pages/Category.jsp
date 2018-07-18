<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@include file="Header.jsp"%> 
 <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %> 
 
<html>
<form action="InsertCategory" method="post">
<table align="center">
  <tr>
        <td>Category Name</td>
        <td><input type="text" name="cname"/></td>
  </tr>
  <tr>
        <td>Category Description</td>
        <td><input type="text" name="catdesc"/></td>
  </tr>
  <tr>
        <td colspan="2">
            <center> 
              <input type="submit" value="Insert Category"/>
             </center>
        </td>
  </tr>
</table>
</form>

<table align="center">
<tr bgcolor="pink">
<td>Category Id</td>
<td>Category Name</td>
<td>Category Description</td>
<td>Operation</td>
</tr>
<c:forEach items="${categorylist}" var="category">
<tr>
<td>${category.categoryid}</td>
<td>${category.categoryname}</td>
<td>${category.categorydesc}</td>
    <td>
    <a href="<c:url value='/deleteCategory/${category.categoryid}'/>">Delete</a>
    <a href="<c:url value='/editCategory/${category.categoryid}'/>">Edit</a>
    </td>
</tr>
</c:forEach>
</table>
</html>