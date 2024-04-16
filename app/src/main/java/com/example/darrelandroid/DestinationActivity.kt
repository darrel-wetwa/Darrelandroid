package com.example.darrelandroid

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class DestinationActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Destination()

        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Destination(){
    Column(modifier = Modifier.fillMaxSize()){

        val mContext = LocalContext.current
        TopAppBar(
            title = { Text(text = "Destination", color = Color.White) },
            colors = TopAppBarDefaults.mediumTopAppBarColors(Color.Blue),
            navigationIcon = {
                IconButton(onClick = { mContext.startActivity(Intent(mContext,MainActivity::class.java)) }) {
                    Icon(imageVector = Icons.Default.ArrowBack,
                        contentDescription = "Arrowback",
                        tint = Color.White)

                }
            },
            actions = {
                IconButton(onClick = { /*TODO() */}) {
                    Icon(imageVector = Icons.Default.Share,
                        contentDescription = "share",
                        tint = Color.White)

                }

                IconButton(onClick = { /*TODO() */}) {
                    Icon(imageVector = Icons.Default.Settings,
                        contentDescription = "settings",
                        tint = Color.White)

                }

            }
        )
        //End of top app bar

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp),
            contentAlignment = Alignment.Center){

            Image(
                painter = painterResource(id = R.drawable.image1) ,
                contentDescription = "newyork",
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop
            )
            Text(
                text = "Lets plan your next vacation",
                fontSize = 30.sp,
                color = Color.White,
                fontWeight = FontWeight.ExtraBold,
                textAlign = TextAlign.Center
            )

        }
        //End of Box

        Spacer(modifier = Modifier.height(10.dp))

        var search by remember { mutableStateOf("") }

        OutlinedTextField(
            value = search,
            onValueChange = {search = it},
            placeholder = { Text(text = "What's your destination?")},
            leadingIcon = { Icon(imageVector = Icons.Default.Search, contentDescription = "search")},
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
        )
        //End of searchbar

        Spacer(modifier = Modifier.height(10.dp))


        Text(
            text = "Recently viewed destinations",
            fontSize = 20.sp,
            color = Color.Black,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(start = 30.dp)
        )

        Spacer(modifier = Modifier.height(10.dp))

       Row(
           modifier = Modifier.horizontalScroll(rememberScrollState())
       ){
           //CARD1
           Card(modifier = Modifier
               .width(200.dp)
               .height(200.dp)
           )
           {
               Column {
                   Box(modifier = Modifier
                       .fillMaxWidth()
                       .height(150.dp),
                       contentAlignment = Alignment.Center
                   ){
                       Image(
                           painter = painterResource(id = R.drawable.city5),
                           contentDescription = "newOrleans",
                           modifier = Modifier.fillMaxSize(),
                           contentScale = ContentScale.Crop)

                   }
                   Text(
                       text = "NewOrleans",
                       modifier = Modifier.fillMaxWidth(),
                       textAlign = TextAlign.Center,
                       fontSize = 20.sp)
               }

           }
           //END OF CARD
           Spacer(modifier = Modifier.width(8.dp))

           //CARD1
           Card(modifier = Modifier
               .width(200.dp)
               .height(200.dp)
           )
           {
               Column {
                   Box(modifier = Modifier
                       .fillMaxWidth()
                       .height(150.dp),
                       contentAlignment = Alignment.Center
                   ){
                       Image(
                           painter = painterResource(id = R.drawable.city1),
                           contentDescription = "NewYork",
                           modifier = Modifier.fillMaxSize(),
                           contentScale = ContentScale.Crop)

                   }
                   Text(
                       text = "NewYork",
                       modifier = Modifier.fillMaxWidth(),
                       textAlign = TextAlign.Center,
                       fontSize = 20.sp)
               }

           }
           //END OF CARD
           Spacer(modifier = Modifier.width(8.dp))

           //CARD1
           Card(modifier = Modifier
               .width(200.dp)
               .height(200.dp)
           )
           {
               Column {
                   Box(modifier = Modifier
                       .fillMaxWidth()
                       .height(150.dp),
                       contentAlignment = Alignment.Center
                   ){
                       Image(
                           painter = painterResource(id = R.drawable.city4),
                           contentDescription = "Illinois",
                           modifier = Modifier.fillMaxSize(),
                           contentScale = ContentScale.Crop)

                   }
                   Text(
                       text = "Illinois",
                       modifier = Modifier.fillMaxWidth(),
                       textAlign = TextAlign.Center,
                       fontSize = 20.sp)
               }

           }
           //END OF CARD
           Spacer(modifier = Modifier.width(8.dp))

           //CARD1
           Card(modifier = Modifier
               .width(200.dp)
               .height(200.dp)
           )
           {
               Column {
                   Box(modifier = Modifier
                       .fillMaxWidth()
                       .height(150.dp),
                       contentAlignment = Alignment.Center
                   ){
                       Image(
                           painter = painterResource(id = R.drawable.city3),
                           contentDescription = "Chicago",
                           modifier = Modifier.fillMaxSize(),
                           contentScale = ContentScale.Crop)

                   }
                   Text(
                       text = "Chicago",
                       modifier = Modifier.fillMaxWidth(),
                       textAlign = TextAlign.Center,
                       fontSize = 20.sp)
               }

           }
           //END OF CARD
           Spacer(modifier = Modifier.width(8.dp))

           //CARD1
           Card(modifier = Modifier
               .width(200.dp)
               .height(200.dp)
           )
           {
               Column {
                   Box(modifier = Modifier
                       .fillMaxWidth()
                       .height(150.dp),
                       contentAlignment = Alignment.Center
                   ){
                       Image(
                           painter = painterResource(id = R.drawable.city4),
                           contentDescription = "Denver",
                           modifier = Modifier.fillMaxSize(),
                           contentScale = ContentScale.Crop)

                   }
                   Text(
                       text = "Denver",
                       modifier = Modifier.fillMaxWidth(),
                       textAlign = TextAlign.Center,
                       fontSize = 20.sp)
               }

           }
           //END OF CARD
           Spacer(modifier = Modifier.width(8.dp))





       }

        Box(modifier = Modifier.fillMaxWidth(),
            contentAlignment = Alignment.Center
        )
        {
            Button(onClick = {
                mContext.startActivity(Intent(mContext,WoofActivity::class.java))
            }) {
                Text(text = "Woof")
            }
        }

        Box(modifier = Modifier.fillMaxWidth(),
            contentAlignment = Alignment.Center
        )
        {
            Button(onClick = {
                mContext.startActivity(Intent(mContext,LottieActivity::class.java))
            }) {
                Text(text = "Lottie")
            }
        }






    }

}

@Preview(showBackground = true)
@Composable
fun DestinationPreview(){
    Destination()
}