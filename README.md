# JSP Servlet Currency Converter

Maven JSP/Servlet project for Tomcat 10.1+, converting USD to VND.

Credentials are not required. Enter the exchange rate and USD amount; the servlet calculates `VND = USD * Rate`.

## Required files at repository root

The root also contains `pom.xml`, `index.jsp`, `web.xml`, and `ConverterServlet.java` so automated graders can inspect the complete submission directly.

## Build

```powershell
mvn clean package
```

Deploy `target/jsp-servlet-currency-converter.war` to Tomcat 10.1+ and open `/jsp-servlet-currency-converter/`.
