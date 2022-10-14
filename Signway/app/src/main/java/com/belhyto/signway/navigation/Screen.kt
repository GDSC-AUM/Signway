package com.belhyto.signway.navigation


    sealed class Screen(val route: String) {
        object Splash: Screen("splash_screen")
        object Home: Screen("home_screen")
        object Menu: Screen("menu_screen")
        object ASign1: Screen("A_sign_screen")
        object ASign2: Screen("B_sign_screen")
        object ASign3: Screen("C_sign_screen")
        object ASign4: Screen("D_sign_screen")
        object ASign5: Screen("E_sign_screen")
        object ASign6: Screen("F_sign_screen")
        object ASign7: Screen("G_sign_screen")
        object ASign8: Screen("H_sign_screen")
        object ASign9: Screen("I_sign_screen")
        object ASign10: Screen("J_sign_screen")
        object ASign11: Screen("K_sign_screen")
        object ASign12: Screen("L_sign_screen")
        object ASign13: Screen("M_sign_screen")
        object ASign14: Screen("N_sign_screen")
        object ASign15: Screen("O_sign_screen")
        object ASign16: Screen("P_sign_screen")
        object ASign17: Screen("Q_sign_screen")
        object ASign18: Screen("R_sign_screen")
        object ASign19: Screen("S_sign_screen")
        object ASign20: Screen("T_sign_screen")
        object ASign21: Screen("U_sign_screen")
        object ASign22: Screen("V_sign_screen")
        object ASign23: Screen("W_sign_screen")
        object ASign24: Screen("X_sign_screen")
        object ASign25: Screen("Y_sign_screen")
        object ASign26: Screen("Z_sign_screen")
        object WSign1: Screen("Hello_sign_screen")
        object WSign2: Screen("Goodbye_sign_screen")
        object WSign3: Screen("please_sign_screen")
        object WSign4: Screen("sorry_sign_screen")
        object WSign5: Screen("Yes_sign_screen")
        object WSign6: Screen("No_sign_screen")
        object PSign1: Screen("Thankyou_sign_screen")
        object PSign2: Screen("YoureWelcome_sign_screen")
        object PSign3: Screen("ily_sign_screen")





    }
