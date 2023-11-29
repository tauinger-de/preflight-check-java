plugins {
    application
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.apache.commons:commons-lang3:3.12.0")
}

group = "de.auinger.training"
version = "1.0"
description = "preflight-check-java"

java.sourceCompatibility = JavaVersion.VERSION_17
