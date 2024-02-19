package com.davinciapp.githubpackagesexample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.davinciapp.github_library.PrintGithubPackage

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PrintGithubPackage(name = "yolo")
        }
    }
}

