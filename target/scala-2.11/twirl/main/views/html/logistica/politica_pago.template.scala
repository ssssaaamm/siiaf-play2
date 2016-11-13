
package views.html.logistica

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
	
""")))};
Seq[Any](format.raw/*1.37*/("""
"""),format.raw/*3.1*/("""
"""),format.raw/*6.2*/("""

"""),format.raw/*10.2*/("""




"""),_display_(/*15.2*/logistica/*15.11*/.base("Manager SIIAF","Politica de Pago","(politica actual)","politica_pago",css,js)/*15.95*/{_display_(Seq[Any](format.raw/*15.96*/("""
	
"""),format.raw/*17.1*/("""<div class="row">
	<div class="col-lg-6">


		<form>


			<div class="form-group">
			 	"""),_display_(/*25.7*/inputText(politica_form("duracion_periodo"), 'disabled->"true", '_showConstraints -> false, '_showErrors -> false,'class -> "form-control", 'placeholder -> "Duracion de periodo en dias", '_label -> "Duracion Periodo: ")),format.raw/*25.226*/("""
			"""),format.raw/*26.4*/("""</div>

			<div class="form-group">
			 	"""),_display_(/*29.7*/inputText(politica_form("salario_minimo"), 'disabled->"true", '_showConstraints -> false, '_showErrors -> false,'class -> "form-control", 'placeholder -> "123.4", '_label -> "Salario Minimo: ")),format.raw/*29.200*/("""
			"""),format.raw/*30.4*/("""</div>

			<div class="form-group">
			 	"""),_display_(/*33.7*/inputText(politica_form("porcentaje_isss"), 'disabled->"true",'_showConstraints -> false, '_showErrors -> false,'class -> "form-control", 'placeholder -> "6.25", '_label -> "Porcentaje ISSS : ")),format.raw/*33.201*/("""
			"""),format.raw/*34.4*/("""</div>

			<div class="form-group">
			 	"""),_display_(/*37.7*/inputText(politica_form("porcentaje_afp"), 'disabled->"true",'_showConstraints -> false, '_showErrors -> false,'class -> "form-control", 'placeholder -> "7.75", '_label -> "Porcentaje AFP: ")),format.raw/*37.198*/("""
			"""),format.raw/*38.4*/("""</div>

			<div class="form-group">
			 	"""),_display_(/*41.7*/inputText(politica_form("tarifa_pago_km_loc"), 'disabled->"true",'_showConstraints -> false, '_showErrors -> false,'class -> "form-control", 'placeholder -> "14.75", '_label -> "Tarifa km Local: ")),format.raw/*41.204*/("""
			"""),format.raw/*42.4*/("""</div>

			<div class="form-group">
			 	"""),_display_(/*45.7*/inputText(politica_form("tarifa_pago_km_int"), 'disabled->"true",'_showConstraints -> false, '_showErrors -> false,'class -> "form-control", 'placeholder -> "14.75", '_label -> "Tarifa km Internacional: ")),format.raw/*45.212*/("""
			"""),format.raw/*46.4*/("""</div>

			<div class="form-group">
			 	"""),_display_(/*49.7*/inputText(politica_form("porcentaje_sobrepeso"), 'disabled->"true",'_showConstraints -> false, '_showErrors -> false,'class -> "form-control", 'placeholder -> "0.50", '_label -> "Porcentaje Sobrepeso: ")),format.raw/*49.210*/("""
			"""),format.raw/*50.4*/("""</div>

			<div class="form-group">
			 	"""),_display_(/*53.7*/inputText(politica_form("tarifa_viatico_vv"), 'disabled->"true",'_showConstraints -> false, '_showErrors -> false,'class -> "form-control", 'placeholder -> "14.75", '_label -> "Tarifa viatico V/V: ")),format.raw/*53.206*/("""
			"""),format.raw/*54.4*/("""</div>
			
			<div class="form-group">
			 	"""),_display_(/*57.7*/inputText(politica_form("tarifa_viatico_vc"), 'disabled->"true",'_showConstraints -> false, '_showErrors -> false,'class -> "form-control", 'placeholder -> "14.75", '_label -> "Tarifa viatico V/C: ")),format.raw/*57.206*/("""
			"""),format.raw/*58.4*/("""</div>
			<div class="form-group">
			 	"""),_display_(/*60.7*/inputText(politica_form("tarifa_viatico_cc"), 'disabled->"true",'_showConstraints -> false, '_showErrors -> false,'class -> "form-control", 'placeholder -> "14.75", '_label -> "Tarifa viatico C/C: ")),format.raw/*60.206*/("""
			"""),format.raw/*61.4*/("""</div>
			

		</form>
	</div>
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
                  DATE: Fri Nov 11 14:28:52 CST 2016
                  SOURCE: /home/samuel/Desarrollo/siiaf/app/views/logistica/politica_pago.scala.html
                  HASH: d1e4d7cdbf91134e71bce5bf10df30ad0b01e94e
                  MATRIX: 783->1|911->56|921->59|1000->61|1026->68|1035->70|1114->72|1157->36|1184->54|1211->65|1240->76|1272->82|1290->91|1383->175|1422->176|1452->179|1567->268|1808->487|1839->491|1907->533|2122->726|2153->730|2221->772|2437->966|2468->970|2536->1012|2749->1203|2780->1207|2848->1249|3067->1446|3098->1450|3166->1492|3393->1697|3424->1701|3492->1743|3717->1946|3748->1950|3816->1992|4037->2191|4068->2195|4139->2240|4360->2439|4391->2443|4458->2484|4679->2683|4710->2687
                  LINES: 27->1|31->4|31->4|33->4|35->8|35->8|37->8|40->1|41->3|42->6|44->10|49->15|49->15|49->15|49->15|51->17|59->25|59->25|60->26|63->29|63->29|64->30|67->33|67->33|68->34|71->37|71->37|72->38|75->41|75->41|76->42|79->45|79->45|80->46|83->49|83->49|84->50|87->53|87->53|88->54|91->57|91->57|92->58|94->60|94->60|95->61
                  -- GENERATED --
              */
          