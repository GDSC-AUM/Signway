package com.belhyto.signway.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.material.Text
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.belhyto.signway.R
import com.belhyto.signway.navigation.Screen
import com.belhyto.signway.showToast


@Composable
fun displayBSign(navController: NavHostController)
{
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        contentAlignment = Alignment.Center

    ) {Image(
        painter = painterResource(R.drawable.icon_x),
        contentDescription = "icons of options",
        modifier = Modifier.size(70.dp).align(Alignment.TopEnd)
            .clickable { navController.navigate(route = Screen.Menu.route) },
    )
        Column(horizontalAlignment = Alignment.CenterHorizontally,modifier = Modifier,
        ) {

            Image(
                painter = painterResource(R.drawable.a_b),
                contentDescription = "icons of options",
                modifier = Modifier.size(500.dp),
            )
            Spacer(modifier = Modifier.height(0.dp))
            Text(
                text = " B",
                color = MaterialTheme.colors.primary,
                style = MaterialTheme.typography.h2,
                fontSize = 50.sp,
                textAlign= TextAlign.Center,
               // modifier = Modifier.clickable { navController.navigate(route = Screen.Menu.route) },
            )
            Spacer(modifier = Modifier.height(80.dp))
            Row() {
                val context = LocalContext.current
                Button(
                    onClick = { showToast(context, "Clicked on back") },
                    modifier = Modifier
                        .width(width = 150.dp)
                        .height(70.dp)
                    .clickable { navController.navigate(route = Screen.ASign1.route) },
                    elevation = ButtonDefaults.elevation(10.dp),
                    colors = ButtonDefaults.buttonColors(
                        backgroundColor = MaterialTheme.colors.secondary,
                        contentColor = Color.White
                    )
                )
                {
                    Text(
                        text = "Back",
                        style = MaterialTheme.typography.h2,
                        fontSize = 35.sp,
                        modifier = Modifier.clickable { navController.navigate(Screen.ASign1.route) },
                    )
                }
                Spacer(modifier = Modifier.width(100.dp))
                Button(
                    onClick = { showToast(context, "Clicked on next") },
                    modifier = Modifier
                        .width(width = 150.dp)
                        .height(70.dp)
                    .clickable { navController.navigate(route = Screen.ASign3.route) },
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
                        fontSize = 35.sp,
                        modifier = Modifier.clickable { navController.navigate(Screen.ASign3.route) },
                    )

                }
            }
        }

    }
}
@Composable
@Preview
fun previewSign2()
{
    displayBSign( navController = rememberNavController())
}