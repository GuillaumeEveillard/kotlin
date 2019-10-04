plugins {
   // kotlin("multiplatform") version "1.3.60-dev-2515"
    kotlin("multiplatform") version "1.3.60-dev-000"
}

repositories {
    jcenter()
    maven { setUrl("https://dl.bintray.com/kotlin/kotlin-dev") }
}

kotlin {
    ios("ios")
    watchos("watchos")
    tvos("tvos")
}
