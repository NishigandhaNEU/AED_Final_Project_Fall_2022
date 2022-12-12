/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface;

import java.awt.SplashScreen;

/**
 *
 * @author Nishigandha
 */
public class minnclass {
     public static void main(String[] args) {
        LandingPage landing = new LandingPage();
         splashscreen screen = new splashscreen();
        MainJFrame sign = new MainJFrame();
       // landing.setVisible(true);
        screen.setVisible(true);
  
        try {
            for (int row =0;row<=100;row++) {
                Thread.sleep(40);
                screen.btnLoadNo.setText(Integer.toString(row)+"%");
                screen.lblLoadingprogress.setValue(row);
                System.out.println(row);
                if (row == 100) {
                    
                    screen.setVisible(false);
                    landing.setVisible(true);
                }
            }
        } catch (Exception e) {
        }
    }

    
}
