<%--
  Created by IntelliJ IDEA.
  User: dimmaryanto93
  Date: 11/09/17
  Time: 13:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="fr" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Tambah Kamar Baru</title>
</head>
<body>

<fr:form commandName="newKamar" action="${pageContext.servletContext.contextPath}/kamar/proses" method="post">
    <div>
        <fr:hidden path="hotel.id"></fr:hidden>
    </div>
    <h2>Informasi Hotel</h2>
    <div>
        <label>Nama Hotel</label>
        <fr:input path="hotel.nama" readonly="true"></fr:input>
    </div>
    <div>
        <label>Alamat Hotel</label>
        <fr:input path="hotel.alamat" readonly="true"></fr:input>
    </div>
    <div>
        <label>Kota Hotel</label>
        <fr:input path="hotel.kota" readonly="true"></fr:input>
    </div>
    <hr/>
    <h2>Informasi Kamar</h2>
    <div>
        <fr:label path="nomorKamar">Nomor Kamar</fr:label>
        <fr:input path="nomorKamar" required="true" size="30" maxlength="20"></fr:input>
    </div>
    <div>
        <fr:label path="jumlahOrang">Jumlah Orang</fr:label>
        <fr:input type="number" path="jumlahOrang" required="true" size="10" maxlength="5"></fr:input>
    </div>
    <div>
        <fr:label path="harga">Harga Kamar</fr:label>
        <fr:select path="harga">
            <fr:option value="300000">Rp.300,000.-/hari</fr:option>
            <fr:option value="500000">Rp.500,000.-/hari</fr:option>
            <fr:option value="800000">Rp.800,000.-/hari</fr:option>
            <fr:option value="1100000">Rp.1,100,000.-/hari</fr:option>
        </fr:select>
    </div>
    <div>
        <button type="submit">Kirim</button>
    </div>
</fr:form>
</body>
</html>
