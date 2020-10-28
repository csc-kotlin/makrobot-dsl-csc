group = "csc.makrobot"
version = "1.0-SNAPSHOT"

plugins {
    kotlin("jvm") version "1.4.10"
}

repositories {
    jcenter()
}

dependencies {
    testImplementation("junit:junit:4.13")
    testImplementation("com.github.tschuchortdev:kotlin-compile-testing:1.3.1")
}
