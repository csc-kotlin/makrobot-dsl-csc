group = "csc.makrobot"
version = "1.0-SNAPSHOT"

plugins {
    kotlin("jvm") version "1.6.10"
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.2")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.2")
    testImplementation("com.github.tschuchortdev:kotlin-compile-testing:1.4.6")
}

tasks.withType<Test>().configureEach {
    useJUnitPlatform()
}