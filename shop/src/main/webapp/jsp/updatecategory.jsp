
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
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
<form action="${pageContext.request.contextPath}/updatecategory.action" method="get">
    <table align="center">
        <tr >
            <td align="center" width="50%"><input type="hidden" name="id" value="${id}"></td>
        </tr>
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
            <td align="center"><input type="submit" value="确认"></td>
            <td align="center"><input type="reset" value="取消"></td>
        </tr>
    </table>
</form>
</body>
</html>
