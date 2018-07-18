<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@include file="Header.jsp"%> 
 <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

 
 <form:form action="UpdateProduct" modelAttribute="product" method="post">
 
 <table align="center" cellspacing="3">
 <tr bgcolor="pink">
       <td> Product Name </td>
       <td> <form:input path="productName"/></td>
 </tr>
 <tr>
        <td> Product Description </td>
        <td> <form:input path="ProductDesc"/> </td>
 </tr>
 <tr>
        <td> Price </td>
        <td> <from:input path="price"/> </td>
 </tr>
 <tr>
        <td> Stock </td>
        <td> <form:input path="stock"/> </td>
 </tr>
 <tr>
        <td> Category </td>
        <td>
           <form:select path="categoryId">
             <form:option value="0" label="--Select List--"/>
             <form:options items="${categoryist}"/>
            </form:select>
          </td> 
 </tr>
 <tr>
        <td> Supplier </td>
        <td> <form:input path="supplierId"/> </td>
 </tr>
 </table>
 </form:form>