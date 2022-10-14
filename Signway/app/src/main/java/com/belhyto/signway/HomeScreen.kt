package com.belhyto.signway

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.belhyto.signway.navigation.Screen

fun showToast(context: Context, message: String)
{
    Toast.makeText(context,message, Toast.LENGTH_SHORT).show()
}
@Composable
fun SignWelcome(navController: NavHostController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        contentAlignment = Alignment.Center

    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Image(
                painter = painterResource(id = R.drawable.logo),
                contentDescription = "logo ",
                modifier = Modifier.size(300.dp)
                   )
           Spacer(modifier = Modifier.height(20.dp))
            Text(
                text = "Welcome to SignWay!",
                color = Color(0xff00b1a7),
                textAlign = TextAlign.Center,
                style = MaterialTheme.typography.h2,
                fontSize = 50.sp
                )

            Spacer(modifier = Modifier.height(100.dp))

            val context = LocalContext.current

            Button(
                onClick = { showToast(context, "Clicked on next") },
                modifier = Modifier
                    //.align(Alignment.Center)
                    .width(width = 200.dp)
                    .height(85.dp),

                elevation = ButtonDefaults.elevation(10.dp),
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = MaterialTheme.colors.secondary,
                    contentColor = Color.White

                )
            )
            {
                Text(
                    text = "Next",
                    style = MaterialTheme.typography.h2,
                    fontSize = 50.sp,
                    modifier = Modifier.clickable { navController.navigate(Screen.Menu.route) },
                )

            }


        }

    }
}
@Composable
@Preview
fun HomePreview()
{
    SignWelcome(
        navController = rememberNavController()
    )
}
