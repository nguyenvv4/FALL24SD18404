<!doctype html>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>
<h2>Danh sach User </h2>
<form:form action="/user/add" method="post" modelAttribute="user">
    <label>id</label>
    <form:input type="text" path="id"/> <br>
    <label>name</label>
    <form:input type="text" path="name"/>
    <form:errors path="name"></form:errors>
    <button type="submit">Add</button>
</form:form>
<table>
    <thead>
    <tr>
        <td>ID</td>
        <td>Name</td>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="user" items="${listUser}">
        <tr>
            <td>${user.id}</td>
            <td>${user.name}</td>
            <td><a href="/detail/${user.id}">Detail</a></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>