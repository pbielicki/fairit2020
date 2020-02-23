rootProject.name = "fairit2020"

plugins {
  id("com.gradle.enterprise").version("3.1.1")
}

include("service")
include("webapp")

renameBuildFiles(rootProject)

fun renameBuildFiles(project: ProjectDescriptor) {
  project.buildFileName = "${project.name}.gradle.kts"
  project.children.forEach {
    renameBuildFiles(it)
  }
}

gradleEnterprise {
  buildScan {
    termsOfServiceUrl = "https://gradle.com/terms-of-service"
    termsOfServiceAgree = "yes"
    publishAlways()
  }
}