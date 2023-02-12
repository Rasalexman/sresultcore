plugins {
    //trick: for the same plugin versions in all sub-modules
    id("com.android.library").version("7.4.0").apply(false)
    kotlin("multiplatform").version("1.8.0").apply(false)
}

buildString {
    apply(from="versions.gradle.kts")
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}
