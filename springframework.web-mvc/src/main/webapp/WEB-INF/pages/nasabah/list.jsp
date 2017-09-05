<%--
  Created by IntelliJ IDEA.
  User: dimmaryanto93
  Date: 04/09/17
  Time: 13:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Daftar Nasabah</title>
</head>
<body>

<h2>Daftar Nasabah</h2>
<hr/>
<a href="${pageContext.servletContext.contextPath}/nasabah/new">Tambah</a>
<hr/>
<table>
    <thead>
    <tr>
        <td>Nomor Register</td>
        <td>Nama Nasabah</td>
        <td>Jenis Kelamin</td>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${listOfNasabah}" var="nasabah">
        <tr>
            <td>${nasabah.nomorRegister}</td>
            <td>${nasabah.nama}</td>
            <td>${nasabah.jenisKelamin}</td>
            <td>
                <form action="${pageContext.servletContext.contextPath}/nasabah/remove" method="post">
                    <input type="hidden" name="nomorRegister" value="${nasabah.nomorRegister}"/>
                    <button type="submit" value="Hapus">Hapus</button>
                </form>
                &nbsp;
                <a href="${pageContext.servletContext.contextPath}/nasabah/update?nomorRegister=${nasabah.nomorRegister}">Update</a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>

</body>
</html>
