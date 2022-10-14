package com.belhyto.signway.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.belhyto.signway.*
import com.belhyto.signway.PhraseScreens.displayP1Sign
import com.belhyto.signway.PhraseScreens.displayP2Sign
import com.belhyto.signway.PhraseScreens.displayP3Sign
import com.belhyto.signway.ui.theme.*


@Composable
fun SetupNavGraph(navController: NavHostController)
{
    NavHost(navController = navController,
        startDestination = Screen.Splash.route )
    {
        composable(route = Screen.Splash.route)
        {
            SignSplash(navController=navController)
        }
        composable(route= Screen.Home.route)
        {
           SignWelcome(navController=navController)
        }
        composable(route= Screen.Menu.route)
        {
            SignMenu(navController=navController)
        }
        composable(route= Screen.ASign1.route)
        {
            displayASign(navController=navController)
        }
        composable(route= Screen.ASign2.route)
        {
            displayBSign(navController=navController)
        }
        composable(route= Screen.ASign3.route)
        {
            displayCSign(navController=navController)
        }
        composable(route= Screen.ASign4.route)
        {
            displayDSign(navController=navController)
        }
        composable(route= Screen.ASign5.route)
        {
            displayESign(navController=navController)
        }
        composable(route= Screen.ASign6.route)
        {
            displayFSign(navController=navController)
        }
        composable(route= Screen.ASign7.route)
        {
            displayGSign(navController=navController)
        }
        composable(route= Screen.ASign8.route)
        {
            displayHSign(navController=navController)
        }
        composable(route= Screen.ASign9.route)
        {
            displayISign(navController=navController)
        }
        composable(route= Screen.ASign10.route)
        {
            displayJSign(navController=navController)
        }
        composable(route= Screen.ASign11.route)
        {
            displayKSign(navController=navController)
        }
        composable(route= Screen.ASign12.route)
        {
            displayLSign(navController=navController)
        }
        composable(route= Screen.ASign13.route)
        {
            displayMSign(navController=navController)
        }
        composable(route= Screen.ASign14.route)
        {
            displayNSign(navController=navController)
        }
        composable(route= Screen.ASign15.route)
        {
            displayOSign(navController=navController)
        }
        composable(route= Screen.ASign16.route)
        {
            displayPSign(navController=navController)
        }
        composable(route= Screen.ASign17.route)
        {
            displayQSign(navController=navController)
        }
        composable(route= Screen.ASign18.route)
        {
            displayRSign(navController=navController)
        }
        composable(route= Screen.ASign19.route)
        {
            displaySSign(navController=navController)
        }
        composable(route= Screen.ASign20.route)
        {
            displayTSign(navController=navController)
        }
        composable(route= Screen.ASign21.route)
        {
            displayUSign(navController=navController)
        }
        composable(route= Screen.ASign22.route)
        {
            displayVSign(navController=navController)
        }
        composable(route= Screen.ASign23.route)
        {
            displayWSign(navController=navController)
        }
        composable(route= Screen.ASign24.route)
        {
            displayXSign(navController=navController)
        }
        composable(route= Screen.ASign25.route)
        {
            displayYSign(navController=navController)
        }
        composable(route= Screen.ASign26.route)
        {
            displayZSign(navController=navController)
        }
        composable(route= Screen.WSign1.route)
        {
            displayW1Sign(navController=navController)
        }

        composable(route= Screen.WSign2.route)
        {
            displayW2Sign(navController=navController)
        }
        composable(route= Screen.WSign3.route)
        {
            displayW3Sign(navController=navController)
        }
        composable(route= Screen.WSign4.route)
        {
            displayW4Sign(navController=navController)
        }
        composable(route= Screen.WSign5.route)
        {
            displayW5Sign(navController=navController)
        }
        composable(route= Screen.WSign6.route)
        {
            displayW6Sign(navController=navController)
        }
        composable(route= Screen.PSign1.route)
        {
            displayP1Sign(navController=navController)
        }
        composable(route= Screen.PSign2.route)
        {
            displayP2Sign(navController=navController)
        }
        composable(route= Screen.PSign3.route)
        {
            displayP3Sign(navController=navController)
        }
    }
}