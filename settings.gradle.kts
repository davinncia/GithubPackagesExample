pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven {
            url = uri("https://maven.pkg.github.com/davinncia/GithubPackagesExample")
            credentials {
                username = "lucas-mahe-insideapp"
                password = "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"
            }
        }
    }
}

rootProject.name = "GithubPackagesExample"
include(":app")
include(":github-library")
