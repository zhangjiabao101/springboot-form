<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ page  isELIgnored="false"%>
<%request.setAttribute("pn", pageContext.getServletContext().getContextPath());%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>修改商品信息</title>
</head>
<body>
<h2>修改商品信息</h2>
<form action="${pn }/goods/update?id=${goods.id}" method="post">
    <table class="table table-hover">
        <tr>
            <td>商品名称</td>
            <td><input type="text" name="name" value="${goods.name }"/></td>
        </tr>
        <tr>
            <td>商品价格</td>
            <td><input type="number" name="price" value="${goods.price }"/></td>
        </tr>
        <tr>
            <td>生产日期</td>
            <td><input type="date" name="makedate" value="${goods.makedate}"/></td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="修改"/>
            </td>
        </tr>
    </table>
</form>
</body>
</html>