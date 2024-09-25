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
<h2>Danh sach sinh vien </h2>

<table>
    <thead>
    <tr>
        <td>ID</td>
        <td>Name</td>
        <td>Address</td>
        <td>Age</td>
        <td>Status</td>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="sinhVien" items="${listSinhVien}">
        <tr>
            <td>${sinhVien.id}</td>
            <td>${sinhVien.name}</td>
            <td>${sinhVien.address}</td>
            <td>${sinhVien.age}</td>
            <td>${sinhVien.status}</td>
<%--            <td><a href="/detail/${user.id}">Detail</a></td>--%>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>