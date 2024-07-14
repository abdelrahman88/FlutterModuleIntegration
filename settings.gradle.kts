pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.PREFER_SETTINGS)
    repositories {
        maven { url =uri("https://jitpack.io") }
        maven {
            url = uri("C://Users/Dell/AndroidStudioProjects/sehhaty-app-android/app/flutter-client-module/build/host/outputs/repo")
            // This is relative to the location of the build.gradle file
            // if using a relative path.
        }

        maven {
            url = uri("https://storage.googleapis.com/download.flutter.io")
        }

        google()
        mavenCentral()
    }
}

//rootProject.name = "FlutterModuleIntegration"
include(":app")
//include (":flutter")
//project(":flutter").projectDir = file("libs")
