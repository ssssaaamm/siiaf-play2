
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object about_Scope0 {
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

class about extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/base("About CRM")/*1.19*/{_display_(Seq[Any](format.raw/*1.20*/("""
	
	"""),format.raw/*3.2*/("""<div class="panel panel-default">
		<div class="panel-heading"><center><h4>Historia</h4></center></div>
		<div class="panel-body">
			<p>
				Este sistema ha sido desarrollado para efectos de la materia de Diseño de Sistemas a favor
				de la empresa VAPE. El objetivo es automatizar el control de viajes realizados por la empresa y llevar
				un control de planilla de los motoristas, asi como tambien un control de cobro a clientes.
			</p>
		</div>
	</div>


	<div class="panel panel-default">
		<div class="panel-heading"><center><h4>Colaboradores</h4></center></div>
		<div class="panel-body">
			
			<div class="panel panel-default">
				<div class="panel-heading"><h6><strong>Ruth Sarahi Torrento Lara</strong></h6></div>
				<div class="panel-body">
					<p></p>
				</div>
			</div>

			<div class="panel panel-default">
				<div class="panel-heading"><h6><strong>Jose Elvis Quintanilla Ticas</strong></h6></div>
				<div class="panel-body">
					<p></p>
				</div>
			</div>

			<div class="panel panel-default">
				<div class="panel-heading"><h6><strong>Fernando Aguilar Huezo</strong></h6></div>
				<div class="panel-body">
					<p></p>
				</div>
			</div>

			<div class="panel panel-default">
				<div class="panel-heading"><h6><strong>Enrique</strong></h6></div>
				<div class="panel-body">
					<p></p>
				</div>
			</div>

			<div class="panel panel-default">
				<div class="panel-heading"><h6><strong>Samuel Alexander Nuñez Flores</strong></h6></div>
				<div class="panel-body">
					<p></p>
				</div>
			</div>

		</div>
	</div>
	
""")))}))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object about extends about_Scope0.about
              /*
                  -- GENERATED --
                  DATE: Fri Nov 11 12:07:01 CST 2016
                  SOURCE: /home/samuel/Desarrollo/siiaf/app/views/about.scala.html
                  HASH: 9c70339f7da61a8a4efae1238ecc6fba63d66073
                  MATRIX: 827->1|852->18|890->19|920->23
                  LINES: 32->1|32->1|32->1|34->3
                  -- GENERATED --
              */
          