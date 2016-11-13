
package views.html.logistica

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

"""),_display_(/*44.2*/logistica/*44.11*/.base("Logistic SIIAF","Planilla de Pago","Planilla de pago a motoristas","planilla",css,js)/*44.103*/{_display_(Seq[Any](format.raw/*44.104*/("""
	

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
                  DATE: Sat Nov 12 23:30:50 CST 2016
                  SOURCE: /home/samuel/Desarrollo/siiaf/app/views/logistica/planilla.scala.html
                  HASH: cec08812041a02e06d46afb55b21012c74466fa9
                  MATRIX: 772->1|923->80|933->83|1012->85|1040->87|1111->132|1125->138|1198->190|1273->239|1287->245|1359->296|1415->325|1443->326|1473->329|1536->365|1564->366|1593->368|1626->381|1636->383|1716->385|1745->387|1786->401|1801->407|1873->458|1950->508|1965->514|2040->568|2117->618|2132->624|2209->680|2286->730|2301->736|2376->790|2453->840|2468->846|2550->907|2627->957|2642->963|2717->1017|2794->1067|2809->1073|2890->1133|2994->1209|3023->1210|3057->1217|3126->1259|3154->1260|3226->1304|3255->1305|3289->1312|3385->1380|3414->1381|3453->1392|3714->1624|3744->1625|3803->1656|3877->1702|3906->1703|3935->1704|3974->1715|4003->1716|4032->1717|4107->1764|4136->1765|4171->1773|4199->1774|4231->1779|4259->1780|4316->30|4343->78|4371->378|4400->1798|4429->1801|4447->1810|4549->1902|4589->1903|4621->1908|4770->2029|4799->2030|4855->2057|4885->2058|6495->3642|6535->3666|6574->3667|6606->3672|6648->3687|6664->3694|6702->3711|6765->3747|6781->3754|6823->3775|6913->3837|6930->3844|6973->3865|7003->3866|7227->4061|7397->4213|7438->4215|7454->4220|7513->4256|7544->4257|7610->4294|7626->4299|7658->4308|7689->4309|7728->4315|7760->4318|7807->4354|7884->4408|7915->4409|7985->4451|8034->4490|8111->4544|8182->4587|8199->4594|8250->4623|8357->4702|8374->4709|8417->4730|8447->4731|8671->4926|8841->5078|8882->5080|8898->5085|8957->5121|8988->5122|9054->5159|9070->5164|9102->5173|9133->5174|9172->5180|9204->5183|9259->5227|9336->5281|9367->5282|9445->5332|9462->5339|9512->5367|9629->5456|9646->5463|9693->5488|9723->5489|10004->5741|10193->5912|10234->5914|10251->5920|10283->5929|10314->5930|10398->5985|10415->5991|10445->5998|10476->5999|10542->6036|10559->6042|10624->6084|10655->6085|10694->6091|10726->6094|10744->6101|10792->6126|10885->6191|10936->6232|11013->6286|11132->6377|11149->6384|11196->6409|11226->6410|11394->6549|11412->6556|11462->6583|11493->6584|11560->6622|11578->6629|11625->6653|11656->6654|11727->6696|11745->6703|11795->6730|11826->6731|11893->6769|11911->6776|11958->6800|11989->6801|12063->6846|12081->6853|12131->6880|12162->6881|12229->6919|12247->6926|12294->6950|12326->6953|12344->6960|12391->6984|12509->7074|12526->7081|12573->7106|12603->7107|12771->7246|12789->7253|12839->7280|12870->7281|12937->7319|12955->7326|13002->7350|13033->7351|13104->7393|13122->7400|13172->7427|13203->7428|13270->7466|13288->7473|13335->7497|13366->7498|13440->7543|13458->7550|13508->7577|13539->7578|13606->7616|13624->7623|13671->7647|13704->7651|13755->7691|13832->7745|13904->7789|13948->7823|14025->7877|14093->7917|14127->7941|14203->7995|14261->8025|14309->8063|14386->8117|14450->8153|14484->8177|14560->8231|14618->8261|14651->8284|14727->8338|14790->8370|14826->8378
                  LINES: 27->1|32->5|32->5|34->5|35->6|35->6|35->6|35->6|36->7|36->7|36->7|38->9|38->9|39->10|41->12|41->12|42->13|43->16|43->16|45->16|46->17|46->17|46->17|46->17|47->18|47->18|47->18|48->19|48->19|48->19|49->20|49->20|49->20|50->21|50->21|50->21|51->22|51->22|51->22|52->23|52->23|52->23|55->26|55->26|56->27|57->28|57->28|60->31|60->31|61->32|61->32|61->32|62->33|64->35|64->35|65->36|65->36|65->36|65->36|65->36|65->36|65->36|66->37|66->37|68->39|68->39|69->40|69->40|72->1|73->4|74->14|76->42|78->44|78->44|78->44|78->44|81->47|82->48|82->48|82->48|82->48|130->96|130->96|130->96|131->97|132->98|132->98|132->98|133->99|133->99|133->99|134->100|134->100|134->100|134->100|134->100|134->100|134->100|134->100|134->100|134->100|134->100|134->100|134->100|134->100|134->100|134->100|134->100|134->100|134->100|135->101|135->101|135->101|136->102|136->102|136->102|137->103|137->103|137->103|137->103|137->103|137->103|137->103|137->103|137->103|137->103|137->103|137->103|137->103|137->103|137->103|137->103|137->103|137->103|137->103|138->104|138->104|138->104|139->105|139->105|139->105|139->105|139->105|139->105|139->105|139->105|139->105|139->105|139->105|139->105|139->105|139->105|139->105|139->105|139->105|139->105|139->105|139->105|139->105|139->105|140->106|140->106|140->106|141->107|141->107|141->107|141->107|141->107|141->107|141->107|141->107|141->107|141->107|141->107|141->107|141->107|141->107|141->107|141->107|141->107|141->107|141->107|141->107|141->107|141->107|141->107|141->107|141->107|141->107|141->107|141->107|141->107|141->107|142->108|142->108|142->108|142->108|142->108|142->108|142->108|142->108|142->108|142->108|142->108|142->108|142->108|142->108|142->108|142->108|142->108|142->108|142->108|142->108|142->108|142->108|142->108|142->108|142->108|142->108|142->108|142->108|142->108|142->108|143->109|143->109|143->109|144->110|144->110|144->110|145->111|145->111|145->111|146->112|146->112|146->112|147->113|147->113|147->113|149->115|151->117
                  -- GENERATED --
              */
          