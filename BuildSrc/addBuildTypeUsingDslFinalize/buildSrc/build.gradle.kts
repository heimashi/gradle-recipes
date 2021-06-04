import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    "groovy"
    kotlin("jvm") version "1.4.32"
}

repositories {
    google()
    jcenter()
}

tasks.withType<KotlinCompile>().configureEach {
    kotlinOptions.apiVersion = "1.4"
}

dependencies {
    implementation("com.android.tools.build:gradle-api:7.1.0-alpha01")
    implementation(kotlin("stdlib"))
    gradleApi()
}
