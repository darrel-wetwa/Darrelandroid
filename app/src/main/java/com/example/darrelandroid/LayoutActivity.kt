package com.example.darrelandroid

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class LayoutActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Layout()

        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Layout(){
    Column(modifier = Modifier.fillMaxSize()){

        val mContext = LocalContext.current
        
        
        

        //TopAppBar
        TopAppBar(
            title = { Text(text = "Home", color = Color.White) },
            colors = TopAppBarDefaults.mediumTopAppBarColors(Color.Red),
            navigationIcon = {
                IconButton(onClick = { mContext.startActivity(Intent(mContext,MainActivity::class.java)) },) {
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
        //End of TopAppBar
        Spacer(modifier = Modifier)
        Text(text = "BREEDS OF DOGS",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center
        )

        Row {

            Image(
                painter = painterResource(id = R.drawable.car1),
                contentDescription = "car1",
                modifier = Modifier.size(width = 200.dp, height = 100.dp)
            )
            Column {
                Text(text = "Volvo", fontWeight = FontWeight.Bold, fontSize = 18.sp)
                Text(text = "A car is a vehicle that has wheels, carries a small number of passengers, and is moved by an engine or a motor. Cars are also called automobiles or motor vehicles. Trucks and buses are motor vehicles as well. However, trucks and buses are larger than cars, and they carry heavier loads.")

            }

        }
        Row {

            Image(
                painter = painterResource(id = R.drawable.car1),
                contentDescription = "car1",
                modifier = Modifier.size(width = 200.dp, height = 100.dp)
            )
            Column {
                Text(text = "Volvo", fontWeight = FontWeight.Bold, fontSize = 18.sp)
                Text(text = "A car is a vehicle that has wheels, carries a small number of passengers, and is moved by an engine or a motor. Cars are also called automobiles or motor vehicles. Trucks and buses are motor vehicles as well. However, trucks and buses are larger than cars, and they carry heavier loads.")

            }

        }
        Button(
            onClick = {
                mContext.startActivity(Intent(mContext,IntentActivity::class.java))
            },
            shape = RoundedCornerShape(5.dp),
            colors = ButtonDefaults.buttonColors(Color.Green),
            modifier = Modifier
                .fillMaxWidth()
                .padding()
        ) {
            Text(text = "About")
        }
    }

}
@Preview(showBackground = true)
@Composable
fun LayoutPreview(){
    Layout()

}