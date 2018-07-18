<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<div class="container">
   <table class="table" border="1">
        <tr>
           <td rowspan="9">
                <img src="<c:url value="C:\Users\hp\workspace\SuperMarketPro\src\main\webapp\images\${product.productId}.jpg"/>" />
           </td>
        </tr>
        <tr>
           <td>Product Id</td>
           <td>${product.productId}</td>
        </tr>
        <tr>
           <td>Product Name</td>
           <td>${product.productName}</td>
        </tr>
        <tr>
           <td>Price</td>
           <td>${product.price}</td>
        </tr>
        <tr>
           <td>Supplier Id</td>
           <td>${product.supplierId}</td>
        </tr>
        <tr>
           <td>Stock</td>
           <td>${product.stock}</td>
        </tr>
        <tr> 
           <td>Quantity</td>
           <td>
           <select name="quantity" class="form-control btn-block">
               <option value="1">1</option>
               <option value="2">2</option>
               <option value="3">3</option>
               <option value="4">4</option>
               <option value="5">5</option>
           </select>
           </td>
        </tr>
        <tr>
             <td colspan="2">
             <input type="submit" value="AddToCart" class="btn btn-info btn-block"/>
   </table>
</div>

</body>
</html>