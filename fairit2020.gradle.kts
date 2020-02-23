import com.gradle.enterprise.gradleplugin.GradleEnterpriseExtension

subprojects {
    apply(plugin = "java-library")

    version = "1.0"

    repositories {
        jcenter()
    }

    val java = extensions.getByType(JavaPluginExtension::class.java)
    java.sourceCompatibility = JavaVersion.VERSION_11
    java.targetCompatibility = JavaVersion.VERSION_11
}
