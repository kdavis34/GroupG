//package unkown;
import java.util.Timer;
import java.util.Random;/**
 * 
 * @author jayas
 */
public class Level {
	//class variables
	int level;		//this # is the level's difficulty (or is it unique ID?)
	int matWidth; 	//this is the x-value for the matrix
	int matHeight;	//this is the y-value for the matrix
	
	Timer timer = new Timer();	//this is the variable/object for the timer for each level
	/**
         * constructor 
         * initialize the values
         */
	public Level() {
                level = 0;
		//calls method to determine size
		determineMatrixSize(level);
		
		//creates matrix array using variables matWidth & matHeight
		String[][] mArry = new String[matWidth][matHeight];
	}
	
        /**
         * matrix allocation size based on level
         * @param level current level
         * @return array of integer
         */
	public void determineMatrixSize (int level) {
		
		if (level == 1) {
			//use RNG to generate matrix size from 1x1 to 4x4
			matWidth = (int)(Math.random() * ((4-1)+1)) + 1;		//matWidth
			matHeight = matWidth;								//matHeight
		}
		else if (level == 2) {
			//use RNG to generate matrix size from 5x5 to 8x8
			matWidth = (int)(Math.random() * ((8-5)+1)) + 5;		//matWidth
			matHeight = matWidth;								//matHeight
		}
		else if (level == 3) {
			//use RNG to generate matrix size from 9x9 to 12x12
			matWidth = (int)(Math.random() * ((12-9)+1)) + 9;		//matWidth
			matHeight = matWidth;								//matHeight
		}
	}
        /**
         * increase level by one
         * @return current level
         */
        public int increaseLevel() {
            //Level Increased
            level++;
            return level;
        }

        /**
         * Game Duration play
         * @return duration time in seconds
         */
        public int determineTimerDuration() {
            int totalDuration=1200;   //Default duration of the Game
            int durationLevel = 5; // Duration level 5 seconds
            return totalDuration - (level*durationLevel);
        }
}
