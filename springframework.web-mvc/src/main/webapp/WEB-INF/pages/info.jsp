<%--
  Created by IntelliJ IDEA.
  User: dimmaryanto93
  Date: 31/08/17
  Time: 14:05
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fr" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>Latihan Input Data</title>
</head>
<body>
<fr:form commandName="nasabah" action="${pageContext.servletContext.contextPath}/nasabah/save" method="post">
    <div>
        <fr:label path="nomorRegister">Nomor Register</fr:label>
        <fr:input disabled="true" path="nomorRegister" id="nomorRegister"/>
    </div>
    <div>
        <fr:label path="nama">Nama Nasabah</fr:label>
        <fr:input disabled="true" path="nama" id="nama"/>
    </div>
</fr:form>

</body>
</html>
