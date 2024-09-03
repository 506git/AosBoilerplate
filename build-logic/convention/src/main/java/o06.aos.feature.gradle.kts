import com.o06.aos.convention.configureHiltAndroid
import com.o06.aos.convention.libs


plugins {
    id("o06.aos.library")
    id("o06.aos.compose")
}

android {
    packaging {
        resources {
            excludes.add("META-INF/**")
        }
    }
    defaultConfig {
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
}

configureHiltAndroid()

dependencies {
    implementation(project(":core:model"))
//    implementation(project(":core:data"))
//    implementation(project(":core:designsystem"))
//    implementation(project(":core:domain"))
    implementation(project(":core:navigation"))
//    implementation(project(":core:ui"))
//
//    testImplementation(project(":core:testing"))

    val libs = project.extensions.libs
    implementation(libs.findLibrary("hilt.navigation.compose").get())
    implementation(libs.findLibrary("androidx.compose.navigation").get())
    androidTestImplementation(libs.findLibrary("androidx.compose.navigation.test").get())

    implementation(libs.findLibrary("androidx.lifecycle.viewModelCompose").get())
    implementation(libs.findLibrary("androidx.lifecycle.runtimeCompose").get())
}
