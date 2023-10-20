import scalapb.compiler.Version.protobufVersion

scalaVersion := "2.13.12"

Compile / PB.targets := Seq(scalapb.gen() -> (Compile / sourceManaged).value)

libraryDependencies += "com.google.protobuf" % "protobuf-java" % protobufVersion % "protobuf"
