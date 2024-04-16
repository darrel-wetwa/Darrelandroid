package com.example.darrelandroid

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Demo()

        }
    }
}

@Composable
fun Demo(){

    Column(modifier = Modifier.fillMaxSize()){
        val mContext = LocalContext.current




        Text(
            text = "Welcome to android",
            color = Color.Red,
            fontSize = 30.sp,
            fontStyle = FontStyle.Italic,
            fontWeight = FontWeight.Bold)

        Text(
            text = "Content providers let you centralize content in one place and have many different applications access it as needed. A content provider behaves very much like a database where you can query it, edit its content, as well as add or delete content using insert(), update(), delete(), and query() methods.")
        
        Spacer(modifier = Modifier.height(20.dp))

        Text(text = "Types of cars",
            fontSize = 20.sp,
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Red)
                .height(40.dp)
                ,
            textAlign = TextAlign.Center,
            textDecoration = TextDecoration.Underline,
            color = Color.White,
            fontWeight = FontWeight.Bold
        )
        Text(text = "1.BMW")
        Text(text = "2.Mercedes Benz")
        Text(text = "3.Ferrari")
        Text(text = "4.Rolls Royce")
        Text(text = "5.Bugatti")

        Box(modifier = Modifier.fillMaxWidth(),
            contentAlignment = Alignment.Center
        )
        {
            Button(onClick = {
                mContext.startActivity(Intent(mContext,DestinationActivity::class.java))
            }) {
              Text(text = "Destination")
            }
        }

        Text(text = "How to sleep without closing your eyes",
            fontSize = 20.sp,
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Blue)
                .height(40.dp)
            ,
            textAlign = TextAlign.Center,
            textDecoration = TextDecoration.Underline,
            color = Color.White,
            fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(10.dp))

        Button(
            onClick = {
                      mContext.startActivity(Intent(mContext,LayoutActivity::class.java))
            },
            shape = RoundedCornerShape(5.dp),
            colors = ButtonDefaults.buttonColors(Color.Red),
            modifier = Modifier
                .fillMaxWidth()
                .padding()
        ) {
            Text(text = "Continue")
        }

        Text(text = "1.Relax Yourself. Pick the most secluded spot for yourself, ruling out the chances of being disturbed while sleeping.")
        Text(text = "2.Breathe Slow.")
        Text(text = "3.Focus on Something. ")
        Text(text = "4.Let Your Thoughts Flow.")
        Text(text = "5.Nocturnal Ophthalmologist.")
        Text(text = "6.Injured Facial Nerves.")

        Spacer(modifier = Modifier.height(20.dp))

        Divider()

        Spacer(modifier = Modifier.height(20.dp))

        Box(modifier = Modifier.fillMaxWidth(),
            contentAlignment = Alignment.Center){

            Image(painter = painterResource(id = R.drawable.dog2),
                contentDescription = "dog2",
                modifier = Modifier
                    .size(200.dp)
                    .clip(shape = CircleShape),
                contentScale = ContentScale.Crop)

        }


    }

}

@Preview(showBackground = true)
@Composable
fun DemoPreview(){
    Demo()

}
