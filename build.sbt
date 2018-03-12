name := "scalasignal"

version := "0.4-SNAPSHOT"

organization := "com.github.scalasignal"

scalaVersion := "2.11.8"

// Maven repositories
resolvers ++= Seq(
  "Sonatype Snapshots" at 
    "https://oss.sonatype.org/content/repositories/snapshots/"
)

// Runtime library dependencies
libraryDependencies ++= Seq(
  "org.scalanlp"                %% "breeze" % "0.13.2",
  "org.scalanlp" %% "breeze-natives" % "0.13.2",
  "net.sourceforge.jtransforms" %  "jtransforms" % "2.4.0"
)

// https://mvnrepository.com/artifact/org.scala-lang.modules/scala-parser-combinators
libraryDependencies += "org.scala-lang.modules" %% "scala-parser-combinators" % "1.1.0"

// Test library dependencies
libraryDependencies += "org.scalatest" %% "scalatest" % "2.2.1" % "test"

// Scalac Options
scalacOptions ++= Seq(
  "-Yno-adapted-args", 
  "-Xfatal-warnings",
  "-deprecation",
  "-feature"
)
