plugins {
    application
}

group = "org.acme.webapp"

dependencies {
    implementation(project(":service"))
}

application {
    mainClassName = "org.acme.Main"
}
