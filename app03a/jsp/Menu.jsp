<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<title>Menu</title>
<style type="text/css">@import url(css/main.css);</style>
</head>
<body>
<div id="global">
	<p>
		Welcome. Number of users online: 
		<s:property value="#application.onlineUserCount"/>
	</p>	
	<p>
		<a href="User_logout.action">Log out</a>
	</p>
</div>
</body>
</html>
