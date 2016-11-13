
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/samuel/Desarrollo/siiaf/conf/routes
// @DATE:Fri Nov 11 13:22:56 CST 2016

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:8
  Assets_4: controllers.Assets,
  // @LINE:12
  HomeController_1: controllers.HomeController,
  // @LINE:22
  AdministradorController_3: controllers.AdministradorController,
  // @LINE:26
  GerenteController_0: controllers.GerenteController,
  // @LINE:57
  LogisticaController_2: controllers.LogisticaController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:8
    Assets_4: controllers.Assets,
    // @LINE:12
    HomeController_1: controllers.HomeController,
    // @LINE:22
    AdministradorController_3: controllers.AdministradorController,
    // @LINE:26
    GerenteController_0: controllers.GerenteController,
    // @LINE:57
    LogisticaController_2: controllers.LogisticaController
  ) = this(errorHandler, Assets_4, HomeController_1, AdministradorController_3, GerenteController_0, LogisticaController_2, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Assets_4, HomeController_1, AdministradorController_3, GerenteController_0, LogisticaController_2, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.HomeController.login"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.HomeController.login_post"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logout""", """controllers.HomeController.logout"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """set/password""", """controllers.HomeController.set_password"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """about""", """controllers.HomeController.about"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/usuarios""", """controllers.AdministradorController.usuarios"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """manager/clientes""", """controllers.GerenteController.clientes"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """manager/clientes/new""", """controllers.GerenteController.cliente_new"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """manager/clientes/edit/""" + "$" + """id<[^/]+>""", """controllers.GerenteController.cliente_edit(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """manager/clientes/remove/""" + "$" + """id<[^/]+>""", """controllers.GerenteController.cliente_remove(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """manager/motoristas""", """controllers.GerenteController.motoristas"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """manager/motoristas/new""", """controllers.GerenteController.motorista_new"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """manager/motoristas/edit/""" + "$" + """id<[^/]+>""", """controllers.GerenteController.motorista_edit(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """manager/motoristas/remove/""" + "$" + """id<[^/]+>""", """controllers.GerenteController.motorista_remove(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """manager/cabezales""", """controllers.GerenteController.cabezales"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """manager/cabezales/new""", """controllers.GerenteController.cabezal_new"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """manager/cabezales/edit/""" + "$" + """id<[^/]+>""", """controllers.GerenteController.cabezal_edit(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """manager/cabezales/remove/""" + "$" + """id<[^/]+>""", """controllers.GerenteController.cabezal_remove(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """manager/planilla""", """controllers.GerenteController.planilla"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """manager/facturacion""", """controllers.GerenteController.facturacion"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """manager/politica/cobro""", """controllers.GerenteController.politica_cobro"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """manager/politica/cobro""", """controllers.GerenteController.politica_cobro_post()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """manager/politica/pago""", """controllers.GerenteController.politica_pago"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """manager/politica/pago""", """controllers.GerenteController.politica_pago_post()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """manager/usuarios""", """controllers.GerenteController.usuarios"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """manager/usuarios/new""", """controllers.GerenteController.usuario_new"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """manager/usuarios/edit/""" + "$" + """id<[^/]+>""", """controllers.GerenteController.usuario_edit(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """manager/usuarios/remove/""" + "$" + """id<[^/]+>""", """controllers.GerenteController.usuario_remove(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logistic/viajes""", """controllers.LogisticaController.viajes"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logistic/viajes/new""", """controllers.LogisticaController.viaje_new"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logistic/viajes/edit/""" + "$" + """id<[^/]+>""", """controllers.LogisticaController.viaje_edit(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logistic/viajes/edit/""" + "$" + """id<[^/]+>""", """controllers.LogisticaController.viaje_edit_post(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logistic/viajes/remove/""" + "$" + """id<[^/]+>""", """controllers.LogisticaController.viaje_remove(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logistic/planilla""", """controllers.LogisticaController.planilla"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logistic/facturacion""", """controllers.LogisticaController.facturacion"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logistic/politica/cobro""", """controllers.LogisticaController.politica_cobro"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logistic/politica/pago""", """controllers.LogisticaController.politica_pago"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:8
  private[this] lazy val controllers_Assets_versioned0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned0_invoker = createInvoker(
    Assets_4.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/""" + "$" + """file<.+>"""
    )
  )

  // @LINE:12
  private[this] lazy val controllers_HomeController_index1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index1_invoker = createInvoker(
    HomeController_1.index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      """ RUTAS DEL HomeController""",
      this.prefix + """"""
    )
  )

  // @LINE:13
  private[this] lazy val controllers_HomeController_login2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_HomeController_login2_invoker = createInvoker(
    HomeController_1.login,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "login",
      Nil,
      "GET",
      """""",
      this.prefix + """login"""
    )
  )

  // @LINE:14
  private[this] lazy val controllers_HomeController_login_post3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_HomeController_login_post3_invoker = createInvoker(
    HomeController_1.login_post,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "login_post",
      Nil,
      "POST",
      """""",
      this.prefix + """login"""
    )
  )

  // @LINE:15
  private[this] lazy val controllers_HomeController_logout4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val controllers_HomeController_logout4_invoker = createInvoker(
    HomeController_1.logout,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "logout",
      Nil,
      "GET",
      """""",
      this.prefix + """logout"""
    )
  )

  // @LINE:16
  private[this] lazy val controllers_HomeController_set_password5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("set/password")))
  )
  private[this] lazy val controllers_HomeController_set_password5_invoker = createInvoker(
    HomeController_1.set_password,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "set_password",
      Nil,
      "POST",
      """""",
      this.prefix + """set/password"""
    )
  )

  // @LINE:17
  private[this] lazy val controllers_HomeController_about6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("about")))
  )
  private[this] lazy val controllers_HomeController_about6_invoker = createInvoker(
    HomeController_1.about,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "about",
      Nil,
      "GET",
      """""",
      this.prefix + """about"""
    )
  )

  // @LINE:22
  private[this] lazy val controllers_AdministradorController_usuarios7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/usuarios")))
  )
  private[this] lazy val controllers_AdministradorController_usuarios7_invoker = createInvoker(
    AdministradorController_3.usuarios,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdministradorController",
      "usuarios",
      Nil,
      "GET",
      """ RUTAS DEL AdministradorController""",
      this.prefix + """admin/usuarios"""
    )
  )

  // @LINE:26
  private[this] lazy val controllers_GerenteController_clientes8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("manager/clientes")))
  )
  private[this] lazy val controllers_GerenteController_clientes8_invoker = createInvoker(
    GerenteController_0.clientes,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.GerenteController",
      "clientes",
      Nil,
      "GET",
      """ RUTAS DEL GerenteController""",
      this.prefix + """manager/clientes"""
    )
  )

  // @LINE:27
  private[this] lazy val controllers_GerenteController_cliente_new9_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("manager/clientes/new")))
  )
  private[this] lazy val controllers_GerenteController_cliente_new9_invoker = createInvoker(
    GerenteController_0.cliente_new,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.GerenteController",
      "cliente_new",
      Nil,
      "POST",
      """""",
      this.prefix + """manager/clientes/new"""
    )
  )

  // @LINE:28
  private[this] lazy val controllers_GerenteController_cliente_edit10_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("manager/clientes/edit/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_GerenteController_cliente_edit10_invoker = createInvoker(
    GerenteController_0.cliente_edit(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.GerenteController",
      "cliente_edit",
      Seq(classOf[Long]),
      "POST",
      """""",
      this.prefix + """manager/clientes/edit/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:29
  private[this] lazy val controllers_GerenteController_cliente_remove11_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("manager/clientes/remove/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_GerenteController_cliente_remove11_invoker = createInvoker(
    GerenteController_0.cliente_remove(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.GerenteController",
      "cliente_remove",
      Seq(classOf[Long]),
      "POST",
      """""",
      this.prefix + """manager/clientes/remove/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:31
  private[this] lazy val controllers_GerenteController_motoristas12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("manager/motoristas")))
  )
  private[this] lazy val controllers_GerenteController_motoristas12_invoker = createInvoker(
    GerenteController_0.motoristas,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.GerenteController",
      "motoristas",
      Nil,
      "GET",
      """""",
      this.prefix + """manager/motoristas"""
    )
  )

  // @LINE:32
  private[this] lazy val controllers_GerenteController_motorista_new13_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("manager/motoristas/new")))
  )
  private[this] lazy val controllers_GerenteController_motorista_new13_invoker = createInvoker(
    GerenteController_0.motorista_new,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.GerenteController",
      "motorista_new",
      Nil,
      "POST",
      """""",
      this.prefix + """manager/motoristas/new"""
    )
  )

  // @LINE:33
  private[this] lazy val controllers_GerenteController_motorista_edit14_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("manager/motoristas/edit/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_GerenteController_motorista_edit14_invoker = createInvoker(
    GerenteController_0.motorista_edit(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.GerenteController",
      "motorista_edit",
      Seq(classOf[Long]),
      "POST",
      """""",
      this.prefix + """manager/motoristas/edit/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:34
  private[this] lazy val controllers_GerenteController_motorista_remove15_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("manager/motoristas/remove/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_GerenteController_motorista_remove15_invoker = createInvoker(
    GerenteController_0.motorista_remove(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.GerenteController",
      "motorista_remove",
      Seq(classOf[Long]),
      "POST",
      """""",
      this.prefix + """manager/motoristas/remove/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:36
  private[this] lazy val controllers_GerenteController_cabezales16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("manager/cabezales")))
  )
  private[this] lazy val controllers_GerenteController_cabezales16_invoker = createInvoker(
    GerenteController_0.cabezales,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.GerenteController",
      "cabezales",
      Nil,
      "GET",
      """""",
      this.prefix + """manager/cabezales"""
    )
  )

  // @LINE:37
  private[this] lazy val controllers_GerenteController_cabezal_new17_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("manager/cabezales/new")))
  )
  private[this] lazy val controllers_GerenteController_cabezal_new17_invoker = createInvoker(
    GerenteController_0.cabezal_new,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.GerenteController",
      "cabezal_new",
      Nil,
      "POST",
      """""",
      this.prefix + """manager/cabezales/new"""
    )
  )

  // @LINE:38
  private[this] lazy val controllers_GerenteController_cabezal_edit18_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("manager/cabezales/edit/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_GerenteController_cabezal_edit18_invoker = createInvoker(
    GerenteController_0.cabezal_edit(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.GerenteController",
      "cabezal_edit",
      Seq(classOf[Long]),
      "POST",
      """""",
      this.prefix + """manager/cabezales/edit/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:39
  private[this] lazy val controllers_GerenteController_cabezal_remove19_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("manager/cabezales/remove/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_GerenteController_cabezal_remove19_invoker = createInvoker(
    GerenteController_0.cabezal_remove(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.GerenteController",
      "cabezal_remove",
      Seq(classOf[Long]),
      "POST",
      """""",
      this.prefix + """manager/cabezales/remove/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:41
  private[this] lazy val controllers_GerenteController_planilla20_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("manager/planilla")))
  )
  private[this] lazy val controllers_GerenteController_planilla20_invoker = createInvoker(
    GerenteController_0.planilla,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.GerenteController",
      "planilla",
      Nil,
      "GET",
      """""",
      this.prefix + """manager/planilla"""
    )
  )

  // @LINE:42
  private[this] lazy val controllers_GerenteController_facturacion21_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("manager/facturacion")))
  )
  private[this] lazy val controllers_GerenteController_facturacion21_invoker = createInvoker(
    GerenteController_0.facturacion,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.GerenteController",
      "facturacion",
      Nil,
      "GET",
      """""",
      this.prefix + """manager/facturacion"""
    )
  )

  // @LINE:44
  private[this] lazy val controllers_GerenteController_politica_cobro22_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("manager/politica/cobro")))
  )
  private[this] lazy val controllers_GerenteController_politica_cobro22_invoker = createInvoker(
    GerenteController_0.politica_cobro,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.GerenteController",
      "politica_cobro",
      Nil,
      "GET",
      """""",
      this.prefix + """manager/politica/cobro"""
    )
  )

  // @LINE:45
  private[this] lazy val controllers_GerenteController_politica_cobro_post23_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("manager/politica/cobro")))
  )
  private[this] lazy val controllers_GerenteController_politica_cobro_post23_invoker = createInvoker(
    GerenteController_0.politica_cobro_post(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.GerenteController",
      "politica_cobro_post",
      Nil,
      "POST",
      """""",
      this.prefix + """manager/politica/cobro"""
    )
  )

  // @LINE:47
  private[this] lazy val controllers_GerenteController_politica_pago24_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("manager/politica/pago")))
  )
  private[this] lazy val controllers_GerenteController_politica_pago24_invoker = createInvoker(
    GerenteController_0.politica_pago,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.GerenteController",
      "politica_pago",
      Nil,
      "GET",
      """""",
      this.prefix + """manager/politica/pago"""
    )
  )

  // @LINE:48
  private[this] lazy val controllers_GerenteController_politica_pago_post25_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("manager/politica/pago")))
  )
  private[this] lazy val controllers_GerenteController_politica_pago_post25_invoker = createInvoker(
    GerenteController_0.politica_pago_post(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.GerenteController",
      "politica_pago_post",
      Nil,
      "POST",
      """""",
      this.prefix + """manager/politica/pago"""
    )
  )

  // @LINE:50
  private[this] lazy val controllers_GerenteController_usuarios26_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("manager/usuarios")))
  )
  private[this] lazy val controllers_GerenteController_usuarios26_invoker = createInvoker(
    GerenteController_0.usuarios,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.GerenteController",
      "usuarios",
      Nil,
      "GET",
      """""",
      this.prefix + """manager/usuarios"""
    )
  )

  // @LINE:51
  private[this] lazy val controllers_GerenteController_usuario_new27_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("manager/usuarios/new")))
  )
  private[this] lazy val controllers_GerenteController_usuario_new27_invoker = createInvoker(
    GerenteController_0.usuario_new,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.GerenteController",
      "usuario_new",
      Nil,
      "POST",
      """""",
      this.prefix + """manager/usuarios/new"""
    )
  )

  // @LINE:52
  private[this] lazy val controllers_GerenteController_usuario_edit28_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("manager/usuarios/edit/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_GerenteController_usuario_edit28_invoker = createInvoker(
    GerenteController_0.usuario_edit(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.GerenteController",
      "usuario_edit",
      Seq(classOf[Long]),
      "POST",
      """""",
      this.prefix + """manager/usuarios/edit/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:53
  private[this] lazy val controllers_GerenteController_usuario_remove29_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("manager/usuarios/remove/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_GerenteController_usuario_remove29_invoker = createInvoker(
    GerenteController_0.usuario_remove(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.GerenteController",
      "usuario_remove",
      Seq(classOf[Long]),
      "POST",
      """""",
      this.prefix + """manager/usuarios/remove/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:57
  private[this] lazy val controllers_LogisticaController_viajes30_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logistic/viajes")))
  )
  private[this] lazy val controllers_LogisticaController_viajes30_invoker = createInvoker(
    LogisticaController_2.viajes,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LogisticaController",
      "viajes",
      Nil,
      "GET",
      """ RUTAS DEL LogisticaController""",
      this.prefix + """logistic/viajes"""
    )
  )

  // @LINE:58
  private[this] lazy val controllers_LogisticaController_viaje_new31_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logistic/viajes/new")))
  )
  private[this] lazy val controllers_LogisticaController_viaje_new31_invoker = createInvoker(
    LogisticaController_2.viaje_new,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LogisticaController",
      "viaje_new",
      Nil,
      "POST",
      """""",
      this.prefix + """logistic/viajes/new"""
    )
  )

  // @LINE:59
  private[this] lazy val controllers_LogisticaController_viaje_edit32_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logistic/viajes/edit/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_LogisticaController_viaje_edit32_invoker = createInvoker(
    LogisticaController_2.viaje_edit(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LogisticaController",
      "viaje_edit",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """logistic/viajes/edit/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:60
  private[this] lazy val controllers_LogisticaController_viaje_edit_post33_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logistic/viajes/edit/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_LogisticaController_viaje_edit_post33_invoker = createInvoker(
    LogisticaController_2.viaje_edit_post(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LogisticaController",
      "viaje_edit_post",
      Seq(classOf[Long]),
      "POST",
      """""",
      this.prefix + """logistic/viajes/edit/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:61
  private[this] lazy val controllers_LogisticaController_viaje_remove34_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logistic/viajes/remove/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_LogisticaController_viaje_remove34_invoker = createInvoker(
    LogisticaController_2.viaje_remove(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LogisticaController",
      "viaje_remove",
      Seq(classOf[Long]),
      "POST",
      """""",
      this.prefix + """logistic/viajes/remove/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:63
  private[this] lazy val controllers_LogisticaController_planilla35_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logistic/planilla")))
  )
  private[this] lazy val controllers_LogisticaController_planilla35_invoker = createInvoker(
    LogisticaController_2.planilla,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LogisticaController",
      "planilla",
      Nil,
      "GET",
      """""",
      this.prefix + """logistic/planilla"""
    )
  )

  // @LINE:64
  private[this] lazy val controllers_LogisticaController_facturacion36_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logistic/facturacion")))
  )
  private[this] lazy val controllers_LogisticaController_facturacion36_invoker = createInvoker(
    LogisticaController_2.facturacion,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LogisticaController",
      "facturacion",
      Nil,
      "GET",
      """""",
      this.prefix + """logistic/facturacion"""
    )
  )

  // @LINE:65
  private[this] lazy val controllers_LogisticaController_politica_cobro37_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logistic/politica/cobro")))
  )
  private[this] lazy val controllers_LogisticaController_politica_cobro37_invoker = createInvoker(
    LogisticaController_2.politica_cobro,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LogisticaController",
      "politica_cobro",
      Nil,
      "GET",
      """""",
      this.prefix + """logistic/politica/cobro"""
    )
  )

  // @LINE:66
  private[this] lazy val controllers_LogisticaController_politica_pago38_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logistic/politica/pago")))
  )
  private[this] lazy val controllers_LogisticaController_politica_pago38_invoker = createInvoker(
    LogisticaController_2.politica_pago,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LogisticaController",
      "politica_pago",
      Nil,
      "GET",
      """""",
      this.prefix + """logistic/politica/pago"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:8
    case controllers_Assets_versioned0_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned0_invoker.call(Assets_4.versioned(path, file))
      }
  
    // @LINE:12
    case controllers_HomeController_index1_route(params) =>
      call { 
        controllers_HomeController_index1_invoker.call(HomeController_1.index)
      }
  
    // @LINE:13
    case controllers_HomeController_login2_route(params) =>
      call { 
        controllers_HomeController_login2_invoker.call(HomeController_1.login)
      }
  
    // @LINE:14
    case controllers_HomeController_login_post3_route(params) =>
      call { 
        controllers_HomeController_login_post3_invoker.call(HomeController_1.login_post)
      }
  
    // @LINE:15
    case controllers_HomeController_logout4_route(params) =>
      call { 
        controllers_HomeController_logout4_invoker.call(HomeController_1.logout)
      }
  
    // @LINE:16
    case controllers_HomeController_set_password5_route(params) =>
      call { 
        controllers_HomeController_set_password5_invoker.call(HomeController_1.set_password)
      }
  
    // @LINE:17
    case controllers_HomeController_about6_route(params) =>
      call { 
        controllers_HomeController_about6_invoker.call(HomeController_1.about)
      }
  
    // @LINE:22
    case controllers_AdministradorController_usuarios7_route(params) =>
      call { 
        controllers_AdministradorController_usuarios7_invoker.call(AdministradorController_3.usuarios)
      }
  
    // @LINE:26
    case controllers_GerenteController_clientes8_route(params) =>
      call { 
        controllers_GerenteController_clientes8_invoker.call(GerenteController_0.clientes)
      }
  
    // @LINE:27
    case controllers_GerenteController_cliente_new9_route(params) =>
      call { 
        controllers_GerenteController_cliente_new9_invoker.call(GerenteController_0.cliente_new)
      }
  
    // @LINE:28
    case controllers_GerenteController_cliente_edit10_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_GerenteController_cliente_edit10_invoker.call(GerenteController_0.cliente_edit(id))
      }
  
    // @LINE:29
    case controllers_GerenteController_cliente_remove11_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_GerenteController_cliente_remove11_invoker.call(GerenteController_0.cliente_remove(id))
      }
  
    // @LINE:31
    case controllers_GerenteController_motoristas12_route(params) =>
      call { 
        controllers_GerenteController_motoristas12_invoker.call(GerenteController_0.motoristas)
      }
  
    // @LINE:32
    case controllers_GerenteController_motorista_new13_route(params) =>
      call { 
        controllers_GerenteController_motorista_new13_invoker.call(GerenteController_0.motorista_new)
      }
  
    // @LINE:33
    case controllers_GerenteController_motorista_edit14_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_GerenteController_motorista_edit14_invoker.call(GerenteController_0.motorista_edit(id))
      }
  
    // @LINE:34
    case controllers_GerenteController_motorista_remove15_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_GerenteController_motorista_remove15_invoker.call(GerenteController_0.motorista_remove(id))
      }
  
    // @LINE:36
    case controllers_GerenteController_cabezales16_route(params) =>
      call { 
        controllers_GerenteController_cabezales16_invoker.call(GerenteController_0.cabezales)
      }
  
    // @LINE:37
    case controllers_GerenteController_cabezal_new17_route(params) =>
      call { 
        controllers_GerenteController_cabezal_new17_invoker.call(GerenteController_0.cabezal_new)
      }
  
    // @LINE:38
    case controllers_GerenteController_cabezal_edit18_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_GerenteController_cabezal_edit18_invoker.call(GerenteController_0.cabezal_edit(id))
      }
  
    // @LINE:39
    case controllers_GerenteController_cabezal_remove19_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_GerenteController_cabezal_remove19_invoker.call(GerenteController_0.cabezal_remove(id))
      }
  
    // @LINE:41
    case controllers_GerenteController_planilla20_route(params) =>
      call { 
        controllers_GerenteController_planilla20_invoker.call(GerenteController_0.planilla)
      }
  
    // @LINE:42
    case controllers_GerenteController_facturacion21_route(params) =>
      call { 
        controllers_GerenteController_facturacion21_invoker.call(GerenteController_0.facturacion)
      }
  
    // @LINE:44
    case controllers_GerenteController_politica_cobro22_route(params) =>
      call { 
        controllers_GerenteController_politica_cobro22_invoker.call(GerenteController_0.politica_cobro)
      }
  
    // @LINE:45
    case controllers_GerenteController_politica_cobro_post23_route(params) =>
      call { 
        controllers_GerenteController_politica_cobro_post23_invoker.call(GerenteController_0.politica_cobro_post())
      }
  
    // @LINE:47
    case controllers_GerenteController_politica_pago24_route(params) =>
      call { 
        controllers_GerenteController_politica_pago24_invoker.call(GerenteController_0.politica_pago)
      }
  
    // @LINE:48
    case controllers_GerenteController_politica_pago_post25_route(params) =>
      call { 
        controllers_GerenteController_politica_pago_post25_invoker.call(GerenteController_0.politica_pago_post())
      }
  
    // @LINE:50
    case controllers_GerenteController_usuarios26_route(params) =>
      call { 
        controllers_GerenteController_usuarios26_invoker.call(GerenteController_0.usuarios)
      }
  
    // @LINE:51
    case controllers_GerenteController_usuario_new27_route(params) =>
      call { 
        controllers_GerenteController_usuario_new27_invoker.call(GerenteController_0.usuario_new)
      }
  
    // @LINE:52
    case controllers_GerenteController_usuario_edit28_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_GerenteController_usuario_edit28_invoker.call(GerenteController_0.usuario_edit(id))
      }
  
    // @LINE:53
    case controllers_GerenteController_usuario_remove29_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_GerenteController_usuario_remove29_invoker.call(GerenteController_0.usuario_remove(id))
      }
  
    // @LINE:57
    case controllers_LogisticaController_viajes30_route(params) =>
      call { 
        controllers_LogisticaController_viajes30_invoker.call(LogisticaController_2.viajes)
      }
  
    // @LINE:58
    case controllers_LogisticaController_viaje_new31_route(params) =>
      call { 
        controllers_LogisticaController_viaje_new31_invoker.call(LogisticaController_2.viaje_new)
      }
  
    // @LINE:59
    case controllers_LogisticaController_viaje_edit32_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_LogisticaController_viaje_edit32_invoker.call(LogisticaController_2.viaje_edit(id))
      }
  
    // @LINE:60
    case controllers_LogisticaController_viaje_edit_post33_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_LogisticaController_viaje_edit_post33_invoker.call(LogisticaController_2.viaje_edit_post(id))
      }
  
    // @LINE:61
    case controllers_LogisticaController_viaje_remove34_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_LogisticaController_viaje_remove34_invoker.call(LogisticaController_2.viaje_remove(id))
      }
  
    // @LINE:63
    case controllers_LogisticaController_planilla35_route(params) =>
      call { 
        controllers_LogisticaController_planilla35_invoker.call(LogisticaController_2.planilla)
      }
  
    // @LINE:64
    case controllers_LogisticaController_facturacion36_route(params) =>
      call { 
        controllers_LogisticaController_facturacion36_invoker.call(LogisticaController_2.facturacion)
      }
  
    // @LINE:65
    case controllers_LogisticaController_politica_cobro37_route(params) =>
      call { 
        controllers_LogisticaController_politica_cobro37_invoker.call(LogisticaController_2.politica_cobro)
      }
  
    // @LINE:66
    case controllers_LogisticaController_politica_pago38_route(params) =>
      call { 
        controllers_LogisticaController_politica_pago38_invoker.call(LogisticaController_2.politica_pago)
      }
  }
}
