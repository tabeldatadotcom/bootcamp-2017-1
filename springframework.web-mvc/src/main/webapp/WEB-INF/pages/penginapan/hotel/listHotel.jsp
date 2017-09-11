<%--
  Created by IntelliJ IDEA.
  User: dimmaryanto93
  Date: 11/09/17
  Time: 13:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Daftar Hotel</title>
</head>
<body>

<table>
    <thead>
    <tr>
        <td>No.</td>
        <td>Nama</td>
        <td>Alamat</td>
        <td>Kota</td>
        <td>Jumlah Kamar</td>
        <td>Aksi</td>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${listOfHotels}" var="h" varStatus="index">
        <tr>
            <td>${index.count}</td>
            <td>${h.nama}</td>
            <td>${h.alamat}</td>
            <td>${h.kota}</td>
            <td>${h.listKamar.size()}</td>
            <td>
                <a href="${pageContext.servletContext.contextPath}/kamar/new?id_hotel=${h.id}">Tambah Kamar</a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>

</body>
</html>
