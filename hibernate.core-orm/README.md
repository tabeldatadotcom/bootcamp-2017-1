# Hibernate ORM

Membuat project menggunakan maven archeytpe generate `maven-archetype-quicstart`

```bash
mvn archetype:generate -DarchetypeCatalog='internal'
```

Untuk menggunakan hibnerate tambahkan dependency di file `pom.xml`

```xml
<dependency>
    <groupId>org.hibernate</groupId>
    <artifactId>hibernate-core</artifactId>
    <version>5.2.10.Final</version>
</dependency>
```

Untuk menggunakan java 1.8 tambahkan plugin di `pom.xml`

```xml
<build>
    <plugins>
        <plugin>
            <groupId>org.apache.maven.plugins</groupId>
            <artifactId>maven-compiler-plugin</artifactId>
            <version>3.6.2</version>
            <configuration>
                <source>1.8</source>
                <target>1.8</target>
            </configuration>
        </plugin>
    </plugins>
</build>
```

setelah itu tambahkan dependency yang mau digunakan seperti `postgresql` atau `mysql` seperti berikut:

```xml
 <dependency>
    <groupId>org.postgresql</groupId>
    <artifactId>postgresql</artifactId>
    <version>42.1.4</version>
</dependency>
<dependency>
    <groupId>org.apache.commons</groupId>
    <artifactId>commons-dbcp2</artifactId>
    <version>2.1.1</version>
</dependency>
```

Setelah itu kita buat setter & getter menggunakan `projectlombok`

```xml
<dependency>
    <groupId>org.projectlombok</groupId>
    <artifactId>lombok</artifactId>
    <version>1.16.18</version>
</dependency>
```

Lalu membuat model contohnya `Mahasiswa` dalam package `com.dimas.maryanto.model`

```java
package com.dimas.maryanto.model;
// import here!!

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Mahasiswa {

    private Integer nim;
    private String nama;
    private Integer angkatan;
    private Date tanggalLahir;
    private String jurusan;
}
```