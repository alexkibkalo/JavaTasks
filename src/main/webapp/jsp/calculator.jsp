<%@ page contentType="text/html; charset=UTF-8" %>
<html>
<head><title>Calculator</title>
</head>
<body>
<h1>Calculator</h1>
<form action="/calculator" method="POST">
    <input name="num1" type="text"/>
    <select name="operation" id="operation">
        <option selected>+</option>
        <option>-</option>
        <option>/</option>
        <option>*</option>
    </select>
    <input name="num2" type="text"/>
    <button type="submit" id="res">solve</button>
</form>
</body>
</html>
