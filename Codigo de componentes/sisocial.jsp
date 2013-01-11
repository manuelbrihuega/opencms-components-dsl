<%@page buffer="none" session="false" taglibs="c,cms" %>
<%@page import="java.util.*"%>

<%
	String title = (String)request.getParameter("title"); 
	String share_delicious = (String)request.getParameter("share_delicious");
	String share_facebook = (String)request.getParameter("share_facebook");
	String share_googleplus = (String)request.getParameter("share_googleplus");
	String share_linkedin = (String)request.getParameter("share_linkedin");
	String share_tuenti = (String)request.getParameter("share_tuenti");
	String share_twitter = (String)request.getParameter("share_twitter");
	String share_xing = (String)request.getParameter("share_xing");
	String share_msn = (String)request.getParameter("share_msn");
	String print = (String)request.getParameter("print");
	String size = (String)request.getParameter("size");
	String texto = (String)request.getParameter("texto_compartir");

	String url = (String) request.getParameter("url"); 
	int cont = 0;

	if(share_delicious.equals("true")) cont++;
	if(share_facebook.equals("true")) cont++;
	if(share_googleplus.equals("true")) cont++;
	if(share_linkedin.equals("true")) cont++;
	if(share_tuenti.equals("true")) cont++;
	if(share_twitter.equals("true")) cont++;
	if(share_xing.equals("true")) cont++;
	if(share_msn.equals("true")) cont++;
	if(print.equals("true")) cont++;
%>

<div id="social_div" style="display: block; width: <%= cont *(Integer.parseInt(size) + 4) + (Integer.parseInt(size) * 3) + 12 %>px; height: <%=size %>px; margin-bottom: 15px;">
	<% if(share_delicious.equals("true")){ %>
		<div style="float: right; margin: 2px;">
			<a href="http://delicious.com/save" onclick="window.open('http://delicious.com/save?v=5&amp;noui&amp;jump=close&amp;url='+'<%=url %>'+'&amp;title='+'<%=title %>','delicious', 'toolbar=no,width=550,height=550'); return false;" target="_blank">
				<img src="<cms:link>/galeria_imagen/iconos/delicious_<%=size %>.png</cms:link>" alt="Compartir en Delicious" />
			</a>
		</div>
	<% 
		}
		if(share_facebook.equals("true")) { %>
		<div style="float: right; margin: 2px;">
			<a href="http://www.facebook.com/sharer.php?u=<%=url %>&t=<%=title%>" target="_blank">
				<img src="<cms:link>/galeria_imagen/iconos/facebook_<%=size %>.png</cms:link>" alt="Compartir en Facebook" />
			</a>
		</div>
	<%
		}
		if(share_googleplus.equals("true")) { %>
		<div style="float: right; margin: 2px;">
			<a href="https://m.google.com/app/plus/x/?v=compose&content=<%=url %>" onclick="window.open('https://m.google.com/app/plus/x/?v=compose&content=http://www.google.es','gplusshare','width=450,height=300,left='+(screen.availWidth/2-225)+',top='+(screen.availHeight/2-150)+'');return false;">
				<img src="<cms:link>/galeria_imagen/iconos/google-plus_<%=size %>.png</cms:link>" alt="Compartir en Google+"/>
			</a>
		</div>
	<%
		}
		if(share_linkedin.equals("true")) { %>
		<div style="float: right; margin: 2px;">
			<a href="http://www.linkedin.com/shareArticle?mini=true&url=<%=url %>&title=<%=title %>" target="_blank">
				<img src="<cms:link>/galeria_imagen/iconos/linkedin_<%=size %>.png</cms:link>">
			</a>
		</div>
	<% 
		}
		if(share_tuenti.equals("true")) { %>
		<div style="float: right; margin: 2px;">
			<a href="http://www.tuenti.com/share?url=<%=url %>" target="_blank">
				<img src="<cms:link>/galeria_imagen/iconos/tuenti_<%=size %>.png</cms:link>" alt="Compartir en Tuenti" />
			</a>
		</div>
	<%
		}
		if(share_twitter.equals("true")) { %>
		<div style="float: right; margin: 2px;"> 	
			<a href="http://twitter.com/home?status=<%=title + " - "%><%=url %>" target="_blank">
				<img src="<cms:link>/galeria_imagen/iconos/twitter_<%=size %>.png</cms:link>" alt="Compartir en twitter" />
			</a>
		</div>
	<%
		}
		if(share_xing.equals("true")) { %>
		<div style="float: right; margin: 2px;">
			<a href="http://www.xing.com/app/user?op=share;url=<%=url %>" target="_blank" title="Compartir en Xing">
				<img src="<cms:link>/galeria_imagen/iconos/xing_<%=size %>.png</cms:link>" alt="Mostrar a tus contactos de XING" />
			</a>
		</div>
	<%
		}	
		if(share_msn.equals("true")) { %>
		<div style="float: right; margin: 2px;">
			<a href="https://profile.live.com/P.mvc#!/badge?url=<%=url %>&title=<%=title %>" target="_blank" title="Compartir en MSN">
				<img src="<cms:link>/galeria_imagen/iconos/msn_<%=size %>.png</cms:link>" alt="Compartir en tu perfil de MSN" />
			</a>
		</div>
	<%
		}
		if(print.equals("true")) { %>
		<div style="float: right; margin: 2px;">
			<script charset='ISO-8859-1' src='http://api.joliprint.com/joliprint/js/joliprint.js' type='text/javascript'></script>
			<script type='text/javascript'>$joliprint().set("label",null).set("labelposition","after").set("buttonUrl", "<cms:link>/galeria_imagen/iconos/print_<%=size %>.png</cms:link>").write();</script>	
		</div>
		
	<%
		}

		String css = "";
		if(size.equals("32")){
			css = "background-image: url('/galeria_imagen/iconos/white_32.png'); float: right; font-size: 1.2em; font-weight: bold; height: 26px; margin: 2px; padding-top: 6px; text-align: center; width: 96px;";	
		}
		if(size.equals("24")){
			css = "background-image: url('/galeria_imagen/iconos/white_24.png'); float: right; font-size: 1em; height: 20px; margin: 2px; padding-top: 4px; text-align: center; width: 72px;";	
		}
		if(size.equals("16")){
			css = "background-image: url('/galeria_imagen/iconos/white_16.png'); float: right; font-size: 0.7em; height: 16px; margin: 2px; padding-top: 0px; text-align: center; width: 48px;";	
		}
	%>
	<div style="<%=css%>">
		<span style="font-size: 0.7em; bottom: 2px; position: relative;"><%=texto%></span>
	</div>
</div>
