subprojects {
    apply(plugin = "java-library")

    version = "1.0"

    repositories {
        jcenter()
    }

    extensions.configure(JavaPluginExtension::class) {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}
