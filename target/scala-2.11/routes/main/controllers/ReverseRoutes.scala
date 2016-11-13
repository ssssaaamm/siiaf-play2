
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/samuel/Desarrollo/siiaf/conf/routes
// @DATE:Fri Nov 11 13:22:56 CST 2016

import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:8
package controllers {

  // @LINE:8
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def versioned(file:Asset): Call = {
      implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:26
  class ReverseGerenteController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:33
    def motorista_edit(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "manager/motoristas/edit/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:41
    def planilla(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "manager/planilla")
    }
  
    // @LINE:45
    def politica_cobro_post(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "manager/politica/cobro")
    }
  
    // @LINE:27
    def cliente_new(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "manager/clientes/new")
    }
  
    // @LINE:42
    def facturacion(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "manager/facturacion")
    }
  
    // @LINE:50
    def usuarios(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "manager/usuarios")
    }
  
    // @LINE:31
    def motoristas(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "manager/motoristas")
    }
  
    // @LINE:39
    def cabezal_remove(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "manager/cabezales/remove/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:29
    def cliente_remove(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "manager/clientes/remove/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:53
    def usuario_remove(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "manager/usuarios/remove/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:32
    def motorista_new(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "manager/motoristas/new")
    }
  
    // @LINE:47
    def politica_pago(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "manager/politica/pago")
    }
  
    // @LINE:36
    def cabezales(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "manager/cabezales")
    }
  
    // @LINE:38
    def cabezal_edit(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "manager/cabezales/edit/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:51
    def usuario_new(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "manager/usuarios/new")
    }
  
    // @LINE:26
    def clientes(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "manager/clientes")
    }
  
    // @LINE:37
    def cabezal_new(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "manager/cabezales/new")
    }
  
    // @LINE:52
    def usuario_edit(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "manager/usuarios/edit/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:28
    def cliente_edit(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "manager/clientes/edit/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:34
    def motorista_remove(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "manager/motoristas/remove/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:48
    def politica_pago_post(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "manager/politica/pago")
    }
  
    // @LINE:44
    def politica_cobro(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "manager/politica/cobro")
    }
  
  }

  // @LINE:57
  class ReverseLogisticaController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:60
    def viaje_edit_post(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "logistic/viajes/edit/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:63
    def planilla(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "logistic/planilla")
    }
  
    // @LINE:61
    def viaje_remove(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "logistic/viajes/remove/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:64
    def facturacion(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "logistic/facturacion")
    }
  
    // @LINE:59
    def viaje_edit(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "logistic/viajes/edit/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:66
    def politica_pago(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "logistic/politica/pago")
    }
  
    // @LINE:58
    def viaje_new(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "logistic/viajes/new")
    }
  
    // @LINE:57
    def viajes(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "logistic/viajes")
    }
  
    // @LINE:65
    def politica_cobro(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "logistic/politica/cobro")
    }
  
  }

  // @LINE:12
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:14
    def login_post(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "login")
    }
  
    // @LINE:17
    def about(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "about")
    }
  
    // @LINE:15
    def logout(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "logout")
    }
  
    // @LINE:16
    def set_password(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "set/password")
    }
  
    // @LINE:12
    def index(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix)
    }
  
    // @LINE:13
    def login(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "login")
    }
  
  }

  // @LINE:22
  class ReverseAdministradorController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:22
    def usuarios(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "admin/usuarios")
    }
  
  }


}
