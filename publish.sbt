
publishMavenStyle := true

publishTo := {
  val nexus = "https://oss.sonatype.org/"
  if (isSnapshot.value)
    Some("snapshots" at nexus + "content/repositories/snapshots")
  else
    Some("releases"  at nexus + "service/local/staging/deploy/maven2")
}

publishArtifact in Test := false

pomIncludeRepository := { _ => false }

sonatypeProfileName := "com.gilt"

pomExtra := {
  <url>https://github.com/gilt/sbt-aws-lambda</url>
  <scm>
    <url>git@github.com:gilt/sbt-aws-lambda.git</url>
    <connection>scm:git:git@github.com:gilt/sbt-aws-lambda.git</connection>
  </scm>
  <licenses>
    <license>
      <name>Apache 2</name>
      <url>http://www.apache.org/licenses/LICENSE-2.0.txt</url>
    </license>
  </licenses>
  <developers>
    <developer>
      <id>bstjohn</id>
      <name>Brendan St John</name>
      <url>https://github.com/stjohnb</url>
    </developer>
  </developers>
}