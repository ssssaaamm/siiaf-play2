
package views.html.logistica

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
                    <a class="navbar-brand" href=""""),_display_(/*31.52*/routes/*31.58*/.LogisticaController.viajes),format.raw/*31.85*/(""""><span class="glyphicon glyphicon-home" aria-hidden="true"></span> Inicio</a>
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
                        
                        """),_display_(/*54.26*/if(activo=="viajes")/*54.46*/{_display_(Seq[Any](format.raw/*54.47*/("""
                            """),format.raw/*55.29*/("""<li class="active">
                        """)))}/*56.26*/else/*56.30*/{_display_(Seq[Any](format.raw/*56.31*/("""
                            """),format.raw/*57.29*/("""<li>
                        """)))}),format.raw/*58.26*/("""
                            """),format.raw/*59.29*/("""<a href=""""),_display_(/*59.39*/routes/*59.45*/.LogisticaController.viajes),format.raw/*59.72*/(""""><span class="glyphicon glyphicon-road" aria-hidden="true"></span> Viajes</a>
                        </li>


                        """),_display_(/*63.26*/if(activo=="planilla")/*63.48*/{_display_(Seq[Any](format.raw/*63.49*/("""
                            """),format.raw/*64.29*/("""<li class="active">
                        """)))}/*65.26*/else/*65.30*/{_display_(Seq[Any](format.raw/*65.31*/("""
                            """),format.raw/*66.29*/("""<li>
                        """)))}),format.raw/*67.26*/("""
                            """),format.raw/*68.29*/("""<a href=""""),_display_(/*68.39*/routes/*68.45*/.LogisticaController.planilla),format.raw/*68.74*/(""""><span class="glyphicon glyphicon-list-alt" aria-hidden="true"></span> Planilla</a>
                        </li>


                        """),_display_(/*72.26*/if(activo=="facturacion")/*72.51*/{_display_(Seq[Any](format.raw/*72.52*/("""
                            """),format.raw/*73.29*/("""<li class="active">
                        """)))}/*74.26*/else/*74.30*/{_display_(Seq[Any](format.raw/*74.31*/("""
                            """),format.raw/*75.29*/("""<li>
                        """)))}),format.raw/*76.26*/("""
                            """),format.raw/*77.29*/("""<a href=""""),_display_(/*77.39*/routes/*77.45*/.LogisticaController.facturacion),format.raw/*77.77*/(""""><span class="glyphicon glyphicon-list-alt" aria-hidden="true"></span> Facturacion</a>
                        </li>


                        """),_display_(/*81.26*/if(activo=="politica_cobro")/*81.54*/{_display_(Seq[Any](format.raw/*81.55*/("""
                            """),format.raw/*82.29*/("""<li class="active">
                        """)))}/*83.26*/else/*83.30*/{_display_(Seq[Any](format.raw/*83.31*/("""
                            """),format.raw/*84.29*/("""<li>
                        """)))}),format.raw/*85.26*/("""
                            """),format.raw/*86.29*/("""<a href=""""),_display_(/*86.39*/routes/*86.45*/.LogisticaController.politica_cobro),format.raw/*86.80*/(""""><span class="glyphicon glyphicon-euro" aria-hidden="true"></span> Politica Cobro</a>
                        </li>


                        """),_display_(/*90.26*/if(activo=="politica_pago")/*90.53*/{_display_(Seq[Any](format.raw/*90.54*/("""
                            """),format.raw/*91.29*/("""<li class="active">
                        """)))}/*92.26*/else/*92.30*/{_display_(Seq[Any](format.raw/*92.31*/("""
                            """),format.raw/*93.29*/("""<li>
                        """)))}),format.raw/*94.26*/("""
                            """),format.raw/*95.29*/("""<a href=""""),_display_(/*95.39*/routes/*95.45*/.LogisticaController.politica_pago),format.raw/*95.79*/(""""><span class="glyphicon glyphicon-euro" aria-hidden="true"></span> Politica pago</a>
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
                                """),_display_(/*114.34*/opcion),format.raw/*114.40*/("""
                                """),format.raw/*115.33*/("""<small>"""),_display_(/*115.41*/descripcion),format.raw/*115.52*/("""</small>
                            </h1>
                            """),_display_(/*117.30*/content),format.raw/*117.37*/("""

                            """),format.raw/*119.29*/("""<div class="well">
                                
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
                    <form method="POST" action=""""),_display_(/*154.50*/routes/*154.56*/.HomeController.set_password()),format.raw/*154.86*/("""">
                    <div class="modal-body">

                        


                        """),_display_(/*160.26*/if(flash.containsKey("password_error"))/*160.65*/{_display_(Seq[Any](format.raw/*160.66*/("""
                            """),format.raw/*161.29*/("""<div class="row">
                            <div class="alert alert-danger fade in col-lg-12">
                                <a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
                                <span class="glyphicon glyphicon-exclamation-sign" aria-hidden="true"></span>
                                <strong>"""),_display_(/*165.42*/flash/*165.47*/.get("password_error")),format.raw/*165.69*/("""</strong>
                            </div>
                            </div>
                        """)))}),format.raw/*168.26*/("""

                        
                        
                            
                                
                                """),format.raw/*174.33*/("""<div class="form-group">
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




        

        """),format.raw/*211.32*/("""


        """),_display_(/*214.10*/if(flash.containsKey("modal"))/*214.40*/ {_display_(Seq[Any](format.raw/*214.42*/("""
            """),format.raw/*215.13*/("""<script>
                $(window).load(function()"""),format.raw/*216.42*/("""{"""),format.raw/*216.43*/("""
                    """),format.raw/*217.21*/("""$('#"""),_display_(/*217.26*/flash/*217.31*/.get("modal")),format.raw/*217.44*/("""').modal('show');
                """),format.raw/*218.17*/("""}"""),format.raw/*218.18*/(""");
            </script>
        """)))}),format.raw/*220.10*/("""



        

        """),format.raw/*227.32*/("""
        

        """),format.raw/*230.9*/("""<script src=""""),_display_(/*230.23*/routes/*230.29*/.Assets.versioned("javascripts/jquery.js")),format.raw/*230.71*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*231.23*/routes/*231.29*/.Assets.versioned("javascripts/bootstrap.min.js")),format.raw/*231.78*/("""" type="text/javascript"></script>
        """),_display_(/*232.10*/js),format.raw/*232.12*/("""
    """),format.raw/*233.5*/("""</body>
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
                  DATE: Fri Nov 11 14:06:44 CST 2016
                  SOURCE: /home/samuel/Desarrollo/siiaf/app/views/logistica/base.scala.html
                  HASH: c09bf64e92be092e2b481bfb0a8780fb1b2378e3
                  MATRIX: 789->2|1011->128|1039->130|1118->235|1153->244|1187->252|1212->257|1305->324|1319->330|1381->371|1469->432|1484->438|1545->477|1632->537|1647->543|1719->593|1802->649|1817->655|1884->700|1983->772|1998->778|2078->836|2117->848|2141->851|2183->866|2949->1605|2964->1611|3012->1638|3397->1995|3416->2004|3454->2020|3484->2021|3961->2471|3976->2477|4019->2499|4550->3003|4579->3023|4618->3024|4675->3053|4739->3098|4752->3102|4791->3103|4848->3132|4909->3162|4966->3191|5003->3201|5018->3207|5066->3234|5229->3370|5260->3392|5299->3393|5356->3422|5420->3467|5433->3471|5472->3472|5529->3501|5590->3531|5647->3560|5684->3570|5699->3576|5749->3605|5918->3747|5952->3772|5991->3773|6048->3802|6112->3847|6125->3851|6164->3852|6221->3881|6282->3911|6339->3940|6376->3950|6391->3956|6444->3988|6616->4133|6653->4161|6692->4162|6749->4191|6813->4236|6826->4240|6865->4241|6922->4270|6983->4300|7040->4329|7077->4339|7092->4345|7148->4380|7319->4524|7355->4551|7394->4552|7451->4581|7515->4626|7528->4630|7567->4631|7624->4660|7685->4690|7742->4719|7779->4729|7794->4735|7849->4769|8468->5360|8496->5366|8558->5399|8594->5407|8627->5418|8727->5490|8756->5497|8815->5527|9720->6404|9736->6410|9788->6440|9917->6541|9966->6580|10006->6581|10064->6610|10450->6968|10465->6973|10509->6995|10646->7100|10821->7246|12142->8628|12182->8640|12222->8670|12263->8672|12305->8685|12384->8735|12414->8736|12464->8757|12497->8762|12512->8767|12547->8780|12610->8814|12640->8815|12706->8849|12757->8961|12804->8980|12846->8994|12862->9000|12926->9042|13011->9099|13027->9105|13098->9154|13170->9198|13194->9200|13227->9205
                  LINES: 27->2|32->2|34->4|37->7|38->8|38->8|38->8|39->9|39->9|39->9|40->10|40->10|40->10|41->11|41->11|41->11|42->12|42->12|42->12|43->13|43->13|43->13|44->14|44->14|46->16|61->31|61->31|61->31|67->37|67->37|67->37|67->37|74->44|74->44|74->44|84->54|84->54|84->54|85->55|86->56|86->56|86->56|87->57|88->58|89->59|89->59|89->59|89->59|93->63|93->63|93->63|94->64|95->65|95->65|95->65|96->66|97->67|98->68|98->68|98->68|98->68|102->72|102->72|102->72|103->73|104->74|104->74|104->74|105->75|106->76|107->77|107->77|107->77|107->77|111->81|111->81|111->81|112->82|113->83|113->83|113->83|114->84|115->85|116->86|116->86|116->86|116->86|120->90|120->90|120->90|121->91|122->92|122->92|122->92|123->93|124->94|125->95|125->95|125->95|125->95|144->114|144->114|145->115|145->115|145->115|147->117|147->117|149->119|184->154|184->154|184->154|190->160|190->160|190->160|191->161|195->165|195->165|195->165|198->168|204->174|240->211|243->214|243->214|243->214|244->215|245->216|245->216|246->217|246->217|246->217|246->217|247->218|247->218|249->220|255->227|258->230|258->230|258->230|258->230|259->231|259->231|259->231|260->232|260->232|261->233
                  -- GENERATED --
              */
          