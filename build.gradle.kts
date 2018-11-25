

buildscript {

    repositories {
        mavenCentral()
    }
    dependencies {
        classpath(kotlin("gradle-plugin", Config.kotlinVersion ))
    }
}
plugins {
    java
    id("com.gradle.build-scan") version "1.16"
    id("jmfayard.github.io.gradle-kotlin-dsl-libs") version "0.2.6"  // $ ./gradlew syncLibs
    id("kotlin2js") apply (false)
    id("kotlin-dce-js") apply (false)
}


allprojects {
    ext{
        set("kotlin_version","1.3")
    }

    apply(plugin = "kotlin2js")
    apply(plugin = "kotlin-dce-js")

    repositories {
        mavenCentral()
        maven("https://jitpack.io")
    }

    dependencies {
        compile(Libs.kotlin_stdlib_js)
        compile(Libs.webextensions_declarations)

    }

}


repositories {
    mavenCentral()
}
dependencies {
    compile("org.jetbrains.kotlin:kotlin-stdlib-js:${Config.kotlinVersion}")
}

