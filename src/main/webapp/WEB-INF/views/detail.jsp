<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>
<form action="/user/update/${user.id}" method="post">
<%--    <label>id</label>--%>
<%--    <input type="text" name="id" value="${user.id}" readonly>--%>
<%--    <br>--%>
    <label>name</label>
    <input type="text" name="name" value="${user.name}"> <br>
    <button type="submit">Update</button>
</form>
</body>
</html>