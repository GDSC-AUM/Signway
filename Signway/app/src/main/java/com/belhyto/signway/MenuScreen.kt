package com.belhyto.signway

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



@Composable
fun SignMenu(modifier: Modifier = Modifier, navController: NavHostController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        contentAlignment = Alignment.Center

    )
    {
        val context = LocalContext.current
        Column( horizontalAlignment = Alignment.CenterHorizontally,) {
            Text(
                text = "Start Learning Signs now!",
                color= MaterialTheme.colors.primary,
                style = MaterialTheme.typography.h2,
                modifier = Modifier.padding(40.dp),
                textAlign= TextAlign.Center,
                fontSize = 50.sp
            )
            Spacer(modifier = Modifier.height(20.dp))
            Button(
                onClick = { showToast(context, "Clicked on next") },
                modifier = Modifier
                    .width(width = 350.dp)
                    .height(height = 100.dp).clickable { navController.navigate(route = Screen.ASign1.route) },
                elevation = ButtonDefaults.elevation(10.dp),
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = MaterialTheme.colors.secondary,
                    contentColor = Color.White


                )
            ) {

                Image(
                    painter = painterResource(R.drawable.icon_sign),
                    contentDescription = "icons of options",

                    modifier = Modifier
                        .size(100.dp)
                        .clickable { navController.navigate(route = Screen.ASign1.route) },
                )
                Text(
                    text = " Alphabets",
                    modifier = Modifier.padding(5.dp).clickable { navController.navigate(route = Screen.ASign1.route) },
                    style = MaterialTheme.typography.h2,
                    fontSize = 35.sp

                )


            }
            Spacer(modifier = Modifier.height(20.dp))
            Button(
                onClick = { showToast(context, "Clicked on next") },
                modifier = Modifier
                    .width(width = 350.dp)
                    .height(height = 100.dp)
                .clickable { navController.navigate(route = Screen.WSign1.route) },
                elevation = ButtonDefaults.elevation(10.dp),
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = MaterialTheme.colors.secondary,
                    contentColor = Color.White

                )
            ) {

                Image(
                    painter = painterResource(R.drawable.icon_word),
                    contentDescription = "icons of options",

                    modifier = Modifier
                        .size(75.dp)
                        .clickable { navController.navigate(route = Screen.WSign1.route) },
                )
                Spacer(modifier = Modifier.width(35.dp))
                Text(
                    text = " Words",
                    modifier = Modifier.padding(5.dp).clickable { navController.navigate(route = Screen.WSign1.route) },
                    style = MaterialTheme.typography.h2,
                    fontSize = 35.sp,
                )


            }
            Spacer(modifier = Modifier.height(20.dp))
            Button(
                onClick = { showToast(context, "Clicked on next") },
                modifier = Modifier
                    .width(width = 350.dp)
                    .height(height = 100.dp).clickable { navController.navigate(route = Screen.PSign1.route) },

                elevation = ButtonDefaults.elevation(10.dp),
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = MaterialTheme.colors.secondary,
                    contentColor = Color.White,


                )
            ) {

                Image(
                    painter = painterResource(R.drawable.icon_phrase),
                    contentDescription = "icons of options",

                    modifier = Modifier
                        .size(100.dp)
                        .clickable { navController.navigate(route = Screen.PSign1.route) },
                )
                Spacer(modifier = Modifier.width(25.dp))
                Text(
                    text = "Phrases",
                    modifier = Modifier.padding(5.dp).clickable { navController.navigate(route = Screen.PSign1.route) },
                    style = MaterialTheme.typography.h2,
                    fontSize = 35.sp,
                )


            }
        }

    }
}

@Composable
@Preview
fun MenuPreview()
{
    SignMenu(
        navController = rememberNavController()
    )
}


