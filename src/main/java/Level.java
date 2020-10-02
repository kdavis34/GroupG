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
		determineMatrixSize();
		
	}
	
        /**
         * matrix allocation size based on level
         * @param level current level
         * @return array of integer
         */
	public int determineMatrixSize () {
		
		int starting = 4; //starting matrix size for level 0
                starting = starting + this.level; // adds the level to the starting array due to it scaling linearly. 
		matWidth = starting;
		matHeight = starting;
		return matWidth;
                
	}
        /**
         * increase level by one
         * @return current level
         */
        public void increaseLevel() {
            //Level Increased
            level++;
        }
        
        public int getLevel(){
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