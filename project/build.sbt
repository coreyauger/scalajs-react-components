import sbt.Keys._


lazy val root = project.in(file("core"))
    .enablePlugins(ScalaJSPlugin)
    .settings(
      scalaVersion := "2.11.7",
      libraryDependencies ++= Seq(
        "org.scala-js" %%% "scalajs-dom" % "0.8.0",
        "com.github.japgolly.scalajs-react" %%% "core" % "0.8.4",
        "com.github.japgolly.scalajs-react" %%% "extra" % "0.9.0",
        "com.github.japgolly.scalacss" %%% "core" % "0.3.0",
        "com.github.japgolly.scalacss" %%% "ext-react" % "0.3.0"
      )
    )

name := "Reusable scalajs-react components"

normalizedName := "scalajs-react-components"

version := "0.2.0-SNAPSHOT"

organization := "com.github.coreyauger.scalajs-react-components"

scalaVersion := "2.11.7"

crossScalaVersions := Seq("2.10.4", "2.11.5")

homepage := Some(url("http://www.surfkit.io/"))

licenses += ("Apache-2.0", url("http://opensource.org/licenses/Apache-2.0"))

