<%--
  Created by IntelliJ IDEA.
  User: dimmaryanto93
  Date: 04/09/17
  Time: 11:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="fr" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Input data Nasabah</title>
</head>
<body>

<fr:form commandName="nasabah" method="post" action="${pageContext.servletContext.contextPath}/nasabah/new">
    <h2>Nasabah</h2>
    <hr/>
    <table>
        <c:if test="${isCreate == false}">
            <tr>
                <td><fr:label path="nomorRegister"></fr:label></td>
                <td><fr:input path="nomorRegister" size="50"></fr:input></td>
            </tr>
        </c:if>
        <tr>
            <td><fr:label path="nama">Nama Nasabah</fr:label></td>
            <td><fr:input path="nama" size="30" maxlength="25"/></td>
        </tr>
        <tr>
            <td><fr:label path="jenisKelamin"></fr:label></td>
            <td>
                <fr:select path="jenisKelamin">
                    <fr:options items="${listJenisKelamin}" itemLabel="jenisKelamin"/>
                </fr:select>
            </td>
        </tr>
        <tr>
            <td></td>
            <td>
                <button type="submit" value="kirim">Kirim</button>
            </td>

        </tr>
    </table>
</fr:form>


</body>
</html>
