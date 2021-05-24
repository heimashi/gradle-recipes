import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    "groovy"
    kotlin("jvm") version "1.3.72"
}

repositories {
    google()
    mavenCentral()
}

tasks.withType<KotlinCompile>().configureEach {
    kotlinOptions.apiVersion = "1.3"
}

dependencies {
    implementation("com.android.tools.build:gradle-api:4.2.0")
    implementation(kotlin("stdlib"))
//    implementation("org.jetbrains.kotlin:kotlin-stdlib:1.3.72")
    gradleApi()
}
