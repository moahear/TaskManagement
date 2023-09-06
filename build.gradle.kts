// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    System.setProperty("room_version", "2.5.2")
    System.setProperty("rxjava3_version", "3.0.1")
    System.setProperty("livedata_version", "2.6.1")
}
plugins {
    id("com.android.application") version "8.1.0" apply false
    id("org.jetbrains.kotlin.android") version "1.9.0" apply false
}