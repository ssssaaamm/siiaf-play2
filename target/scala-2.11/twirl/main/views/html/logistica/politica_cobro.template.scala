
package views.html.logistica

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
	
""")))};
Seq[Any](format.raw/*1.38*/("""
"""),format.raw/*3.1*/("""
"""),format.raw/*6.2*/("""

"""),format.raw/*10.2*/("""


"""),_display_(/*13.2*/logistica/*13.11*/.base("Logistica SIIAF","Politica de Cobro","(politica actual)","politica_cobro",css,js)/*13.99*/{_display_(Seq[Any](format.raw/*13.100*/("""
	
"""),format.raw/*15.1*/("""<div class="row">
	<div class="col-lg-6">
		

		<form>


			<div class="form-group">
			 	"""),_display_(/*23.7*/inputText(politica_form("duracion_periodo"),'disabled->"true", '_showConstraints -> false, '_showErrors -> false,'class -> "form-control", 'placeholder -> "Duracion de periodo en dias", '_label -> "Duracion Periodo: ")),format.raw/*23.225*/("""
			"""),format.raw/*24.4*/("""</div>

			<div class="form-group">
			 	"""),_display_(/*27.7*/inputText(politica_form("tarifa_cobro_km_sen"),'disabled->"true", '_showConstraints -> false, '_showErrors -> false,'class -> "form-control", 'placeholder -> "Tarifa en USD", '_label -> "Tarifa Km Sencillo: ")),format.raw/*27.216*/("""
			"""),format.raw/*28.4*/("""</div>

			<div class="form-group">
			 	"""),_display_(/*31.7*/inputText(politica_form("tarifa_cobro_km_car"), 'disabled->"true",'_showConstraints -> false, '_showErrors -> false,'class -> "form-control", 'placeholder -> "Tarifa en USD", '_label -> "Tarifa Km Cargado: ")),format.raw/*31.215*/("""
			"""),format.raw/*32.4*/("""</div>

			<div class="form-group">
			 	"""),_display_(/*35.7*/inputText(politica_form("tarifa_cobro_km_vac"), 'disabled->"true",'_showConstraints -> false, '_showErrors -> false,'class -> "form-control", 'placeholder -> "Tarifa en USD", '_label -> "Tarifa Km Vacio: ")),format.raw/*35.213*/("""
			"""),format.raw/*36.4*/("""</div>

			<div class="form-group">
			 	"""),_display_(/*39.7*/inputText(politica_form("tarifa_sobrepeso"), 'disabled->"true",'_showConstraints -> false, '_showErrors -> false,'class -> "form-control", 'placeholder -> "Tarifa en USD", '_label -> "Tarifa Sobrepeso: ")),format.raw/*39.211*/("""
			"""),format.raw/*40.4*/("""</div>

			<div class="form-group">
			 	"""),_display_(/*43.7*/inputText(politica_form("tarifa_cruce_frontera"), 'disabled->"true",'_showConstraints -> false, '_showErrors -> false,'class -> "form-control", 'placeholder -> "Tarifa en USD", '_label -> "Tarifa Cruce Frontera: ")),format.raw/*43.221*/("""
			"""),format.raw/*44.4*/("""</div>

		</form>
	</div>
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
                  DATE: Fri Nov 11 14:28:52 CST 2016
                  SOURCE: /home/samuel/Desarrollo/siiaf/app/views/logistica/politica_cobro.scala.html
                  HASH: 0d6e56cf841e35fcbf4b403a73eeafc01f732a0e
                  MATRIX: 786->1|915->57|925->60|1004->62|1030->69|1039->71|1118->73|1161->37|1188->55|1215->66|1244->77|1274->81|1292->90|1389->178|1429->179|1459->182|1576->273|1816->491|1847->495|1915->537|2146->746|2177->750|2245->792|2475->1000|2506->1004|2574->1046|2802->1252|2833->1256|2901->1298|3127->1502|3158->1506|3226->1548|3462->1762|3493->1766
                  LINES: 27->1|31->4|31->4|33->4|35->8|35->8|37->8|40->1|41->3|42->6|44->10|47->13|47->13|47->13|47->13|49->15|57->23|57->23|58->24|61->27|61->27|62->28|65->31|65->31|66->32|69->35|69->35|70->36|73->39|73->39|74->40|77->43|77->43|78->44
                  -- GENERATED --
              */
          