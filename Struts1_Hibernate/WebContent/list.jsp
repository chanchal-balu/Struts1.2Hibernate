<%@page contentType="text/html" import="com.naveen.struts.java.entities.*,java.util.*"%>
<%@ page language="java" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="bean"%>
<%@taglib prefix="html" uri="http://jakarta.apache.org/struts/tags-html"%>


<html:html locale="true">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>List Of Subscribers</title>
    </head>
    <body>
        <h2>Subscribers </h2>
        <table border="1" cellpadding="5">
        <tr><th>Email <th>Fullname <th>Joined ON <th>&nbsp;</tr>
        <%
            List subscribers = com.naveen.struts.java.dao.SubscriberDAO.query();
            for( Object o : subscribers) {
                Subscriber s = (Subscriber) o;
                out.println("<tr><td>" +  s.getEmail() + "</td><td>"  +  s.getFullname() + "</td><td>" +  (s.getDj() == null? "&nbsp;" : s.getDj()) +
                        "</td><td><a href=update.jsp?email=" + s.getEmail() + ">update</a></td></tr>");
            }
        %>
        </table>
        <p/>
        <a href="index.jsp">Home Page </a>
    </body>
</html:html>
