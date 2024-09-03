import com.o06.aos.convention.configureHiltAndroid
import com.o06.aos.convention.configureKotlinAndroid

plugins {
    id("com.android.application")
}

configureKotlinAndroid()
configureHiltAndroid()
