pluginManagement {
    repositories {
        gradlePluginPortal()
        jcenter()
    }
    resolutionStrategy {
        eachPlugin {
            val plugin = requested.id.id
            val module = Config.pluginsResolution.get(plugin)
            if (module != null) {
                useModule(module)
            } else {
//                println("No resolutionStrategy for plugin=$plugin")
            }
        }
    }
}
rootProject.name = "lenz-mozilla-extension"
include(":popup", ":content_script")

