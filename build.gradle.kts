plugins {
    application
}

group = "org.acme"
version = "1.0"

java {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
}

repositories {
    jcenter()
}

dependencies {
    implementation("com.google.code.gson:gson:2.+")
    runtimeOnly("org.slf4j:slf4j-simple:1.7.25")
    testImplementation("junit:junit:4.12")
    testImplementation("org.hamcrest:hamcrest-all:1.+")
    testImplementation("org.mockito:mockito-core:1.+")
    testImplementation("com.google.code.gson:gson:2.+")
}

application {
    mainClassName = "org.acme.Main"
}

buildScan {
    termsOfServiceUrl = "https://gradle.com/terms-of-service"
    termsOfServiceAgree = "yes"
    publishAlways()
}
