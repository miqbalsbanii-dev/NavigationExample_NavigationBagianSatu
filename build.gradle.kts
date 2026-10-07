buildscript {
    repositories {
        google()
        mavenCentral()
    }

    dependencies {
        classpath("androidx.navigation:navigation-safe-args-gradle-plugin:2.9.7")
    }
}

plugins {
    alias(libs.plugins.android.application) apply false
}