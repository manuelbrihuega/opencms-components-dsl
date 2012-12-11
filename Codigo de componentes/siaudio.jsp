<%@page buffer="none" session="false" taglibs="c,cms" %>
<%@page import="java.util.*"%>

<%
	String title = (String)request.getParameter("Titulo"); 
	String mp3 = (String)request.getParameter("Mp3");
	String ogg = (String)request.getParameter("Ogg");
	String controles = (String)request.getParameter("Controles");
%>

<div class="siaudio">
	<audio <% if(controles.equals("true")){ %> controls="controls" <% } %> >
		<source src="<%=ogg%>" type="audio/ogg" />
		<source src="<%=mp3%>" type="audio/mp3" />
		Tu navegador no soporta la reproducción de ficheros de audio
	</audio>
</div>
