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
		
		//with double foreach, adds word string in matrix
		for (String letter : mArry) {
			for (String let : letter) {
				//let = String;
			}
		}
		
		//perhaps for above this could be its own method called createMatrix?
		
		//calls on function that notes where words share letters
			//aka determines on what letter the words cross
		
		//calls on GUI to display img
	}
	
        /**
         * matrix allocation size based on level
         * @param level current level
         * @return array of integer
         */
	public int[] determineMatrixSize (int level) {
		int matVals[] = new int[2];									//array to store x and y of matrix size
		
		if (level == 1) {
			//use RNG to generate matrix size from 1x1 to 4x4
			matVals[0] = (int)(Math.random() * ((4-1)+1)) + 1;		//matWidth
			matVals[1] = matVals[0];								//matHeight
		}
		else if (level == 2) {
			//use RNG to generate matrix size from 5x5 to 8x8
			matVals[0] = (int)(Math.random() * ((8-5)+1)) + 5;		//matWidth
			matVals[1] = matVals[0];								//matHeight
		}
		else if (level == 3) {
			//use RNG to generate matrix size from 9x9 to 12x12
			matVals[0] = (int)(Math.random() * ((12-9)+1)) + 9;		//matWidth
			matVals[1] = matVals[0];								//matHeight
		}
		
		return matVals;												//return array of width and height values
		
		//maybe returns nothing and instead edits values of matWidth & matHeight?
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

public class WordMatrix {
    
 public static void main(String args[]) {
     
 }   
}