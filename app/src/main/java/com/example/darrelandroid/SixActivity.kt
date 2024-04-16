package com.example.darrelandroid

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
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
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class SixActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Six()
        }
    }
}

@Composable
fun Six(){
    Column (
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        val mContext = LocalContext.current

        Spacer(modifier = Modifier.height(80.dp))

        Image(
            painter = painterResource(id = R.drawable.fashion2),
            contentDescription = "fash",
            modifier = Modifier
                .size(250.dp)
                .clip(shape = CircleShape),
            contentScale = ContentScale.Crop
        )
        Spacer(modifier = Modifier.height(60.dp))

        Text(text = "Add to Your Cart",
            fontSize = 30.sp,
            fontFamily = FontFamily.Cursive,
            modifier = Modifier
                .fillMaxWidth()
                .height(40.dp)
            ,
            textAlign = TextAlign.Center,
            color = Color.Black,
            fontWeight = FontWeight.ExtraBold)

        Spacer(modifier = Modifier.height(50.dp))

        Text(text = "Certainly! Here's a succinct description for a men's shirt Classic button-down shirt in breathable cotton, perfect for work or casual outings.",
            fontSize = 20.sp,
            fontFamily = FontFamily.SansSerif,
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 10.dp, end = 10.dp)
            ,
            textAlign = TextAlign.Center,
            color = Color.Black)

        Spacer(modifier = Modifier.height(5.dp))

        Image(
            painter = painterResource(id = R.drawable.dot1),
            contentDescription = "dot1",
            modifier = Modifier
                .size(70.dp)
        )

        Spacer(modifier = Modifier.height(5.dp))

        Box(modifier = Modifier.fillMaxWidth(),
            contentAlignment = Alignment.Center
        )
        {
            Button(onClick = {
                mContext.startActivity(Intent(mContext,SevenActivity::class.java))
            },
                shape = RoundedCornerShape(20.dp),
                colors = ButtonDefaults.buttonColors(Color.Red),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 30.dp, end = 30.dp)
            ) {
                Text(text = "Next")
            }
        }








    }





















}

@Preview(showBackground = true)
@Composable
fun SixPreview(){
    Six()
}