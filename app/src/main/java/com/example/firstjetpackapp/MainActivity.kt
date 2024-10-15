package com.example.firstjetpackapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Face
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.firstjetpackapp.ui.theme.FirstJetpackAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FirstJetpackAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                            name = "Android",
                            modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    LazyRow(modifier=Modifier.fillMaxSize()) {
        items(50){ i ->
            Icon(
                imageVector = Icons.Default.Face,
                contentDescription = null)
        }
    }


//    Image(
//        painter = painterResource(id = R.drawable.ic_launcher_foreground),
//        contentDescription = null ,
//        modifier = Modifier.background(Color.Blue)
//
//    )

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
//    Box (
//
//        modifier = Modifier.size(400.dp),
//        contentAlignment = Alignment.Center
//
////        modifier = Modifier.fillMaxSize()
////        modifier = Modifier.fillMaxWidth()
//
//    ){
//        Text(
//            text = "Hello $name!",
//            color = Color.Red,
//            fontSize = 30.sp,
//            modifier = Modifier.align(Alignment.BottomEnd)
////            modifier = Modifier.fillMaxSize()
////            modifier = Modifier.background(Color.Cyan)
//
//        )
//        Text(
//            text = "Hello, how are you!",
//            color = Color.Red,
//            fontSize = 30.sp,
////            modifier = Modifier.background(Color.Green)
//
//        )
//    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    FirstJetpackAppTheme {
        Greeting("Lody")
    }
}