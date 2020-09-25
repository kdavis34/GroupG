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
	int counter = 0;	//this is the counter for the amount of games the player has completed
				//while not used now, will be used to calculate score later
	
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
	public int[][] determineMatrixSize (int level) {
		
		int starting = 5;							//starting matrix size for level 1
		matWidth = starting;
		matHeight = starting;
		int[][] matPuz = new int[matWidth][matHeight];
		
		if (level > 1) {							//if the player has completed a game, the matrix will be larger than was previously
			matWidth++;							//as level increases, matrix size increases the same amount
			matHeight++;	
		}
		
		return matPuz[matWidth][matHeight];
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
            int totalDuration=30;   //Default duration of the Game
            int durationLevel = 5; // Duration level 5 seconds
            return totalDuration - (level*durationLevel);
        }
}
