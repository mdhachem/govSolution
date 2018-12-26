<%@ include  file="includeslib.jsp" %>


<c:choose>
         
         <c:when test = "${typeApp <= 0}">
            <%@ include  file="header.jsp" %>
            <%@ include file="login.jsp" %>
         </c:when>
         
         <c:when test = "${typeApp ==1}">
         	<%@ include  file="headerSuperAdmin.jsp" %>
         	<%@ include file="slideRightSuperAdmin.jsp" %> 
        	<%@ include file="homeSuperAdmin.jsp" %> 
        	
        	<%@ include file="footerSuperAdmin.jsp" %>
         </c:when>
         <c:when test = "${typeApp ==2}">
          <%@ include  file="headerSuperAdmin.jsp" %>
         	<%@ include file="slideRightAdminCompany.jsp" %> 
        	<%@ include file="homeAdminCompany.jsp" %> 
        	
        	<%@ include file="footerSuperAdmin.jsp" %>
         </c:when>
         <c:when test = "${typeApp ==3}">
           <%@ include  file="headerUserCompany.jsp" %>
           <%@ include file="homeUserCompany.jsp" %>
           <%@ include file="footer.jsp" %>
         </c:when>
         
         <c:otherwise>
           <%@ include  file="header.jsp" %>
           <%@ include file="login.jsp" %>
           <%@ include file="footer.jsp" %>
         </c:otherwise>
      </c:choose>



