<%--
  Created by IntelliJ IDEA.
  User: dimmaryanto93
  Date: 31/08/17
  Time: 10:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
</head>
<body>

<%--Scriptlet--%>
<%
    Integer bil1, bil2;
    bil1 = 10;
    bil2 = 20;

    out.println("bil1 : " + bil1 + ", bil2: " + bil2);
    Integer hasil = bil1 * bil2;
    out.println("bil1 * bil2 = " + (bil1 * bil2));

    for (int i = 0; i < 100; i++) {
        out.print(i);
    }
%>

<%--JSTL--%>
<c:out value="Halo Saya dari JSTL!!!"/>

<c:forEach begin="1" end="100" var="index">
    <c:out value="${index}"/>
</c:forEach>

<c:out value="Terima pesan dari halaman sebelumnya: ${halo}"/>
<hr/>
<table border="1">
    <thead>
    <tr>
        <td>No</td>
        <td>Nomor Register</td>
        <td>Nama Nasabah</td>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${listOfNasabah}" var="nasabah">
        <tr>
            <td></td>
            <td><c:out value="${nasabah.id}"/></td>
            <td><c:out value="${nasabah.nama}"/></td>
        </tr>
    </c:forEach>
    </tbody>
</table>

<hr/>
<h1>Tambah Nasabah</h1>
<hr/>
<form action="${pageContext.servletContext.contextPath}/nasabah/proses" method="post">
    <div>
        <label for="idNasabah">Nomor Register</label>
        <input type="text" id="idNasabah" name="id" max="5" size="10">
    </div>
    <div>
        <label for="namaNasabah">Nama Nasabah</label>
        <input type="text" id="namaNasabah" name="nama" max="20" size="25">
    </div>
    <div>
        <button type="submit" value="Kirim">Kirim</button>
        <button type="reset" value="Ulang">Ulang</button>
    </div>
</form>
</body>
</html>
