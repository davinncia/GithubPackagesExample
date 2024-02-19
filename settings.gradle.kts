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
                password = "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" // Read package token
            }
        }
    }
}

rootProject.name = "GithubPackagesExample"
include(":app")
include(":github-library")
