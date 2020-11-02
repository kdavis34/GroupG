import java.util.Timer;
import java.util.Random;/**
 * 
 * @author jayas
 */
public class Level {
	//class variables
	int level;              //this # is the level's difficulty (or is it unique ID?)
	int matWidth;           //this is the x-value for the matrix
	int matHeight;          //this is the y-value for the matrix
	int counter = 0;	//this is the counter for the amount of games the player has completed
	String word;		//while not used now, will be used to calculate score later
        String playerName="";
        int highestLevel=0;
	public Level() {
            level = 0;	
	}
	//i can hear you
        /**
         * matrix allocation size based on level
         * @param level current level
         * @return array of integer
         */
	public void determineMatrixSize () {
            int starting = 4; //starting matrix size for level 0
            starting = starting + this.level; // adds the level to the starting array due to it scaling linearly. 
            matWidth = starting;
            matHeight = starting;
	}
        
        public void createMatrix() {
            Matrix matrix = new Matrix(matWidth);
            matrix.generateMatrix();
            word = matrix.getWord();
        }
        // Returns word in matrix 
        public String retrieveWord() {
            return word;
        }
        
        /**
         * increase level by one
         * @return current level
         */
        public void increaseLevel() {
            //Level Increased
            level++;
        }
        
        // Returns current level
        public int getLevel(){
            return level;
        }
        /**
         * Assign Player Name
         * @param name 
         */
        public void setPlayerName(String name){
            this.playerName=name;
        }
        /**
         * Set Highest Level
         */
        public void setHighestLevel(){
            if(highestLevel<level){
                highestLevel = level;
            }
        }
        /**
         * Get Highest Level
         * @return 
         */
        public int getHighestLevel(){
            return this.highestLevel;
        }
        public void resetLevel(){
            level=0;
        }
}