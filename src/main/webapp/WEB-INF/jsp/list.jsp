<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<%@ page  isELIgnored="false"%>
<%request.setAttribute("pn", pageContext.getServletContext().getContextPath());%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>商品信息</title>
</head>
<body>
<table border="1" cellpadding="10" cellspacing="0">
    <thead>
    <caption><h1>商品管理</h1></caption>
    <tr>
        <th>名称</th>
        <th>价格</th>
        <th>生产日期</th>
        <th><a href="${pn }/goods/toAdd">添加</a></th>
        <th colspan="2">操作</th>
    </tr>
    </thead>
    <c:forEach items="${list }" var="map">
        <tr>
            <td>${map.name }</td>
            <td>${map.price }</td>
            <td><fmt:formatDate value='${map.makedate }' pattern='yyyy-MM-dd' /> </td>
            <td><a href="${pn }/goods/toUpdate?id=${map.id }">修改</a></td>
            <td><a href="JavaScript:void(0)" onclick="showDelete(${map.id })">删除</a></td>
        </tr>
    </c:forEach>
</table>
<script type="text/javascript">
    function showDelete(id) {
        var flag = confirm("确定要删除么？");
        if (flag) {
            location.href = "${pn }/goods/delete?id=" + id;
        }
    }
</script>
</body>
</html>