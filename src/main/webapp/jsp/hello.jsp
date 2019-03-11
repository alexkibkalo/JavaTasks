<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hello</title>
</head>
<body>
    <h1>Hello from Spring!</h1>
    <form action="/hello" method="post">
        <input type="text" name="name">
        <input type="submit" name="btn" value="send">
    </form>
</body>
</html>
