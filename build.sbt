name := "shiny-lana"
 
organization := "shiny.lana"
 
version := "0.0.1-SNAPSHOT"
 
scalaVersion := "2.9.1"

seq(webSettings :_*)
 
libraryDependencies ++= {
       val liftVersion = "2.4"
       Seq(
               "net.liftweb" %% "lift-webkit" % liftVersion % "compile",
               "org.mortbay.jetty" % "jetty" % "6.1.26" % "container",
               "org.scalatest" %% "scalatest" % "1.8" % "test"		
       )
}

unmanagedResourceDirectories in Test <+= (baseDirectory) { _ / "src/main/webapp" }
