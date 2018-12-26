<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

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
</head>
<body>
		<nav class="navbar navbar-inverse" role="banner">
			<div class="container-fluid">
				<div class="navbar-header">
					<a class="navbar-brand" href="#">GovSolution</a>
				</div>
			<ul class="nav navbar-nav">
      				<li class="active"><a href="#">Home</a></li>
     				 <li><a href="#">Page 1</a></li>
     				 <li><a href="#">Page 2</a></li> 
     				 <li><a href="#">Page 3</a></li> 
    			</ul>
		
			
              <ul class="nav navbar-nav navbar-right">
                    <li><a href="#"><span class="glyphicon glyphicon-user"></span> ${user.login}</a></li>
                  <li><a href="${appPath}/user/doLogout.action"><span class="glyphicon glyphicon-log-out"></span> Logout</a></li>
                </ul>
                	</div>
        </div>
		</nav>
		
