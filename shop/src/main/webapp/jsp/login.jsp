
<%@ page contentType="text/html;charset=UTF-8" language="java"  pageEncoding="utf-8" %>
<html>
<head>
    <title>login</title>
</head>
<body>
<div align="center"> <h1>登录系统</h1></div><br/><br/>
<form action="${pageContext.request.contextPath}/login.action" method="get" >
    <table align="center" border="2px">
        <tr>
            <td align="center" width="50%">用户名</td>
            <td align="center"><input type="text" name="username" ></td>

        </tr>
        <tr>
            <td align="center" width="50%">密码</td>
            <td align="center"><input type="password" name="password"></td>
        </tr>
    </table>
    <table align="center">
        <tr><td align="center" width="25%"><input type="submit" value="确认"  /></td>
            <td align="center" width="25%"><input type="reset" value="取消"/></td>
        </tr>
    </table>
</form>

</body>
</html>
