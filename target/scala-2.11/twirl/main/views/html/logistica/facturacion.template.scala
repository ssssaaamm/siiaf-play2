
package views.html.logistica

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object facturacion_Scope0 {
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

class facturacion extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[DetalleCobro],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(detalles: List[DetalleCobro]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import scala.math.BigDecimal
import helper._
def /*5.2*/css/*5.5*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*5.7*/("""
	"""),format.raw/*6.2*/("""<link rel="stylesheet" media="screen" href=""""),_display_(/*6.47*/routes/*6.53*/.Assets.versioned("stylesheets/bootstrap-table.css")),format.raw/*6.105*/("""">
	<link rel="stylesheet" media="screen" href=""""),_display_(/*7.47*/routes/*7.53*/.Assets.versioned("stylesheets/vertical-table.css")),format.raw/*7.104*/("""">
<style>
	.popover-content """),format.raw/*9.19*/("""{"""),format.raw/*9.20*/("""
  """),format.raw/*10.3*/("""height: 200px;
  overflow-y: auto;
 """),format.raw/*12.2*/("""}"""),format.raw/*12.3*/("""
 """),format.raw/*13.2*/("""</style>
""")))};def /*16.2*/js/*16.4*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*16.6*/("""
	"""),format.raw/*17.2*/("""<script src=""""),_display_(/*17.16*/routes/*17.22*/.Assets.versioned("javascripts/bootstrap-table.js")),format.raw/*17.73*/("""" type="text/javascript"></script>
	<script src=""""),_display_(/*18.16*/routes/*18.22*/.Assets.versioned("javascripts/export/tableExport.js")),format.raw/*18.76*/("""" type="text/javascript"></script>
	<script src=""""),_display_(/*19.16*/routes/*19.22*/.Assets.versioned("javascripts/export/jquery.base64.js")),format.raw/*19.78*/("""" type="text/javascript"></script>
	<script src=""""),_display_(/*20.16*/routes/*20.22*/.Assets.versioned("javascripts/export/html2canvas.js")),format.raw/*20.76*/("""" type="text/javascript"></script>
	<script src=""""),_display_(/*21.16*/routes/*21.22*/.Assets.versioned("javascripts/export/jspdf/libs/sprintf.js")),format.raw/*21.83*/("""" type="text/javascript"></script>
	<script src=""""),_display_(/*22.16*/routes/*22.22*/.Assets.versioned("javascripts/export/jspdf/jspdf.js")),format.raw/*22.76*/("""" type="text/javascript"></script>
	<script src=""""),_display_(/*23.16*/routes/*23.22*/.Assets.versioned("javascripts/export/jspdf/libs/base64.js")),format.raw/*23.82*/("""" type="text/javascript"></script>

	<script>
		$(document).ready(function()"""),format.raw/*26.31*/("""{"""),format.raw/*26.32*/("""
		    """),format.raw/*27.7*/("""$('[data-toggle="popover"]').popover();
		"""),format.raw/*28.3*/("""}"""),format.raw/*28.4*/(""");


		$(document).on('click', function (e) """),format.raw/*31.40*/("""{"""),format.raw/*31.41*/("""
		    """),format.raw/*32.7*/("""$('[data-toggle="popover"],[data-original-title]').each(function () """),format.raw/*32.75*/("""{"""),format.raw/*32.76*/("""
		        """),format.raw/*33.11*/("""//the 'is' for buttons that trigger popups
		        //the 'has' for icons within a button that triggers a popup
		        if (!$(this).is(e.target) && $(this).has(e.target).length === 0 && $('.popover').has(e.target).length === 0) """),format.raw/*35.120*/("""{"""),format.raw/*35.121*/("""                
		            """),format.raw/*36.15*/("""(($(this).popover('hide').data('bs.popover')||"""),format.raw/*36.61*/("""{"""),format.raw/*36.62*/("""}"""),format.raw/*36.63*/(""").inState||"""),format.raw/*36.74*/("""{"""),format.raw/*36.75*/("""}"""),format.raw/*36.76*/(""").click = false  // fix for BS 3.3.6
		        """),format.raw/*37.11*/("""}"""),format.raw/*37.12*/("""

		    """),format.raw/*39.7*/("""}"""),format.raw/*39.8*/(""");
		"""),format.raw/*40.3*/("""}"""),format.raw/*40.4*/(""");
</script>				
""")))};
Seq[Any](format.raw/*1.32*/("""
"""),format.raw/*4.1*/("""
"""),format.raw/*14.2*/("""

"""),format.raw/*42.2*/("""

"""),_display_(/*44.2*/logistica/*44.11*/.base("Logistic SIIAF","Facturacion de Clientes","Detalles de cobro","planilla",css,js)/*44.98*/{_display_(Seq[Any](format.raw/*44.99*/("""
	

	"""),format.raw/*47.2*/("""<div class="table-responsive">
		<button type="button" class="btn btn-warning" onclick="$('#planilla-table').tableExport("""),format.raw/*48.91*/("""{"""),format.raw/*48.92*/("""type:'excel',escape:'false'"""),format.raw/*48.119*/("""}"""),format.raw/*48.120*/(""");"><span class="glyphicon glyphicon-export"> Exportar excel</span></button>
	  <div class="form-group pull-right">
			<input type="text" class="search1 form-control" placeholder="Busqueda">
	  </div>
	  <span class="counter1 pull-right"></span>
	  <table class="table table-hover table-bordered results1" id="planilla-table">
		  <thead>
			<tr>
				
				<th></th>
				<th colspan="6"><center>Locales</center></th>
				<th colspan="6"><center>Internacionales</center></th>
				<th colspan="2"><center>V. Agregados</center></th>
				<th></th><!-- total_cobro_periodo -->
				

			</tr>
			<tr class="warning no-result1">
				<td colspan="4"><i class="fa fa-warning"></i> No hay resultados</td>
			</tr>
		
			
			<tr>
				<th rowspan="1"><center>Cliente</center></th>
				<th><center>Sencillo</center></th><!-- kilometros locales sencillos-->
				<th><center>Monto</center></th><!-- monto locales sencillos-->
				<th><center>Vacio</center></th><!-- kilometros locales vacio -->
				<th><center>Monto</center></th><!-- monto locales vacio-->
				<th><center>Cargado</center></th><!-- kilometros locales cargado -->
				<th><center>Monto</center></th><!-- monto locales cargado-->
				
				<th><center>Sencillo</center></th><!-- kilometros internacionales sencillos-->
				<th><center>Monto</center></th><!-- monto internacionales sencillos-->
				<th><center>Vacio</center></th><!-- kilometros internacionales vacio -->
				<th><center>Monto</center></th><!-- monto internacionales vacio-->
				<th><center>Cargado</center></th><!-- kilometros internacionales cargado -->
				<th><center>Monto</center></th><!-- monto internacionales cargado-->

				<th><center>Cantidad</center></th>
				<th><center>Monto</center></th>
				
				<th><center>Total cobro</center></th>
			</tr>
		</thead>
		<tbody>
			"""),_display_(/*93.5*/for(detalle <- detalles) yield /*93.29*/{_display_(Seq[Any](format.raw/*93.30*/("""
				"""),format.raw/*94.5*/("""<tr>
					<td>"""),_display_(/*95.11*/detalle/*95.18*/.cliente.nombre),format.raw/*95.33*/("""</td><!-- nombre -->
					<!-- <td>"""),_display_(/*96.16*/detalle/*96.23*/.total_viajes_locales),format.raw/*96.44*/("""</td> viajes locales --> 
					<td>"""),_display_(/*97.11*/BigDecimal(detalle.total_km_sen_locales)/*97.51*/.setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble),format.raw/*97.105*/(""" """),format.raw/*97.106*/("""km</td> <!-- km locales-->
					<td>$"""),_display_(/*98.12*/BigDecimal(detalle.total_mont_sen_locales)/*98.54*/.setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble),format.raw/*98.108*/("""</td><!-- monto locales -->
					<td>"""),_display_(/*99.11*/BigDecimal(detalle.total_km_vac_locales)/*99.51*/.setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble),format.raw/*99.105*/(""" """),format.raw/*99.106*/("""km</td> <!-- km locales-->
					<td>$"""),_display_(/*100.12*/BigDecimal(detalle.total_mont_vac_locales)/*100.54*/.setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble),format.raw/*100.108*/("""</td><!-- monto locales -->
					<td>"""),_display_(/*101.11*/BigDecimal(detalle.total_km_car_locales)/*101.51*/.setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble),format.raw/*101.105*/(""" """),format.raw/*101.106*/("""km</td> <!-- km locales-->
					<td>$"""),_display_(/*102.12*/BigDecimal(detalle.total_mont_car_locales)/*102.54*/.setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble),format.raw/*102.108*/("""</td><!-- monto locales -->


					<td>"""),_display_(/*105.11*/BigDecimal(detalle.total_km_sen_internacionales)/*105.59*/.setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble),format.raw/*105.113*/(""" """),format.raw/*105.114*/("""km</td> <!-- km internacionales-->
					<td>$"""),_display_(/*106.12*/BigDecimal(detalle.total_mont_sen_internacionales)/*106.62*/.setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble),format.raw/*106.116*/("""</td><!-- mont internacionales -->
					<td>"""),_display_(/*107.11*/BigDecimal(detalle.total_km_vac_internacionales)/*107.59*/.setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble),format.raw/*107.113*/(""" """),format.raw/*107.114*/("""km</td> <!-- km  internecionas-->
					<td>$"""),_display_(/*108.12*/BigDecimal(detalle.total_mont_vac_internacionales)/*108.62*/.setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble),format.raw/*108.116*/("""</td><!-- mont internacionales -->
					<td>"""),_display_(/*109.11*/BigDecimal(detalle.total_km_car_internacionales)/*109.59*/.setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble),format.raw/*109.113*/(""" """),format.raw/*109.114*/("""km</td> <!-- km  internecionas-->
					<td>$"""),_display_(/*110.12*/BigDecimal(detalle.total_mont_car_internacionales)/*110.62*/.setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble),format.raw/*110.116*/("""</td><!-- mont internacionales -->
					
					<td>"""),_display_(/*112.11*/BigDecimal(detalle.total_cantidad_agregados)/*112.55*/.setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble),format.raw/*112.109*/(""" """),format.raw/*112.110*/("""km</td> <!-- km internacionales-->
					<td>"""),_display_(/*113.11*/BigDecimal(detalle.total_mont_agregados)/*113.51*/.setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble),format.raw/*113.105*/(""" """),format.raw/*113.106*/("""km</td> <!-- km internacionales-->
					<td>"""),_display_(/*114.11*/BigDecimal(detalle.total_cobro_periodo)/*114.50*/.setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble),format.raw/*114.104*/(""" """),format.raw/*114.105*/("""km</td> <!-- km internacionales-->




					
				</tr>
			""")))}),format.raw/*121.5*/("""
				
		"""),format.raw/*123.3*/("""</tbody>
	</table>

""")))}))
      }
    }
  }

  def render(detalles:List[DetalleCobro]): play.twirl.api.HtmlFormat.Appendable = apply(detalles)

  def f:((List[DetalleCobro]) => play.twirl.api.HtmlFormat.Appendable) = (detalles) => apply(detalles)

  def ref: this.type = this

}


}

/**/
object facturacion extends facturacion_Scope0.facturacion
              /*
                  -- GENERATED --
                  DATE: Sat Nov 12 23:30:51 CST 2016
                  SOURCE: /home/samuel/Desarrollo/siiaf/app/views/logistica/facturacion.scala.html
                  HASH: 0c9c3d4db261d67858da7176683fc4371902bf0e
                  MATRIX: 779->1|931->81|941->84|1020->86|1048->88|1119->133|1133->139|1206->191|1281->240|1295->246|1367->297|1423->326|1451->327|1481->330|1544->366|1572->367|1601->369|1634->382|1644->384|1724->386|1753->388|1794->402|1809->408|1881->459|1958->509|1973->515|2048->569|2125->619|2140->625|2217->681|2294->731|2309->737|2384->791|2461->841|2476->847|2558->908|2635->958|2650->964|2725->1018|2802->1068|2817->1074|2898->1134|3002->1210|3031->1211|3065->1218|3134->1260|3162->1261|3234->1305|3263->1306|3297->1313|3393->1381|3422->1382|3461->1393|3722->1625|3752->1626|3811->1657|3885->1703|3914->1704|3943->1705|3982->1716|4011->1717|4040->1718|4115->1765|4144->1766|4179->1774|4207->1775|4239->1780|4267->1781|4324->31|4351->79|4379->379|4408->1799|4437->1802|4455->1811|4551->1898|4590->1899|4622->1904|4771->2025|4800->2026|4856->2053|4886->2054|6714->3856|6754->3880|6793->3881|6825->3886|6867->3901|6883->3908|6919->3923|6982->3959|6998->3966|7040->3987|7103->4023|7152->4063|7228->4117|7258->4118|7323->4156|7374->4198|7450->4252|7515->4290|7564->4330|7640->4384|7670->4385|7736->4423|7788->4465|7865->4519|7931->4557|7981->4597|8058->4651|8089->4652|8155->4690|8207->4732|8284->4786|8352->4826|8410->4874|8487->4928|8518->4929|8592->4975|8652->5025|8729->5079|8802->5124|8860->5172|8937->5226|8968->5227|9041->5272|9101->5322|9178->5376|9251->5421|9309->5469|9386->5523|9417->5524|9490->5569|9550->5619|9627->5673|9706->5724|9760->5768|9837->5822|9868->5823|9941->5868|9991->5908|10068->5962|10099->5963|10172->6008|10221->6047|10298->6101|10329->6102|10419->6161|10455->6169
                  LINES: 27->1|32->5|32->5|34->5|35->6|35->6|35->6|35->6|36->7|36->7|36->7|38->9|38->9|39->10|41->12|41->12|42->13|43->16|43->16|45->16|46->17|46->17|46->17|46->17|47->18|47->18|47->18|48->19|48->19|48->19|49->20|49->20|49->20|50->21|50->21|50->21|51->22|51->22|51->22|52->23|52->23|52->23|55->26|55->26|56->27|57->28|57->28|60->31|60->31|61->32|61->32|61->32|62->33|64->35|64->35|65->36|65->36|65->36|65->36|65->36|65->36|65->36|66->37|66->37|68->39|68->39|69->40|69->40|72->1|73->4|74->14|76->42|78->44|78->44|78->44|78->44|81->47|82->48|82->48|82->48|82->48|127->93|127->93|127->93|128->94|129->95|129->95|129->95|130->96|130->96|130->96|131->97|131->97|131->97|131->97|132->98|132->98|132->98|133->99|133->99|133->99|133->99|134->100|134->100|134->100|135->101|135->101|135->101|135->101|136->102|136->102|136->102|139->105|139->105|139->105|139->105|140->106|140->106|140->106|141->107|141->107|141->107|141->107|142->108|142->108|142->108|143->109|143->109|143->109|143->109|144->110|144->110|144->110|146->112|146->112|146->112|146->112|147->113|147->113|147->113|147->113|148->114|148->114|148->114|148->114|155->121|157->123
                  -- GENERATED --
              */
          