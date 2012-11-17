import bootstrap.liftweb.Boot
import net.liftweb.common.Empty
import net.liftweb.http.{S, LiftSession}
import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers

class WorldSpec extends FlatSpec with ShouldMatchers {

  "The index" should "say Hello World !" in  {

    val session = new LiftSession("/", "1", Empty)
    S.initIfUninitted(session){
      new Boot().boot
      val page = S.session.get.findAndProcessTemplate(List("index")).openTheBox
      page.text should include("Hello World !")
    }
  }
}
