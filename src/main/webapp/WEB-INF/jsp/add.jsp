<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page  isELIgnored="false"%>
<%request.setAttribute("pn", pageContext.getServletContext().getContextPath());%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>添加商品信息</title>
</head>
<body>
<h2>添加商品信息</h2>
<form action="${pn }/goods/add" method="post">
    <table class="table table-hover">
        <tr>
            <td>商品名称</td>
            <td><input type="text" name="name"/></td>
        </tr>
        <tr>
            <td>商品价格</td>
            <td><input type="number" name="price"/></td>
        </tr>
        <tr>
            <td>生产日期</td>
            <td><input type="date" name="makedate"/></td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="添加"/>
            </td>
        </tr>
    </table>
</form>
</body>
</html>