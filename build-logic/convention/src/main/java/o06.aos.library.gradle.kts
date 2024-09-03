import com.o06.aos.convention.configureCoroutineAndroid
import com.o06.aos.convention.configureHiltAndroid
import com.o06.aos.convention.configureKotlinAndroid

plugins {
    id("com.android.library")
}

configureKotlinAndroid()
configureCoroutineAndroid()
configureHiltAndroid()
