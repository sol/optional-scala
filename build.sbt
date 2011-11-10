import AssemblyKeys._

name := "optional"

version := "0.3"

organization := "com.github.paulp"

scalaVersion := "2.9.1"

libraryDependencies ++= Seq(
  "com.thoughtworks.paranamer" % "paranamer" % "2.2.1",
  "org.scalatest" %% "scalatest" % "1.6.1" % "test"
)

// assembly task
seq(assemblySettings: _*)

assembleArtifact in packageScala := false
