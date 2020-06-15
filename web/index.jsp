<%--
  Created by IntelliJ IDEA.
  User: hurah
  Date: 6/15/2020
  Time: 2:25 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Product Discount Calculator</title>
  </head>
  <body>
  <h2>Product Discount Calculator</h2>
  <form method="post" action="${pageContext.request.contextPath}/display-discount">
    <input type="text" name="Product Description: " placeholder="Product name or series">
    <input type="text" name="List Price: " placeholder="Price">
    <input type="submit" id="submit" value="Calculate Discount ">
  </form>
  </body>
</html>
