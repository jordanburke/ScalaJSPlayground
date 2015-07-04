enablePlugins(ScalaJSPlugin)

name := "ScalaJSPlayground"

version := "1.0"

scalaVersion := "2.11.7"

// This needs to be here else we get: Cannot call method "createElement" of undefined
jsDependencies += RuntimeDOM

libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "0.8.0"

libraryDependencies += "be.doeraene" %%% "scalajs-jquery" % "0.8.0"
    