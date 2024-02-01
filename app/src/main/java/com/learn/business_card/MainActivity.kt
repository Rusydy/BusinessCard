package com.learn.business_card

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Phone
import androidx.compose.material.icons.rounded.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.learn.business_card.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardTheme {
                Surface(
                    color = Color.Green,
                ) {
                    BusinessCard(
                        name = "John Smith",
                        jobTitle = "Android Developer",
                    )
                }
            }
        }
    }
}

val fontColour = Color.hsl(150f, 0.96f, 0.20f)
val backgroundColour = Color.hsl(120f, 0.33f, 0.85f)

@Composable
fun BusinessCard(
    name : String,
    jobTitle : String,
) {

    val image = painterResource(R.drawable.android_logo)

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = image,
            contentDescription = "Android Logo",
            modifier = Modifier
                .height(150.dp)
                .fillMaxHeight()
                .background(Color.DarkGray)
        )

        Column(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ){
            Text(
                text = name,
                style = MaterialTheme.typography.titleLarge,
                fontSize = 48.sp,
                color = Color.Black,
                textAlign = TextAlign.Center,
            )

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = jobTitle,
                style = MaterialTheme.typography.titleMedium,
                fontSize = 18.sp,
                color = fontColour,
                textAlign = TextAlign.Center,
            )
        }
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(80.dp, 0.dp, 80.dp, 50.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Bottom,
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.Start,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                Icons.Rounded.Phone,
                contentDescription = "Phone Icon",
            )

            Spacer(modifier = Modifier.width(18.dp))

            Text(
                text = "+1 234 567 8901",
                style = MaterialTheme.typography.bodyMedium,
                fontSize = 18.sp,
                color = fontColour,
                textAlign = TextAlign.Center,
            )
        }

        Spacer(modifier = Modifier.height(18.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.Start,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                Icons.Rounded.Share,
                contentDescription = "Share Icon",
            )

            Spacer(modifier = Modifier.width(18.dp))

            Text(
                text = "@JohnSmith",
                style = MaterialTheme.typography.bodyMedium,
                fontSize = 18.sp,
                color = fontColour,
                textAlign = TextAlign.Center,
            )
        }

        Spacer(modifier = Modifier.height(18.dp))

        Row (
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.Start,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                Icons.Rounded.Email,
                contentDescription = "Email Icon",
            )

            Spacer(modifier = Modifier.width(18.dp))

            Text(
                text = "john.smith@android.com",
                style = MaterialTheme.typography.bodyMedium,
                fontSize = 18.sp,
                color = fontColour,
                textAlign = TextAlign.Center,
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BusinessCardTheme {
        Surface (
            color = backgroundColour
        ){
            BusinessCard(
                name = "John Smith",
                jobTitle = "Android Developer",
            )
        }
    }
}