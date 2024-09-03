package com.o06.aos.convention

import org.gradle.api.Project

fun Project.setNamespace(name: String) {
    androidExtension.apply {
        namespace = "com.o06.aos.$name"
    }
}