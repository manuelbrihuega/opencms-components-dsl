<%@page buffer="none" session="false" taglibs="c,cms,fmt" %>	
<cms:formatter var="content" val="v">

	<div class="sibanner_bottom">
		<div class="banner" href="${v.Enlace}" style="width: ${v.Ancho}px;">
			<c:set var="fuente" value="${v.Imagen}"/>
			<c:choose>
				       <c:when test="${v.Video.exists}">                                        
				       		<c:set var="video" value="${v.Video}"/>
	 					<cms:include page="../multimedia/sivideo.jsp">
	 						<cms:param name="Titulo">${video.value.Titulo}</cms:param>	
	 						<cms:param name="Ancho">${v.Ancho}</cms:param>
	 						<cms:param name="Alto">${v.Alto}</cms:param>
	 						<cms:param name="Mp4">${video.value.Mp4}</cms:param>
	 						<cms:param name="Ogg">${video.value.Ogg}</cms:param>
	 						<cms:param name="Idyoutube">${video.value.Idyoutube}</cms:param>
	 						<cms:param name="Idvimeo">${video.value.Idvimeo}</cms:param>
	 					</cms:include>    
				       </c:when>
				       <c:otherwise>
				       		<div class="imagen_banner">
							<a href="${v.Enlace}"><img  style="width: ${v.Ancho}px; height: ${v.Alto}px;" src="<cms:link>${fuente}</cms:link>"/></a>
						</div>
				       </c:otherwise>
			</c:choose>		
			
		</div>
	</div>
	
</cms:formatter>
