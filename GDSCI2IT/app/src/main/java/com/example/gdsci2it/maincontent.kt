package com.example.gdsci2it

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.Navigation
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

import com.example.gdsci2it.ui.theme.navigation

@Composable
fun screen()
{
    val navController = rememberNavController()
    Surface(modifier = Modifier.fillMaxSize()) {
        NavHost(navController = navController, startDestination = "Main")
        {
            composable("Main")
            {
                Main(navController)
            }
            composable("navigation")
            {
                navigation()
            }
        }
    }


}