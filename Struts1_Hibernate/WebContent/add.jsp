<%@taglib prefix="html" uri="http://jakarta.apache.org/struts/tags-html"%>
<html:html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Add New Subscriber</title>
</head>
<body>
	<html:form action="/add">
		<h2>
			Add New Subscriber
		</h2>
		<table>
			<tr>
				<td>
					Email Address :
				</td>
				<td>
					<html:text property="email" size="30" />
				</td>
			</tr>
			<tr>
				<td>
					Fullname :
				</td>
				<td>
					<html:text property="fullname" size="30" />
				</td>
			</tr>
		</table>
		<p />
			<html:submit value="Add Subscriber" />
		<h3>
			${msg}
		</h3>
		<a href="index.jsp"> Home Page </a>
	</html:form>
</body>
</html:html>