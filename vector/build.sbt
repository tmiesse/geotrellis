import Dependencies._

name := "geotrellis-vector"
libraryDependencies ++= Seq(
  jts,
  typesafeConfig,
  sprayJson,
  apacheMath,
  spire)
