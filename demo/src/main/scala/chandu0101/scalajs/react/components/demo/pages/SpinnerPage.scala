package chandu0101.scalajs.react.components.demo.pages

import chandu0101.scalajs.react.components.demo.components.LeftNavPage
import chandu0101.scalajs.react.components.demo.routes.{SpinnerRouteModule, LeftRoute, ReactSelectRouteModule}
import chandu0101.scalajs.react.components.mixins.AsyncLoad
import japgolly.scalajs.react.extra.router2.RouterCtl
import japgolly.scalajs.react.{BackendScope, ReactComponentB}


object SpinnerPage {

  class Backend(t: BackendScope[_, _]) extends AsyncLoad {
    override val jsResources: Vector[String] = Vector("assets/spinnerPage-bundle.js")
  }

  val component = ReactComponentB[Props]("SpinnerPage")
    .stateless
    .backend(new Backend(_))
    .render((P,S,B) => {
    LeftNavPage(SpinnerRouteModule.menu, P.selectedPage, P.ctrl)
  })
    .configure(AsyncLoad.mixin)
    .build

  case class Props(selectedPage: LeftRoute, ctrl: RouterCtl[LeftRoute])

  def apply(selectedPage: LeftRoute, ctrl: RouterCtl[LeftRoute]) = component(Props(selectedPage, ctrl))

}
