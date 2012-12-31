package bootstrap.liftweb

import net.liftweb.http._
import net.liftweb.common.{Full, Empty}

class Boot {

  def boot {

    LiftRules.addToPackages("shiny.lana")
    LiftRules.early.append(_.setCharacterEncoding("UTF-8"))
    LiftRules.htmlProperties.default.set((r: Req) => new Html5Properties(r.userAgent))

    LiftRules.dispatch.append({
      case Req("a"::Nil, _, _) => () => for {
        x <- Empty ?~ "This is Wrong" ~> 500
      } yield OkResponse()
      case Req("b" :: Nil, _, _) => () => for {
        x <- Empty ?~ "This is still wrong"
      } yield OkResponse()
      case Req("c" :: Nil, _, _) => () => for {
        x <- Full(3)
      } yield OkResponse()
    })
  }
}
