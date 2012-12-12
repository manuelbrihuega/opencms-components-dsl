<%@page buffer="none" session="false" taglibs="c,cms,fmt" %>
<cms:formatter var="content" val="v">

<div class="metacomponente">
	<h2>${v.Titulo}</h2>
	<c:if test="${v.Subtitulo.exists}">
		<h3>${v.Subtitulo}</h3>
	</c:if>
	<c:if test="${v.Entradilla.exists}">
		<p class="entradilla">${v.Entradilla}</p>
	</c:if>
	<c:if test="${v.Texto.exists}">
		<div class="texto">
			<p>${v.Texto}</p>
		</div>
	</c:if>
	<c:if test="${v.Enlace.exists}">
		<a href="<cms:link>${v.Enlace}</cms:link>">${v.Enlace}</a>
	</c:if>
	<c:if test="${v.Imagen.exists}">
		<span class="imagen_diario">
				<a href="<cms:link>${v.Imagen}</cms:link>"><img src="<cms:link>${v.Imagen}</cms:link>"/></a>
		</span>
	</c:if>
	<c:if test="${v.Fecha.exists}">
		<c:set var="fch" value="${v.Fecha}"/>
		<span class="fecha"><fmt:formatDate value="${cms:convertDate(fch)}" dateStyle="SHORT" timeStyle="SHORT" type="both" /></span>
	</c:if>
	<c:if test="${v.Audio.exists}">
		<div>
			<span>
				<c:set var="audio" value="${v.Audio}"/>
				<cms:include page="../multimedia/siaudio.jsp">
					<cms:param name="Titulo">${audio.value.Titulo}</cms:param>	
					<cms:param name="Mp3">${audio.value.Mp3}</cms:param>
					<cms:param name="Ogg">${audio.value.Ogg}</cms:param>
					<cms:param name="Controles">${audio.value.Controles}</cms:param>
				</cms:include>			
			</span>
		</div>
	</c:if>
	<c:if test="${v.Video.exists}">
		<div>
			<c:set var="video" value="${v.Video}"/>
	 		<cms:include page="../multimedia/sivideo.jsp">
	 			<cms:param name="Titulo">${video.value.Titulo}</cms:param>	
		 		<cms:param name="Ancho">${video.value.Ancho}</cms:param>
		 		<cms:param name="Alto">${video.value.Alto}</cms:param>
		 		<cms:param name="Mp4">${video.value.Mp4}</cms:param>
	 			<cms:param name="Ogg">${video.value.Ogg}</cms:param>
	 			<cms:param name="Idyoutube">${video.value.Idyoutube}</cms:param>
	 			<cms:param name="Idvimeo">${video.value.Idvimeo}</cms:param>
	 		</cms:include>
		</div>
 	</c:if>
	<c:if test="${v.BotonSeleccion.exists}">
		<div>
		</div>
	</c:if>
	<c:if test="${v.Boton.exists}">
		<div>
		</div>
	</c:if>
	<c:if test="${v.Etiqueta.exists}">
		<div>
		</div>
	</c:if>
	<c:if test="${v.EntradaTexto.exists}">
		<div>
		</div>
	</c:if>
</div>
</cms:formatter>
