
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
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

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/base("Home CRM")/*1.18*/{_display_(Seq[Any](format.raw/*1.19*/("""
	
	"""),format.raw/*3.2*/("""<center>
	<div id="myCarousel" class="carousel slide">
		<!-- Carousel indicators -->
		<ol class="carousel-indicators">
			<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
			<li data-target="#myCarousel" data-slide-to="1"></li>
			<li data-target="#myCarousel" data-slide-to="2"></li>
		</ol>

		<!-- Carousel items -->
		<div class="carousel-inner">
			<div class="item active">
				<img src=""""),_display_(/*15.16*/routes/*15.22*/.Assets.versioned("images/fondo-1024x450.png")),format.raw/*15.68*/("""" alt="First slide">
			</div>
		
			<div class="item">
				<img src=""""),_display_(/*19.16*/routes/*19.22*/.Assets.versioned("images/fondo-1024x450.png")),format.raw/*19.68*/("""" alt="Second slide">
			</div>
			
			<div class="item">
				<img src=""""),_display_(/*23.16*/routes/*23.22*/.Assets.versioned("images/fondo-1024x450.png")),format.raw/*23.68*/("""" alt="Third slide">
			</div>
		
		</div>
		<!-- Carousel nav -->

		<a class="carousel-control left" href="#myCarousel" data-slide="prev">&lsaquo;</a>
		<a class="carousel-control right" href="#myCarousel" data-slide="next">&rsaquo;</a>
	</div>
	</center>

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
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Fri Nov 11 11:50:32 CST 2016
                  SOURCE: /home/samuel/Desarrollo/siiaf/app/views/index.scala.html
                  HASH: 7979a0e592343d6b36bad6dcfe10c7d45e025b00
                  MATRIX: 827->1|851->17|889->18|919->22|1363->439|1378->445|1445->491|1543->562|1558->568|1625->614|1725->687|1740->693|1807->739
                  LINES: 32->1|32->1|32->1|34->3|46->15|46->15|46->15|50->19|50->19|50->19|54->23|54->23|54->23
                  -- GENERATED --
              */
          