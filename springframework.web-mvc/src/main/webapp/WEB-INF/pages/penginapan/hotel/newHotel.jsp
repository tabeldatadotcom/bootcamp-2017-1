<%--
  Created by IntelliJ IDEA.
  User: dimmaryanto93
  Date: 11/09/17
  Time: 11:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="fr" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Hotel</title>
</head>
<body>

<fr:form commandName="aHotel" action="${pageContext.servletContext.contextPath}/hotel/proses" method="post">
    <div>
        <fr:label path="nama">Nama Hotel</fr:label>
        <fr:input path="nama" required="true" size="20" maxlength="50"></fr:input>
    </div>
    <div>
        <fr:label path="alamat">Alamat:</fr:label>
        <fr:textarea path="alamat"></fr:textarea>
    </div>
    <div>
        <fr:label path="kota">Kota</fr:label>
        <fr:select path="kota" required="true">
            <fr:option value="bdg" label="Bandung"/>
            <fr:option value="jkt-ut" label="Jakarta Utara"/>
            <fr:option value="jak-sel" label="Jakarta Selatan"/>
            <fr:option value="jak-pus" label="Jakarta Pusat"/>
        </fr:select>
    </div>
    <div>
        <button type="submit">Kirim</button>
    </div>

</fr:form>

</body>
</html>
