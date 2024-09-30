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
<form action="/sinh-vien/add" method="post">
    <label>name</label>
    <input type="text" name="name"><br>
    <label>address</label>
    <input type="text" name="address"><br>
    <label>age</label>
    <input type="text" name="age"><br>
    <label>class</label>
    <select name="lopHoc" id="">
        <c:forEach var="lop" items="${listClass}">
            <option value="${lop.id}">${lop.className}</option>
        </c:forEach>

    </select><br>
    <label>status</label>
    <input type="radio" name="status" value="active">active
    <input type="radio" name="status" value="inactive">inactive <br>
    <button type="submit">Add</button>

</form>
<table>
    <thead>
    <tr>
        <td>ID</td>
        <td>Name</td>
        <td>Address</td>
        <td>Age</td>
        <td>Status</td>
        <td>Class name</td>
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
            <td>${sinhVien.lopHoc.className}</td>
                <%--            <td><a href="/detail/${user.id}">Detail</a></td>--%>
            <td><a href="/delete/${sinhVien.id}">Delete</a></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>