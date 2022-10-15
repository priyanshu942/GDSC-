package com.example.gdsci2it.ui.theme

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

//sealed class Routes(val route:String)
//{
//    object Info:Routes("Info")
//    object Details:Routes("details")
//}

@Composable
fun navigation(){
    Box(modifier = Modifier.fillMaxWidth())
    {
        Text(text = "welcome to my Kingdom")
    }
}
