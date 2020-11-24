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
    <title>税表</title>
    <script src="js/jquery-1.8.3.js"></script>
</head>
<body>
    <form action="list" method="post">
        日期：
        <input type="text" name="date1" value="${tax.date1}"> - <input type="text" name="date2" value="${tax.date2}"> <br>
        金额：
        <input type="number" name="money1" value="${tax.money1}"> - <input type="number" name="money2" value="${tax.money2}">
        &emsp;
        <input type="submit" value="查询">
        &emsp;
        <input type="button" onclick="add()" value="添加">
        &emsp;
        <input type="button" onclick="loglist()" value="日志列表"><br>
    </form>

    <table border="1" style="border-collapse:collapse;border-spacing:0;">
        <thead>
            <tr>
                <td>编号</td>
                <td>姓名</td>
                <td>金额</td>
                <td>日期</td>
                <td>交税证明</td>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="tax" items="${taxs}" varStatus="status">
            <tr>
                    <td>${status.count}</td>
                    <td>${user.name}</td>
                    <td>${tax.money}</td>
                    <td><fmt:formatDate value="${tax.date}" type="both" pattern="yyyy-MM-dd HH:mm:ss"/></td>
                    <td><img src="${tax.imgurl}" height="30px" width="30px"></td>
            </tr>
            </c:forEach>
        </tbody>
    </table>

    <script>
        function add()
        {
            location.href = "toAdd";
        }

        function loglist()
        {
            location.href = "loglist";
        }
    </script>
</body>
</html>
