
package views.html.logistica

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object viaje_edit_Scope0 {
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

class viaje_edit extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[Viaje,List[Cabezal],List[Motorista],List[Cliente],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(viaje: Viaje,  cabezales: List[Cabezal], motoristas: List[Motorista], clientes: List[Cliente]):play.twirl.api.HtmlFormat.Appendable = {
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
		    """),format.raw/*17.7*/("""format: 'dd/mm/yyyy'
		 """),format.raw/*18.4*/("""}"""),format.raw/*18.5*/(""");
	</script>

	<!-- clone form -->
	<script>
		$('.clone-wrapper').cloneya("""),format.raw/*23.31*/("""{"""),format.raw/*23.32*/("""
            """),format.raw/*24.13*/("""serializeIndex     : true,
            serializeID     : true,
            minimum		    : 1,
            maximum         : 10,
            cloneThis		: '.toclone',
        """),format.raw/*29.9*/("""}"""),format.raw/*29.10*/(""");
	</script>


	"""),_display_(/*33.3*/for( (boleta,i) <- viaje.boletas.zipWithIndex) yield /*33.49*/{_display_(Seq[Any](format.raw/*33.50*/("""
		"""),format.raw/*34.3*/("""<script>
			document.getElementsByName('codigo["""),_display_(/*35.40*/i),format.raw/*35.41*/("""]')[0].value=""""),_display_(/*35.56*/boleta/*35.62*/.codigo),format.raw/*35.69*/("""";
			document.getElementsByName('destino["""),_display_(/*36.41*/i),format.raw/*36.42*/("""]')[0].value=""""),_display_(/*36.57*/boleta/*36.63*/.destino),format.raw/*36.71*/("""";
			document.getElementsByName('km_asignados["""),_display_(/*37.46*/i),format.raw/*37.47*/("""]')[0].value=""""),_display_(/*37.62*/boleta/*37.68*/.km_asignados),format.raw/*37.81*/("""";
			document.getElementsByName('tipo_carga["""),_display_(/*38.44*/i),format.raw/*38.45*/("""]')[0].value=""""),_display_(/*38.60*/boleta/*38.66*/.tipo_carga),format.raw/*38.77*/("""";
			document.getElementsByName('sentido["""),_display_(/*39.41*/i),format.raw/*39.42*/("""]')[0].value=""""),_display_(/*39.57*/boleta/*39.63*/.sentido),format.raw/*39.71*/("""";

			"""),_display_(/*41.5*/if(boleta.sobrepeso)/*41.25*/{_display_(Seq[Any](format.raw/*41.26*/("""
				"""),format.raw/*42.5*/("""document.getElementsByName('sobrepeso["""),_display_(/*42.44*/i),format.raw/*42.45*/("""]')[0].checked=""""),_display_(/*42.62*/boleta/*42.68*/.sobrepeso),format.raw/*42.78*/("""";
			""")))}),format.raw/*43.5*/("""
			"""),_display_(/*44.5*/if(boleta.cruce_frontera)/*44.30*/{_display_(Seq[Any](format.raw/*44.31*/("""
				"""),format.raw/*45.5*/("""document.getElementsByName('cruce_frontera["""),_display_(/*45.49*/i),format.raw/*45.50*/("""]')[0].checked=""""),_display_(/*45.67*/boleta/*45.73*/.cruce_frontera),format.raw/*45.88*/("""";
			""")))}),format.raw/*46.5*/("""
			

			"""),_display_(/*49.5*/if(i!=viaje.boletas.size()-1)/*49.34*/{_display_(Seq[Any](format.raw/*49.35*/("""
				"""),_display_(/*50.6*/if(i==0)/*50.14*/{_display_(Seq[Any](format.raw/*50.15*/("""
					"""),format.raw/*51.6*/("""$('.clone-wrapper').triggerHandler('clone.cloneya',[$('#clone"""),_display_(/*51.68*/i),format.raw/*51.69*/("""')]);
				""")))}/*52.6*/else/*52.10*/{_display_(Seq[Any](format.raw/*52.11*/("""
					"""),format.raw/*53.6*/("""$('.clone-wrapper').triggerHandler('clone.cloneya',[$('#clone0"""),_display_(/*53.69*/i),format.raw/*53.70*/("""')]);
				""")))}),format.raw/*54.6*/("""
			""")))}),format.raw/*55.5*/("""
			
			
		"""),format.raw/*58.3*/("""</script>
	""")))}),format.raw/*59.3*/("""
	

	"""),format.raw/*62.2*/("""<!-- fix checkbox enable disable select for new -->
	<script>
		document.getElementById('check-viatico').onchange = function() """),format.raw/*64.66*/("""{"""),format.raw/*64.67*/("""
		    """),format.raw/*65.7*/("""document.getElementById('select-viatico').disabled = !this.checked;
		"""),format.raw/*66.3*/("""}"""),format.raw/*66.4*/(""";
	</script>


""")))};
Seq[Any](format.raw/*1.97*/("""
"""),format.raw/*3.1*/("""
"""),format.raw/*7.2*/("""

"""),format.raw/*70.2*/("""




"""),_display_(/*75.2*/logistica/*75.11*/.base("Logistica SIIAF","Viajes","Editar viaje: "+viaje.id,"viajes",css,js)/*75.86*/{_display_(Seq[Any](format.raw/*75.87*/("""
	
		"""),_display_(/*77.4*/if(flash.containsKey("error"))/*77.34*/{_display_(Seq[Any](format.raw/*77.35*/("""
			"""),format.raw/*78.4*/("""<div class="alert alert-danger fade in">
				<a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
				<span class="glyphicon glyphicon-exclamation-sign" aria-hidden="true"></span>
				<strong>"""),_display_(/*81.14*/flash/*81.19*/.get("error")),format.raw/*81.32*/("""</strong>
			</div>
		""")))}),format.raw/*83.4*/("""

		"""),_display_(/*85.4*/if(flash.containsKey("exito"))/*85.34*/{_display_(Seq[Any](format.raw/*85.35*/("""
			"""),format.raw/*86.4*/("""<div class="alert alert-success fade in">
				<a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
				<span class="glyphicon glyphicon-ok" aria-hidden="true"></span>
				<strong>"""),_display_(/*89.14*/flash/*89.19*/.get("exito")),format.raw/*89.32*/("""</strong>
			</div>
		""")))}),format.raw/*91.4*/("""


		"""),format.raw/*94.3*/("""<a href=""""),_display_(/*94.13*/routes/*94.19*/.LogisticaController.viajes()),format.raw/*94.48*/("""" class="btn btn-success"><span class="glyphicon glyphicon-arrow-left"></span></a>
		"""),_display_(/*95.4*/form(action=routes.LogisticaController.viaje_edit_post(viaje.id), 'class->"form-horizontal", 'autocomplete->"off", '_id -> "viaje-new-form")/*95.144*/{_display_(Seq[Any](format.raw/*95.145*/("""


			

				"""),format.raw/*100.5*/("""<div class="panel panel-default">
					<br/>
					

					<div class="form-group">
						<label class="control-label col-sm-2" >Tipo:</label>
						<div class="col-sm-8">
							<select class="form-control" name="tipo" >
								<option value="" """),_display_(/*108.27*/if(viaje.tipo==null)/*108.47*/{_display_(Seq[Any](format.raw/*108.48*/("""selected""")))}),format.raw/*108.57*/(""" """),format.raw/*108.58*/("""disabled>Seleccione...</option>
								<option value="1" """),_display_(/*109.28*/if(viaje.tipo==1)/*109.45*/{_display_(Seq[Any](format.raw/*109.46*/("""selected""")))}),format.raw/*109.55*/(""">Local</option>
								<option value="2" """),_display_(/*110.28*/if(viaje.tipo==2)/*110.45*/{_display_(Seq[Any](format.raw/*110.46*/("""selected""")))}),format.raw/*110.55*/(""">Internacional</option>
							</select>
						</div>
					</div>
						
  				
					<div class="form-group">
						<label class="control-label col-sm-2"  >Cabezal:</label>
						<div class="col-sm-8">
							<select class="form-control" name="cabezal" >
								<option value="" selected disabled>Seleccione...</option>
								"""),_display_(/*121.10*/for(cabezal <- cabezales ) yield /*121.36*/{_display_(Seq[Any](format.raw/*121.37*/("""
									"""),format.raw/*122.10*/("""<option value=""""),_display_(/*122.26*/cabezal/*122.33*/.id),format.raw/*122.36*/("""" """),_display_(/*122.39*/if(viaje.cabezal.id==cabezal.id)/*122.71*/{_display_(Seq[Any](format.raw/*122.72*/("""selected""")))}),format.raw/*122.81*/(""">"""),_display_(/*122.83*/cabezal/*122.90*/.placa),format.raw/*122.96*/("""</option>
								""")))}),format.raw/*123.10*/("""
							"""),format.raw/*124.8*/("""</select>
						</div>
					</div>

					<div class="form-group">
						<label class="control-label col-sm-2"  >Motorista:</label>
						<div class="col-sm-8">
							<select class="form-control" name="motorista" >
								<option value="" selected disabled>Seleccione...</option>
								"""),_display_(/*133.10*/for(motorista <- motoristas ) yield /*133.39*/{_display_(Seq[Any](format.raw/*133.40*/("""
									"""),format.raw/*134.10*/("""<option value=""""),_display_(/*134.26*/motorista/*134.35*/.id),format.raw/*134.38*/("""" """),_display_(/*134.41*/if(viaje.motorista.id==motorista.id)/*134.77*/{_display_(Seq[Any](format.raw/*134.78*/("""selected""")))}),format.raw/*134.87*/(""" """),format.raw/*134.88*/(""">"""),_display_(/*134.90*/motorista/*134.99*/.nombre),format.raw/*134.106*/("""</option>
								""")))}),format.raw/*135.10*/("""
							"""),format.raw/*136.8*/("""</select>
						</div>
					</div>

					<div class="form-group">
						<label class="control-label col-sm-2"  >Cliente:</label>
						<div class="col-sm-8">
							<select class="form-control" name="cliente" >
								<option value="" selected disabled>Seleccione...</option>
								"""),_display_(/*145.10*/for(cliente <- clientes ) yield /*145.35*/{_display_(Seq[Any](format.raw/*145.36*/("""
									"""),format.raw/*146.10*/("""<option value=""""),_display_(/*146.26*/cliente/*146.33*/.id),format.raw/*146.36*/("""" """),_display_(/*146.39*/if(viaje.cliente.id==cliente.id)/*146.71*/{_display_(Seq[Any](format.raw/*146.72*/("""selected""")))}),format.raw/*146.81*/(""">"""),_display_(/*146.83*/cliente/*146.90*/.nombre),format.raw/*146.97*/("""</option>
								""")))}),format.raw/*147.10*/("""
							"""),format.raw/*148.8*/("""</select>
						</div>
					</div>

				    
					<div class="form-group">
						<div class="col-sm-offset-2 col-sm-10">
							<div class="checkbox">
								<label><input type="checkbox" name="viaticos" id="check-viatico" """),_display_(/*156.75*/if(viaje.viaticos==true)/*156.99*/{_display_(Seq[Any](format.raw/*156.100*/("""checked""")))}),format.raw/*156.108*/(""">Viaticos</label>
							</div>
						</div>
					</div>

					<div class="form-group">
						<label class="control-label col-sm-2" >Tipo Viatico:</label>
						<div class="col-sm-8">
							<select class="form-control" """),_display_(/*164.38*/if(viaje.viaticos==false)/*164.63*/{_display_(Seq[Any](format.raw/*164.64*/("""disabled""")))}),format.raw/*164.73*/(""" """),format.raw/*164.74*/("""name="tipo_viatico" id="select-viatico">
								<option value=""  disabled """),_display_(/*165.37*/if(viaje.tipo_viatico==null)/*165.65*/{_display_(Seq[Any](format.raw/*165.66*/("""selected""")))}),format.raw/*165.75*/(""">Seleccione...</option>
								<option value="1" """),_display_(/*166.28*/if(viaje.tipo_viatico==1)/*166.53*/{_display_(Seq[Any](format.raw/*166.54*/("""selected""")))}),format.raw/*166.63*/(""">Vacio/Vacio</option>
								<option value="2" """),_display_(/*167.28*/if(viaje.tipo_viatico==2)/*167.53*/{_display_(Seq[Any](format.raw/*167.54*/("""selected""")))}),format.raw/*167.63*/(""">Vacio/Cargado</option>
								<option value="3" """),_display_(/*168.28*/if(viaje.tipo_viatico==3)/*168.53*/{_display_(Seq[Any](format.raw/*168.54*/("""selected""")))}),format.raw/*168.63*/(""">Cargado/Cargado</option>
							</select>
						</div>
					</div>
				</div><!--pannel-->


				"""),_display_(/*175.6*/for( (boleta,i) <- viaje.boletas.subList(0,1).zipWithIndex) yield /*175.65*/{_display_(Seq[Any](format.raw/*175.66*/("""
					"""),format.raw/*176.6*/("""<div class="clone-wrapper" >
						<!--panel boleta-->
						<div class="panel panel-default toclone " id="clone0">
							
							<button type="button" class="delete btn btn-danger pull-right" >-</button>
							<button type="button" class="clone btn btn-success pull-right">+</button>
							
							<div class="row">
								<p class="text-center"><strong>Boleta</strong></p>
							</div>
							
								

								<div class="form-group">
								<label class="col-xs-1 control-label"></label>
							


								<input type="hidden" name="id["""),_display_(/*194.40*/i),format.raw/*194.41*/("""]" readonly="readonly" class="form-control" placeholder="Id" value=""""),_display_(/*194.110*/boleta/*194.116*/.id),format.raw/*194.119*/("""">

		
								<div class=" col-xs-2">
									<label class="control-label">Codigo</label>
									<input type="text" name="codigo["""),_display_(/*199.43*/i),format.raw/*199.44*/("""]" class="form-control" placeholder="Codigo" value=""""),_display_(/*199.97*/boleta/*199.103*/.codigo),format.raw/*199.110*/("""">
								</div>


								<div class="col-xs-2">
									<label class="control-label">Destino</label>
									<input type="text" name="destino["""),_display_(/*205.44*/i),format.raw/*205.45*/("""]" class="form-control" placeholder="Destino" value=""""),_display_(/*205.99*/boleta/*205.105*/.destino),format.raw/*205.113*/("""">
								</div>

								<div class="col-xs-2">
									<label class="control-label">Kilometros</label>
									<input type="text" name="km_asignados["""),_display_(/*210.49*/i),format.raw/*210.50*/("""]" class="form-control" placeholder="Kms" value=""""),_display_(/*210.100*/boleta/*210.106*/.km_asignados),format.raw/*210.119*/("""">
								</div>

								<div class="col-xs-2">
									<label class="control-label">Carga</label>
									<select name="tipo_carga["""),_display_(/*215.36*/i),format.raw/*215.37*/("""]" class="form-control">
										<option value="" """),_display_(/*216.29*/if(boleta.tipo_carga==null)/*216.56*/{_display_(Seq[Any](format.raw/*216.57*/("""selected""")))}),format.raw/*216.66*/(""" """),format.raw/*216.67*/("""disabled>Seleccione</option>
										<option value="1" """),_display_(/*217.30*/if(boleta.tipo_carga==1)/*217.54*/{_display_(Seq[Any](format.raw/*217.55*/("""selected""")))}),format.raw/*217.64*/(""">Vacio</option>
										<option value="2" """),_display_(/*218.30*/if(boleta.tipo_carga==2)/*218.54*/{_display_(Seq[Any](format.raw/*218.55*/("""selected""")))}),format.raw/*218.64*/(""">Sencillo</option>
										<option value="3" """),_display_(/*219.30*/if(boleta.tipo_carga==3)/*219.54*/{_display_(Seq[Any](format.raw/*219.55*/("""selected""")))}),format.raw/*219.64*/(""">Cargado</option>
									</select>
								</div>

								<div class="col-xs-2">
									<label class="control-label">Sentido</label>
									<select name="sentido["""),_display_(/*225.33*/i),format.raw/*225.34*/("""]" class="form-control">
										<option value="" """),_display_(/*226.29*/if(boleta.sentido==null)/*226.53*/{_display_(Seq[Any](format.raw/*226.54*/("""selected""")))}),format.raw/*226.63*/(""" """),format.raw/*226.64*/("""disabled>Seleccione</option>
										<option value="3" """),_display_(/*227.30*/if(boleta.sentido==3)/*227.51*/{_display_(Seq[Any](format.raw/*227.52*/("""selected""")))}),format.raw/*227.61*/(""">No definido</option>
										<option value="1" """),_display_(/*228.30*/if(boleta.sentido==1)/*228.51*/{_display_(Seq[Any](format.raw/*228.52*/("""selected""")))}),format.raw/*228.61*/(""">Ida</option>
										<option value="2" """),_display_(/*229.30*/if(boleta.sentido==2)/*229.51*/{_display_(Seq[Any](format.raw/*229.52*/("""selected""")))}),format.raw/*229.61*/(""">Regreso</option>
									</select>
								</div>

								
								<div class="col-sm-offset-1 col-lg-4">
									<div class="checkbox">
										<label><input type="checkbox" """),_display_(/*236.42*/if(boleta.sobrepeso==true)/*236.68*/{_display_(Seq[Any](format.raw/*236.69*/("""checked""")))}),format.raw/*236.77*/(""" """),format.raw/*236.78*/("""name="sobrepeso["""),_display_(/*236.95*/i),format.raw/*236.96*/("""]" class="form-control">Sobrepeso</label>
									</div>
								</div>

								<div class="col-lg-4">
									<div class="checkbox">
										<label><input type="checkbox" """),_display_(/*242.42*/if(boleta.cruce_frontera==true)/*242.73*/{_display_(Seq[Any](format.raw/*242.74*/("""checked""")))}),format.raw/*242.82*/(""" """),format.raw/*242.83*/("""name="cruce_frontera["""),_display_(/*242.105*/i),format.raw/*242.106*/("""]" class="form-control">Cruce Frontera</label>
									</div>
								</div>					
															   
						    </div>
						    <br/>
						</div>
						<!--fin panel boleta-->
						
					</div>
				""")))}),format.raw/*252.6*/("""
				
				
				

				"""),format.raw/*257.5*/("""<a href=""""),_display_(/*257.15*/routes/*257.21*/.LogisticaController.viajes()),format.raw/*257.50*/("""" class="btn btn-success"><span class="glyphicon glyphicon-arrow-left"></span></a>
				<button type="submit" class="btn btn-primary pull-right"><span class="glyphicon glyphicon-floppy-disk" aria-hidden="true"></span> Guardar</button>
		""")))}),format.raw/*259.4*/("""

	
""")))}))
      }
    }
  }

  def render(viaje:Viaje,cabezales:List[Cabezal],motoristas:List[Motorista],clientes:List[Cliente]): play.twirl.api.HtmlFormat.Appendable = apply(viaje,cabezales,motoristas,clientes)

  def f:((Viaje,List[Cabezal],List[Motorista],List[Cliente]) => play.twirl.api.HtmlFormat.Appendable) = (viaje,cabezales,motoristas,clientes) => apply(viaje,cabezales,motoristas,clientes)

  def ref: this.type = this

}


}

/**/
object viaje_edit extends viaje_edit_Scope0.viaje_edit
              /*
                  -- GENERATED --
                  DATE: Fri Nov 11 09:28:12 CST 2016
                  SOURCE: /home/samuel/Desarrollo/siiaf/app/views/logistica/viaje_edit.scala.html
                  HASH: 28ec660e1942ee3666d2531be2ac0cf93767376d
                  MATRIX: 808->1|996->116|1006->119|1085->121|1113->123|1184->168|1198->174|1271->226|1346->275|1360->281|1428->328|1454->335|1463->337|1542->339|1571->341|1612->355|1627->361|1699->412|1776->462|1791->468|1868->524|1945->574|1960->580|2031->630|2178->749|2207->750|2241->757|2292->781|2320->782|2424->858|2453->859|2494->872|2693->1044|2722->1045|2766->1063|2828->1109|2867->1110|2897->1113|2972->1161|2994->1162|3036->1177|3051->1183|3079->1190|3149->1233|3171->1234|3213->1249|3228->1255|3257->1263|3332->1311|3354->1312|3396->1327|3411->1333|3445->1346|3518->1392|3540->1393|3582->1408|3597->1414|3629->1425|3699->1468|3721->1469|3763->1484|3778->1490|3807->1498|3841->1506|3870->1526|3909->1527|3941->1532|4007->1571|4029->1572|4073->1589|4088->1595|4119->1605|4156->1612|4187->1617|4221->1642|4260->1643|4292->1648|4363->1692|4385->1693|4429->1710|4444->1716|4480->1731|4517->1738|4553->1748|4591->1777|4630->1778|4662->1784|4679->1792|4718->1793|4751->1799|4840->1861|4862->1862|4891->1873|4904->1877|4943->1878|4976->1884|5066->1947|5088->1948|5129->1959|5164->1964|5202->1975|5244->1987|5276->1992|5431->2119|5460->2120|5494->2127|5591->2197|5619->2198|5674->96|5701->114|5728->332|5757->2214|5789->2220|5807->2229|5891->2304|5930->2305|5962->2311|6001->2341|6040->2342|6071->2346|6316->2564|6330->2569|6364->2582|6417->2605|6448->2610|6487->2640|6526->2641|6557->2645|6789->2850|6803->2855|6837->2868|6890->2891|6922->2896|6959->2906|6974->2912|7024->2941|7136->3027|7286->3167|7326->3168|7366->3180|7640->3426|7670->3446|7710->3447|7751->3456|7781->3457|7868->3516|7895->3533|7935->3534|7976->3543|8047->3586|8074->3603|8114->3604|8155->3613|8513->3943|8556->3969|8596->3970|8635->3980|8679->3996|8696->4003|8721->4006|8752->4009|8794->4041|8834->4042|8875->4051|8905->4053|8922->4060|8950->4066|9001->4085|9037->4093|9355->4383|9401->4412|9441->4413|9480->4423|9524->4439|9543->4448|9568->4451|9599->4454|9645->4490|9685->4491|9726->4500|9756->4501|9786->4503|9805->4512|9835->4519|9886->4538|9922->4546|10236->4832|10278->4857|10318->4858|10357->4868|10401->4884|10418->4891|10443->4894|10474->4897|10516->4929|10556->4930|10597->4939|10627->4941|10644->4948|10673->4955|10724->4974|10760->4982|11013->5207|11047->5231|11088->5232|11129->5240|11378->5461|11413->5486|11453->5487|11494->5496|11524->5497|11629->5574|11667->5602|11707->5603|11748->5612|11827->5663|11862->5688|11902->5689|11943->5698|12020->5747|12055->5772|12095->5773|12136->5782|12215->5833|12250->5858|12290->5859|12331->5868|12457->5967|12533->6026|12573->6027|12607->6033|13183->6581|13206->6582|13304->6651|13321->6657|13347->6660|13509->6794|13532->6795|13613->6848|13630->6854|13660->6861|13836->7009|13859->7010|13941->7064|13958->7070|13989->7078|14172->7233|14195->7234|14274->7284|14291->7290|14327->7303|14492->7440|14515->7441|14596->7494|14633->7521|14673->7522|14714->7531|14744->7532|14830->7590|14864->7614|14904->7615|14945->7624|15018->7669|15052->7693|15092->7694|15133->7703|15209->7751|15243->7775|15283->7776|15324->7785|15522->7955|15545->7956|15626->8009|15660->8033|15700->8034|15741->8043|15771->8044|15857->8102|15888->8123|15928->8124|15969->8133|16048->8184|16079->8205|16119->8206|16160->8215|16231->8258|16262->8279|16302->8280|16343->8289|16553->8471|16589->8497|16629->8498|16669->8506|16699->8507|16744->8524|16767->8525|16973->8703|17014->8734|17054->8735|17094->8743|17124->8744|17175->8766|17199->8767|17432->8969|17481->8990|17519->9000|17535->9006|17586->9035|17854->9272
                  LINES: 27->1|31->4|31->4|33->4|34->5|34->5|34->5|34->5|35->6|35->6|35->6|36->9|36->9|38->9|39->10|39->10|39->10|39->10|40->11|40->11|40->11|41->12|41->12|41->12|45->16|45->16|46->17|47->18|47->18|52->23|52->23|53->24|58->29|58->29|62->33|62->33|62->33|63->34|64->35|64->35|64->35|64->35|64->35|65->36|65->36|65->36|65->36|65->36|66->37|66->37|66->37|66->37|66->37|67->38|67->38|67->38|67->38|67->38|68->39|68->39|68->39|68->39|68->39|70->41|70->41|70->41|71->42|71->42|71->42|71->42|71->42|71->42|72->43|73->44|73->44|73->44|74->45|74->45|74->45|74->45|74->45|74->45|75->46|78->49|78->49|78->49|79->50|79->50|79->50|80->51|80->51|80->51|81->52|81->52|81->52|82->53|82->53|82->53|83->54|84->55|87->58|88->59|91->62|93->64|93->64|94->65|95->66|95->66|100->1|101->3|102->7|104->70|109->75|109->75|109->75|109->75|111->77|111->77|111->77|112->78|115->81|115->81|115->81|117->83|119->85|119->85|119->85|120->86|123->89|123->89|123->89|125->91|128->94|128->94|128->94|128->94|129->95|129->95|129->95|134->100|142->108|142->108|142->108|142->108|142->108|143->109|143->109|143->109|143->109|144->110|144->110|144->110|144->110|155->121|155->121|155->121|156->122|156->122|156->122|156->122|156->122|156->122|156->122|156->122|156->122|156->122|156->122|157->123|158->124|167->133|167->133|167->133|168->134|168->134|168->134|168->134|168->134|168->134|168->134|168->134|168->134|168->134|168->134|168->134|169->135|170->136|179->145|179->145|179->145|180->146|180->146|180->146|180->146|180->146|180->146|180->146|180->146|180->146|180->146|180->146|181->147|182->148|190->156|190->156|190->156|190->156|198->164|198->164|198->164|198->164|198->164|199->165|199->165|199->165|199->165|200->166|200->166|200->166|200->166|201->167|201->167|201->167|201->167|202->168|202->168|202->168|202->168|209->175|209->175|209->175|210->176|228->194|228->194|228->194|228->194|228->194|233->199|233->199|233->199|233->199|233->199|239->205|239->205|239->205|239->205|239->205|244->210|244->210|244->210|244->210|244->210|249->215|249->215|250->216|250->216|250->216|250->216|250->216|251->217|251->217|251->217|251->217|252->218|252->218|252->218|252->218|253->219|253->219|253->219|253->219|259->225|259->225|260->226|260->226|260->226|260->226|260->226|261->227|261->227|261->227|261->227|262->228|262->228|262->228|262->228|263->229|263->229|263->229|263->229|270->236|270->236|270->236|270->236|270->236|270->236|270->236|276->242|276->242|276->242|276->242|276->242|276->242|276->242|286->252|291->257|291->257|291->257|291->257|293->259
                  -- GENERATED --
              */
          