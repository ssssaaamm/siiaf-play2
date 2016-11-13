
package views.html.administrador

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object usuarios_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class usuarios extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Form[Usuario],List[Usuario],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(usuario_form: Form[Usuario], usuarios_list: List[Usuario] ):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._
def /*4.2*/css/*4.5*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*4.7*/("""
	"""),format.raw/*5.2*/("""<link rel="stylesheet" media="screen" href=""""),_display_(/*5.47*/routes/*5.53*/.Assets.versioned("stylesheets/bootstrap-table.css")),format.raw/*5.105*/("""">
""")))};def /*8.2*/js/*8.4*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*8.6*/("""
	"""),format.raw/*9.2*/("""<script src=""""),_display_(/*9.16*/routes/*9.22*/.Assets.versioned("javascripts/bootstrap-table.js")),format.raw/*9.73*/("""" type="text/javascript"></script>

	<!--fix modal open at edit-->
	"""),_display_(/*12.3*/if(flash.containsKey("modal"))/*12.33*/ {_display_(Seq[Any](format.raw/*12.35*/("""
		"""),format.raw/*13.3*/("""<script>
	    	$(window).load(function()"""),format.raw/*14.32*/("""{"""),format.raw/*14.33*/("""
	        	"""),format.raw/*15.11*/("""$('#"""),_display_(/*15.16*/flash/*15.21*/.get("modal")),format.raw/*15.34*/("""').modal('show');
	    	"""),format.raw/*16.7*/("""}"""),format.raw/*16.8*/(""");
	    </script>
	""")))}),format.raw/*18.3*/("""


	"""),format.raw/*21.2*/("""<!-- fix modal close at edit -->
	<script>
		$('.modal').on('hidden.bs.modal', function () """),format.raw/*23.49*/("""{"""),format.raw/*23.50*/("""
			"""),format.raw/*24.4*/("""if(window.location.pathname!='"""),_display_(/*24.35*/routes/*24.41*/.GerenteController.usuarios),format.raw/*24.68*/("""')"""),format.raw/*24.70*/("""{"""),format.raw/*24.71*/("""
				
				"""),format.raw/*26.5*/("""window.location='"""),_display_(/*26.23*/routes/*26.29*/.GerenteController.usuarios),format.raw/*26.56*/("""';
			"""),format.raw/*27.4*/("""}"""),format.raw/*27.5*/("""	
		"""),format.raw/*28.3*/("""}"""),format.raw/*28.4*/(""");
	</script>
""")))};def /*34.2*/errores_formulario/*34.20*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*34.22*/("""

	"""),_display_(/*36.3*/if(usuario_form.hasGlobalErrors)/*36.35*/ {_display_(Seq[Any](format.raw/*36.37*/("""

        """),_display_(/*38.10*/for(error <- usuario_form.globalErrors) yield /*38.49*/ {_display_(Seq[Any](format.raw/*38.51*/("""
	        """),format.raw/*39.10*/("""<div class="alert alert-danger">
				<a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
				<strong>"""),_display_(/*41.14*/Messages(error.messages, error.arguments.toArray: _*)),format.raw/*41.67*/("""</strong>
			</div>
        """)))}),format.raw/*43.10*/("""
	""")))}),format.raw/*44.3*/("""



	"""),_display_(/*48.3*/for(error <- usuario_form("nombre").errors) yield /*48.46*/ {_display_(Seq[Any](format.raw/*48.48*/("""
    	"""),format.raw/*49.6*/("""<div class="alert alert-danger">
			<a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
			<strong>"""),_display_(/*51.13*/Messages(error.messages, error.arguments.toArray: _*)),format.raw/*51.66*/("""</strong>
		</div>
	""")))}),format.raw/*53.3*/("""


	"""),_display_(/*56.3*/for(error <- usuario_form("username").errors) yield /*56.48*/ {_display_(Seq[Any](format.raw/*56.50*/("""
    	"""),format.raw/*57.6*/("""<div class="alert alert-danger">
			<a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
			<strong>"""),_display_(/*59.13*/Messages(error.messages, error.arguments.toArray: _*)),format.raw/*59.66*/("""</strong>
		</div>
	""")))}),format.raw/*61.3*/("""

	"""),_display_(/*63.3*/for(error <- usuario_form("password").errors) yield /*63.48*/ {_display_(Seq[Any](format.raw/*63.50*/("""
    	"""),format.raw/*64.6*/("""<div class="alert alert-danger">
			<a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
			<strong>"""),_display_(/*66.13*/Messages(error.messages, error.arguments.toArray: _*)),format.raw/*66.66*/("""</strong>
		</div>
	""")))}),format.raw/*68.3*/("""

	"""),_display_(/*70.3*/for(error <- usuario_form("password_confirmation").errors) yield /*70.61*/ {_display_(Seq[Any](format.raw/*70.63*/("""
    	"""),format.raw/*71.6*/("""<div class="alert alert-danger">
			<a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
			<strong>"""),_display_(/*73.13*/Messages(error.messages, error.arguments.toArray: _*)),format.raw/*73.66*/("""</strong>
		</div>
	""")))}),format.raw/*75.3*/("""

""")))};
Seq[Any](format.raw/*1.62*/("""
"""),format.raw/*3.1*/("""
"""),format.raw/*6.2*/("""

"""),format.raw/*30.2*/("""



"""),format.raw/*77.2*/("""




"""),_display_(/*82.2*/administrador/*82.15*/.base("Administrador SIIAF","Usuarios","Gestion de usuarios","usuarios",css,js)/*82.94*/{_display_(Seq[Any](format.raw/*82.95*/("""
	"""),format.raw/*83.2*/("""<button type="button" id="main-add-button" class="btn btn-primary" data-toggle="modal" data-target="#mod-new"><span class="glyphicon glyphicon-plus" aria-hidden="true"></span> Agregar Usuario</button>

	"""),_display_(/*85.3*/if(flash.containsKey("exito"))/*85.33*/{_display_(Seq[Any](format.raw/*85.34*/("""
		"""),format.raw/*86.3*/("""<div class="alert alert-success fade in">
			<a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
			<span class="glyphicon glyphicon-ok" aria-hidden="true"></span>
			<strong>"""),_display_(/*89.13*/flash/*89.18*/.get("exito")),format.raw/*89.31*/("""</strong>
		</div>
	""")))}),format.raw/*91.3*/("""


  	"""),format.raw/*94.4*/("""<!-- Modal -->
	<div class="modal fade" id="mod-new" role="dialog">

		<div class="modal-dialog">

		<!-- Modal content-->
		<div class="modal-content">
			"""),_display_(/*101.5*/form(action=routes.GerenteController.usuario_new())/*101.56*/{_display_(Seq[Any](format.raw/*101.57*/("""
				"""),format.raw/*102.5*/("""<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal">&times;</button>
					<h4 class="modal-title">Agregar nuevo usuario</h4>
				</div>
				"""),_display_(/*106.6*/errores_formulario),format.raw/*106.24*/("""
				"""),format.raw/*107.5*/("""<div class="modal-body">




	        		 <div class="form-group">
	        		 	"""),_display_(/*113.15*/inputText(usuario_form("nombre"), '_showConstraints -> false , '_showErrors -> false,'class -> "form-control", 'placeholder -> "Nombre del usuario", '_label -> "Nombre: ")),format.raw/*113.186*/("""
	        		 """),format.raw/*114.13*/("""</div>


	        		 <div class="form-group">
						"""),_display_(/*118.8*/select(usuario_form("tipo.id"), options(TipoUsuario.options), '_showConstraints -> false , '_showErrors -> false,'class -> "form-control", 'placeholder -> "Tipo de Usuario",'_label -> "Tipo de Usuario: ")),format.raw/*118.212*/("""
					 """),format.raw/*119.7*/("""</div>

					 <div class="form-group">
						"""),_display_(/*122.8*/inputText(usuario_form("username"), '_showConstraints -> false, '_showErrors -> false ,'class -> "form-control", 'placeholder -> "sn036156",'_label -> "Usuario: ")),format.raw/*122.171*/("""
					 """),format.raw/*123.7*/("""</div>

					 <div class="form-group">
						"""),_display_(/*126.8*/inputText(usuario_form("password"),'type -> "password", '_showConstraints -> false , '_showErrors -> false,'class -> "form-control", 'placeholder -> "Use contraseñas seguras",'_label -> "Contraseña: ")),format.raw/*126.209*/("""
					 """),format.raw/*127.7*/("""</div>

					 <div class="form-group">
						"""),_display_(/*130.8*/inputText(usuario_form("password_confirmation"),'type -> "password", '_showConstraints -> false , '_showErrors -> false,'class -> "form-control", 'placeholder -> "Use contraseñas seguras",'_label -> "Confirme Contraseña: ")),format.raw/*130.231*/("""
					 """),format.raw/*131.7*/("""</div>




				</div>
				<div class="modal-footer">
						<button type="button" class="btn btn-default" data-dismiss="modal">Cerrar</button>
						<button type="submit" class="btn btn-primary"><span class="glyphicon glyphicon-plus" aria-hidden="true"></span> Agregar</button>
				</div>
			""")))}),format.raw/*141.5*/("""
		"""),format.raw/*142.3*/("""</div>

		</div>
	</div>

                	





	<div class="table-responsive">
		<div class="form-group pull-right">
		<input type="text" class="search form-control" placeholder="Busqueda">
	</div>
	<span class="counter pull-right"></span>
	<table class="table table-hover table-bordered results">
		<thead>
			<tr>
				<th>Id</th>
				<th class="col-md-5 col-xs-5">Nombre</th>
				<th class="col-md-4 col-xs-4">Tipo</th>
				<th class="col-md-3 col-xs-3">Usuario</th>
				<th class="col-md-3 col-xs-3 center-column">Editar</th>
				<th class="col-md-3 col-xs-3 center-column">Eliminar</th>
			</tr>
			<tr class="warning no-result">
				<td colspan="4"><i class="fa fa-warning"></i> No hay resultados</td>
			</tr>
		</thead>
		<tbody>
			"""),_display_(/*173.5*/for(usuario <- usuarios_list) yield /*173.34*/{_display_(Seq[Any](format.raw/*173.35*/("""
				"""),format.raw/*174.5*/("""<tr>
					<td>"""),_display_(/*175.11*/usuario/*175.18*/.id),format.raw/*175.21*/("""</td>
					<td>"""),_display_(/*176.11*/usuario/*176.18*/.nombre),format.raw/*176.25*/("""</td>
					<td>"""),_display_(/*177.11*/usuario/*177.18*/.tipo.nombre),format.raw/*177.30*/("""</td>
					<td>"""),_display_(/*178.11*/usuario/*178.18*/.username),format.raw/*178.27*/("""</td>
					<td><button class="btn btn-success btn-xs" data-toggle="modal" data-target="#mod-edit-"""),_display_(/*179.93*/usuario/*179.100*/.id),format.raw/*179.103*/(""""><span class="glyphicon glyphicon-edit"></span> Editar</button></td>
					<td><button class="btn btn-danger btn-xs" data-toggle="modal" data-target="#mod-remove-"""),_display_(/*180.94*/usuario/*180.101*/.id),format.raw/*180.104*/(""""><span class="glyphicon glyphicon-trash"></span> Eliminar</button></td>
				</tr>



				<!-- Modal -->
				<div class="modal fade" id="mod-edit-"""),_display_(/*186.43*/usuario/*186.50*/.id),format.raw/*186.53*/("""" role="dialog">
					
					<div class="modal-dialog">

					<!-- Modal content-->
					<div class="modal-content">
						"""),_display_(/*192.8*/form(action=routes.GerenteController.usuario_edit(usuario.id))/*192.70*/{_display_(Seq[Any](format.raw/*192.71*/("""
							"""),format.raw/*193.8*/("""<div class="modal-header">
								<button type="button" class="close" data-dismiss="modal">&times;</button>
								<h4 class="modal-title">Editar usuario: """),_display_(/*195.50*/usuario/*195.57*/.nombre),format.raw/*195.64*/("""</h4>
								</div>
								"""),_display_(/*197.10*/errores_formulario),format.raw/*197.28*/("""
								"""),format.raw/*198.9*/("""<div class="modal-body">


									 <div class="form-group">
					        		 	"""),_display_(/*202.19*/inputText(usuario.getForm()("id"), '_showConstraints -> false, 'readonly -> "readonly" , '_showErrors -> false,'class -> "form-control", 'placeholder -> "Id", '_label -> "Id: ")),format.raw/*202.196*/("""
					        		 """),format.raw/*203.17*/("""</div>

					        		 <div class="form-group">
					        		 	"""),_display_(/*206.19*/inputText(usuario.getForm()("nombre"), '_showConstraints -> false , '_showErrors -> false,'class -> "form-control", 'placeholder -> "Nombre del usuario", '_label -> "Nombre: ")),format.raw/*206.195*/("""
					        		 """),format.raw/*207.17*/("""</div>

					        		 <div class="form-group">
										"""),_display_(/*210.12*/select(usuario.getForm()("tipo.id"), options(TipoUsuario.options), '_showConstraints -> false , '_showErrors -> false,'class -> "form-control", 'placeholder -> "Tipo de Usuario",'_label -> "Tipo de Usuario: ")),format.raw/*210.221*/("""
									 """),format.raw/*211.11*/("""</div>

									 <div class="form-group">
										"""),_display_(/*214.12*/inputText(usuario.getForm()("username"), '_showConstraints -> false, '_showErrors -> false ,'class -> "form-control", 'placeholder -> "sn036156",'_label -> "Usuario: ")),format.raw/*214.180*/("""
									 """),format.raw/*215.11*/("""</div>

									 <div class="form-group">
										"""),_display_(/*218.12*/inputText(usuario.getForm()("password"),'type -> "password", '_showConstraints -> false , '_showErrors -> false,'class -> "form-control", 'placeholder -> "Use contraseñas seguras",'_label -> "Contraseña: ")),format.raw/*218.218*/("""
									 """),format.raw/*219.11*/("""</div>

									 <div class="form-group">
										"""),_display_(/*222.12*/inputText(usuario.getForm()("password_confirmation"),'type -> "password", '_showConstraints -> false , '_showErrors -> false,'class -> "form-control", 'placeholder -> "Use contraseñas seguras",'_label -> "Confirme Contraseña: ")),format.raw/*222.240*/("""
									 """),format.raw/*223.11*/("""</div>




								</div>
								<div class="modal-footer">
									<button type="button" class="btn btn-default" data-dismiss="modal">Cerrar</button>
									<button type="submit" class="btn btn-primary"><span class="glyphicon glyphicon-floppy-disk" aria-hidden="true"></span> Guardar</button>
								</div>
							</div>
						""")))}),format.raw/*234.8*/("""
					"""),format.raw/*235.6*/("""</div>
				</div>





				<!-- Modal -->
				<div class="modal fade" id="mod-remove-"""),_display_(/*243.45*/usuario/*243.52*/.id),format.raw/*243.55*/("""" role="dialog">
					<div class="modal-dialog">

					<!-- Modal content-->
					<div class="modal-content">
						<div class="modal-header">
							<button type="button" class="close" data-dismiss="modal">&times;</button>
							<h4 class="modal-title">Eliminar usuario: """),_display_(/*250.51*/usuario/*250.58*/.nombre),format.raw/*250.65*/("""</h4>
							</div>
							<div class="modal-body">

								¿Esta seguro que desea eliminar el usuario?.
								El usuario ya no tendra acceso al sistema.


							</div>
							<div class="modal-footer">
								<form>
								<button type="button" class="btn btn-default" data-dismiss="modal">Cerrar</button>							
								<button type="submit" class="btn btn-danger" formmethod="POST" formaction=""""),_display_(/*262.85*/routes/*262.91*/.GerenteController.usuario_remove(usuario.id)),format.raw/*262.136*/(""""><span class="glyphicon glyphicon-trash" aria-hidden="true"></span> Eliminar</button>
								</form>
							</div>
						</div>

					</div>
				</div>


			""")))}),format.raw/*271.5*/("""
		"""),format.raw/*272.3*/("""</tbody>
	</table>
	</div>

""")))}))
      }
    }
  }

  def render(usuario_form:Form[Usuario],usuarios_list:List[Usuario]): play.twirl.api.HtmlFormat.Appendable = apply(usuario_form,usuarios_list)

  def f:((Form[Usuario],List[Usuario]) => play.twirl.api.HtmlFormat.Appendable) = (usuario_form,usuarios_list) => apply(usuario_form,usuarios_list)

  def ref: this.type = this

}


}

/**/
object usuarios extends usuarios_Scope0.usuarios
              /*
                  -- GENERATED --
                  DATE: Fri Nov 11 14:32:12 CST 2016
                  SOURCE: /home/samuel/Desarrollo/siiaf/app/views/administrador/usuarios.scala.html
                  HASH: ce5b1125d4046b03a552006051c57d2e7ef6e15a
                  MATRIX: 786->1|939->81|949->84|1028->86|1056->88|1127->133|1141->139|1214->191|1240->198|1249->200|1328->202|1356->204|1396->218|1410->224|1481->275|1576->344|1615->374|1655->376|1685->379|1753->419|1782->420|1821->431|1853->436|1867->441|1901->454|1952->478|1980->479|2030->499|2061->503|2180->594|2209->595|2240->599|2298->630|2313->636|2361->663|2391->665|2420->666|2457->676|2502->694|2517->700|2565->727|2598->733|2626->734|2657->738|2685->739|2723->759|2750->777|2831->779|2861->783|2902->815|2942->817|2980->828|3035->867|3075->869|3113->879|3268->1007|3342->1060|3402->1089|3435->1092|3467->1098|3526->1141|3566->1143|3599->1149|3752->1275|3826->1328|3877->1349|3908->1354|3969->1399|4009->1401|4042->1407|4195->1533|4269->1586|4320->1607|4350->1611|4411->1656|4451->1658|4484->1664|4637->1790|4711->1843|4762->1864|4792->1868|4866->1926|4906->1928|4939->1934|5092->2060|5166->2113|5217->2134|5259->61|5286->79|5313->195|5342->754|5373->2137|5405->2143|5427->2156|5515->2235|5554->2236|5583->2238|5813->2442|5852->2472|5891->2473|5921->2476|6150->2678|6164->2683|6198->2696|6249->2717|6282->2723|6466->2880|6527->2931|6567->2932|6600->2937|6805->3115|6845->3133|6878->3138|6986->3218|7180->3389|7222->3402|7302->3455|7529->3659|7564->3666|7637->3712|7823->3875|7858->3882|7931->3928|8155->4129|8190->4136|8263->4182|8509->4405|8544->4412|8867->4704|8898->4707|9668->5450|9714->5479|9754->5480|9787->5485|9830->5500|9847->5507|9872->5510|9916->5526|9933->5533|9962->5540|10006->5556|10023->5563|10057->5575|10101->5591|10118->5598|10149->5607|10275->5705|10293->5712|10319->5715|10510->5878|10528->5885|10554->5888|10729->6035|10746->6042|10771->6045|10921->6168|10993->6230|11033->6231|11069->6239|11255->6397|11272->6404|11301->6411|11359->6441|11399->6459|11436->6468|11544->6548|11744->6725|11790->6742|11885->6809|12084->6985|12130->7002|12218->7062|12450->7271|12490->7282|12572->7336|12763->7504|12803->7515|12885->7569|13114->7775|13154->7786|13236->7840|13487->8068|13527->8079|13892->8413|13926->8419|14040->8505|14057->8512|14082->8515|14384->8789|14401->8796|14430->8803|14862->9207|14878->9213|14946->9258|15137->9418|15168->9421
                  LINES: 27->1|31->4|31->4|33->4|34->5|34->5|34->5|34->5|35->8|35->8|37->8|38->9|38->9|38->9|38->9|41->12|41->12|41->12|42->13|43->14|43->14|44->15|44->15|44->15|44->15|45->16|45->16|47->18|50->21|52->23|52->23|53->24|53->24|53->24|53->24|53->24|53->24|55->26|55->26|55->26|55->26|56->27|56->27|57->28|57->28|59->34|59->34|61->34|63->36|63->36|63->36|65->38|65->38|65->38|66->39|68->41|68->41|70->43|71->44|75->48|75->48|75->48|76->49|78->51|78->51|80->53|83->56|83->56|83->56|84->57|86->59|86->59|88->61|90->63|90->63|90->63|91->64|93->66|93->66|95->68|97->70|97->70|97->70|98->71|100->73|100->73|102->75|105->1|106->3|107->6|109->30|113->77|118->82|118->82|118->82|118->82|119->83|121->85|121->85|121->85|122->86|125->89|125->89|125->89|127->91|130->94|137->101|137->101|137->101|138->102|142->106|142->106|143->107|149->113|149->113|150->114|154->118|154->118|155->119|158->122|158->122|159->123|162->126|162->126|163->127|166->130|166->130|167->131|177->141|178->142|209->173|209->173|209->173|210->174|211->175|211->175|211->175|212->176|212->176|212->176|213->177|213->177|213->177|214->178|214->178|214->178|215->179|215->179|215->179|216->180|216->180|216->180|222->186|222->186|222->186|228->192|228->192|228->192|229->193|231->195|231->195|231->195|233->197|233->197|234->198|238->202|238->202|239->203|242->206|242->206|243->207|246->210|246->210|247->211|250->214|250->214|251->215|254->218|254->218|255->219|258->222|258->222|259->223|270->234|271->235|279->243|279->243|279->243|286->250|286->250|286->250|298->262|298->262|298->262|307->271|308->272
                  -- GENERATED --
              */
          