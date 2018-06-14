
<%@ page contentType="text/html;charset=UTF-8" language="java"  pageEncoding="utf-8" %>
<html>
<head>
    <meta charset="UTF-8">
    <title></title>
</head>
<frameset rows="20%,80%" >
    <frame src="${pageContext.request.contextPath}/tohead.action" />
    <frameset cols="20%,80%">
        <frame src="${pageContext.request.contextPath}/tobody.action" />
        <frame name="right" src="${pageContext.request.contextPath}/tocategory.action"  />
    </frameset>
</frameset>
</html>

