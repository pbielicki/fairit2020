group = "org.acme.service"

dependencies {
    testImplementation("org.hamcrest:hamcrest-all:1.+")
    testCompileOnly("org.junit.jupiter:junit-jupiter-api:5.+")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.+")
}

tasks.test {
    useJUnitPlatform()
}