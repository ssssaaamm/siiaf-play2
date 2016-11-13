
package views.html.gerente

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object planilla_Scope0 {
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

class planilla extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[DetallePago],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(detalles: List[DetallePago]):play.twirl.api.HtmlFormat.Appendable = {
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
Seq[Any](format.raw/*1.31*/("""
"""),format.raw/*4.1*/("""
"""),format.raw/*14.2*/("""

"""),format.raw/*42.2*/("""

"""),_display_(/*44.2*/gerente/*44.9*/.base("Logistic SIIAF","Planilla de Pago","Planilla de pago a motoristas","planilla",css,js)/*44.101*/{_display_(Seq[Any](format.raw/*44.102*/("""
	

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
				<th colspan="2"><center>Locales</center></th>
				<th colspan="2"><center>Internacionales</center></th>
				<th colspan="2"><center>V. Agregados</center></th>
				<th colspan="2"><center>Viaticos</center></th>
				<th></th><!-- ganado -->
				<th></th><!-- bono -->
				<th></th><!-- total pago -->
				<th></th><!-- isss -->
				<th></th><!-- afp -->
				

			</tr>
			<tr class="warning no-result1">
				<td colspan="4"><i class="fa fa-warning"></i> No hay resultados</td>
			</tr>
		
			
			<tr>
				<th rowspan="1"><center>Motorista</center></th>
				<!-- <th><center>Viajes</center></th> -->
				<th><center>Kms</center></th>
				<th><center>Monto</center></th>
				<!-- <th><center>Viajes</center></th> -->
				<th><center>Kms</center></th>
				<th><center>Monto</center></th>
				<th><center>Cantidad</center></th>
				<th><center>Monto</center></th>
				<th><center>Cantidad</center></th>
				<th><center>Monto</center></th>
				<th rowspan="1"><center>Ganado</center></th>
				<th rowspan="1"><center>Bono</center></th>
				<th rowspan="1"><center>Total pago</center></th>
				<th rowspan="1"><center>ISSS</center></th>
				<th rowspan="1"><center>AFP</center></th>
				
			</tr>
		</thead>
		<tbody>
			"""),_display_(/*96.5*/for(detalle <- detalles) yield /*96.29*/{_display_(Seq[Any](format.raw/*96.30*/("""
				"""),format.raw/*97.5*/("""<tr>
					<td>"""),_display_(/*98.11*/detalle/*98.18*/.motorista.nombre),format.raw/*98.35*/("""</td><!-- nombre -->
					<!-- <td>"""),_display_(/*99.16*/detalle/*99.23*/.total_viajes_locales),format.raw/*99.44*/("""</td> viajes locales --> 
					<td><a title="<center><strong>"""),_display_(/*100.37*/detalle/*100.44*/.total_viajes_locales),format.raw/*100.65*/(""" """),format.raw/*100.66*/("""viajes</strong></center>" class="popover-content" data-toggle="popover"  data-html="true" data-content='<strong>Fecha viaje</strong> &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp <strong>Kms</strong><br/>"""),_display_(/*100.261*/for(viaje <- Viaje.find.where().conjunction().eq("periodo_planilla",detalle.periodo_planilla).eq("motorista",detalle.motorista).eq("tipo",1).findList()) yield /*100.413*/{_display_(Seq[Any](_display_(/*100.415*/viaje/*100.420*/.fecha_registro.format("dd-MM-yyyy")),format.raw/*100.456*/(""" """),format.raw/*100.457*/("""&nbsp &nbsp &nbsp &nbsp &nbsp &nbsp """),_display_(/*100.494*/viaje/*100.499*/.total_km),format.raw/*100.508*/(""" """),format.raw/*100.509*/("""<br/>""")))}),format.raw/*100.515*/("""'>"""),_display_(/*100.518*/BigDecimal(detalle.total_km_locales)/*100.554*/.setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble),format.raw/*100.608*/(""" """),format.raw/*100.609*/("""km</a></td> <!-- km locales-->
					<td>$"""),_display_(/*101.12*/BigDecimal(detalle.total_monto_locales)/*101.51*/.setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble),format.raw/*101.105*/("""</td><!-- monto locales -->
					<!-- <td>"""),_display_(/*102.16*/detalle/*102.23*/.total_viajes_internacionales),format.raw/*102.52*/("""</td>  viajes internacionales -->
					<td><a href="#" title="<center><strong>"""),_display_(/*103.46*/detalle/*103.53*/.total_viajes_locales),format.raw/*103.74*/(""" """),format.raw/*103.75*/("""viajes</strong></center>" class="popover-content" data-toggle="popover"  data-html="true" data-content='<strong>Fecha viaje</strong> &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp <strong>Kms</strong><br/>"""),_display_(/*103.270*/for(viaje <- Viaje.find.where().conjunction().eq("periodo_planilla",detalle.periodo_planilla).eq("motorista",detalle.motorista).eq("tipo",2).findList()) yield /*103.422*/{_display_(Seq[Any](_display_(/*103.424*/viaje/*103.429*/.fecha_registro.format("dd-MM-yyyy")),format.raw/*103.465*/(""" """),format.raw/*103.466*/("""&nbsp &nbsp &nbsp &nbsp &nbsp &nbsp """),_display_(/*103.503*/viaje/*103.508*/.total_km),format.raw/*103.517*/(""" """),format.raw/*103.518*/("""<br/>""")))}),format.raw/*103.524*/("""'>"""),_display_(/*103.527*/BigDecimal(detalle.total_km_internacionales)/*103.571*/.setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble),format.raw/*103.625*/(""" """),format.raw/*103.626*/("""km</a></td><!-- km internacionales -->
					<td>$"""),_display_(/*104.12*/detalle/*104.19*/.total_monto_internacionales),format.raw/*104.47*/("""</td><!-- monto internacionales -->
					<td><center><a href="#" title="<center><strong>"""),_display_(/*105.54*/detalle/*105.61*/.total_cantidad_agregados),format.raw/*105.86*/(""" """),format.raw/*105.87*/("""boletas</strong></center>" class="popover-content" data-toggle="popover"  data-html="true" data-content='<strong>Viaje</strong> &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp <strong>Boleta</strong> &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp <strong>Fecha</strong><br/>"""),_display_(/*105.339*/for(boleta <- Boleta.find.where().conjunction().eq("viaje.periodo_planilla",detalle.periodo_planilla).eq("viaje.motorista",detalle.motorista).eq("sobrepeso",1).findList()) yield /*105.510*/{_display_(Seq[Any](_display_(/*105.512*/boleta/*105.518*/.viaje.id),format.raw/*105.527*/(""" """),format.raw/*105.528*/("""&nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp """),_display_(/*105.583*/boleta/*105.589*/.codigo),format.raw/*105.596*/(""" """),format.raw/*105.597*/("""&nbsp &nbsp &nbsp &nbsp &nbsp &nbsp """),_display_(/*105.634*/boleta/*105.640*/.viaje.fecha_registro.format("dd-MM-yyyy")),format.raw/*105.682*/(""" """),format.raw/*105.683*/("""<br/>""")))}),format.raw/*105.689*/("""'>"""),_display_(/*105.692*/detalle/*105.699*/.total_cantidad_agregados),format.raw/*105.724*/("""</a></center></td><!-- cantidad valores agregados -->
					<td>$"""),_display_(/*106.12*/BigDecimal(detalle.total_monto_agregados)/*106.53*/.setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble),format.raw/*106.107*/("""</td><!-- monto valores agregados -->
					<td><center><a href="#" title="<center><strong>"""),_display_(/*107.54*/detalle/*107.61*/.total_cantidad_agregados),format.raw/*107.86*/(""" """),format.raw/*107.87*/("""boletas</strong></center>" class="popover-content" data-toggle="popover"  data-html="true" data-content='<strong>Vacio/Vacio</strong><br/>"""),_display_(/*107.226*/detalle/*107.233*/.total_cantidad_viaticos_vv),format.raw/*107.260*/(""" """),format.raw/*107.261*/("""&nbsp &nbsp &nbsp &nbsp &nbsp &nbsp $"""),_display_(/*107.299*/detalle/*107.306*/.total_monto_viaticos_vv),format.raw/*107.330*/(""" """),format.raw/*107.331*/("""<br/><strong>Vacio/Cargado</strong><br/> """),_display_(/*107.373*/detalle/*107.380*/.total_cantidad_viaticos_vc),format.raw/*107.407*/(""" """),format.raw/*107.408*/("""&nbsp &nbsp &nbsp &nbsp &nbsp &nbsp $"""),_display_(/*107.446*/detalle/*107.453*/.total_monto_viaticos_vc),format.raw/*107.477*/(""" """),format.raw/*107.478*/("""<br/> <strong>Cargado/Cargado</strong><br/> """),_display_(/*107.523*/detalle/*107.530*/.total_cantidad_viaticos_cc),format.raw/*107.557*/(""" """),format.raw/*107.558*/("""&nbsp &nbsp &nbsp &nbsp &nbsp &nbsp $"""),_display_(/*107.596*/detalle/*107.603*/.total_monto_viaticos_cc),format.raw/*107.627*/("""'>"""),_display_(/*107.630*/detalle/*107.637*/.total_cantidad_viaticos),format.raw/*107.661*/("""</a></center></td><!-- cantidad viaticos -->
					<td><a href="#" title="<center><strong>"""),_display_(/*108.46*/detalle/*108.53*/.total_cantidad_agregados),format.raw/*108.78*/(""" """),format.raw/*108.79*/("""boletas</strong></center>" class="popover-content" data-toggle="popover"  data-html="true" data-content='<strong>Vacio/Vacio</strong><br/>"""),_display_(/*108.218*/detalle/*108.225*/.total_cantidad_viaticos_vv),format.raw/*108.252*/(""" """),format.raw/*108.253*/("""&nbsp &nbsp &nbsp &nbsp &nbsp &nbsp $"""),_display_(/*108.291*/detalle/*108.298*/.total_monto_viaticos_vv),format.raw/*108.322*/(""" """),format.raw/*108.323*/("""<br/><strong>Vacio/Cargado</strong><br/> """),_display_(/*108.365*/detalle/*108.372*/.total_cantidad_viaticos_vc),format.raw/*108.399*/(""" """),format.raw/*108.400*/("""&nbsp &nbsp &nbsp &nbsp &nbsp &nbsp $"""),_display_(/*108.438*/detalle/*108.445*/.total_monto_viaticos_vc),format.raw/*108.469*/(""" """),format.raw/*108.470*/("""<br/> <strong>Cargado/Cargado</strong><br/> """),_display_(/*108.515*/detalle/*108.522*/.total_cantidad_viaticos_cc),format.raw/*108.549*/(""" """),format.raw/*108.550*/("""&nbsp &nbsp &nbsp &nbsp &nbsp &nbsp $"""),_display_(/*108.588*/detalle/*108.595*/.total_monto_viaticos_cc),format.raw/*108.619*/("""'>$"""),_display_(/*108.623*/BigDecimal(detalle.total_monto_viaticos)/*108.663*/.setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble),format.raw/*108.717*/("""</a></td><!-- monto viaticos -->
					<td>$"""),_display_(/*109.12*/BigDecimal(detalle.salario_ganado)/*109.46*/.setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble),format.raw/*109.100*/("""</td><!-- salario ganado -->
					<td>$"""),_display_(/*110.12*/BigDecimal(detalle.bono)/*110.36*/.setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble),format.raw/*110.90*/("""</td><!-- bono -->
					<td>$"""),_display_(/*111.12*/BigDecimal(detalle.total_pago_periodo)/*111.50*/.setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble),format.raw/*111.104*/("""</td><!-- pago total -->
					<td>$"""),_display_(/*112.12*/BigDecimal(detalle.isss)/*112.36*/.setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble),format.raw/*112.90*/("""</td><!-- isss -->
					<td>$"""),_display_(/*113.12*/BigDecimal(detalle.afp)/*113.35*/.setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble),format.raw/*113.89*/("""</td><!-- afp -->
				</tr>
			""")))}),format.raw/*115.5*/("""
				
		"""),format.raw/*117.3*/("""</tbody>
	</table>

""")))}))
      }
    }
  }

  def render(detalles:List[DetallePago]): play.twirl.api.HtmlFormat.Appendable = apply(detalles)

  def f:((List[DetallePago]) => play.twirl.api.HtmlFormat.Appendable) = (detalles) => apply(detalles)

  def ref: this.type = this

}


}

/**/
object planilla extends planilla_Scope0.planilla
              /*
                  -- GENERATED --
                  DATE: Sun Nov 13 00:05:09 CST 2016
                  SOURCE: /home/samuel/Desarrollo/siiaf/app/views/gerente/planilla.scala.html
                  HASH: 64bf071d7d4a8ef4a837fd696af0ffbcb8542972
                  MATRIX: 770->1|921->80|931->83|1010->85|1038->87|1109->132|1123->138|1196->190|1271->239|1285->245|1357->296|1413->325|1441->326|1471->329|1534->365|1562->366|1591->368|1624->381|1634->383|1714->385|1743->387|1784->401|1799->407|1871->458|1948->508|1963->514|2038->568|2115->618|2130->624|2207->680|2284->730|2299->736|2374->790|2451->840|2466->846|2548->907|2625->957|2640->963|2715->1017|2792->1067|2807->1073|2888->1133|2992->1209|3021->1210|3055->1217|3124->1259|3152->1260|3224->1304|3253->1305|3287->1312|3383->1380|3412->1381|3451->1392|3712->1624|3742->1625|3801->1656|3875->1702|3904->1703|3933->1704|3972->1715|4001->1716|4030->1717|4105->1764|4134->1765|4169->1773|4197->1774|4229->1779|4257->1780|4314->30|4341->78|4369->378|4398->1798|4427->1801|4442->1808|4544->1900|4584->1901|4616->1906|4765->2027|4794->2028|4850->2055|4880->2056|6490->3640|6530->3664|6569->3665|6601->3670|6643->3685|6659->3692|6697->3709|6760->3745|6776->3752|6818->3773|6908->3835|6925->3842|6968->3863|6998->3864|7222->4059|7392->4211|7433->4213|7449->4218|7508->4254|7539->4255|7605->4292|7621->4297|7653->4306|7684->4307|7723->4313|7755->4316|7802->4352|7879->4406|7910->4407|7980->4449|8029->4488|8106->4542|8177->4585|8194->4592|8245->4621|8352->4700|8369->4707|8412->4728|8442->4729|8666->4924|8836->5076|8877->5078|8893->5083|8952->5119|8983->5120|9049->5157|9065->5162|9097->5171|9128->5172|9167->5178|9199->5181|9254->5225|9331->5279|9362->5280|9440->5330|9457->5337|9507->5365|9624->5454|9641->5461|9688->5486|9718->5487|9999->5739|10188->5910|10229->5912|10246->5918|10278->5927|10309->5928|10393->5983|10410->5989|10440->5996|10471->5997|10537->6034|10554->6040|10619->6082|10650->6083|10689->6089|10721->6092|10739->6099|10787->6124|10880->6189|10931->6230|11008->6284|11127->6375|11144->6382|11191->6407|11221->6408|11389->6547|11407->6554|11457->6581|11488->6582|11555->6620|11573->6627|11620->6651|11651->6652|11722->6694|11740->6701|11790->6728|11821->6729|11888->6767|11906->6774|11953->6798|11984->6799|12058->6844|12076->6851|12126->6878|12157->6879|12224->6917|12242->6924|12289->6948|12321->6951|12339->6958|12386->6982|12504->7072|12521->7079|12568->7104|12598->7105|12766->7244|12784->7251|12834->7278|12865->7279|12932->7317|12950->7324|12997->7348|13028->7349|13099->7391|13117->7398|13167->7425|13198->7426|13265->7464|13283->7471|13330->7495|13361->7496|13435->7541|13453->7548|13503->7575|13534->7576|13601->7614|13619->7621|13666->7645|13699->7649|13750->7689|13827->7743|13899->7787|13943->7821|14020->7875|14088->7915|14122->7939|14198->7993|14256->8023|14304->8061|14381->8115|14445->8151|14479->8175|14555->8229|14613->8259|14646->8282|14722->8336|14785->8368|14821->8376
                  LINES: 27->1|32->5|32->5|34->5|35->6|35->6|35->6|35->6|36->7|36->7|36->7|38->9|38->9|39->10|41->12|41->12|42->13|43->16|43->16|45->16|46->17|46->17|46->17|46->17|47->18|47->18|47->18|48->19|48->19|48->19|49->20|49->20|49->20|50->21|50->21|50->21|51->22|51->22|51->22|52->23|52->23|52->23|55->26|55->26|56->27|57->28|57->28|60->31|60->31|61->32|61->32|61->32|62->33|64->35|64->35|65->36|65->36|65->36|65->36|65->36|65->36|65->36|66->37|66->37|68->39|68->39|69->40|69->40|72->1|73->4|74->14|76->42|78->44|78->44|78->44|78->44|81->47|82->48|82->48|82->48|82->48|130->96|130->96|130->96|131->97|132->98|132->98|132->98|133->99|133->99|133->99|134->100|134->100|134->100|134->100|134->100|134->100|134->100|134->100|134->100|134->100|134->100|134->100|134->100|134->100|134->100|134->100|134->100|134->100|134->100|135->101|135->101|135->101|136->102|136->102|136->102|137->103|137->103|137->103|137->103|137->103|137->103|137->103|137->103|137->103|137->103|137->103|137->103|137->103|137->103|137->103|137->103|137->103|137->103|137->103|138->104|138->104|138->104|139->105|139->105|139->105|139->105|139->105|139->105|139->105|139->105|139->105|139->105|139->105|139->105|139->105|139->105|139->105|139->105|139->105|139->105|139->105|139->105|139->105|139->105|140->106|140->106|140->106|141->107|141->107|141->107|141->107|141->107|141->107|141->107|141->107|141->107|141->107|141->107|141->107|141->107|141->107|141->107|141->107|141->107|141->107|141->107|141->107|141->107|141->107|141->107|141->107|141->107|141->107|141->107|141->107|141->107|141->107|142->108|142->108|142->108|142->108|142->108|142->108|142->108|142->108|142->108|142->108|142->108|142->108|142->108|142->108|142->108|142->108|142->108|142->108|142->108|142->108|142->108|142->108|142->108|142->108|142->108|142->108|142->108|142->108|142->108|142->108|143->109|143->109|143->109|144->110|144->110|144->110|145->111|145->111|145->111|146->112|146->112|146->112|147->113|147->113|147->113|149->115|151->117
                  -- GENERATED --
              */
          