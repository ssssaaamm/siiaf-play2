
package views.html.gerente

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object cabezales_Scope0 {
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

class cabezales extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Form[Cabezal],List[Cabezal],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(cabezal_form: Form[Cabezal], cabezales_list: List[Cabezal] ):play.twirl.api.HtmlFormat.Appendable = {
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
			"""),format.raw/*24.4*/("""if(window.location.pathname!='"""),_display_(/*24.35*/routes/*24.41*/.GerenteController.cabezales),format.raw/*24.69*/("""')"""),format.raw/*24.71*/("""{"""),format.raw/*24.72*/("""
				
				"""),format.raw/*26.5*/("""window.location='"""),_display_(/*26.23*/routes/*26.29*/.GerenteController.cabezales),format.raw/*26.57*/("""';
			"""),format.raw/*27.4*/("""}"""),format.raw/*27.5*/("""	
		"""),format.raw/*28.3*/("""}"""),format.raw/*28.4*/(""");
	</script>
""")))};def /*34.2*/errores_formulario/*34.20*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*34.22*/("""

	"""),_display_(/*36.3*/if(cabezal_form.hasGlobalErrors)/*36.35*/ {_display_(Seq[Any](format.raw/*36.37*/("""

        """),_display_(/*38.10*/for(error <- cabezal_form.globalErrors) yield /*38.49*/ {_display_(Seq[Any](format.raw/*38.51*/("""
	        """),format.raw/*39.10*/("""<div class="alert alert-danger">
				<a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
				<strong>"""),_display_(/*41.14*/Messages(error.messages, error.arguments.toArray: _*)),format.raw/*41.67*/("""</strong>
			</div>
        """)))}),format.raw/*43.10*/("""
	""")))}),format.raw/*44.3*/("""



	"""),_display_(/*48.3*/for(error <- cabezal_form("placa").errors) yield /*48.45*/ {_display_(Seq[Any](format.raw/*48.47*/("""
    	"""),format.raw/*49.6*/("""<div class="alert alert-danger">
			<a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
			<strong>"""),_display_(/*51.13*/Messages(error.messages, error.arguments.toArray: _*)),format.raw/*51.66*/("""</strong>
		</div>
	""")))}),format.raw/*53.3*/("""


	"""),_display_(/*56.3*/for(error <- cabezal_form("descripcion").errors) yield /*56.51*/ {_display_(Seq[Any](format.raw/*56.53*/("""
    	"""),format.raw/*57.6*/("""<div class="alert alert-danger">
			<a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
			<strong>"""),_display_(/*59.13*/Messages(error.messages, error.arguments.toArray: _*)),format.raw/*59.66*/("""</strong>
		</div>
	""")))}),format.raw/*61.3*/("""

""")))};
Seq[Any](format.raw/*1.63*/("""
"""),format.raw/*3.1*/("""
"""),format.raw/*6.2*/("""

"""),format.raw/*30.2*/("""



"""),format.raw/*63.2*/("""




"""),_display_(/*68.2*/gerente/*68.9*/.base("Manager SIIAF","Cabezales","Gestion de cabezales","cabezales",css,js)/*68.85*/{_display_(Seq[Any](format.raw/*68.86*/("""
	"""),format.raw/*69.2*/("""<button type="button" id="main-add-button" class="btn btn-primary" data-toggle="modal" data-target="#mod-new"><span class="glyphicon glyphicon-plus" aria-hidden="true"></span> Agregar Cabezal</button>

	"""),_display_(/*71.3*/if(flash.containsKey("exito"))/*71.33*/{_display_(Seq[Any](format.raw/*71.34*/("""
		"""),format.raw/*72.3*/("""<div class="alert alert-success fade in">
			<a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
			<span class="glyphicon glyphicon-ok" aria-hidden="true"></span>
			<strong>"""),_display_(/*75.13*/flash/*75.18*/.get("exito")),format.raw/*75.31*/("""</strong>
		</div>
	""")))}),format.raw/*77.3*/("""


  	"""),format.raw/*80.4*/("""<!-- Modal -->
	<div class="modal fade" id="mod-new" role="dialog">

		<div class="modal-dialog">

		<!-- Modal content-->
		<div class="modal-content">
			"""),_display_(/*87.5*/form(action=routes.GerenteController.cabezal_new())/*87.56*/{_display_(Seq[Any](format.raw/*87.57*/("""
				"""),format.raw/*88.5*/("""<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal">&times;</button>
					<h4 class="modal-title">Agregar nuevo cabezal</h4>
				</div>
				"""),_display_(/*92.6*/errores_formulario),format.raw/*92.24*/("""
				"""),format.raw/*93.5*/("""<div class="modal-body">




	        		 <div class="form-group">
	        		 	"""),_display_(/*99.15*/inputText(cabezal_form("placa"), '_showConstraints -> false , '_showErrors -> false,'class -> "form-control", 'placeholder -> "C212-093", '_label -> "Placa: ")),format.raw/*99.174*/("""
	        		 """),format.raw/*100.13*/("""</div>

	        		  <div class="form-group">
	        		 	"""),_display_(/*103.15*/textarea(cabezal_form("descripcion"),'rows -> 5, '_showConstraints -> false , '_showErrors -> false,'class -> "form-control", '_label -> "Descripción: ")),format.raw/*103.168*/("""
	        		 """),format.raw/*104.13*/("""</div>

	        		 </div>
				<div class="modal-footer">
						<button type="button" class="btn btn-default" data-dismiss="modal">Cerrar</button>
						<button type="submit" class="btn btn-primary"><span class="glyphicon glyphicon-plus" aria-hidden="true"></span> Agregar</button>
				</div>
			""")))}),format.raw/*111.5*/("""
		"""),format.raw/*112.3*/("""</div>

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
				<th class="col-md-2 col-xs-5">Id</th>
				<th class="col-md-4 col-xs-4">Placa</th>
				<th class="col-md-6 col-xs-3">Descripcion</th>
				<th class="col-md-3 col-xs-3 center-column">Editar</th>
				<th class="col-md-3 col-xs-3 center-column">Eliminar</th>
			</tr>
			<tr class="warning no-result">
				<td colspan="4"><i class="fa fa-warning"></i> No hay resultados</td>
			</tr>
		</thead>
		<tbody>
			"""),_display_(/*141.5*/for(cabezal <- cabezales_list) yield /*141.35*/{_display_(Seq[Any](format.raw/*141.36*/("""
				"""),format.raw/*142.5*/("""<tr>
					<td>"""),_display_(/*143.11*/cabezal/*143.18*/.id),format.raw/*143.21*/("""</td>
					<td>"""),_display_(/*144.11*/cabezal/*144.18*/.placa),format.raw/*144.24*/("""</td>
					<td>"""),_display_(/*145.11*/cabezal/*145.18*/.descripcion),format.raw/*145.30*/("""</td>
					<td><button class="btn btn-success btn-xs" data-toggle="modal" data-target="#mod-edit-"""),_display_(/*146.93*/cabezal/*146.100*/.id),format.raw/*146.103*/(""""><span class="glyphicon glyphicon-edit"></span> Editar</button></td>
					<td><button class="btn btn-danger btn-xs" data-toggle="modal" data-target="#mod-remove-"""),_display_(/*147.94*/cabezal/*147.101*/.id),format.raw/*147.104*/(""""><span class="glyphicon glyphicon-trash"></span> Eliminar</button></td>
				</tr>



				<!-- Modal -->
				<div class="modal fade" id="mod-edit-"""),_display_(/*153.43*/cabezal/*153.50*/.id),format.raw/*153.53*/("""" role="dialog">
					
					<div class="modal-dialog">

					<!-- Modal content-->
					<div class="modal-content">
						"""),_display_(/*159.8*/form(action=routes.GerenteController.cabezal_edit(cabezal.id))/*159.70*/{_display_(Seq[Any](format.raw/*159.71*/("""
							"""),format.raw/*160.8*/("""<div class="modal-header">
								<button type="button" class="close" data-dismiss="modal">&times;</button>
								<h4 class="modal-title">Editar cabezal: """),_display_(/*162.50*/cabezal/*162.57*/.placa),format.raw/*162.63*/("""</h4>
								</div>
								"""),_display_(/*164.10*/errores_formulario),format.raw/*164.28*/("""
								"""),format.raw/*165.9*/("""<div class="modal-body">


									 <div class="form-group">
					        		 	"""),_display_(/*169.19*/inputText(cabezal.getForm()("id"), '_showConstraints -> false, 'readonly -> "readonly" , '_showErrors -> false,'class -> "form-control", 'placeholder -> "Id", '_label -> "Id: ")),format.raw/*169.196*/("""
					        		 """),format.raw/*170.17*/("""</div>

					        		 <div class="form-group">
					        		 	"""),_display_(/*173.19*/inputText(cabezal.getForm()("placa"), '_showConstraints -> false , '_showErrors -> false,'class -> "form-control", 'placeholder -> "C212-093", '_label -> "Placa: ")),format.raw/*173.183*/("""
					        		 """),format.raw/*174.17*/("""</div>

					        		 <div class="form-group">
					        		 	"""),_display_(/*177.19*/textarea(cabezal.getForm()("descripcion"),'rows -> 5, '_showConstraints -> false , '_showErrors -> false,'class -> "form-control", '_label -> "Descripción: ")),format.raw/*177.177*/("""
					        		 """),format.raw/*178.17*/("""</div>
					        		 

								</div>
								<div class="modal-footer">
									<button type="button" class="btn btn-default" data-dismiss="modal">Cerrar</button>
									<button type="submit" class="btn btn-primary"><span class="glyphicon glyphicon-floppy-disk" aria-hidden="true"></span> Guardar</button>
								</div>
							</div>
						""")))}),format.raw/*187.8*/("""
					"""),format.raw/*188.6*/("""</div>
				</div>





				<!-- Modal -->
				<div class="modal fade" id="mod-remove-"""),_display_(/*196.45*/cabezal/*196.52*/.id),format.raw/*196.55*/("""" role="dialog">
					<div class="modal-dialog">

					<!-- Modal content-->
					<div class="modal-content">
						<div class="modal-header">
							<button type="button" class="close" data-dismiss="modal">&times;</button>
							<h4 class="modal-title">Eliminar cabezal: """),_display_(/*203.51*/cabezal/*203.58*/.placa),format.raw/*203.64*/("""</h4>
							</div>
							<div class="modal-body">

								¿Esta seguro que desea eliminar el cabezal?.
								Ya no podra registrar viajes para con este cabezal.



							</div>
							<div class="modal-footer">
								<form>
								<button type="button" class="btn btn-default" data-dismiss="modal">Cerrar</button>							
								<button type="submit" class="btn btn-danger" formmethod="POST" formaction=""""),_display_(/*216.85*/routes/*216.91*/.GerenteController.cabezal_remove(cabezal.id)),format.raw/*216.136*/(""""><span class="glyphicon glyphicon-trash" aria-hidden="true"></span> Eliminar</button>
								</form>
							</div>
						</div>

					</div>
				</div>


			""")))}),format.raw/*225.5*/("""
		"""),format.raw/*226.3*/("""</tbody>
	</table>
	</div>

""")))}))
      }
    }
  }

  def render(cabezal_form:Form[Cabezal],cabezales_list:List[Cabezal]): play.twirl.api.HtmlFormat.Appendable = apply(cabezal_form,cabezales_list)

  def f:((Form[Cabezal],List[Cabezal]) => play.twirl.api.HtmlFormat.Appendable) = (cabezal_form,cabezales_list) => apply(cabezal_form,cabezales_list)

  def ref: this.type = this

}


}

/**/
object cabezales extends cabezales_Scope0.cabezales
              /*
                  -- GENERATED --
                  DATE: Thu Nov 10 10:18:06 CST 2016
                  SOURCE: /home/samuel/Desarrollo/siiaf/app/views/gerente/cabezales.scala.html
                  HASH: bb5a53554ff27430a7866009dacfdaa9819f1d3e
                  MATRIX: 782->1|936->82|946->85|1025->87|1053->89|1124->134|1138->140|1211->192|1237->199|1246->201|1325->203|1353->205|1393->219|1407->225|1478->276|1573->345|1612->375|1652->377|1682->380|1750->420|1779->421|1818->432|1850->437|1864->442|1898->455|1949->479|1977->480|2027->500|2058->504|2177->595|2206->596|2237->600|2295->631|2310->637|2359->665|2389->667|2418->668|2455->678|2500->696|2515->702|2564->730|2597->736|2625->737|2656->741|2684->742|2722->762|2749->780|2830->782|2860->786|2901->818|2941->820|2979->831|3034->870|3074->872|3112->882|3267->1010|3341->1063|3401->1092|3434->1095|3466->1101|3524->1143|3564->1145|3597->1151|3750->1277|3824->1330|3875->1351|3906->1356|3970->1404|4010->1406|4043->1412|4196->1538|4270->1591|4321->1612|4363->62|4390->80|4417->196|4446->757|4477->1615|4509->1621|4524->1628|4609->1704|4648->1705|4677->1707|4907->1911|4946->1941|4985->1942|5015->1945|5244->2147|5258->2152|5292->2165|5343->2186|5376->2192|5559->2349|5619->2400|5658->2401|5690->2406|5894->2584|5933->2602|5965->2607|6072->2687|6253->2846|6295->2859|6383->2919|6559->3072|6601->3085|6929->3382|6960->3385|7712->4110|7759->4140|7799->4141|7832->4146|7875->4161|7892->4168|7917->4171|7961->4187|7978->4194|8006->4200|8050->4216|8067->4223|8101->4235|8227->4333|8245->4340|8271->4343|8462->4506|8480->4513|8506->4516|8681->4663|8698->4670|8723->4673|8873->4796|8945->4858|8985->4859|9021->4867|9207->5025|9224->5032|9252->5038|9310->5068|9350->5086|9387->5095|9495->5175|9695->5352|9741->5369|9836->5436|10023->5600|10069->5617|10164->5684|10345->5842|10391->5859|10770->6207|10804->6213|10918->6299|10935->6306|10960->6309|11262->6583|11279->6590|11307->6596|11749->7010|11765->7016|11833->7061|12024->7221|12055->7224
                  LINES: 27->1|31->4|31->4|33->4|34->5|34->5|34->5|34->5|35->8|35->8|37->8|38->9|38->9|38->9|38->9|41->12|41->12|41->12|42->13|43->14|43->14|44->15|44->15|44->15|44->15|45->16|45->16|47->18|50->21|52->23|52->23|53->24|53->24|53->24|53->24|53->24|53->24|55->26|55->26|55->26|55->26|56->27|56->27|57->28|57->28|59->34|59->34|61->34|63->36|63->36|63->36|65->38|65->38|65->38|66->39|68->41|68->41|70->43|71->44|75->48|75->48|75->48|76->49|78->51|78->51|80->53|83->56|83->56|83->56|84->57|86->59|86->59|88->61|91->1|92->3|93->6|95->30|99->63|104->68|104->68|104->68|104->68|105->69|107->71|107->71|107->71|108->72|111->75|111->75|111->75|113->77|116->80|123->87|123->87|123->87|124->88|128->92|128->92|129->93|135->99|135->99|136->100|139->103|139->103|140->104|147->111|148->112|177->141|177->141|177->141|178->142|179->143|179->143|179->143|180->144|180->144|180->144|181->145|181->145|181->145|182->146|182->146|182->146|183->147|183->147|183->147|189->153|189->153|189->153|195->159|195->159|195->159|196->160|198->162|198->162|198->162|200->164|200->164|201->165|205->169|205->169|206->170|209->173|209->173|210->174|213->177|213->177|214->178|223->187|224->188|232->196|232->196|232->196|239->203|239->203|239->203|252->216|252->216|252->216|261->225|262->226
                  -- GENERATED --
              */
          