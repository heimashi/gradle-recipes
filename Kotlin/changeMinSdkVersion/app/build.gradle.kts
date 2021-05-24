import com.android.build.api.variant.AndroidVersion

plugins {
        id("com.android.application")
        kotlin("android")
        kotlin("android.extensions")
}

android {
    
    compileSdkVersion(29)
    defaultConfig {
        minSdkVersion(21)
        targetSdkVersion(29)
    }
}

androidComponents {
    beforeVariants { variant ->
        if (variant.name == "release") {
            variant.minSdkVersion = AndroidVersion(23)
        }
    }
}