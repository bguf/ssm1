<%--
  Created by IntelliJ IDEA.
  User: bguf
  Date: 2020/11/20
  Time: 4:24 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>日志表</title>
</head>
<body>
    <table border="1" style="border-collapse:collapse;border-spacing:0;">
        <thead>
            <tr>
                <td>编号</td>
                <td>日志信息</td>
                <td>时间戳</td>
                <td>用户信息</td>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="log" items="${logs}" varStatus="status">
                <tr>
                    <td>${status.count}</td>
                    <td>${log.type}</td>
                    <td>${log.date}</td>
                    <td>${user.name}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>
