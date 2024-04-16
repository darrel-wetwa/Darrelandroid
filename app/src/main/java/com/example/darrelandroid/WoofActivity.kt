package com.example.darrelandroid

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class WoofActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Woof()
        }
    }
}

@Composable
fun Woof(){
   Column  (
       modifier = Modifier.fillMaxSize()
){
       //heading
       Box (contentAlignment = Alignment.Center,
           modifier = Modifier.fillMaxWidth()){
           Row {

               Image(
                   painter = painterResource(id = R.drawable.woof),
                   contentDescription = "woof",
                   modifier = Modifier.size(60.dp))

               Text(
                   text = "Woof",
                   fontSize = 50.sp,
                   fontWeight = FontWeight.ExtraBold,
                   textAlign = TextAlign.Center
               )

           }
       }
       //end of heading

       //CARD1
       Box (contentAlignment = Alignment.Center,
           modifier = Modifier.fillMaxWidth()){
           Row {

              Card (modifier = Modifier.fillMaxWidth()){
                 Row {
                     Image(
                         painter = painterResource(id = R.drawable.koda),
                         contentDescription = "register",
                         modifier = Modifier
                             .size(60.dp)
                             .clip(shape = CircleShape),
                         contentScale = ContentScale.Crop
                     )
                     Spacer(modifier = Modifier.width(15.dp))

                     Column {
                         Text(
                             text = "Koda",
                             fontSize = 30.sp,
                             fontWeight = FontWeight.ExtraBold,
                             textAlign = TextAlign.Center
                         )
                         Text(
                             text = "2 years old",
                             fontSize = 20.sp,
                             textAlign = TextAlign.Center
                         )
                     }
                 }
              }

           }
       }
       //END OF CARD1
       Spacer(modifier = Modifier.height(20.dp))

       //CARD2
       Box (contentAlignment = Alignment.Center,
           modifier = Modifier.fillMaxWidth()){
           Row {

               Card (modifier = Modifier.fillMaxWidth()){
                   Row {
                       Image(
                           painter = painterResource(id = R.drawable.lola),
                           contentDescription = "register",
                           modifier = Modifier
                               .size(60.dp)
                               .clip(shape = CircleShape),
                           contentScale = ContentScale.Crop
                       )
                       Spacer(modifier = Modifier.width(15.dp))

                       Column {
                           Text(
                               text = "Lola",
                               fontSize = 30.sp,
                               fontWeight = FontWeight.ExtraBold,
                               textAlign = TextAlign.Center
                           )
                           Text(
                               text = "16 years old",
                               fontSize = 20.sp,
                               textAlign = TextAlign.Center
                           )
                       }
                   }
               }

           }
       }
       //END OF CARD2
       Spacer(modifier = Modifier.height(20.dp))

       //CARD3
       Box (contentAlignment = Alignment.Center,
           modifier = Modifier.fillMaxWidth()){
           Row {

               Card (modifier = Modifier.fillMaxWidth()){
                   Row {
                       Image(
                           painter = painterResource(id = R.drawable.frankie),
                           contentDescription = "register",
                           modifier = Modifier
                               .size(60.dp)
                               .clip(shape = CircleShape),
                           contentScale = ContentScale.Crop
                       )
                       Spacer(modifier = Modifier.width(15.dp))

                       Column {
                           Text(
                               text = "Frankie",
                               fontSize = 30.sp,
                               fontWeight = FontWeight.ExtraBold,
                               textAlign = TextAlign.Center
                           )
                           Text(
                               text = "2 years old",
                               fontSize = 20.sp,
                               textAlign = TextAlign.Center
                           )
                       }
                   }
               }

           }
       }
       //END OF CARD3
       Spacer(modifier = Modifier.height(20.dp))


       //CARD4
       Box (contentAlignment = Alignment.Center,
           modifier = Modifier.fillMaxWidth()){
           Row {

               Card (modifier = Modifier.fillMaxWidth()){
                   Row {
                       Image(
                           painter = painterResource(id = R.drawable.nox),
                           contentDescription = "register",
                           modifier = Modifier
                               .size(60.dp)
                               .clip(shape = CircleShape),
                           contentScale = ContentScale.Crop
                       )
                       Spacer(modifier = Modifier.width(15.dp))

                       Column {
                           Text(
                               text = "Nox",
                               fontSize = 30.sp,
                               fontWeight = FontWeight.ExtraBold,
                               textAlign = TextAlign.Center
                           )
                           Text(
                               text = "8 years old",
                               fontSize = 20.sp,
                               textAlign = TextAlign.Center
                           )
                       }
                   }
               }

           }
       }
       //END OF CARD4
       Spacer(modifier = Modifier.height(20.dp))

       //CARD5
       Box (contentAlignment = Alignment.Center,
           modifier = Modifier.fillMaxWidth()){
           Row {

               Card (modifier = Modifier.fillMaxWidth()){
                   Row {
                       Image(
                           painter = painterResource(id = R.drawable.faye),
                           contentDescription = "register",
                           modifier = Modifier
                               .size(60.dp)
                               .clip(shape = CircleShape),
                           contentScale = ContentScale.Crop
                       )
                       Spacer(modifier = Modifier.width(15.dp))

                       Column {
                           Text(
                               text = "Faye",
                               fontSize = 30.sp,
                               fontWeight = FontWeight.ExtraBold,
                               textAlign = TextAlign.Center
                           )
                           Text(
                               text = "8 years old",
                               fontSize = 20.sp,
                               textAlign = TextAlign.Center
                           )
                       }
                   }
               }

           }
       }
       //END OF CARD5
       Spacer(modifier = Modifier.height(20.dp))

       //CARD6
       Box (contentAlignment = Alignment.Center,
           modifier = Modifier.fillMaxWidth()){
           Row {

               Card (modifier = Modifier.fillMaxWidth()){
                   Row {
                       Image(
                           painter = painterResource(id = R.drawable.bella),
                           contentDescription = "register",
                           modifier = Modifier
                               .size(60.dp)
                               .clip(shape = CircleShape),
                           contentScale = ContentScale.Crop
                       )
                       Spacer(modifier = Modifier.width(15.dp))

                       Column {
                           Text(
                               text = "Bella",
                               fontSize = 30.sp,
                               fontWeight = FontWeight.ExtraBold,
                               textAlign = TextAlign.Center
                           )
                           Text(
                               text = "14 years old",
                               fontSize = 20.sp,
                               textAlign = TextAlign.Center
                           )
                       }
                   }
               }

           }
       }
       //END OF CARD6
       Spacer(modifier = Modifier.height(20.dp))

       //CARD7
       Box (contentAlignment = Alignment.Center,
           modifier = Modifier.fillMaxWidth()){
           Row {

               Card (modifier = Modifier.fillMaxWidth()){
                   Row {
                       Image(
                           painter = painterResource(id = R.drawable.moana),
                           contentDescription = "register",
                           modifier = Modifier
                               .size(60.dp)
                               .clip(shape = CircleShape),
                           contentScale = ContentScale.Crop
                       )
                       Spacer(modifier = Modifier.width(15.dp))

                       Column {
                           Text(
                               text = "Moana",
                               fontSize = 30.sp,
                               fontWeight = FontWeight.ExtraBold,
                               textAlign = TextAlign.Center
                           )
                           Text(
                               text = "2 years old",
                               fontSize = 20.sp,
                               textAlign = TextAlign.Center
                           )
                       }
                   }
               }

           }
       }
       //END OF CARD7
       Spacer(modifier = Modifier.height(20.dp))

       //CARD8
       Box (contentAlignment = Alignment.Center,
           modifier = Modifier.fillMaxWidth()){
           Row {

               Card (modifier = Modifier.fillMaxWidth()){
                   Row {
                       Image(
                           painter = painterResource(id = R.drawable.tel),
                           contentDescription = "register",
                           modifier = Modifier
                               .size(60.dp)
                               .clip(shape = CircleShape),
                           contentScale = ContentScale.Crop
                       )
                       Spacer(modifier = Modifier.width(15.dp))

                       Column {
                           Text(
                               text = "Tzeitel",
                               fontSize = 30.sp,
                               fontWeight = FontWeight.ExtraBold,
                               textAlign = TextAlign.Center
                           )
                           Text(
                               text = "7 years old",
                               fontSize = 20.sp,
                               textAlign = TextAlign.Center
                           )
                       }
                   }
               }

           }
       }
       //END OF CARD7
       Spacer(modifier = Modifier.height(20.dp))






   }

}

@Preview(showBackground = true)
@Composable
fun WoofPreview(){
    Woof()

}