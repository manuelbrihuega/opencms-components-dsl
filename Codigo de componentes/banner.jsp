<%@page buffer="none" session="false" taglibs="c,cms" %>
<%@page import="java.util.*"%>

<%
	String enlace = (String)request.getParameter("Enlace"); 
	String ancho = (String)request.getParameter("Ancho");
	String alto = (String)request.getParameter("Alto");
	String imagen = (String)request.getParameter("Imagen");
%>

<div class="sibanner_bottom">
	<div class="banner" href="<%=enlace%>" style="width: <%=ancho%>px;">
		<c:set var="fuente" value="<%=imagen%>"/>
		<div class="imagen_banner">
			<a href="<%=enlace%>"><img  style="width: <%=ancho%>px; height: <%=alto%>px;" src="<cms:link>${fuente}</cms:link>"/></a>
		</div>	       	
	</div>
</div>

