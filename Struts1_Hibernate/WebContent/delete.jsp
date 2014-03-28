
<%@taglib prefix="html" uri="http://jakarta.apache.org/struts/tags-html"%>

<html:html locale="true">
   <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Delete Subscriber</title>
   </head>
   <body>
        <html:form action="/delete">
        <h2>Delete Subscriber </h2>
        Email Address  : <html:text  property="email" size="30" />
        <p/>
        <html:submit value="Delete Subscriber" />
        <h3> ${msg} </h3>
        <a href="index.jsp">Home Page</a>
       </html:form>
   </body>
</html:html>
