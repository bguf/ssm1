<%--
  Created by IntelliJ IDEA.
  User: bguf
  Date: 2020/11/19
  Time: 10:45 上午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html >
<title>登录</title>
<script src="js/jquery-1.8.3.js"></script>
<body>
    <h3>${hello}</h3>
    <form method="post">
        姓名：<input type="text" name="name"/><br>
        密码：<input type="password" name="pwd"/><br>
        <input type="button" value="提交" onclick="login()"/>
    </form>

    <script>
        function login()
        {
            $.post(
                "login",
                $("form").serialize(),
                function (obj)
                {
                    if (obj)
                    {
                        alert("登录成功");
                        location.href = "toAdd";
                    }
                    else
                    {
                        alert("登录失败");
                    }
                },
                "json");
        }
    </script>

</body>
</html>

