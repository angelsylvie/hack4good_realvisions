// Comment to get more information during initialization
logLevel := Level.Warn

// The Typesafe repository 
resolvers += "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/"

// Use the Play sbt plugin for Play projects
addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.2.0")

// Prismic.io Maven repository
resolvers += "Prismic.io kits" at "https://github.com/prismicio/repository/raw/master/maven/"

// The Scala kit
libraryDependencies += "io.prismic" %% "scala-kit" % "1.0-M2"