
<%@ include  file="includeslib.jsp" %>
<c:set var="appPath" value="${pageContext.request.contextPath}"/>
<%
	String contextPath = request.getContextPath();
	String homePath = contextPath+"/home.action";
%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href='<%=contextPath+"/css/bootstrap.min.css" %>' rel="stylesheet">
<link href='<%=contextPath+"/css/application.css" %>' rel="stylesheet">
<link href='<%=contextPath+"/css/jquery-ui.css" %>' rel="stylesheet">
<link href='<%=contextPath+"/css/slide-bar.css" %>' rel="stylesheet">
</head>
<body>
		<nav class="navbar navbar-inverse" role="banner">
			<div class="container-fluid">
				<div class="navbar-header">
					<a class="navbar-brand" href="#">GovSolution</a>
				</div>
			  <ul class="nav navbar-nav navbar-right">
			           <li><a href="${appPath}/user/dosignin.action"><span class="glyphicon glyphicon-log-in"></span> Sign In</a></li>
                       <li><a href="${appPath}/user/doRegistration.action"><span class="glyphicon glyphicon-floppy-disk"></span> Sign Up</a></li>
                </ul>
			</div>
			
		</nav>
		
