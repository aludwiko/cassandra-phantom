logLevel := Level.Warn
def websudosPattern = {   
  val pList = List("[organisation]/[module](_[scalaVersion])(_[sbtVersion])/[revision]/[artifact]-[revision](-[classifier]).[ext]")   
  Patterns(pList, pList, true)
}

resolvers ++= Seq(Resolver.url("Maven ivy Websudos", url(Resolver.DefaultMavenRepositoryRoot))(websudosPattern))

resolvers ++= Seq(
  Resolver.bintrayRepo("websudos", "oss-releases"),
  Resolver.url("Websudos OSS", url("http://dl.bintray.com/websudos/oss-releases"))(Resolver.ivyStylePatterns)
)

// And finally the plugin dependency itself
addSbtPlugin("com.websudos" %% "phantom-sbt" % "1.27.0")
