plugins {
    java
    kotlin("jvm") version "1.4.21"
    id("com.github.johnrengelman.shadow") version "6.1.0"
}

group = properties["launcherGroup"]!!
version = properties["launcherVersion"]!!

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation("no.tornado:tornadofx:1.7.20")
    implementation("mysql:mysql-connector-java:8.0.15")
}

val shade = configurations.create("shade")
shade.extendsFrom(configurations.implementation.get())

tasks {
    javadoc {
        options.encoding = "UTF-8"
    }

    compileJava {
        options.encoding = "UTF-8"
    }

    compileKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }

    jar {
        manifest {
            attributes["Main-Class"] = "org.projecttl.launcher.project.MainLauncher"
        }

        from (shade.map { artifacts ->
            if (artifacts.isDirectory) artifacts else zipTree(artifacts)
        })
    }
}