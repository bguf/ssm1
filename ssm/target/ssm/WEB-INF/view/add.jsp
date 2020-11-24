<%--
  Created by IntelliJ IDEA.
  User: bguf
  Date: 2020/11/23
  Time: 9:12 上午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>交税</title>
    <script src="js/jquery-1.8.3.js"></script>
</head>
<body>
    <form action="add" method="post" enctype="multipart/form-data">
        姓名： ${user.name}<br>
        <input type="hidden" name="uid" value="${user.id}">
        交税金额：
        <input type="text" name="money"><br>
        交税截图：
        <input type="file" name="_multipartFile"><br>
        <input type="submit" value="提交">
    </form>

<%--    <script>
        function tollage()
        {
            $.post(
                "add",
                $("form").serialize(),
                function (obj)
                {
                    if (obj)
                    {
                        alert("交税成功");
                        location.href = "list";
                    }
                    else
                    {
                        alert("交税失败");
                    }
                },
                "json");
        }
    </script>--%>
</body>
</html>
