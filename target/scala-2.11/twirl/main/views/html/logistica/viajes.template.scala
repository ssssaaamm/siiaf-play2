
package views.html.logistica

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object viajes_Scope0 {
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

class viajes extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template5[List[Viaje],List[Viaje],List[Cabezal],List[Motorista],List[Cliente],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(viajes_facturacion_list: List[Viaje], viajes_planilla_list: List[Viaje], cabezales: List[Cabezal], motoristas: List[Motorista], clientes: List[Cliente]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._
def /*4.2*/css/*4.5*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*4.7*/("""
	"""),format.raw/*5.2*/("""<link rel="stylesheet" media="screen" href=""""),_display_(/*5.47*/routes/*5.53*/.Assets.versioned("stylesheets/bootstrap-table.css")),format.raw/*5.105*/("""">
	<link rel="stylesheet" media="screen" href=""""),_display_(/*6.47*/routes/*6.53*/.Assets.versioned("stylesheets/datepicker.css")),format.raw/*6.100*/("""">
""")))};def /*9.2*/js/*9.4*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*9.6*/("""
	"""),format.raw/*10.2*/("""<script src=""""),_display_(/*10.16*/routes/*10.22*/.Assets.versioned("javascripts/bootstrap-table.js")),format.raw/*10.73*/("""" type="text/javascript"></script>
	<script src=""""),_display_(/*11.16*/routes/*11.22*/.Assets.versioned("javascripts/bootstrap-datepicker.js")),format.raw/*11.78*/("""" type="text/javascript"></script>
	<script src=""""),_display_(/*12.16*/routes/*12.22*/.Assets.versioned("javascripts/jquery-cloneya.js")),format.raw/*12.72*/("""" type="text/javascript"></script>
	
	<!-- configuracion de datepicker -->
	<script>
	     $('.datepicker').datepicker("""),format.raw/*16.35*/("""{"""),format.raw/*16.36*/("""
		    """),format.raw/*17.7*/("""format: 'dd/MM/yyyy'
		 """),format.raw/*18.4*/("""}"""),format.raw/*18.5*/(""");
	</script>

	<!-- clone form -->
	<script>
		$('.clone-wrapper').cloneya("""),format.raw/*23.31*/("""{"""),format.raw/*23.32*/("""
            """),format.raw/*24.13*/("""serializeIndex     : true,
            minimum		    : 1,
            maximum         : 10,
        """),format.raw/*27.9*/("""}"""),format.raw/*27.10*/(""");
	</script>

	
	<!--fix modal open at edit-->
	"""),_display_(/*32.3*/if(flash.containsKey("modal"))/*32.33*/ {_display_(Seq[Any](format.raw/*32.35*/("""
		"""),format.raw/*33.3*/("""<script>
	    	$(window).load(function()"""),format.raw/*34.32*/("""{"""),format.raw/*34.33*/("""
	        	"""),format.raw/*35.11*/("""$('#"""),_display_(/*35.16*/flash/*35.21*/.get("modal")),format.raw/*35.34*/("""').modal('show');
	    	"""),format.raw/*36.7*/("""}"""),format.raw/*36.8*/(""");
	    </script>
	""")))}),format.raw/*38.3*/("""


	"""),format.raw/*41.2*/("""<!-- fix modal close at edit -->
	<script>
		$('.modal').on('hidden.bs.modal', function () """),format.raw/*43.49*/("""{"""),format.raw/*43.50*/("""
			"""),format.raw/*44.4*/("""if(window.location.pathname!='"""),_display_(/*44.35*/routes/*44.41*/.LogisticaController.viajes),format.raw/*44.68*/("""')"""),format.raw/*44.70*/("""{"""),format.raw/*44.71*/("""
				
				"""),format.raw/*46.5*/("""window.location='"""),_display_(/*46.23*/routes/*46.29*/.LogisticaController.viajes),format.raw/*46.56*/("""';
			"""),format.raw/*47.4*/("""}"""),format.raw/*47.5*/("""	
		"""),format.raw/*48.3*/("""}"""),format.raw/*48.4*/(""");
	</script>

	<!-- reset form new viaje-->
	<script>
		document.getElementById('viaje-new-form').reset();
	</script>


	<!-- fix checkbox default checked -->
	<script>
		var checkboxes = document.getElementsByTagName('input');

		for (var i=0; i<checkboxes.length; i++)  """),format.raw/*61.44*/("""{"""),format.raw/*61.45*/("""
		  """),format.raw/*62.5*/("""if (checkboxes[i].type == 'checkbox')   """),format.raw/*62.45*/("""{"""),format.raw/*62.46*/("""
		    """),format.raw/*63.7*/("""checkboxes[i].checked = false;
		  """),format.raw/*64.5*/("""}"""),format.raw/*64.6*/("""
		"""),format.raw/*65.3*/("""}"""),format.raw/*65.4*/("""

		"""),format.raw/*67.3*/("""document.getElementById('select-viatico').disabled = true;
	</script>

	<!-- fix checkbox enable disable select for new -->
	<script>
		document.getElementById('check-viatico').onclick = function() """),format.raw/*72.65*/("""{"""),format.raw/*72.66*/("""
		    """),format.raw/*73.7*/("""document.getElementById('select-viatico').disabled = !this.checked;
		"""),format.raw/*74.3*/("""}"""),format.raw/*74.4*/(""";
	</script>



""")))};
Seq[Any](format.raw/*1.155*/("""
"""),format.raw/*3.1*/("""
"""),format.raw/*7.2*/("""

"""),format.raw/*79.2*/("""




"""),_display_(/*84.2*/logistica/*84.11*/.base("Logistica SIIAF","Viajes","Gestion de viajes","viajes",css,js)/*84.80*/{_display_(Seq[Any](format.raw/*84.81*/("""
	"""),format.raw/*85.2*/("""<button type="button" id="main-add-button" class="btn btn-primary pull-right" data-toggle="modal" data-target="#mod-new"><span class="glyphicon glyphicon-plus" aria-hidden="true"></span> Agregar Viaje</button>
	<!-- <button type="button" id="main-add-button" class="btn btn-primary" data-toggle="modal" data-target="#mod-new"><span class="glyphicon glyphicon-plus" aria-hidden="true"></span> Agregar Viaje</button> -->

	"""),_display_(/*88.3*/if(flash.containsKey("exito"))/*88.33*/{_display_(Seq[Any](format.raw/*88.34*/("""
		"""),format.raw/*89.3*/("""<div class="row">
		<div class="alert alert-success fade in col-lg-10">
			<a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
			<span class="glyphicon glyphicon-ok" aria-hidden="true"></span>
			<strong>"""),_display_(/*93.13*/flash/*93.18*/.get("exito")),format.raw/*93.31*/("""</strong>
		</div>
		</div>
	""")))}),format.raw/*96.3*/("""


	"""),_display_(/*99.3*/if(flash.containsKey("global_error"))/*99.40*/{_display_(Seq[Any](format.raw/*99.41*/("""
		"""),format.raw/*100.3*/("""<div class="row">
		<div class="alert alert-danger fade in col-lg-10">
			<a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
			<span class="glyphicon glyphicon-exclamation-sign" aria-hidden="true"></span>
			<strong>"""),_display_(/*104.13*/flash/*104.18*/.get("global_error")),format.raw/*104.38*/("""</strong>
		</div>
		</div>
	""")))}),format.raw/*107.3*/("""


	  """),format.raw/*110.4*/("""<ul class="nav nav-tabs">
	    <li class="active"><a data-toggle="tab" href="#facturacion_tab">Periodo Facturacion</a></li>
	    <li><a data-toggle="tab" href="#planilla_tab">Periodo Planilla</a></li>
	  </ul>

	  <div class="tab-content">
	    <div id="facturacion_tab" class="tab-pane fade in active">
	      <br/>
	      




	    <!-- TABLA -->
		<div class="table-responsive">
			<div class="form-group pull-right">
			<input type="text" class="search1 form-control" placeholder="Busqueda">
		</div>
		<span class="counter1 pull-right"></span>
		<table class="table table-hover table-bordered results1">
			<thead>
				<tr>
					<th class="col-md-2 col-xs-1">Tipo</th>
					<th class="col-md-2 col-xs-1">Registrado</th>
					<th class="col-md-2 col-xs-2">Cliente</th>
					<th class="col-md-2 col-xs-2">Motorista</th>
					<th class="col-md-2 col-xs-1">Total Kms </th>
					<th class="col-md-1 col-xs-1">Viatico</th>
					<th class="col-md-2 col-xs-2">Tipo viatico</th>
					<th class="col-md-1 col-xs-1">Boletas</th>
					<th class="col-md-1 col-xs-1 center-column">Editar</th>
					<th class="col-md-1 col-xs-1 center-column">Eliminar</th>
				</tr>
				<tr class="warning no-result1">
					<td colspan="4"><i class="fa fa-warning"></i> No hay resultados</td>
				</tr>
			</thead>
			<tbody>
				"""),_display_(/*148.6*/for(viaje <- viajes_facturacion_list) yield /*148.43*/{_display_(Seq[Any](format.raw/*148.44*/("""
					"""),format.raw/*149.6*/("""<tr>
						<td>"""),_display_(/*150.12*/if(viaje.tipo==1)/*150.29*/{_display_(Seq[Any](format.raw/*150.30*/("""Local""")))}/*150.36*/else/*150.40*/{_display_(_display_(/*150.42*/if(viaje.tipo==2)/*150.59*/{_display_(Seq[Any](format.raw/*150.60*/("""Internacional""")))}))}),format.raw/*150.75*/("""</td>
						<td>"""),_display_(/*151.12*/viaje/*151.17*/.fecha_registro.format("dd/MM/yyyy")),format.raw/*151.53*/("""</td>
						<td>"""),_display_(/*152.12*/viaje/*152.17*/.cliente.nombre),format.raw/*152.32*/("""</td>
						<td>"""),_display_(/*153.12*/viaje/*153.17*/.motorista.nombre),format.raw/*153.34*/("""</td>
						<td>"""),_display_(/*154.12*/viaje/*154.17*/.total_km),format.raw/*154.26*/("""</td>
						<td>"""),_display_(/*155.12*/if(viaje.viaticos==true)/*155.36*/{_display_(Seq[Any](format.raw/*155.37*/("""Si""")))}/*155.40*/else/*155.44*/{_display_(_display_(/*155.46*/if(viaje.viaticos==false)/*155.71*/{_display_(Seq[Any](format.raw/*155.72*/("""No""")))}))}),format.raw/*155.76*/("""</td>
						<td>"""),_display_(/*156.12*/if(viaje.tipo_viatico==1)/*156.37*/{_display_(Seq[Any](format.raw/*156.38*/("""V/V""")))}/*156.42*/else/*156.46*/{_display_(_display_(/*156.48*/if(viaje.tipo_viatico==2)/*156.73*/{_display_(Seq[Any](format.raw/*156.74*/("""V/C""")))}/*156.78*/else/*156.82*/{_display_(_display_(/*156.84*/if(viaje.tipo_viatico==3)/*156.109*/{_display_(Seq[Any](format.raw/*156.110*/("""C/C""")))}))}))}),format.raw/*156.116*/("""</td>
						<td><a href="#" data-toggle="modal" data-target="#mod-bol-"""),_display_(/*157.66*/viaje/*157.71*/.id),format.raw/*157.74*/(""""><center>--"""),_display_(/*157.87*/viaje/*157.92*/.boletas.length),format.raw/*157.107*/("""--</center></a></td>
						<td><a href=""""),_display_(/*158.21*/routes/*158.27*/.LogisticaController.viaje_edit(viaje.id)),format.raw/*158.68*/("""" class="btn btn-success btn-xs" ><span class="glyphicon glyphicon-edit"></span> Editar</button></td>
						<td><button class="btn btn-danger btn-xs" data-toggle="modal" data-target="#mod-remove-"""),_display_(/*159.95*/viaje/*159.100*/.id),format.raw/*159.103*/(""""><span class="glyphicon glyphicon-trash"></span> Eliminar</button></td>
					</tr>



					<!-- Modal remove-->
					<div class="modal fade" id="mod-remove-"""),_display_(/*165.46*/viaje/*165.51*/.id),format.raw/*165.54*/("""" role="dialog">
						<div class="modal-dialog">

						<!-- Modal content-->
						<div class="modal-content">
							<div class="modal-header">
								<button type="button" class="close" data-dismiss="modal">&times;</button>
								<h4 class="modal-title">Eliminar viaje: """),_display_(/*172.50*/viaje/*172.55*/.tipo),format.raw/*172.60*/("""</h4>
								</div>
								<div class="modal-body">

									¿Esta seguro que desea eliminar el viaje?.
									El detalle de pago para el empleado que lo realizo sera actualizado.
									Ademas detalle de cobro para el cliente a quien fue realizado sera actualizado

								</div>
								<div class="modal-footer">
									<form>
									<button type="button" class="btn btn-default" data-dismiss="modal">Cerrar</button>							
									<button type="submit" class="btn btn-danger" formmethod="POST" formaction=""""),_display_(/*184.86*/routes/*184.92*/.LogisticaController.viaje_remove(viaje.id)),format.raw/*184.135*/(""""><span class="glyphicon glyphicon-trash" aria-hidden="true"></span> Eliminar</button>
									</form>
								</div>
							</div>

						</div>
					</div>
					<!-- Fin Modal remove-->

				""")))}),format.raw/*193.6*/("""
			"""),format.raw/*194.4*/("""</tbody>
		</table>
		</div>
		<!-- FIN TABLA -->





	    </div>
	    <div id="planilla_tab" class="tab-pane fade">
	      <br/>
	      



	      	<!-- TABLA -->
		<div class="table-responsive">
			<div class="form-group pull-right">
			<input type="text" class="search2 form-control" placeholder="Busqueda">
		</div>
		<span class="counter2 pull-right"></span>
		<table class="table table-hover table-bordered results2">
			<thead>
				<tr>
					<th class="col-md-2 col-xs-2">Tipo</th>
					<th class="col-md-2 col-xs-2">Registrado</th>
					<th class="col-md-2 col-xs-2">Cliente</th>
					<th class="col-md-2 col-xs-2">Motorista</th>
					<th class="col-md-2 col-xs-2">Total Kms </th>
					<th class="col-md-1 col-xs-1">Viatico</th>
					<th class="col-md-2 col-xs-2">Tipo viatico</th>
					<th class="col-md-1 col-xs-1">Boletas</th>
					<th class="col-md-1 col-xs-1 center-column">Editar</th>
					<th class="col-md-1 col-xs-1 center-column">Eliminar</th>
				</tr>
				<tr class="warning no-result2">
					<td colspan="4"><i class="fa fa-warning"></i> No hay resultados</td>
				</tr>
			</thead>
			<tbody>
				"""),_display_(/*235.6*/for(viaje <- viajes_planilla_list) yield /*235.40*/{_display_(Seq[Any](format.raw/*235.41*/("""
					"""),format.raw/*236.6*/("""<tr>
						<td>"""),_display_(/*237.12*/if(viaje.tipo==1)/*237.29*/{_display_(Seq[Any](format.raw/*237.30*/("""Local""")))}/*237.36*/else/*237.40*/{_display_(_display_(/*237.42*/if(viaje.tipo==2)/*237.59*/{_display_(Seq[Any](format.raw/*237.60*/("""Internacional""")))}))}),format.raw/*237.75*/("""</td>
						<td>"""),_display_(/*238.12*/viaje/*238.17*/.fecha_registro.format("dd/MM/yyyy")),format.raw/*238.53*/("""</td>
						<td>"""),_display_(/*239.12*/viaje/*239.17*/.cliente.nombre),format.raw/*239.32*/("""</td>
						<td>"""),_display_(/*240.12*/viaje/*240.17*/.motorista.nombre),format.raw/*240.34*/("""</td>
						<td>"""),_display_(/*241.12*/viaje/*241.17*/.total_km),format.raw/*241.26*/("""</td>
						<td>"""),_display_(/*242.12*/if(viaje.viaticos==true)/*242.36*/{_display_(Seq[Any](format.raw/*242.37*/("""Si""")))}/*242.40*/else/*242.44*/{_display_(_display_(/*242.46*/if(viaje.viaticos==false)/*242.71*/{_display_(Seq[Any](format.raw/*242.72*/("""No""")))}))}),format.raw/*242.76*/("""</td>
						<td>"""),_display_(/*243.12*/if(viaje.tipo_viatico==1)/*243.37*/{_display_(Seq[Any](format.raw/*243.38*/("""V/V""")))}/*243.42*/else/*243.46*/{_display_(_display_(/*243.48*/if(viaje.tipo_viatico==2)/*243.73*/{_display_(Seq[Any](format.raw/*243.74*/("""V/C""")))}/*243.78*/else/*243.82*/{_display_(_display_(/*243.84*/if(viaje.tipo_viatico==3)/*243.109*/{_display_(Seq[Any](format.raw/*243.110*/("""C/C""")))}))}))}),format.raw/*243.116*/("""</td>
						<td><a href="#" data-toggle="modal" data-target="#mod-bol-"""),_display_(/*244.66*/viaje/*244.71*/.id),format.raw/*244.74*/(""""><center>--"""),_display_(/*244.87*/viaje/*244.92*/.boletas.length),format.raw/*244.107*/("""--</center></a></td>
						<td><a href=""""),_display_(/*245.21*/routes/*245.27*/.LogisticaController.viaje_edit(viaje.id)),format.raw/*245.68*/("""" class="btn btn-success btn-xs" ><span class="glyphicon glyphicon-edit"></span> Editar</button></td>
						<td><button class="btn btn-danger btn-xs" data-toggle="modal" data-target="#mod-remove-"""),_display_(/*246.95*/viaje/*246.100*/.id),format.raw/*246.103*/(""""><span class="glyphicon glyphicon-trash"></span> Eliminar</button></td>
					</tr>



					<!-- Modal remove -->
					<div class="modal fade" id="mod-remove-"""),_display_(/*252.46*/viaje/*252.51*/.id),format.raw/*252.54*/("""" role="dialog">
						<div class="modal-dialog">
						<!-- Modal content-->
						<div class="modal-content">
							<div class="modal-header">
								<button type="button" class="close" data-dismiss="modal">&times;</button>
								<h4 class="modal-title">Eliminar viaje: """),_display_(/*258.50*/viaje/*258.55*/.tipo),format.raw/*258.60*/("""</h4>
								</div>
								<div class="modal-body">

									¿Esta seguro que desea eliminar el viaje?.

								</div>
								<div class="modal-footer">
									<form>
									<button type="button" class="btn btn-default" data-dismiss="modal">Cerrar</button>							
									<button type="submit" class="btn btn-danger" formmethod="POST" formaction=""""),_display_(/*268.86*/routes/*268.92*/.LogisticaController.viaje_remove(viaje.id)),format.raw/*268.135*/(""""><span class="glyphicon glyphicon-trash" aria-hidden="true"></span> Eliminar</button>
									</form>
								</div>
							</div>

						</div>
					</div>
					<!-- Fin Modal remove -->




					

				""")))}),format.raw/*282.6*/("""
			"""),format.raw/*283.4*/("""</tbody>
		</table>
		</div>
		<!-- FIN TABLA -->




	    </div>
	  </div>







	<!--Inicio modal nuevo viaje-->
	<div class="modal fade" id="mod-new" role="dialog">

		<div class="modal-dialog modal-lg modal-admin">

		<!-- Modal content-->
		<div class="modal-content">
			"""),_display_(/*307.5*/form(action=routes.LogisticaController.viaje_new(), 'class->"form-horizontal", 'autocomplete->"off", '_id -> "viaje-new-form")/*307.131*/{_display_(Seq[Any](format.raw/*307.132*/("""
				"""),format.raw/*308.5*/("""<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal">&times;</button>
					<h4 class="modal-title">Agregar nuevo viaje</h4>
				</div>

				
				<div class="modal-body">
					<div class="panel panel-default">
						<br/>
						"""),_display_(/*317.8*/if(flash.containsKey("error"))/*317.38*/{_display_(Seq[Any](format.raw/*317.39*/("""
							"""),format.raw/*318.8*/("""<div class="alert alert-danger fade in">
								<a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
								<span class="glyphicon glyphicon-exclamation-sign" aria-hidden="true"></span>
								<strong>"""),_display_(/*321.18*/flash/*321.23*/.get("error")),format.raw/*321.36*/("""</strong>
							</div>
						""")))}),format.raw/*323.8*/("""

						"""),format.raw/*325.7*/("""<div class="form-group">
							<label class="control-label col-sm-2" >Tipo:</label>
							<div class="col-sm-8">
								<select class="form-control" name="tipo" >
									<option value="" selected disabled>Seleccione...</option>
									<option value="1">Local</option>
									<option value="2">Internacional</option>
								</select>
							</div>
						</div>
							
	  				
						<div class="form-group">
							<label class="control-label col-sm-2"  >Cabezal:</label>
							<div class="col-sm-8">
								<select class="form-control" name="cabezal" >
									<option value="" selected disabled>Seleccione...</option>
									"""),_display_(/*342.11*/for(cabezal <- cabezales ) yield /*342.37*/{_display_(Seq[Any](format.raw/*342.38*/("""
										"""),format.raw/*343.11*/("""<option value=""""),_display_(/*343.27*/cabezal/*343.34*/.id),format.raw/*343.37*/("""">"""),_display_(/*343.40*/cabezal/*343.47*/.placa),format.raw/*343.53*/("""</option>
									""")))}),format.raw/*344.11*/("""
								"""),format.raw/*345.9*/("""</select>
							</div>
						</div>

						<div class="form-group">
							<label class="control-label col-sm-2"  >Motorista:</label>
							<div class="col-sm-8">
								<select class="form-control" name="motorista" >
									<option value="" selected disabled>Seleccione...</option>
									"""),_display_(/*354.11*/for(motorista <- motoristas ) yield /*354.40*/{_display_(Seq[Any](format.raw/*354.41*/("""
										"""),format.raw/*355.11*/("""<option value=""""),_display_(/*355.27*/motorista/*355.36*/.id),format.raw/*355.39*/("""">"""),_display_(/*355.42*/motorista/*355.51*/.nombre),format.raw/*355.58*/("""</option>
									""")))}),format.raw/*356.11*/("""
								"""),format.raw/*357.9*/("""</select>
							</div>
						</div>

						<div class="form-group">
							<label class="control-label col-sm-2"  >Cliente:</label>
							<div class="col-sm-8">
								<select class="form-control" name="cliente" >
									<option value="" selected disabled>Seleccione...</option>
									"""),_display_(/*366.11*/for(cliente <- clientes ) yield /*366.36*/{_display_(Seq[Any](format.raw/*366.37*/("""
										"""),format.raw/*367.11*/("""<option value=""""),_display_(/*367.27*/cliente/*367.34*/.id),format.raw/*367.37*/("""">"""),_display_(/*367.40*/cliente/*367.47*/.nombre),format.raw/*367.54*/("""</option>
									""")))}),format.raw/*368.11*/("""
								"""),format.raw/*369.9*/("""</select>
							</div>
						</div>

					    
						<div class="form-group">
							<div class="col-sm-offset-2 col-sm-10">
								<div class="checkbox">
									<label><input type="checkbox" name="viaticos" id="check-viatico" checked="false">Viaticos</label>
								</div>
							</div>
						</div>

						<div class="form-group">
							<label class="control-label col-sm-2" >Tipo Viatico:</label>
							<div class="col-sm-8">
								<select class="form-control" name="tipo_viatico" id="select-viatico">
									<option value="" selected disabled>Seleccione...</option>
									<option value="1">Vacio/Vacio</option>
									<option value="2">Vacio/Cargado</option>
									<option value="3">Cargado/Cargado</option>
								</select>
							</div>
						</div>
					</div><!--pannel-->


					
					<div class="clone-wrapper">
						<!--panel boleta-->
						<div class="panel panel-default toclone">
							
							<button type="button" class="delete btn btn-danger pull-right">-</button>
							<button type="button" class="clone btn btn-success pull-right">+</button>
							
							<div class="row">
								<p class="text-center"><strong>Boleta</strong></p>
							</div>
							
							
							
							<div class="form-group">
								<label class="col-xs-1 control-label"></label>
								
								<div class=" col-xs-2">
									<label class="control-label">Codigo</label>
									<input type="text" name="codigo[0]" class="form-control" placeholder="Codigo">
								</div>


								<div class="col-xs-2">
									<label class="control-label">Destino</label>
									<input type="text" name="destino[0]" class="form-control" placeholder="Destino">
								</div>

								<div class="col-xs-2">
									<label class="control-label">Kilometros</label>
									<input type="text" name="km_asignados[0]" class="form-control" placeholder="Kms">
								</div>

								<div class="col-xs-2">
									<label class="control-label">Carga</label>
									<select name="tipo_carga[0]" class="form-control">
										<option value="" selected disabled>Seleccione</option>
										<option value="1">Vacio</option>
										<option value="2">Sencillo</option>
										<option value="3">Cargado</option>
									</select>
								</div>

								<div class="col-xs-2">
									<label class="control-label">Sentido</label>
									<select name="sentido[0]" class="form-control">
										<option value="" selected disabled>Seleccione</option>
										<option value="3">No definido</option>
										<option value="1">Ida</option>
										<option value="2">Regreso</option>
									</select>
								</div>

								
								<div class="col-sm-offset-1 col-lg-4">
									<div class="checkbox">
										<label><input type="checkbox" checked="false" name="sobrepeso[0]" class="form-control">Sobrepeso</label>
									</div>
								</div>

								<div class="col-lg-4">
									<div class="checkbox">
										<label><input type="checkbox" checked="false" name="cruce_frontera[0]" class="form-control">Cruce Frontera</label>
									</div>
								</div>					
															   
						    </div>
						    <br/>
						</div>
						<!--fin panel boleta-->
						
					</div>
					



				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">Cerrar</button>
					<button type="submit" class="btn btn-primary"><span class="glyphicon glyphicon-plus" aria-hidden="true"></span> Agregar</button>
				</div>
			""")))}),format.raw/*477.5*/("""
		"""),format.raw/*478.3*/("""</div>

		</div>
	</div>
	<!--Fin modal nuevo viaje-->


	<!-- CREACION DE MODALES viajes periodo planilla-->
	"""),_display_(/*486.3*/for(viaje <- viajes_planilla_list) yield /*486.37*/{_display_(Seq[Any](format.raw/*486.38*/("""
		"""),format.raw/*487.3*/("""<!-- Modal  show boletas-->
		<div class="modal fade" id="mod-bol-"""),_display_(/*488.40*/viaje/*488.45*/.id),format.raw/*488.48*/("""" role="dialog">
			<div class="modal-dialog modal-lg">
			<!-- Modal content-->
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal">&times;</button>
					<h4 class="modal-title">Boletas de viaje: """),_display_(/*494.49*/viaje/*494.54*/.id),format.raw/*494.57*/("""</h4>
					</div>
					<div class="modal-body">
				       <div class="table-responsive">
						  <table class="table table-hover">
						    <thead>
								<tr>
									<th>Codigo</th>
									<th>Destino</th>
									<th>Kilometros</th>
									<th>Carga</th>
									<th>Sobrepeso</th>
									<th>Frontera</th>
									<th>Sentido</th>
								</tr>
							</thead>
							<tbody>
								"""),_display_(/*511.10*/for(boleta <- viaje.boletas) yield /*511.38*/{_display_(Seq[Any](format.raw/*511.39*/("""
									"""),format.raw/*512.10*/("""<tr>
										<td>"""),_display_(/*513.16*/boleta/*513.22*/.codigo),format.raw/*513.29*/("""</td>
										<td>"""),_display_(/*514.16*/boleta/*514.22*/.destino),format.raw/*514.30*/("""</td>
										<td>"""),_display_(/*515.16*/boleta/*515.22*/.km_asignados),format.raw/*515.35*/("""</td>
										<td>"""),_display_(/*516.16*/if(boleta.tipo_carga==1)/*516.40*/{_display_(Seq[Any](format.raw/*516.41*/("""Vacio""")))}/*516.47*/else/*516.51*/{_display_(_display_(/*516.53*/if(boleta.tipo_carga==2)/*516.77*/{_display_(Seq[Any](format.raw/*516.78*/("""Sencillo""")))}/*516.87*/else/*516.91*/{_display_(Seq[Any](format.raw/*516.92*/("""Cargado""")))}))}),format.raw/*516.101*/("""</td>
										<td>"""),_display_(/*517.16*/if(boleta.sobrepeso==true)/*517.42*/{_display_(Seq[Any](format.raw/*517.43*/("""Si""")))}/*517.46*/else/*517.50*/{_display_(Seq[Any](format.raw/*517.51*/("""No""")))}),format.raw/*517.54*/("""</td>
										<td>"""),_display_(/*518.16*/if(boleta.cruce_frontera==true)/*518.47*/{_display_(Seq[Any](format.raw/*518.48*/("""Si""")))}/*518.51*/else/*518.55*/{_display_(Seq[Any](format.raw/*518.56*/("""No""")))}),format.raw/*518.59*/("""</td>
										<td>"""),_display_(/*519.16*/if(boleta.sentido==1)/*519.37*/{_display_(Seq[Any](format.raw/*519.38*/("""Ida""")))}/*519.42*/else/*519.46*/{_display_(_display_(/*519.48*/if(boleta.sentido==2)/*519.69*/{_display_(Seq[Any](format.raw/*519.70*/("""Regreso""")))}/*519.78*/else/*519.82*/{_display_(Seq[Any](format.raw/*519.83*/("""Indefinido""")))}))}),format.raw/*519.95*/("""</td>
									</tr>
								""")))}),format.raw/*521.10*/("""
							"""),format.raw/*522.8*/("""</tbody>
						  </table>
						</div> 
					</div>
					<div class="modal-footer">
						<button type="button" class="btn btn-default" data-dismiss="modal">Cerrar</button>							
					</div>
				</div>

			</div>
		</div>
		<!-- Modal  show boletas-->
	""")))}),format.raw/*534.3*/("""
	"""),format.raw/*535.2*/("""<!-- fin creacion modales planilla -->


	<!-- CREACION DE MODALES viajes periodo planilla-->
	"""),_display_(/*539.3*/for(viaje <- viajes_facturacion_list) yield /*539.40*/{_display_(Seq[Any](format.raw/*539.41*/("""
		"""),format.raw/*540.3*/("""<!-- Modal  show boletas-->
		<div class="modal fade" id="mod-bol-"""),_display_(/*541.40*/viaje/*541.45*/.id),format.raw/*541.48*/("""" role="dialog">
			<div class="modal-dialog modal-lg">
			<!-- Modal content-->
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal">&times;</button>
					<h4 class="modal-title">Boletas de viaje: """),_display_(/*547.49*/viaje/*547.54*/.id),format.raw/*547.57*/("""</h4>
					</div>
					<div class="modal-body">
				       <div class="table-responsive">
						  <table class="table table-hover">
						    <thead>
								<tr>
									<th>Codigo</th>
									<th>Destino</th>
									<th>Kilometros</th>
									<th>Carga</th>
									<th>Sobrepeso</th>
									<th>Frontera</th>
									<th>Sentido</th>
								</tr>
							</thead>
							<tbody>
								"""),_display_(/*564.10*/for(boleta <- viaje.boletas) yield /*564.38*/{_display_(Seq[Any](format.raw/*564.39*/("""
									"""),format.raw/*565.10*/("""<tr>
										<td>"""),_display_(/*566.16*/boleta/*566.22*/.codigo),format.raw/*566.29*/("""</td>
										<td>"""),_display_(/*567.16*/boleta/*567.22*/.destino),format.raw/*567.30*/("""</td>
										<td>"""),_display_(/*568.16*/boleta/*568.22*/.km_asignados),format.raw/*568.35*/("""</td>
										<td>"""),_display_(/*569.16*/if(boleta.tipo_carga==1)/*569.40*/{_display_(Seq[Any](format.raw/*569.41*/("""Vacio""")))}/*569.47*/else/*569.51*/{_display_(_display_(/*569.53*/if(boleta.tipo_carga==2)/*569.77*/{_display_(Seq[Any](format.raw/*569.78*/("""Sencillo""")))}/*569.87*/else/*569.91*/{_display_(Seq[Any](format.raw/*569.92*/("""Cargado""")))}))}),format.raw/*569.101*/("""</td>
										<td>"""),_display_(/*570.16*/if(boleta.sobrepeso==true)/*570.42*/{_display_(Seq[Any](format.raw/*570.43*/("""Si""")))}/*570.46*/else/*570.50*/{_display_(Seq[Any](format.raw/*570.51*/("""No""")))}),format.raw/*570.54*/("""</td>
										<td>"""),_display_(/*571.16*/if(boleta.cruce_frontera==true)/*571.47*/{_display_(Seq[Any](format.raw/*571.48*/("""Si""")))}/*571.51*/else/*571.55*/{_display_(Seq[Any](format.raw/*571.56*/("""No""")))}),format.raw/*571.59*/("""</td>
										<td>"""),_display_(/*572.16*/if(boleta.sentido==1)/*572.37*/{_display_(Seq[Any](format.raw/*572.38*/("""Ida""")))}/*572.42*/else/*572.46*/{_display_(_display_(/*572.48*/if(boleta.sentido==2)/*572.69*/{_display_(Seq[Any](format.raw/*572.70*/("""Regreso""")))}/*572.78*/else/*572.82*/{_display_(Seq[Any](format.raw/*572.83*/("""Indefinido""")))}))}),format.raw/*572.95*/("""</td>
									</tr>
								""")))}),format.raw/*574.10*/("""
							"""),format.raw/*575.8*/("""</tbody>
						  </table>
						</div> 
					</div>
					<div class="modal-footer">
						<button type="button" class="btn btn-default" data-dismiss="modal">Cerrar</button>							
					</div>
				</div>

			</div>
		</div>
		<!-- Modal  show boletas-->
	""")))}),format.raw/*587.3*/("""
	"""),format.raw/*588.2*/("""<!-- fin creacion modales facturacion -->
  	


""")))}))
      }
    }
  }

  def render(viajes_facturacion_list:List[Viaje],viajes_planilla_list:List[Viaje],cabezales:List[Cabezal],motoristas:List[Motorista],clientes:List[Cliente]): play.twirl.api.HtmlFormat.Appendable = apply(viajes_facturacion_list,viajes_planilla_list,cabezales,motoristas,clientes)

  def f:((List[Viaje],List[Viaje],List[Cabezal],List[Motorista],List[Cliente]) => play.twirl.api.HtmlFormat.Appendable) = (viajes_facturacion_list,viajes_planilla_list,cabezales,motoristas,clientes) => apply(viajes_facturacion_list,viajes_planilla_list,cabezales,motoristas,clientes)

  def ref: this.type = this

}


}

/**/
object viajes extends viajes_Scope0.viajes
              /*
                  -- GENERATED --
                  DATE: Fri Nov 11 22:58:40 CST 2016
                  SOURCE: /home/samuel/Desarrollo/siiaf/app/views/logistica/viajes.scala.html
                  HASH: da6bb7ae55c437e679dad477e1ddbf99393e8167
                  MATRIX: 818->1|1064->174|1074->177|1153->179|1181->181|1252->226|1266->232|1339->284|1414->333|1428->339|1496->386|1522->393|1531->395|1610->397|1639->399|1680->413|1695->419|1767->470|1844->520|1859->526|1936->582|2013->632|2028->638|2099->688|2246->807|2275->808|2309->815|2360->839|2388->840|2492->916|2521->917|2562->930|2688->1029|2717->1030|2793->1080|2832->1110|2872->1112|2902->1115|2970->1155|2999->1156|3038->1167|3070->1172|3084->1177|3118->1190|3169->1214|3197->1215|3247->1235|3278->1239|3397->1330|3426->1331|3457->1335|3515->1366|3530->1372|3578->1399|3608->1401|3637->1402|3674->1412|3719->1430|3734->1436|3782->1463|3815->1469|3843->1470|3874->1474|3902->1475|4203->1748|4232->1749|4264->1754|4332->1794|4361->1795|4395->1802|4457->1837|4485->1838|4515->1841|4543->1842|4574->1846|4800->2044|4829->2045|4863->2052|4960->2122|4988->2123|5045->154|5072->172|5099->390|5128->2140|5160->2146|5178->2155|5256->2224|5295->2225|5324->2227|5772->2649|5811->2679|5850->2680|5880->2683|6139->2915|6153->2920|6187->2933|6247->2963|6278->2968|6324->3005|6363->3006|6394->3009|6667->3254|6682->3259|6724->3279|6785->3309|6819->3315|8151->4620|8205->4657|8245->4658|8279->4664|8323->4680|8350->4697|8390->4698|8416->4704|8430->4708|8461->4710|8488->4727|8528->4728|8577->4743|8622->4760|8637->4765|8695->4801|8740->4818|8755->4823|8792->4838|8837->4855|8852->4860|8891->4877|8936->4894|8951->4899|8982->4908|9027->4925|9061->4949|9101->4950|9124->4953|9138->4957|9169->4959|9204->4984|9244->4985|9282->4989|9327->5006|9362->5031|9402->5032|9426->5036|9440->5040|9471->5042|9506->5067|9546->5068|9570->5072|9584->5076|9615->5078|9651->5103|9692->5104|9735->5110|9834->5181|9849->5186|9874->5189|9915->5202|9930->5207|9968->5222|10037->5263|10053->5269|10116->5310|10340->5506|10356->5511|10382->5514|10568->5672|10583->5677|10608->5680|10914->5958|10929->5963|10956->5968|11508->6492|11524->6498|11590->6541|11816->6736|11848->6740|12996->7861|13047->7895|13087->7896|13121->7902|13165->7918|13192->7935|13232->7936|13258->7942|13272->7946|13303->7948|13330->7965|13370->7966|13419->7981|13464->7998|13479->8003|13537->8039|13582->8056|13597->8061|13634->8076|13679->8093|13694->8098|13733->8115|13778->8132|13793->8137|13824->8146|13869->8163|13903->8187|13943->8188|13966->8191|13980->8195|14011->8197|14046->8222|14086->8223|14124->8227|14169->8244|14204->8269|14244->8270|14268->8274|14282->8278|14313->8280|14348->8305|14388->8306|14412->8310|14426->8314|14457->8316|14493->8341|14534->8342|14577->8348|14676->8419|14691->8424|14716->8427|14757->8440|14772->8445|14810->8460|14879->8501|14895->8507|14958->8548|15182->8744|15198->8749|15224->8752|15411->8911|15426->8916|15451->8919|15756->9196|15771->9201|15798->9206|16184->9564|16200->9570|16266->9613|16503->9819|16535->9823|16841->10102|16978->10228|17019->10229|17052->10234|17343->10498|17383->10528|17423->10529|17459->10537|17717->10767|17732->10772|17767->10785|17829->10816|17865->10824|18535->11466|18578->11492|18618->11493|18658->11504|18702->11520|18719->11527|18744->11530|18775->11533|18792->11540|18820->11546|18872->11566|18909->11575|19235->11873|19281->11902|19321->11903|19361->11914|19405->11930|19424->11939|19449->11942|19480->11945|19499->11954|19528->11961|19580->11981|19617->11990|19939->12284|19981->12309|20021->12310|20061->12321|20105->12337|20122->12344|20147->12347|20178->12350|20195->12357|20224->12364|20276->12384|20313->12393|23847->15896|23878->15899|24017->16011|24068->16045|24108->16046|24139->16049|24234->16116|24249->16121|24274->16124|24572->16394|24587->16399|24612->16402|25042->16804|25087->16832|25127->16833|25166->16843|25214->16863|25230->16869|25259->16876|25308->16897|25324->16903|25354->16911|25403->16932|25419->16938|25454->16951|25503->16972|25537->16996|25577->16997|25603->17003|25617->17007|25648->17009|25682->17033|25722->17034|25751->17043|25765->17047|25805->17048|25849->17057|25898->17078|25934->17104|25974->17105|25997->17108|26011->17112|26051->17113|26086->17116|26135->17137|26176->17168|26216->17169|26239->17172|26253->17176|26293->17177|26328->17180|26377->17201|26408->17222|26448->17223|26472->17227|26486->17231|26517->17233|26548->17254|26588->17255|26616->17263|26630->17267|26670->17268|26716->17280|26778->17310|26814->17318|27100->17573|27130->17575|27253->17671|27307->17708|27347->17709|27378->17712|27473->17779|27488->17784|27513->17787|27811->18057|27826->18062|27851->18065|28281->18467|28326->18495|28366->18496|28405->18506|28453->18526|28469->18532|28498->18539|28547->18560|28563->18566|28593->18574|28642->18595|28658->18601|28693->18614|28742->18635|28776->18659|28816->18660|28842->18666|28856->18670|28887->18672|28921->18696|28961->18697|28990->18706|29004->18710|29044->18711|29088->18720|29137->18741|29173->18767|29213->18768|29236->18771|29250->18775|29290->18776|29325->18779|29374->18800|29415->18831|29455->18832|29478->18835|29492->18839|29532->18840|29567->18843|29616->18864|29647->18885|29687->18886|29711->18890|29725->18894|29756->18896|29787->18917|29827->18918|29855->18926|29869->18930|29909->18931|29955->18943|30017->18973|30053->18981|30339->19236|30369->19238
                  LINES: 27->1|31->4|31->4|33->4|34->5|34->5|34->5|34->5|35->6|35->6|35->6|36->9|36->9|38->9|39->10|39->10|39->10|39->10|40->11|40->11|40->11|41->12|41->12|41->12|45->16|45->16|46->17|47->18|47->18|52->23|52->23|53->24|56->27|56->27|61->32|61->32|61->32|62->33|63->34|63->34|64->35|64->35|64->35|64->35|65->36|65->36|67->38|70->41|72->43|72->43|73->44|73->44|73->44|73->44|73->44|73->44|75->46|75->46|75->46|75->46|76->47|76->47|77->48|77->48|90->61|90->61|91->62|91->62|91->62|92->63|93->64|93->64|94->65|94->65|96->67|101->72|101->72|102->73|103->74|103->74|109->1|110->3|111->7|113->79|118->84|118->84|118->84|118->84|119->85|122->88|122->88|122->88|123->89|127->93|127->93|127->93|130->96|133->99|133->99|133->99|134->100|138->104|138->104|138->104|141->107|144->110|182->148|182->148|182->148|183->149|184->150|184->150|184->150|184->150|184->150|184->150|184->150|184->150|184->150|185->151|185->151|185->151|186->152|186->152|186->152|187->153|187->153|187->153|188->154|188->154|188->154|189->155|189->155|189->155|189->155|189->155|189->155|189->155|189->155|189->155|190->156|190->156|190->156|190->156|190->156|190->156|190->156|190->156|190->156|190->156|190->156|190->156|190->156|190->156|191->157|191->157|191->157|191->157|191->157|191->157|192->158|192->158|192->158|193->159|193->159|193->159|199->165|199->165|199->165|206->172|206->172|206->172|218->184|218->184|218->184|227->193|228->194|269->235|269->235|269->235|270->236|271->237|271->237|271->237|271->237|271->237|271->237|271->237|271->237|271->237|272->238|272->238|272->238|273->239|273->239|273->239|274->240|274->240|274->240|275->241|275->241|275->241|276->242|276->242|276->242|276->242|276->242|276->242|276->242|276->242|276->242|277->243|277->243|277->243|277->243|277->243|277->243|277->243|277->243|277->243|277->243|277->243|277->243|277->243|277->243|278->244|278->244|278->244|278->244|278->244|278->244|279->245|279->245|279->245|280->246|280->246|280->246|286->252|286->252|286->252|292->258|292->258|292->258|302->268|302->268|302->268|316->282|317->283|341->307|341->307|341->307|342->308|351->317|351->317|351->317|352->318|355->321|355->321|355->321|357->323|359->325|376->342|376->342|376->342|377->343|377->343|377->343|377->343|377->343|377->343|377->343|378->344|379->345|388->354|388->354|388->354|389->355|389->355|389->355|389->355|389->355|389->355|389->355|390->356|391->357|400->366|400->366|400->366|401->367|401->367|401->367|401->367|401->367|401->367|401->367|402->368|403->369|511->477|512->478|520->486|520->486|520->486|521->487|522->488|522->488|522->488|528->494|528->494|528->494|545->511|545->511|545->511|546->512|547->513|547->513|547->513|548->514|548->514|548->514|549->515|549->515|549->515|550->516|550->516|550->516|550->516|550->516|550->516|550->516|550->516|550->516|550->516|550->516|550->516|551->517|551->517|551->517|551->517|551->517|551->517|551->517|552->518|552->518|552->518|552->518|552->518|552->518|552->518|553->519|553->519|553->519|553->519|553->519|553->519|553->519|553->519|553->519|553->519|553->519|553->519|555->521|556->522|568->534|569->535|573->539|573->539|573->539|574->540|575->541|575->541|575->541|581->547|581->547|581->547|598->564|598->564|598->564|599->565|600->566|600->566|600->566|601->567|601->567|601->567|602->568|602->568|602->568|603->569|603->569|603->569|603->569|603->569|603->569|603->569|603->569|603->569|603->569|603->569|603->569|604->570|604->570|604->570|604->570|604->570|604->570|604->570|605->571|605->571|605->571|605->571|605->571|605->571|605->571|606->572|606->572|606->572|606->572|606->572|606->572|606->572|606->572|606->572|606->572|606->572|606->572|608->574|609->575|621->587|622->588
                  -- GENERATED --
              */
          