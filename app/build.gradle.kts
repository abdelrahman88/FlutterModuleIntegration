plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)
}


android {
    namespace = "com.example.fluttermoduleintegration"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.fluttermoduleintegration"
        minSdk = 31
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        multiDexEnabled = true


        ndk {
            // Filter for architectures supported by Flutter
            abiFilters += listOf("armeabi-v7a", "arm64-v8a", "x86_64")
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
        create("profile") {
            initWith(getByName("debug"))
        }

    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }

//    val storageUrl = System.env.FLUTTER_STORAGE_BASE_URL ?: "https://storage.googleapis.com"
//    repositories {
//        maven {
//            url = uri("C:/Users/Dell/AndroidStudioProjects/sehhaty-app-android/app/flutter-client-module/build/host/outputs/repo")
//        }
//        maven {
//            url = uri("https://storage.googleapis.com/download.flutter.io")
//        }
//    }

}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
//    debugImplementation("com.example.libs.com.lean.pingChat.dev:flutter_debug:1.0")
//    releaseImplementation("com.example.libs.com.lean.pingChat.dev:flutter_release:1.0")
//    add("profileImplementation", "com.example.libs.com.lean.pingChat.dev:flutter_profile:1.0")

    debugImplementation ("com.lean.pingChat.dev:flutter_debug:1.0")
    add("profileImplementation", "com.lean.pingChat.dev:flutter_profile:1.0")
    releaseImplementation ("com.lean.pingChat.dev:flutter_release:1.0")
//}
//    compileOnly("io.flutter:flutter_embedding_debug:1.0.0-0fdb562ac8068ce3dda6b69aca3f355f4d1d2718")


//    implementation(project(":flutter"))

    // Include the dependencies required by Flutter
//    implementation("com.android.support:multidex:1.0.0")
//    implementation ("androidx.multidex:multidex:2.0.1")
//    implementation("androidx.annotation:annotation:1.1.0")
//    implementation("androidx.localbroadcastmanager:localbroadcastmanager:1.0.0")
//    implementation ("io.flutter:flutter_embedding_debug:1.0.0-2.5.0")
//    implementation(project(":flutter"))
//    implementation("androidx.annotation:annotation:1.1.0")
//    implementation("androidx.localbroadcastmanager:localbroadcastmanager:1.0.0")
//    implementation("io.flutter:flutter_embedding_debug:1.0.0-2.5.0")
}

configurations {
    getByName("profileImplementation") {
    }
}