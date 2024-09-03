import com.o06.aos.convention.setNamespace

plugins {
    id("o06.aos.feature")
}

android {
    setNamespace("feature.home")
}

dependencies {
    implementation(libs.androidx.appcompat)
}