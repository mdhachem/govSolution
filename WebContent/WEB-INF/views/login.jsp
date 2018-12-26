
<%
	String loginAction = request.getContextPath() + "/user/doLogin.action";
	String registerAction= request.getContextPath()+"/user/doRegister.action";
%>
<div class="container">
<div  class="page-section">
		<div class="row">
			
			<div class="col-lg-12 text-center v-center">
				<c:if test="${not empty error}">
					<div class="alert alert-warning alert-dismissible" role="alert">
 						 <button type="button" class="close" data-dismiss="alert"><span aria-hidden="true">&times;</span><span class="sr-only">Close</span></button>
 						 <strong>Warning!</strong>${error }
				</div>
				</c:if>
				<h3>Sign in Here</h3>
				<br />
				<form action="<%=loginAction.toString()%>" method="post"  >
					<div class="input-group"
						style="width: 340px; text-align: center; margin: 0 auto;">
						<input class="form-control input-lg" title="Signin"
							placeholder="Enter your login" type="text" name="username"> <span
							class="input-group-btn"> </span>
					</div>
					<div class="input-group"
						style="padding-top: 10px; width: 340px; text-align: center; margin: 0 auto;">
						<input class="form-control input-lg" title="password" name="password" placeholder="Password" type="password"> <span
							class="input-group-btn"> </span>
					</div>
					<div class="input-group"
						style="padding-top: 10px; width: 340px; text-align: center; margin: 0 auto;">
						<button class="btn btn-lg btn-block btn-primary">Login</button>
					</div>
				</form>
			</div>
		</div>
		<br /> <br /> <br /> <br /> <br /> <br /> <br /> <br /> <br />
	</div>
</div>


