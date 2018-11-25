object Config {

  val latestGradleVersion = Versions.Gradle.currentVersion
  val kotlinVersion = Versions.org_jetbrains_kotlin

   val pluginsResolution : Map<String, String> = mapOf(
    "kotlin-android" to Libs.kotlin_gradle_plugin,
    "kotlin-dce-js" to Libs.kotlin_gradle_plugin,
    "kotlin2js" to Libs.kotlin_gradle_plugin)
 } 