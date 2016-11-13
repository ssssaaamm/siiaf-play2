
package views.html.gerente

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object politica_pago_Scope0 {
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

class politica_pago extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[PoliticaPago],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(politica_form: Form[PoliticaPago]):play.twirl.api.HtmlFormat.Appendable = {
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


	"""),_display_(/*35.3*/for(error <- politica_form("salario_minimo").errors) yield /*35.55*/ {_display_(Seq[Any](format.raw/*35.57*/("""
    	"""),format.raw/*36.6*/("""<div class="alert alert-danger">
			<a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
			<strong>"""),_display_(/*38.13*/Messages(error.messages, error.arguments.toArray: _*)),format.raw/*38.66*/("""</strong>
		</div>
	""")))}),format.raw/*40.3*/("""



	"""),_display_(/*44.3*/for(error <- politica_form("porcentaje_isss").errors) yield /*44.56*/ {_display_(Seq[Any](format.raw/*44.58*/("""
    	"""),format.raw/*45.6*/("""<div class="alert alert-danger">
			<a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
			<strong>"""),_display_(/*47.13*/Messages(error.messages, error.arguments.toArray: _*)),format.raw/*47.66*/("""</strong>
		</div>
	""")))}),format.raw/*49.3*/("""

	"""),_display_(/*51.3*/for(error <- politica_form("porcentaje_afp").errors) yield /*51.55*/ {_display_(Seq[Any](format.raw/*51.57*/("""
    	"""),format.raw/*52.6*/("""<div class="alert alert-danger">
			<a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
			<strong>"""),_display_(/*54.13*/Messages(error.messages, error.arguments.toArray: _*)),format.raw/*54.66*/("""</strong>
		</div>
	""")))}),format.raw/*56.3*/("""


	"""),_display_(/*59.3*/for(error <- politica_form("tarifa_pago_km_loc").errors) yield /*59.59*/ {_display_(Seq[Any](format.raw/*59.61*/("""
    	"""),format.raw/*60.6*/("""<div class="alert alert-danger">
			<a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
			<strong>"""),_display_(/*62.13*/Messages(error.messages, error.arguments.toArray: _*)),format.raw/*62.66*/("""</strong>
		</div>
	""")))}),format.raw/*64.3*/("""

	"""),_display_(/*66.3*/for(error <- politica_form("tarifa_pago_km_int").errors) yield /*66.59*/ {_display_(Seq[Any](format.raw/*66.61*/("""
    	"""),format.raw/*67.6*/("""<div class="alert alert-danger">
			<a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
			<strong>"""),_display_(/*69.13*/Messages(error.messages, error.arguments.toArray: _*)),format.raw/*69.66*/("""</strong>
		</div>
	""")))}),format.raw/*71.3*/("""
	
	"""),_display_(/*73.3*/for(error <- politica_form("porcentaje_sobrepeso").errors) yield /*73.61*/ {_display_(Seq[Any](format.raw/*73.63*/("""
    	"""),format.raw/*74.6*/("""<div class="alert alert-danger">
			<a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
			<strong>"""),_display_(/*76.13*/Messages(error.messages, error.arguments.toArray: _*)),format.raw/*76.66*/("""</strong>
		</div>
	""")))}),format.raw/*78.3*/("""

	"""),_display_(/*80.3*/for(error <- politica_form("tarifa_viatico_km_vv").errors) yield /*80.61*/ {_display_(Seq[Any](format.raw/*80.63*/("""
    	"""),format.raw/*81.6*/("""<div class="alert alert-danger">
			<a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
			<strong>"""),_display_(/*83.13*/Messages(error.messages, error.arguments.toArray: _*)),format.raw/*83.66*/("""</strong>
		</div>
	""")))}),format.raw/*85.3*/("""

	"""),_display_(/*87.3*/for(error <- politica_form("tarifa_viatico_km_vc").errors) yield /*87.61*/ {_display_(Seq[Any](format.raw/*87.63*/("""
    	"""),format.raw/*88.6*/("""<div class="alert alert-danger">
			<a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
			<strong>"""),_display_(/*90.13*/Messages(error.messages, error.arguments.toArray: _*)),format.raw/*90.66*/("""</strong>
		</div>
	""")))}),format.raw/*92.3*/("""

	"""),_display_(/*94.3*/for(error <- politica_form("tarifa_viatico_km_cc").errors) yield /*94.61*/ {_display_(Seq[Any](format.raw/*94.63*/("""
    	"""),format.raw/*95.6*/("""<div class="alert alert-danger">
			<a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
			<strong>"""),_display_(/*97.13*/Messages(error.messages, error.arguments.toArray: _*)),format.raw/*97.66*/("""</strong>
		</div>
	""")))}),format.raw/*99.3*/("""

""")))};
Seq[Any](format.raw/*1.37*/("""
"""),format.raw/*3.1*/("""
"""),format.raw/*6.2*/("""

"""),format.raw/*10.2*/("""


"""),format.raw/*101.2*/("""

"""),_display_(/*103.2*/gerente/*103.9*/.base("Manager SIIAF","Politica de Pago","Configuracion","politica_pago",css,js)/*103.89*/{_display_(Seq[Any](format.raw/*103.90*/("""
	
"""),format.raw/*105.1*/("""<div class="row">
	<div class="col-lg-6">
		"""),_display_(/*107.4*/if(flash.containsKey("exito"))/*107.34*/{_display_(Seq[Any](format.raw/*107.35*/("""
		"""),format.raw/*108.3*/("""<div class="alert alert-success fade in">
			<a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
			<span class="glyphicon glyphicon-ok" aria-hidden="true"></span>
			<strong>"""),_display_(/*111.13*/flash/*111.18*/.get("exito")),format.raw/*111.31*/("""</strong>
		</div>
		""")))}),format.raw/*113.4*/("""

		"""),_display_(/*115.4*/errores_formulario),format.raw/*115.22*/("""


		"""),_display_(/*118.4*/form(action=routes.GerenteController.politica_pago_post())/*118.62*/{_display_(Seq[Any](format.raw/*118.63*/("""


			"""),format.raw/*121.4*/("""<div class="form-group">
			 	"""),_display_(/*122.7*/inputText(politica_form("duracion_periodo"), '_showConstraints -> false, '_showErrors -> false,'class -> "form-control", 'placeholder -> "Duracion de periodo en dias", '_label -> "Duracion Periodo: ")),format.raw/*122.207*/("""
			"""),format.raw/*123.4*/("""</div>

			<div class="form-group">
			 	"""),_display_(/*126.7*/inputText(politica_form("salario_minimo"), '_showConstraints -> false, '_showErrors -> false,'class -> "form-control", 'placeholder -> "123.4", '_label -> "Salario Minimo: ")),format.raw/*126.181*/("""
			"""),format.raw/*127.4*/("""</div>

			<div class="form-group">
			 	"""),_display_(/*130.7*/inputText(politica_form("porcentaje_isss"), '_showConstraints -> false, '_showErrors -> false,'class -> "form-control", 'placeholder -> "6.25", '_label -> "Porcentaje ISSS : ")),format.raw/*130.183*/("""
			"""),format.raw/*131.4*/("""</div>

			<div class="form-group">
			 	"""),_display_(/*134.7*/inputText(politica_form("porcentaje_afp"), '_showConstraints -> false, '_showErrors -> false,'class -> "form-control", 'placeholder -> "7.75", '_label -> "Porcentaje AFP: ")),format.raw/*134.180*/("""
			"""),format.raw/*135.4*/("""</div>

			<div class="form-group">
			 	"""),_display_(/*138.7*/inputText(politica_form("tarifa_pago_km_loc"), '_showConstraints -> false, '_showErrors -> false,'class -> "form-control", 'placeholder -> "14.75", '_label -> "Tarifa km Local: ")),format.raw/*138.186*/("""
			"""),format.raw/*139.4*/("""</div>

			<div class="form-group">
			 	"""),_display_(/*142.7*/inputText(politica_form("tarifa_pago_km_int"), '_showConstraints -> false, '_showErrors -> false,'class -> "form-control", 'placeholder -> "14.75", '_label -> "Tarifa km Internacional: ")),format.raw/*142.194*/("""
			"""),format.raw/*143.4*/("""</div>

			<div class="form-group">
			 	"""),_display_(/*146.7*/inputText(politica_form("porcentaje_sobrepeso"), '_showConstraints -> false, '_showErrors -> false,'class -> "form-control", 'placeholder -> "0.50", '_label -> "Porcentaje Sobrepeso: ")),format.raw/*146.192*/("""
			"""),format.raw/*147.4*/("""</div>

			<div class="form-group">
			 	"""),_display_(/*150.7*/inputText(politica_form("tarifa_viatico_vv"), '_showConstraints -> false, '_showErrors -> false,'class -> "form-control", 'placeholder -> "14.75", '_label -> "Tarifa viatico V/V: ")),format.raw/*150.188*/("""
			"""),format.raw/*151.4*/("""</div>
			
			<div class="form-group">
			 	"""),_display_(/*154.7*/inputText(politica_form("tarifa_viatico_vc"), '_showConstraints -> false, '_showErrors -> false,'class -> "form-control", 'placeholder -> "14.75", '_label -> "Tarifa viatico V/C: ")),format.raw/*154.188*/("""
			"""),format.raw/*155.4*/("""</div>
			<div class="form-group">
			 	"""),_display_(/*157.7*/inputText(politica_form("tarifa_viatico_cc"), '_showConstraints -> false, '_showErrors -> false,'class -> "form-control", 'placeholder -> "14.75", '_label -> "Tarifa viatico C/C: ")),format.raw/*157.188*/("""
			"""),format.raw/*158.4*/("""</div>
			
			<button type="submit" class="btn btn-primary form-control"><span class="glyphicon glyphicon-floppy-disk" aria-hidden="true"></span> Cambiar Politica de Cobro</button>

		""")))}),format.raw/*162.4*/("""
	"""),format.raw/*163.2*/("""</div>
</div>
	
""")))}))
      }
    }
  }

  def render(politica_form:Form[PoliticaPago]): play.twirl.api.HtmlFormat.Appendable = apply(politica_form)

  def f:((Form[PoliticaPago]) => play.twirl.api.HtmlFormat.Appendable) = (politica_form) => apply(politica_form)

  def ref: this.type = this

}


}

/**/
object politica_pago extends politica_pago_Scope0.politica_pago
              /*
                  -- GENERATED --
                  DATE: Fri Nov 11 02:17:59 CST 2016
                  SOURCE: /home/samuel/Desarrollo/siiaf/app/views/gerente/politica_pago.scala.html
                  HASH: 6a3bc39da392095126cf84dabf7ac8bbc2bf9200
                  MATRIX: 781->1|909->56|919->59|998->61|1024->68|1033->70|1112->72|1139->80|1166->98|1247->100|1277->104|1319->137|1359->139|1397->150|1453->190|1493->192|1531->202|1686->330|1760->383|1820->412|1853->415|1885->421|1955->475|1995->477|2028->483|2181->609|2255->662|2306->683|2337->688|2405->740|2445->742|2478->748|2631->874|2705->927|2756->948|2788->954|2857->1007|2897->1009|2930->1015|3083->1141|3157->1194|3208->1215|3238->1219|3306->1271|3346->1273|3379->1279|3532->1405|3606->1458|3657->1479|3688->1484|3760->1540|3800->1542|3833->1548|3986->1674|4060->1727|4111->1748|4141->1752|4213->1808|4253->1810|4286->1816|4439->1942|4513->1995|4564->2016|4595->2021|4669->2079|4709->2081|4742->2087|4895->2213|4969->2266|5020->2287|5050->2291|5124->2349|5164->2351|5197->2357|5350->2483|5424->2536|5475->2557|5505->2561|5579->2619|5619->2621|5652->2627|5805->2753|5879->2806|5930->2827|5960->2831|6034->2889|6074->2891|6107->2897|6260->3023|6334->3076|6385->3097|6427->36|6454->54|6481->65|6510->76|6541->3100|6571->3103|6587->3110|6677->3190|6717->3191|6748->3194|6820->3239|6860->3269|6900->3270|6931->3273|7161->3475|7176->3480|7211->3493|7264->3515|7296->3520|7336->3538|7369->3544|7437->3602|7477->3603|7511->3609|7569->3640|7792->3840|7824->3844|7893->3886|8090->4060|8122->4064|8191->4106|8390->4282|8422->4286|8491->4328|8687->4501|8719->4505|8788->4547|8990->4726|9022->4730|9091->4772|9301->4959|9333->4963|9402->5005|9610->5190|9642->5194|9711->5236|9915->5417|9947->5421|10019->5466|10223->5647|10255->5651|10323->5692|10527->5873|10559->5877|10775->6062|10805->6064
                  LINES: 27->1|31->4|31->4|33->4|35->8|35->8|37->8|39->13|39->13|41->13|43->15|43->15|43->15|45->17|45->17|45->17|46->18|48->20|48->20|50->22|51->23|55->27|55->27|55->27|56->28|58->30|58->30|60->32|63->35|63->35|63->35|64->36|66->38|66->38|68->40|72->44|72->44|72->44|73->45|75->47|75->47|77->49|79->51|79->51|79->51|80->52|82->54|82->54|84->56|87->59|87->59|87->59|88->60|90->62|90->62|92->64|94->66|94->66|94->66|95->67|97->69|97->69|99->71|101->73|101->73|101->73|102->74|104->76|104->76|106->78|108->80|108->80|108->80|109->81|111->83|111->83|113->85|115->87|115->87|115->87|116->88|118->90|118->90|120->92|122->94|122->94|122->94|123->95|125->97|125->97|127->99|130->1|131->3|132->6|134->10|137->101|139->103|139->103|139->103|139->103|141->105|143->107|143->107|143->107|144->108|147->111|147->111|147->111|149->113|151->115|151->115|154->118|154->118|154->118|157->121|158->122|158->122|159->123|162->126|162->126|163->127|166->130|166->130|167->131|170->134|170->134|171->135|174->138|174->138|175->139|178->142|178->142|179->143|182->146|182->146|183->147|186->150|186->150|187->151|190->154|190->154|191->155|193->157|193->157|194->158|198->162|199->163
                  -- GENERATED --
              */
          