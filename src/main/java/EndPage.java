package com.groupg.wordmatrix;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Logger;

/**
 *
 * @author jayas
 */
public class EndPage {

    Timer timer;
    Level level;

    public EndPage(int seconds, Level levelinfo) {
        timer = new Timer();
        level = levelinfo;
        timer.schedule(new RemainTask(), seconds * 1000);
    }

    class RemainTask extends TimerTask {

        public void run() {

            System.out.println("Your Highest Score" + level.highestScore);
            BufferedReader reader
                    = new BufferedReader(new InputStreamReader(System.in));

            // Reading data using readLine 
            String name;
            try {
                name = reader.readLine();
                if (name.equalsIgnoreCase(".")) {
                    System.exit(1);
                } else if (name.equalsIgnoreCase( " ")) {
                    WordMatrix.startprogram();
                }
            } catch (IOException ex) {
                Logger.getLogger(EndPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }

            timer.cancel(); //Terminate the timer thread

        }
    }

}
