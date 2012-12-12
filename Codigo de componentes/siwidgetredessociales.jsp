<%@page buffer="none" session="false" taglibs="c,cms,fmt" %>	
<cms:formatter var="content" val="v">

	<div class="siwidgetredessociales_bottom">
		
		<c:if test="${v.URLTwitter.exists}">
			
				<a class="urlredes" href="${v.URLTwitter}">
					<img src="/opencms/opencms/system/modules/es.dipucadiz2.basico/resources/img/twitter.png"/>
				</a>
			
		</c:if>
		<c:if test="${v.URLFacebook.exists}">
			
				<a class="urlredes" href="${v.URLFacebook}">
					<img src="/opencms/opencms/system/modules/es.dipucadiz2.basico/resources/img/facebook.png"/>
				</a>
			
		</c:if>
		<c:if test="${v.URLYoutube.exists}">
			
				<a class="urlredes" href="${v.URLYoutube}">
					<img src="/opencms/opencms/system/modules/es.dipucadiz2.basico/resources/img/youtube.png"/>
				</a>
			
		</c:if>
		<c:if test="${v.URLLinkedin.exists}">
			<div>
				<a class="urlredes" href="${v.URLLinkedin}">
					<img src="/opencms/opencms/system/modules/es.dipucadiz2.basico/resources/img/linkedin.png"/>
				</a>
			</div>
		</c:if>
		<c:if test="${v.URLTuenti.exists}">
			
				<a class="urlredes" href="${v.URLTuenti}">
					<img src="/opencms/opencms/system/modules/es.dipucadiz2.basico/resources/img/tuenti.png"/>
				</a>
			
		</c:if>
		<c:if test="${v.URLGoogleplus.exists}">
			
				<a class="urlredes" href="${v.URLGoogleplus}">
					<img src="/opencms/opencms/system/modules/es.dipucadiz2.basico/resources/img/googleplus.png"/>
				</a>
			
		</c:if>
	</div>
</cms:formatter>
