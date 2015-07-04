enablePlugins(ScalaJSPlugin)

name := "ScalaJSPlayground"

version := "1.0"

scalaVersion := "2.11.7"

// This needs to be here else we get: Cannot call method "createElement" of undefined
jsDependencies += RuntimeDOM

//persistLauncher in Compile := true

//mainClass in (Compile, packageBin) := Some("examples.FirstApp")

persistLauncher in Test := false

testFrameworks += new TestFramework("utest.runner.Framework")

libraryDependencies ++= Seq(
  "org.scala-js" %%% "scalajs-dom" % "0.8.0",
  "be.doeraene" %%% "scalajs-jquery" % "0.8.0",
  "com.lihaoyi" %%% "utest" % "0.3.0" % "test"
)
    