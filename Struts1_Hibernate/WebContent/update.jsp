<%@page contentType="text/html"  import="com.naveen.struts.java.entities.*"%>
<%@ page language="java" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="bean"%>
<%@taglib prefix="html" uri="http://jakarta.apache.org/struts/tags-html"%>


<html:html locale="true">
   <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Update Subscriber</title>
   </head>
   <body>

        <%
           String email = request.getParameter("email");
           Subscriber s = Subscriber.getSubscriber(email);
           if ( s == null)
               return;

        %>
        <html:form action="/update">
        <h2>Update Subscriber </h2>
        <table>
            <tr>
                <td>Email Address  : </td>
                <td> <html:text  readonly="true" property="email" size="30"  value="<%=s.getEmail()%>" /> </td>
            </tr>

            <tr>
                <td>Fullname :  </td>
                <td> <html:text  property="fullname" size="30"   value="<%=s.getFullname()%>"/> </td>
            </tr>

            <tr>
                <td>Date Of Joining :  </td>
                <td> <html:text  readonly="true" property="dj" size="20" value="<%=s.getDj().toString()%>"/> </td>
            </tr>
        </table>
        <p/>
        <html:submit value="Update Subscriber" />
        <h3> ${msg} </h3>
        <a href="index.jsp"> Home Page </a> &nbsp;&nbsp;
        <a href="list.jsp"> List Subscribers</a>
       </html:form>
   </body>
</html:html>
