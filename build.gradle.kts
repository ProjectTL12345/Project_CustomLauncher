plugins {
    java
    kotlin("jvm") version "1.4.30"
    id("com.github.johnrengelman.shadow") version "6.1.0"
}

group = properties["launcherGroup"]!!
version = properties["launcherVersion"]!!

repositories {
    jcenter()
    maven("https://jitpack.io/")
}

dependencies {
    implementation(kotlin("stdlib"))

    implementation("no.tornado:tornadofx:1.7.20")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin:2.12.1")

    compileOnly("org.projectlombok:lombok:1.18.16")
    annotationProcessor("org.projectlombok:lombok:1.18.16")
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
            attributes["Main-Class"] = project.properties["launcherMain"]
        }

        from (shade.map { artifacts ->
            if (artifacts.isDirectory) artifacts else zipTree(artifacts)
        })
    }
}