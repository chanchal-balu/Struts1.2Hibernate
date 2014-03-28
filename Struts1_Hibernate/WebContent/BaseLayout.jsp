<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
  "http://www.w3.org/TR/html4/loose.dtd">
<html>

	<body>
		<table border="1" bordercolor="green" cellpadding="2" cellspacing="2"
			align="center">
			<tr>
				<td height="40" colspan="3">
					<tiles:insert attribute="Header" />
				</td>
			</tr>
			<tr>
				<td height="400" width="100">
					<tiles:insert attribute="Menu" />
				</td>
				<td height="400" width="400">
					<tiles:insert attribute="Body" />
				</td>

			</tr>
			<tr>
				<td height="30" colspan="3">
					<tiles:insert attribute="Footer" />
				</td>
			</tr>
		</table>
	</body>
</html>