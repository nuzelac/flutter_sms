plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android") version "2.1.21"
}

group = "com.example.flutter_sms"
version = "1.0-SNAPSHOT"

android {
    namespace = "com.example.flutter_sms"
    compileSdk = flutter.compileSdkVersion
    ndkVersion = flutter.ndkVersion
    defaultConfig {
        minSdk = flutter.minSdkVersion
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    compileOptions {
        sourceCompatibility JavaVersion.VERSION_1_8
        targetCompatibility JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = '1.8'
    }

    sourceSets["main"].java.srcDirs("src/main/kotlin")

    lint {
        disable.add("InvalidPackage")
    }
}

repositories {
    google()
    mavenCentral() // jcenter is deprecated; use mavenCentral
}

dependencies {
    implementation("androidx.core:core-ktx:1.16.0")
   }
