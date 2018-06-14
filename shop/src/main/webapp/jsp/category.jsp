
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <meta charset="UTF-8">
    <title></title>
</head>
<body>
<br />
<br />
<br />
<table align="center" border="2px">
    <tr>
        <td align="center" width="100px">编号</td>
        <td align="center" width="100px">名称</td>
        <td align="center" width="200px">操作</td>
    </tr>

    <c:forEach items="${ categorys }" var="category">
        <tr>
            <td align="center"> ${category.number }</td>
            <td align="center"> ${category.name }</td>
            <td align="center"> <span><a href="${pageContext.request.contextPath}/toupdatecategory.action?id=${category.id}" >修改</a> </span>
            <span><a href="${pageContext.request.contextPath}/deletecategory.action?id=${category.id}">删除</a></span>
            </td>
        </tr>
    </c:forEach>

</table>
</body>
</html>

