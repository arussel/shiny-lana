shiny-lana
==========

Shiny-lana is the simplest lift project. The master branch shows only 
an index.html page with 'Hello World!'. The snippet used is tested.

To see the live application, run sbt and type:
  container:start

To import the project in eclipse, add this line to ~/.sbt/plugins/build.sbt
  addSbtPlugin("com.typesafe.sbteclipse" % "sbteclipse-plugin" % "2.1.0")

Then, run sbt and type:
  eclipse

To import the project in IDEA, add this line to ~/.sbt/plugins/build.sbt
  addSbtPlugin("com.github.mpeltonen" % "sbt-idea" % "1.1.0")

Then, run sbt and type:
  gen-idea
