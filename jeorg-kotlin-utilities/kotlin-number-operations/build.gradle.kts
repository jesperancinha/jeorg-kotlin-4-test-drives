plugins {
    kotlin("jvm") version "2.0.0"
}

group = "org.jesperancinha"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("io.kotest:kotest-assertions-core-jvm:5.9.0")
    testImplementation("org.jetbrains.kotlin:kotlin-test")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(21)
}