plugins {
    kotlin("jvm") version "2.0.21"
}

group = "org.jesperancinha.asnsei.modularity"
version = "unspecified"

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(mapOf("path" to ":jeorg-kotlin-crums:module-common")))
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(21)
}