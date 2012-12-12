<%@page buffer="none" session="false" taglibs="c,cms" %>
<%@page import="java.util.*"%>

<div class="sivideo embed-container">
<%
	String title = (String)request.getParameter("Titulo");
	String ancho = (String)request.getParameter("Ancho");
	String alto = (String)request.getParameter("Alto");

	if(!request.getParameter("Mp4").equals("") && !request.getParameter("Ogg").equals("")){
		String mp4 = (String)request.getParameter("Mp4");
		String ogg = (String)request.getParameter("Ogg");
%>
		<video width="<%=ancho%>" height="<%=alto%>" controls="controls">
		  <source src="<%=mp4%>" type="video/mp4" />
		  <source src="<%=ogg%>" type="video/ogg" />
		  Tu navegador no da soporte a la etiqueta de video.
		</video>
<%
	}
	else if(!request.getParameter("Idyoutube").equals("")){
		String idyoutube = (String)request.getParameter("Idyoutube");
%>
		<iframe width="<%=ancho%>" height="<%=alto%>" src="http://www.youtube-nocookie.com/embed/<%=idyoutube%>?rel=0" frameborder="0" allowfullscreen></iframe>
<%
	}
	else if(!request.getParameter("Idvimeo").equals("")){
		String idvimeo = (String)request.getParameter("Idvimeo");
%>
		<iframe src="http://player.vimeo.com/video/<%=idvimeo%>?title=0&amp;byline=0&amp;portrait=0" width="<%=ancho%>" height="<%=alto%>" frameborder="0" webkitAllowFullScreen mozallowfullscreen allowFullScreen></iframe>
<%
	}
%>
</div>
