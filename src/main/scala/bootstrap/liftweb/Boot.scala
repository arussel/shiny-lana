package bootstrap.liftweb

import net.liftweb.http._

class Boot {

  def boot {

    LiftRules.addToPackages("shiny.lana")
    LiftRules.early.append(_.setCharacterEncoding("UTF-8"))
    LiftRules.htmlProperties.default.set((r: Req) => new Html5Properties(r.userAgent))

  }
}
