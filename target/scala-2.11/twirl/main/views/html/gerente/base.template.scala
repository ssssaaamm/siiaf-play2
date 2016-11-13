
package views.html.gerente

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object base_Scope0 {
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

class base extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template7[String,String,String,String,Html,Html,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(title: String, opcion: String, descripcion: String, activo: String, css: Html = Html(""), js: Html = Html(""))(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.128*/("""

"""),format.raw/*4.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        """),format.raw/*7.62*/("""
        """),format.raw/*8.9*/("""<title>"""),_display_(/*8.17*/title),format.raw/*8.22*/("""</title>
        <!-- <link rel="stylesheet" media="screen" href=""""),_display_(/*9.59*/routes/*9.65*/.Assets.versioned("stylesheets/main.css")),format.raw/*9.106*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*10.59*/routes/*10.65*/.Assets.versioned("images/favicon.png")),format.raw/*10.104*/(""""> -->
        <link rel="stylesheet" media="screen" href=""""),_display_(/*11.54*/routes/*11.60*/.Assets.versioned("stylesheets/bootstrap.min.css")),format.raw/*11.110*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*12.54*/routes/*12.60*/.Assets.versioned("stylesheets/sb-admin.css")),format.raw/*12.105*/("""">
        <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(/*13.70*/routes/*13.76*/.Assets.versioned("font-awesome/css/font-awesome.min.css")),format.raw/*13.134*/("""">
        """),_display_(/*14.10*/css),format.raw/*14.13*/(""" 
        
    """),format.raw/*16.5*/("""</head>
    <body>

        <div id="wrapper">
            
            <!-- Navigation -->
            <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
                <!-- Brand and toggle get grouped for better mobile display -->
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-ex1-collapse">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href=""""),_display_(/*31.52*/routes/*31.58*/.GerenteController.clientes),format.raw/*31.85*/(""""><span class="glyphicon glyphicon-home" aria-hidden="true"></span> Inicio</a>
                </div>
                <!-- Top Menu Items -->
                <ul class="nav navbar-right top-nav">

                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle toggle" data-toggle="dropdown"><i class="fa fa-user"></i> """),_display_(/*37.119*/session()/*37.128*/.get("username")),format.raw/*37.144*/(""" """),format.raw/*37.145*/("""<b class="caret"></b></a>
                        <ul class="dropdown-menu">
                            <li>
                                <a data-toggle="modal" data-target="#mod-password" class="btn"><span class="glyphicon glyphicon-setting" aria-hidden="true"></span> Password</a>
                            </li>
                            <li class="divider"></li>
                            <li>
                                <a href=""""),_display_(/*44.43*/routes/*44.49*/.HomeController.logout),format.raw/*44.71*/(""""><span class="glyphicon glyphicon-off" aria-hidden="true"></span> Salir</a>
                            </li>
                        </ul>
                    </li>
                    
                </ul>
                <!-- Sidebar Menu Items - These collapse to the responsive navigation menu on small screens -->
                <div class="collapse navbar-collapse navbar-ex1-collapse">
                    <ul class="nav navbar-nav side-nav">
                        """),_display_(/*53.26*/if(activo=="clientes")/*53.48*/{_display_(Seq[Any](format.raw/*53.49*/("""
                            """),format.raw/*54.29*/("""<li class="active">
                        """)))}/*55.26*/else/*55.30*/{_display_(Seq[Any](format.raw/*55.31*/("""
                            """),format.raw/*56.29*/("""<li>
                        """)))}),format.raw/*57.26*/("""
                            """),format.raw/*58.29*/("""<a href=""""),_display_(/*58.39*/routes/*58.45*/.GerenteController.clientes),format.raw/*58.72*/(""""><span class="glyphicon glyphicon-briefcase" aria-hidden="true"></span> Clientes</a>
                        </li>

                        """),_display_(/*61.26*/if(activo=="motoristas")/*61.50*/{_display_(Seq[Any](format.raw/*61.51*/("""
                            """),format.raw/*62.29*/("""<li class="active">
                        """)))}/*63.26*/else/*63.30*/{_display_(Seq[Any](format.raw/*63.31*/("""
                            """),format.raw/*64.29*/("""<li>
                        """)))}),format.raw/*65.26*/("""
                            """),format.raw/*66.29*/("""<a href=""""),_display_(/*66.39*/routes/*66.45*/.GerenteController.motoristas),format.raw/*66.74*/(""""><span class="glyphicon glyphicon-oil" aria-hidden="true"></span> Motoristas</a>
                        </li>


                        """),_display_(/*70.26*/if(activo=="cabezales")/*70.49*/{_display_(Seq[Any](format.raw/*70.50*/("""
                            """),format.raw/*71.29*/("""<li class="active">
                        """)))}/*72.26*/else/*72.30*/{_display_(Seq[Any](format.raw/*72.31*/("""
                            """),format.raw/*73.29*/("""<li>
                        """)))}),format.raw/*74.26*/("""
                            """),format.raw/*75.29*/("""<a href=""""),_display_(/*75.39*/routes/*75.45*/.GerenteController.cabezales),format.raw/*75.73*/(""""><span class="glyphicon glyphicon-bed" aria-hidden="true"></span> Cabezales</a>
                        </li>



                        """),_display_(/*80.26*/if(activo=="planilla")/*80.48*/{_display_(Seq[Any](format.raw/*80.49*/("""
                            """),format.raw/*81.29*/("""<li class="active">
                        """)))}/*82.26*/else/*82.30*/{_display_(Seq[Any](format.raw/*82.31*/("""
                            """),format.raw/*83.29*/("""<li>
                        """)))}),format.raw/*84.26*/("""
                            """),format.raw/*85.29*/("""<a href=""""),_display_(/*85.39*/routes/*85.45*/.GerenteController.planilla),format.raw/*85.72*/(""""><span class="glyphicon glyphicon-list-alt" aria-hidden="true"></span> Planilla</a>
                        </li>


                        """),_display_(/*89.26*/if(activo=="facturacion")/*89.51*/{_display_(Seq[Any](format.raw/*89.52*/("""
                            """),format.raw/*90.29*/("""<li class="active">
                        """)))}/*91.26*/else/*91.30*/{_display_(Seq[Any](format.raw/*91.31*/("""
                            """),format.raw/*92.29*/("""<li>
                        """)))}),format.raw/*93.26*/("""
                            """),format.raw/*94.29*/("""<a href=""""),_display_(/*94.39*/routes/*94.45*/.GerenteController.facturacion),format.raw/*94.75*/(""""><span class="glyphicon glyphicon-list-alt" aria-hidden="true"></span> Facturacion</a>
                        </li>



                        """),_display_(/*99.26*/if(activo=="politica_cobro")/*99.54*/{_display_(Seq[Any](format.raw/*99.55*/("""
                            """),format.raw/*100.29*/("""<li class="active">
                        """)))}/*101.26*/else/*101.30*/{_display_(Seq[Any](format.raw/*101.31*/("""
                            """),format.raw/*102.29*/("""<li>
                        """)))}),format.raw/*103.26*/("""
                            """),format.raw/*104.29*/("""<a href=""""),_display_(/*104.39*/routes/*104.45*/.GerenteController.politica_cobro),format.raw/*104.78*/(""""><span class="glyphicon glyphicon-euro" aria-hidden="true"></span> Politica Cobro</a>
                        </li>


                        """),_display_(/*108.26*/if(activo=="politica_pago")/*108.53*/{_display_(Seq[Any](format.raw/*108.54*/("""
                            """),format.raw/*109.29*/("""<li class="active">
                        """)))}/*110.26*/else/*110.30*/{_display_(Seq[Any](format.raw/*110.31*/("""
                            """),format.raw/*111.29*/("""<li>
                        """)))}),format.raw/*112.26*/("""
                            """),format.raw/*113.29*/("""<a href=""""),_display_(/*113.39*/routes/*113.45*/.GerenteController.politica_pago),format.raw/*113.77*/(""""><span class="glyphicon glyphicon-euro" aria-hidden="true"></span> Politica pago</a>
                        </li>



                        """),_display_(/*118.26*/if(activo=="usuarios")/*118.48*/{_display_(Seq[Any](format.raw/*118.49*/("""
                            """),format.raw/*119.29*/("""<li class="active">
                        """)))}/*120.26*/else/*120.30*/{_display_(Seq[Any](format.raw/*120.31*/("""
                            """),format.raw/*121.29*/("""<li>
                        """)))}),format.raw/*122.26*/("""
                            """),format.raw/*123.29*/("""<a href=""""),_display_(/*123.39*/routes/*123.45*/.GerenteController.usuarios),format.raw/*123.72*/(""""><span class="glyphicon glyphicon-user" aria-hidden="true"></span> Usuarios</a>
                        </li>


                    </ul>
                </div>
                <!-- /.navbar-collapse -->
            </nav>
            <!-- End Navigation -->

            <!--Content-->
            <div id="page-wrapper">

                <div class="container-fluid">

                    <!-- Page Heading -->
                    <div class="row">
                        <div class="col-lg-12">
                            <h1 class="page-header">
                                """),_display_(/*142.34*/opcion),format.raw/*142.40*/("""
                                """),format.raw/*143.33*/("""<small>"""),_display_(/*143.41*/descripcion),format.raw/*143.52*/("""</small>
                            </h1>
                            """),_display_(/*145.30*/content),format.raw/*145.37*/("""

                            """),format.raw/*147.29*/("""<div class="well">
                                
                            </div>

                        </div>
                    </div>
                    <!-- /.row -->


                </div>
                <!-- /.container-fluid -->

            </div>
            <!--/.page-wrapper-->
            <!--End Content-->



        </div>
        <!--/.wrapper-->






        <!-- Modal -->
        <div class="modal fade" id="mod-password" role="dialog">
            <div class="modal-dialog">

            <!-- Modal content-->
            <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal">&times;</button>
                        <h4 class="modal-title">Cabiar contraseña:</h4>
                    </div>
                    <form method="POST" action=""""),_display_(/*183.50*/routes/*183.56*/.HomeController.set_password()),format.raw/*183.86*/("""">
                    <div class="modal-body">

                        


                        """),_display_(/*189.26*/if(flash.containsKey("password_error"))/*189.65*/{_display_(Seq[Any](format.raw/*189.66*/("""
                            """),format.raw/*190.29*/("""<div class="row">
                            <div class="alert alert-danger fade in col-lg-12">
                                <a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
                                <span class="glyphicon glyphicon-exclamation-sign" aria-hidden="true"></span>
                                <strong>"""),_display_(/*194.42*/flash/*194.47*/.get("password_error")),format.raw/*194.69*/("""</strong>
                            </div>
                            </div>
                        """)))}),format.raw/*197.26*/("""

                        
                        
                            
                                
                                """),format.raw/*203.33*/("""<div class="form-group">
                                    <label>Password actual:</label>
                                    <input type="password" class="form-control" name="old"/>
                                </div>

                                <div class="form-group">
                                    <label>Nuevo Password:</label>
                                    <input type="password" class="form-control" name="new"/>
                                </div>

                                <div class="form-group">
                                    <label>Confirme Nuevo Password:</label>
                                    <input type="password" class="form-control" name="confirmation"/>
                                </div>

                            




                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-default" data-dismiss="modal">Cerrar</button>                          
                        <button type="submit" class="btn btn-danger"><span class="glyphicon glyphicon-floppy-disk" aria-hidden="true"></span> Cambiar</button>
                    </div>
                    </form>
                </div>

            </div>
        </div>




        

        """),format.raw/*240.32*/("""


        """),_display_(/*243.10*/if(flash.containsKey("modal"))/*243.40*/ {_display_(Seq[Any](format.raw/*243.42*/("""
            """),format.raw/*244.13*/("""<script>
                $(window).load(function()"""),format.raw/*245.42*/("""{"""),format.raw/*245.43*/("""
                    """),format.raw/*246.21*/("""$('#"""),_display_(/*246.26*/flash/*246.31*/.get("modal")),format.raw/*246.44*/("""').modal('show');
                """),format.raw/*247.17*/("""}"""),format.raw/*247.18*/(""");
            </script>
        """)))}),format.raw/*249.10*/("""
        

        """),format.raw/*252.9*/("""<script src=""""),_display_(/*252.23*/routes/*252.29*/.Assets.versioned("javascripts/jquery.js")),format.raw/*252.71*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*253.23*/routes/*253.29*/.Assets.versioned("javascripts/bootstrap.min.js")),format.raw/*253.78*/("""" type="text/javascript"></script>
        """),_display_(/*254.10*/js),format.raw/*254.12*/("""
    """),format.raw/*255.5*/("""</body>
</html>
"""))
      }
    }
  }

  def render(title:String,opcion:String,descripcion:String,activo:String,css:Html,js:Html,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title,opcion,descripcion,activo,css,js)(content)

  def f:((String,String,String,String,Html,Html) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title,opcion,descripcion,activo,css,js) => (content) => apply(title,opcion,descripcion,activo,css,js)(content)

  def ref: this.type = this

}


}

/**/
object base extends base_Scope0.base
              /*
                  -- GENERATED --
                  DATE: Fri Nov 11 14:06:05 CST 2016
                  SOURCE: /home/samuel/Desarrollo/siiaf/app/views/gerente/base.scala.html
                  HASH: b716985a69338767032552d547fbed41cfb2b374
                  MATRIX: 787->2|1009->128|1037->130|1116->235|1151->244|1185->252|1210->257|1303->324|1317->330|1379->371|1467->432|1482->438|1543->477|1630->537|1645->543|1717->593|1800->649|1815->655|1882->700|1981->772|1996->778|2076->836|2115->848|2139->851|2181->866|2947->1605|2962->1611|3010->1638|3395->1995|3414->2004|3452->2020|3482->2021|3959->2471|3974->2477|4017->2499|4523->2978|4554->3000|4593->3001|4650->3030|4714->3075|4727->3079|4766->3080|4823->3109|4884->3139|4941->3168|4978->3178|4993->3184|5041->3211|5210->3353|5243->3377|5282->3378|5339->3407|5403->3452|5416->3456|5455->3457|5512->3486|5573->3516|5630->3545|5667->3555|5682->3561|5732->3590|5898->3729|5930->3752|5969->3753|6026->3782|6090->3827|6103->3831|6142->3832|6199->3861|6260->3891|6317->3920|6354->3930|6369->3936|6418->3964|6584->4103|6615->4125|6654->4126|6711->4155|6775->4200|6788->4204|6827->4205|6884->4234|6945->4264|7002->4293|7039->4303|7054->4309|7102->4336|7271->4478|7305->4503|7344->4504|7401->4533|7465->4578|7478->4582|7517->4583|7574->4612|7635->4642|7692->4671|7729->4681|7744->4687|7795->4717|7968->4863|8005->4891|8044->4892|8102->4921|8167->4966|8181->4970|8221->4971|8279->5000|8341->5030|8399->5059|8437->5069|8453->5075|8508->5108|8680->5252|8717->5279|8757->5280|8815->5309|8880->5354|8894->5358|8934->5359|8992->5388|9054->5418|9112->5447|9150->5457|9166->5463|9220->5495|9392->5639|9424->5661|9464->5662|9522->5691|9587->5736|9601->5740|9641->5741|9699->5770|9761->5800|9819->5829|9857->5839|9873->5845|9922->5872|10536->6458|10564->6464|10626->6497|10662->6505|10695->6516|10795->6588|10824->6595|10883->6625|11789->7503|11805->7509|11857->7539|11986->7640|12035->7679|12075->7680|12133->7709|12519->8067|12534->8072|12578->8094|12715->8199|12890->8345|14211->9727|14251->9739|14291->9769|14332->9771|14374->9784|14453->9834|14483->9835|14533->9856|14566->9861|14581->9866|14616->9879|14679->9913|14709->9914|14775->9948|14822->9967|14864->9981|14880->9987|14944->10029|15029->10086|15045->10092|15116->10141|15188->10185|15212->10187|15245->10192
                  LINES: 27->2|32->2|34->4|37->7|38->8|38->8|38->8|39->9|39->9|39->9|40->10|40->10|40->10|41->11|41->11|41->11|42->12|42->12|42->12|43->13|43->13|43->13|44->14|44->14|46->16|61->31|61->31|61->31|67->37|67->37|67->37|67->37|74->44|74->44|74->44|83->53|83->53|83->53|84->54|85->55|85->55|85->55|86->56|87->57|88->58|88->58|88->58|88->58|91->61|91->61|91->61|92->62|93->63|93->63|93->63|94->64|95->65|96->66|96->66|96->66|96->66|100->70|100->70|100->70|101->71|102->72|102->72|102->72|103->73|104->74|105->75|105->75|105->75|105->75|110->80|110->80|110->80|111->81|112->82|112->82|112->82|113->83|114->84|115->85|115->85|115->85|115->85|119->89|119->89|119->89|120->90|121->91|121->91|121->91|122->92|123->93|124->94|124->94|124->94|124->94|129->99|129->99|129->99|130->100|131->101|131->101|131->101|132->102|133->103|134->104|134->104|134->104|134->104|138->108|138->108|138->108|139->109|140->110|140->110|140->110|141->111|142->112|143->113|143->113|143->113|143->113|148->118|148->118|148->118|149->119|150->120|150->120|150->120|151->121|152->122|153->123|153->123|153->123|153->123|172->142|172->142|173->143|173->143|173->143|175->145|175->145|177->147|213->183|213->183|213->183|219->189|219->189|219->189|220->190|224->194|224->194|224->194|227->197|233->203|269->240|272->243|272->243|272->243|273->244|274->245|274->245|275->246|275->246|275->246|275->246|276->247|276->247|278->249|281->252|281->252|281->252|281->252|282->253|282->253|282->253|283->254|283->254|284->255
                  -- GENERATED --
              */
          