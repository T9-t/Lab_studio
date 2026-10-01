package com.example.myinformation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .statusBarsPadding(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Column(
                    modifier = Modifier.weight(3f),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    NewImage(160.dp)
                    Text(
                        text = "Full Name",
                        fontSize = 40.sp,
                        fontWeight = FontWeight.Bold
                    )
                    Text(
                        text = "Title",
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Bold
                    )
                }
                Column(
                    modifier = Modifier.weight(1f)
                ) {
                    NewContact("+00 (00) 000 000")
                    NewContact("@socialmediahandle")
                    NewContact("email@domail.com")
                }
            }
        }
    }
}

@Composable
fun NewImage(size: Dp, modifier: Modifier = Modifier) {
    Image(
        painter = painterResource(android.R.drawable.ic_menu_gallery),
        contentDescription = "Logo",
        modifier = Modifier
            .size(size)
    )
}
@Composable
fun NewContact(text: String, modifier: Modifier = Modifier) {
    Row(
        verticalAlignment = Alignment.CenterVertically
    ) {
        NewImage(50.dp)
        Text(
            text = text,
            fontSize = 16.sp
        )
    }
}