package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.magnifier
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme
import java.time.format.TextStyle

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BusinessCardText(
                        name = "Theresia Pasingki Sollu",
                        title = "Informatics Engineering Student"
                    )
                    BusinessContacts(
                        email = "theressia596@gmail.com",
                        telp = "+62 895395633265",
                        linkedin = "Theresia Pasingki Sollu"
                    )
                }
            }
        }
    }
}

@Composable
fun BusinessCardText(name: String, title: String, modifier: Modifier = Modifier){
    val image = painterResource(R.drawable.background)
    Image(
        painter = image,
        contentDescription = null,
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .fillMaxSize()
    )
    Column (
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
            .padding(8.dp)
    ){
        Image(
            painter = painterResource(R.drawable.theresiaprofile),
            contentDescription = null,
            modifier = Modifier
                .size(180.dp)
                .clip(CircleShape)
                .padding(10.dp)
        )
        Text(
            text = name,
            fontSize = 20.sp,
            lineHeight = 100.sp,
            textAlign = TextAlign.Center,
            style = androidx.compose.ui.text.TextStyle(fontWeight = FontWeight.Bold)
        )
        Text(
            text = title,
            fontSize = 20.sp,
            modifier = Modifier
                .padding(7.dp)
                .align(alignment = Alignment.CenterHorizontally)
        )
    }
}

@Composable
fun BusinessContacts(email: String, telp: String, linkedin: String, modifier: Modifier = Modifier) {
    Column (
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Column(
            verticalArrangement = Arrangement.Bottom,
            modifier = modifier
                .padding(
                    bottom = 30.dp,
                    start = 30.dp
                )
        ) {
            Row(
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically
            ) {
                val image = painterResource(R.drawable.email_542638)
                Image(
                    painter = image,
                    contentDescription = null,
                    modifier = modifier
                        .padding(horizontal = 8.dp)
                        .height(20.dp)
                        .width(20.dp)
                )
                Text(
                    text = email,
                    fontSize = 20.sp,
                    lineHeight = 100.sp,
                    textAlign = TextAlign.Center,
                )
            }
            Row(
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically
            ) {
                val image = painterResource(R.drawable.telephone_159832)
                Image(
                    painter = image,
                    contentDescription = null,
                    modifier = modifier
                        .padding(horizontal = 8.dp)
                        .height(20.dp)
                        .width(20.dp)
                )
                Text(
                    text = telp,
                    fontSize = 20.sp,
                    modifier = Modifier
                        .padding(7.dp)
                )
            }
            Row(
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically
            ) {
                val image = painterResource(R.drawable.linkedin_1384014)
                Image(
                    painter = image,
                    contentDescription = null,
                    modifier = modifier
                        .padding(horizontal = 8.dp)
                        .height(20.dp)
                        .width(20.dp)
                )
                Text(
                    text = linkedin,
                    fontSize = 20.sp,
                    modifier = Modifier
                        .padding(7.dp)
                )
            }
        }
    }
}
