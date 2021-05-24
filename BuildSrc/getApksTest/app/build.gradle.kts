plugins {
        id("com.android.application")
        kotlin("android")
        kotlin("android.extensions")
}

apply<ExamplePlugin>()

android { 
    compileSdkVersion(29)
    defaultConfig {
        minSdkVersion(21)
        targetSdkVersion(29)
    }
}
dependencies{
    implementation("org.jetbrains.kotlin:kotlin-stdlib:1.3.72")
}
