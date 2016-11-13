
package views.html.gerente

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object politica_cobro_Scope0 {
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

class politica_cobro extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[PoliticaCobro],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(politica_form: Form[PoliticaCobro]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._
def /*4.2*/css/*4.5*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*4.7*/("""
	
""")))};def /*8.2*/js/*8.4*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*8.6*/("""
	
""")))};def /*13.2*/errores_formulario/*13.20*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*13.22*/("""

	"""),_display_(/*15.3*/if(politica_form.hasGlobalErrors)/*15.36*/ {_display_(Seq[Any](format.raw/*15.38*/("""

        """),_display_(/*17.10*/for(error <- politica_form.globalErrors) yield /*17.50*/ {_display_(Seq[Any](format.raw/*17.52*/("""
	        """),format.raw/*18.10*/("""<div class="alert alert-danger">
				<a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
				<strong>"""),_display_(/*20.14*/Messages(error.messages, error.arguments.toArray: _*)),format.raw/*20.67*/("""</strong>
			</div>
        """)))}),format.raw/*22.10*/("""
	""")))}),format.raw/*23.3*/("""



	"""),_display_(/*27.3*/for(error <- politica_form("duracion_periodo").errors) yield /*27.57*/ {_display_(Seq[Any](format.raw/*27.59*/("""
    	"""),format.raw/*28.6*/("""<div class="alert alert-danger">
			<a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
			<strong>"""),_display_(/*30.13*/Messages(error.messages, error.arguments.toArray: _*)),format.raw/*30.66*/("""</strong>
		</div>
	""")))}),format.raw/*32.3*/("""


	"""),_display_(/*35.3*/for(error <- politica_form("tarifa_cobro_km_sen").errors) yield /*35.60*/ {_display_(Seq[Any](format.raw/*35.62*/("""
    	"""),format.raw/*36.6*/("""<div class="alert alert-danger">
			<a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
			<strong>"""),_display_(/*38.13*/Messages(error.messages, error.arguments.toArray: _*)),format.raw/*38.66*/("""</strong>
		</div>
	""")))}),format.raw/*40.3*/("""



	"""),_display_(/*44.3*/for(error <- politica_form("tarifa_cobro_km_car").errors) yield /*44.60*/ {_display_(Seq[Any](format.raw/*44.62*/("""
    	"""),format.raw/*45.6*/("""<div class="alert alert-danger">
			<a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
			<strong>"""),_display_(/*47.13*/Messages(error.messages, error.arguments.toArray: _*)),format.raw/*47.66*/("""</strong>
		</div>
	""")))}),format.raw/*49.3*/("""

	"""),_display_(/*51.3*/for(error <- politica_form("tarifa_cobro_km_vac").errors) yield /*51.60*/ {_display_(Seq[Any](format.raw/*51.62*/("""
    	"""),format.raw/*52.6*/("""<div class="alert alert-danger">
			<a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
			<strong>"""),_display_(/*54.13*/Messages(error.messages, error.arguments.toArray: _*)),format.raw/*54.66*/("""</strong>
		</div>
	""")))}),format.raw/*56.3*/("""

	"""),_display_(/*58.3*/for(error <- politica_form("tarifa_sobrepeso").errors) yield /*58.57*/ {_display_(Seq[Any](format.raw/*58.59*/("""
    	"""),format.raw/*59.6*/("""<div class="alert alert-danger">
			<a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
			<strong>"""),_display_(/*61.13*/Messages(error.messages, error.arguments.toArray: _*)),format.raw/*61.66*/("""</strong>
		</div>
	""")))}),format.raw/*63.3*/("""

	"""),_display_(/*65.3*/for(error <- politica_form("tarifa_cruce_frontera").errors) yield /*65.62*/ {_display_(Seq[Any](format.raw/*65.64*/("""
    	"""),format.raw/*66.6*/("""<div class="alert alert-danger">
			<a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
			<strong>"""),_display_(/*68.13*/Messages(error.messages, error.arguments.toArray: _*)),format.raw/*68.66*/("""</strong>
		</div>
	""")))}),format.raw/*70.3*/("""


""")))};
Seq[Any](format.raw/*1.38*/("""
"""),format.raw/*3.1*/("""
"""),format.raw/*6.2*/("""

"""),format.raw/*10.2*/("""


"""),format.raw/*73.2*/("""

"""),_display_(/*75.2*/gerente/*75.9*/.base("Manager SIIAF","Politica de Cobro","Configuracion","politica_cobro",css,js)/*75.91*/{_display_(Seq[Any](format.raw/*75.92*/("""
	
"""),format.raw/*77.1*/("""<div class="row">
	<div class="col-lg-6">
		"""),_display_(/*79.4*/if(flash.containsKey("exito"))/*79.34*/{_display_(Seq[Any](format.raw/*79.35*/("""
		"""),format.raw/*80.3*/("""<div class="alert alert-success fade in">
			<a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
			<span class="glyphicon glyphicon-ok" aria-hidden="true"></span>
			<strong>"""),_display_(/*83.13*/flash/*83.18*/.get("exito")),format.raw/*83.31*/("""</strong>
		</div>
		""")))}),format.raw/*85.4*/("""

		"""),_display_(/*87.4*/errores_formulario),format.raw/*87.22*/("""


		"""),_display_(/*90.4*/form(action=routes.GerenteController.politica_cobro_post())/*90.63*/{_display_(Seq[Any](format.raw/*90.64*/("""


			"""),format.raw/*93.4*/("""<div class="form-group">
			 	"""),_display_(/*94.7*/inputText(politica_form("duracion_periodo"), '_showConstraints -> false, '_showErrors -> false,'class -> "form-control", 'placeholder -> "Duracion de periodo en dias", '_label -> "Duracion Periodo: ")),format.raw/*94.207*/("""
			"""),format.raw/*95.4*/("""</div>

			<div class="form-group">
			 	"""),_display_(/*98.7*/inputText(politica_form("tarifa_cobro_km_sen"), '_showConstraints -> false, '_showErrors -> false,'class -> "form-control", 'placeholder -> "Tarifa en USD", '_label -> "Tarifa Km Sencillo: ")),format.raw/*98.198*/("""
			"""),format.raw/*99.4*/("""</div>

			<div class="form-group">
			 	"""),_display_(/*102.7*/inputText(politica_form("tarifa_cobro_km_car"), '_showConstraints -> false, '_showErrors -> false,'class -> "form-control", 'placeholder -> "Tarifa en USD", '_label -> "Tarifa Km Cargado: ")),format.raw/*102.197*/("""
			"""),format.raw/*103.4*/("""</div>

			<div class="form-group">
			 	"""),_display_(/*106.7*/inputText(politica_form("tarifa_cobro_km_vac"), '_showConstraints -> false, '_showErrors -> false,'class -> "form-control", 'placeholder -> "Tarifa en USD", '_label -> "Tarifa Km Vacio: ")),format.raw/*106.195*/("""
			"""),format.raw/*107.4*/("""</div>

			<div class="form-group">
			 	"""),_display_(/*110.7*/inputText(politica_form("tarifa_sobrepeso"), '_showConstraints -> false, '_showErrors -> false,'class -> "form-control", 'placeholder -> "Tarifa en USD", '_label -> "Tarifa Sobrepeso: ")),format.raw/*110.193*/("""
			"""),format.raw/*111.4*/("""</div>

			<div class="form-group">
			 	"""),_display_(/*114.7*/inputText(politica_form("tarifa_cruce_frontera"), '_showConstraints -> false, '_showErrors -> false,'class -> "form-control", 'placeholder -> "Tarifa en USD", '_label -> "Tarifa Cruce Frontera: ")),format.raw/*114.203*/("""
			"""),format.raw/*115.4*/("""</div>

			<button type="submit" class="btn btn-primary form-control"><span class="glyphicon glyphicon-floppy-disk" aria-hidden="true"></span> Cambiar Politica de Cobro</button>

		""")))}),format.raw/*119.4*/("""
	"""),format.raw/*120.2*/("""</div>
</div>
	
""")))}))
      }
    }
  }

  def render(politica_form:Form[PoliticaCobro]): play.twirl.api.HtmlFormat.Appendable = apply(politica_form)

  def f:((Form[PoliticaCobro]) => play.twirl.api.HtmlFormat.Appendable) = (politica_form) => apply(politica_form)

  def ref: this.type = this

}


}

/**/
object politica_cobro extends politica_cobro_Scope0.politica_cobro
              /*
                  -- GENERATED --
                  DATE: Wed Nov 09 10:35:31 CST 2016
                  SOURCE: /home/samuel/Desarrollo/siiaf/app/views/gerente/politica_cobro.scala.html
                  HASH: 5bfee32f3e0d428836f21ad55d06619ea27903a2
                  MATRIX: 784->1|913->57|923->60|1002->62|1028->69|1037->71|1116->73|1143->81|1170->99|1251->101|1281->105|1323->138|1363->140|1401->151|1457->191|1497->193|1535->203|1690->331|1764->384|1824->413|1857->416|1889->422|1959->476|1999->478|2032->484|2185->610|2259->663|2310->684|2341->689|2414->746|2454->748|2487->754|2640->880|2714->933|2765->954|2797->960|2870->1017|2910->1019|2943->1025|3096->1151|3170->1204|3221->1225|3251->1229|3324->1286|3364->1288|3397->1294|3550->1420|3624->1473|3675->1494|3705->1498|3775->1552|3815->1554|3848->1560|4001->1686|4075->1739|4126->1760|4156->1764|4231->1823|4271->1825|4304->1831|4457->1957|4531->2010|4582->2031|4625->37|4652->55|4679->66|4708->77|4738->2035|4767->2038|4782->2045|4873->2127|4912->2128|4942->2131|5013->2176|5052->2206|5091->2207|5121->2210|5350->2412|5364->2417|5398->2430|5450->2452|5481->2457|5520->2475|5552->2481|5620->2540|5659->2541|5692->2547|5749->2578|5971->2778|6002->2782|6070->2824|6283->3015|6314->3019|6383->3061|6596->3251|6628->3255|6697->3297|6908->3485|6940->3489|7009->3531|7218->3717|7250->3721|7319->3763|7538->3959|7570->3963|7783->4145|7813->4147
                  LINES: 27->1|31->4|31->4|33->4|35->8|35->8|37->8|39->13|39->13|41->13|43->15|43->15|43->15|45->17|45->17|45->17|46->18|48->20|48->20|50->22|51->23|55->27|55->27|55->27|56->28|58->30|58->30|60->32|63->35|63->35|63->35|64->36|66->38|66->38|68->40|72->44|72->44|72->44|73->45|75->47|75->47|77->49|79->51|79->51|79->51|80->52|82->54|82->54|84->56|86->58|86->58|86->58|87->59|89->61|89->61|91->63|93->65|93->65|93->65|94->66|96->68|96->68|98->70|102->1|103->3|104->6|106->10|109->73|111->75|111->75|111->75|111->75|113->77|115->79|115->79|115->79|116->80|119->83|119->83|119->83|121->85|123->87|123->87|126->90|126->90|126->90|129->93|130->94|130->94|131->95|134->98|134->98|135->99|138->102|138->102|139->103|142->106|142->106|143->107|146->110|146->110|147->111|150->114|150->114|151->115|155->119|156->120
                  -- GENERATED --
              */
          