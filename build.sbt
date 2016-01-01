name := "learn_spark"

organization := "com.learning"

// project description
description := "Learning Java with SBT and spark"

// project version
version := "0.1"

// java version
javacOptions ++= Seq("-source", "1.8")

// library dependencies
libraryDependencies ++= Seq(
	"com.sparkjava" % "spark-core" % "2.3",
	"org.codehaus.jackson" % "jackson-core-asl" % "1.9.13"
	)

// Do not append Scala versions to the generated artifacts
crossPaths := false

// This forbids including Scala related libraries into the dependency
autoScalaLibrary := false