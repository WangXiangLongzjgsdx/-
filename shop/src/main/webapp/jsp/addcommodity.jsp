-%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<%@ taglib prefix="c" uri ="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <meta charset="UTF-8">
    <title>updateCategory</title>
</head>
<body>
<br/><!--[if IE]>

<![endif]-->
<br/>
<br/>
<br/>
<form action="${pageContext.request.contextPath}/addcommodity.action" method="get">
    <table align="center">
        <tr>
            <td align="center">编号：</td>
            <td align="center"><input type="text" name="number" ></td>
        </tr>
        <tr>
        <tr>
            <td align="center">名称：</td>
            <td align="center"><input type="text" name="name" ></td>
        </tr>
        <tr>
            <td align="center">类别：</td>
            <td align="center"><select name="category">
                <c:forEach items="${categorys}" var="category">
                    <option value="${category}">${category}</option>
                </c:forEach>
            </select></td>
        </tr>
        <tr>
        <tr>
            <td align="center">价格：</td>
            <td align="center"><input type="text" name="price" ></td>
        </tr>
        <tr>
        <tr>
            <td align="center">库存：</td>
            <td align="center"><input type="text" name="repertory" ></td>
        </tr>

        <tr>
            <td align="center"><input type="submit" value="确认"></td>
            <td align="center"><input type="reset" value="取消"></td>
        </tr>
    </table>
</form>
</body>
</html>


