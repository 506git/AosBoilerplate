import com.o06.aos.convention.setNamespace

plugins {
    id("o06.aos.library")
    id("o06.aos.compose")
    alias(libs.plugins.kotlin.serialization)
}

android {
    setNamespace("core.navigation")
}

dependencies {
    implementation(libs.kotlinx.serialization.json)
}
