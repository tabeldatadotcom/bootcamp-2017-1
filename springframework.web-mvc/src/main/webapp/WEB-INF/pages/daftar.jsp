<%--
  Created by IntelliJ IDEA.
  User: dimmaryanto93
  Date: 31/08/17
  Time: 14:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<table border="1">
    <thead>
    <tr>
        <td></td>
        <td>No Register</td>
        <td>Nama Nasabah</td>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${listOfNasabah}" var="n">
        <tr>
            <td></td>
            <td>${n.nomorRegister}</td>
            <td>${n.nama}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>

</body>
</html>
