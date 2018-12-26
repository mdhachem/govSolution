
<%@page import="tn.iset.govsolution.entity.Role"%>
<%@page import="tn.iset.govsolution.entity.User"%>
<%@page import="java.util.List"%>
<%@ include  file="includeslib.jsp" %>




<c:choose>
         
         <c:when test = "${typeApp <= 0}">
          <%--  <%@ include  file="header.jsp" %> --%>
         </c:when>
         
         <c:when test = "${typeApp ==1}">

           <%@ include  file="headerSuperAdmin.jsp" %>
           
           <%@ include  file="slideRightSuperAdmin.jsp" %> 

           <div class="main-content">
                  <%@ include file="homeSuperAdmin.jsp" %> 
            </div>
            <%@ include  file="footerSuperAdmin.jsp" %> 
         </c:when>
         <c:when test = "${typeApp ==2}">
         <%@ include  file="headerSuperAdmin.jsp" %>
           
           <%@ include  file="slideRightAdminCompany.jsp" %> 
 			<div class="main-content">
           <%@ include file="homeAdminCompany.jsp" %> 
           </div>
           <%@ include  file="footerSuperAdmin.jsp" %> 
         </c:when>
         <c:when test = "${typeApp ==3}">
           <%@ include  file="headerUserCompany.jsp" %>
           <%@ include file="homeUserCompany.jsp" %>
         </c:when>
         
         <c:otherwise>
          <%@ include  file="header.jsp" %> 
         </c:otherwise>
      </c:choose>

 

	
<%-- <%@ include file="footer.jsp" %> --%>
