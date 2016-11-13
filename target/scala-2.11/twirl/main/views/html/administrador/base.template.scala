
package views.html.administrador

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
                    <a class="navbar-brand" href=""""),_display_(/*31.52*/routes/*31.58*/.AdministradorController.usuarios),format.raw/*31.91*/(""""><span class="glyphicon glyphicon-home" aria-hidden="true"></span> Inicio</a>
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
                        """),_display_(/*53.26*/if(activo=="usuarios")/*53.48*/{_display_(Seq[Any](format.raw/*53.49*/("""
                            """),format.raw/*54.29*/("""<li class="active">
                        """)))}/*55.26*/else/*55.30*/{_display_(Seq[Any](format.raw/*55.31*/("""
                            """),format.raw/*56.29*/("""<li>
                        """)))}),format.raw/*57.26*/("""
                            """),format.raw/*58.29*/("""<a href=""""),_display_(/*58.39*/routes/*58.45*/.AdministradorController.usuarios),format.raw/*58.78*/(""""><span class="glyphicon glyphicon-briefcase" aria-hidden="true"></span> Usuarios</a>
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
                                """),_display_(/*75.34*/opcion),format.raw/*75.40*/("""
                                """),format.raw/*76.33*/("""<small>"""),_display_(/*76.41*/descripcion),format.raw/*76.52*/("""</small>
                            </h1>
                            """),_display_(/*78.30*/content),format.raw/*78.37*/("""

                            """),format.raw/*80.29*/("""<div class="well">
                                
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
                    <form method="POST" action=""""),_display_(/*113.50*/routes/*113.56*/.HomeController.set_password()),format.raw/*113.86*/("""">
                    <div class="modal-body">

                        


                        """),_display_(/*119.26*/if(flash.containsKey("password_error"))/*119.65*/{_display_(Seq[Any](format.raw/*119.66*/("""
                            """),format.raw/*120.29*/("""<div class="row">
                            <div class="alert alert-danger fade in col-lg-12">
                                <a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
                                <span class="glyphicon glyphicon-exclamation-sign" aria-hidden="true"></span>
                                <strong>"""),_display_(/*124.42*/flash/*124.47*/.get("password_error")),format.raw/*124.69*/("""</strong>
                            </div>
                            </div>
                        """)))}),format.raw/*127.26*/("""

                        
                        
                            
                                
                                """),format.raw/*133.33*/("""<div class="form-group">
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




        

        """),format.raw/*170.32*/("""


        """),_display_(/*173.10*/if(flash.containsKey("modal"))/*173.40*/ {_display_(Seq[Any](format.raw/*173.42*/("""
            """),format.raw/*174.13*/("""<script>
                $(window).load(function()"""),format.raw/*175.42*/("""{"""),format.raw/*175.43*/("""
                    """),format.raw/*176.21*/("""$('#"""),_display_(/*176.26*/flash/*176.31*/.get("modal")),format.raw/*176.44*/("""').modal('show');
                """),format.raw/*177.17*/("""}"""),format.raw/*177.18*/(""");
            </script>
        """)))}),format.raw/*179.10*/("""
        

        """),format.raw/*183.32*/("""
        

        """),format.raw/*186.9*/("""<script src=""""),_display_(/*186.23*/routes/*186.29*/.Assets.versioned("javascripts/jquery.js")),format.raw/*186.71*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*187.23*/routes/*187.29*/.Assets.versioned("javascripts/bootstrap.min.js")),format.raw/*187.78*/("""" type="text/javascript"></script>
        """),_display_(/*188.10*/js),format.raw/*188.12*/("""
    """),format.raw/*189.5*/("""</body>
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
                  DATE: Fri Nov 11 14:12:15 CST 2016
                  SOURCE: /home/samuel/Desarrollo/siiaf/app/views/administrador/base.scala.html
                  HASH: 05b2fd589fbede0380b08930e7cf64be0aa824be
                  MATRIX: 793->2|1015->128|1043->130|1122->235|1157->244|1191->252|1216->257|1309->324|1323->330|1385->371|1473->432|1488->438|1549->477|1636->537|1651->543|1723->593|1806->649|1821->655|1888->700|1987->772|2002->778|2082->836|2121->848|2145->851|2187->866|2953->1605|2968->1611|3022->1644|3407->2001|3426->2010|3464->2026|3494->2027|3971->2477|3986->2483|4029->2505|4535->2984|4566->3006|4605->3007|4662->3036|4726->3081|4739->3085|4778->3086|4835->3115|4896->3145|4953->3174|4990->3184|5005->3190|5059->3223|5675->3812|5702->3818|5763->3851|5798->3859|5830->3870|5929->3942|5957->3949|6015->3979|6918->4854|6934->4860|6986->4890|7115->4991|7164->5030|7204->5031|7262->5060|7648->5418|7663->5423|7707->5445|7844->5550|8019->5696|9340->7078|9380->7090|9420->7120|9461->7122|9503->7135|9582->7185|9612->7186|9662->7207|9695->7212|9710->7217|9745->7230|9808->7264|9838->7265|9904->7299|9952->7408|9999->7427|10041->7441|10057->7447|10121->7489|10206->7546|10222->7552|10293->7601|10365->7645|10389->7647|10422->7652
                  LINES: 27->2|32->2|34->4|37->7|38->8|38->8|38->8|39->9|39->9|39->9|40->10|40->10|40->10|41->11|41->11|41->11|42->12|42->12|42->12|43->13|43->13|43->13|44->14|44->14|46->16|61->31|61->31|61->31|67->37|67->37|67->37|67->37|74->44|74->44|74->44|83->53|83->53|83->53|84->54|85->55|85->55|85->55|86->56|87->57|88->58|88->58|88->58|88->58|105->75|105->75|106->76|106->76|106->76|108->78|108->78|110->80|143->113|143->113|143->113|149->119|149->119|149->119|150->120|154->124|154->124|154->124|157->127|163->133|199->170|202->173|202->173|202->173|203->174|204->175|204->175|205->176|205->176|205->176|205->176|206->177|206->177|208->179|211->183|214->186|214->186|214->186|214->186|215->187|215->187|215->187|216->188|216->188|217->189
                  -- GENERATED --
              */
          