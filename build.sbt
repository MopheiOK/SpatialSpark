name := "SpatialSpark"

version := "1.0"

scalaVersion := "2.11.12"
val sparkVersion = "2.3.2"

libraryDependencies += "com.typesafe.scala-logging" %% "scala-logging" % "3.5.0"

libraryDependencies +="org.apache.spark" %% "spark-core" % sparkVersion % "provided"

libraryDependencies +="com.vividsolutions" % "jts" % "1.13"

libraryDependencies += "org.apache.commons" % "commons-math3" % "3.2"

libraryDependencies +="com.google.uzaygezen" % "uzaygezen-core" % "0.2"

libraryDependencies += "org.scalactic" %% "scalactic" % "2.2.6"
libraryDependencies += "org.scalatest" %% "scalatest" % "2.2.6" % "test"

assemblyMergeStrategy in assembly := {
  case PathList("META-INF", xs @ _*) => MergeStrategy.discard
  case x => MergeStrategy.first
}

assemblyOption in assembly := (assemblyOption in assembly).value.copy(includeScala = false)
test in assembly := {}
