plugins {
    `kotlin-dsl`
    `kotlin-dsl-precompiled-script-plugins`
}

dependencies {
    implementation(libs.android.gradlePlugin)
    implementation(libs.kotlin.gradlePlugin)
    implementation(libs.ksp.gradlePlugin)
    compileOnly(libs.compose.compiler.gradle.plugin)
}

gradlePlugin {
    plugins {
        register("androidHilt") {
            id = "o06.aos.hilt"
            implementationClass = "com.o06.aos.convention.HiltAndroidPlugin"
        }
        register("kotlinHilt") {
            id = "o06.kotlin.hilt"
            implementationClass = "com.o06.aos.convention.HiltKotlinPlugin"
        }
    }
}

