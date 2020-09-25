import java.util.*;
        
public class Matrix {
    int matrixWidth = 0;
    int matrixHeight = 0;
    String word = "";
    int orientation = 0;
    int wordLength = 0;
   
    
    public Matrix(int x, int y, String word, int orientation, int wordLength) {
        this.matrixWidth = x;
        this.matrixHeight = y;
        this.word = word;
        this.orientation = orientation;
        this.wordLength = wordLength; 
    }
    
    public void determineWordLength(int wordLength, int wl[][]) {
        wl = new int [matrixWidth][matrixHeight];
           for ( int i = 0; i <= wl[matrixWidth].length; i++ ) {
              for ( int j = 1; j <= wl[matrixHeight].length; j++ ) {
                  wordLength =  Math.max(matrixWidth,matrixHeight);   
              }
            }
    }
        // Randomly determines the orientation of the word in the matrix
        // 1 = vertical, 0 = horizontal
        public void determineOrientation() {
            Random rng = new Random();
            orientation = rng.nextInt(2);
        }
        // Generates a matrix based on dimensions and populates each element with a random letter A-Z
        public String[][] generateMatrix() {
            Random rng2 = new Random();
            char letter = 'A';
            String[][] matrix = new String[matrixWidth][matrixHeight];
            for (int row = 0; row < matrix.length; row++) { // Loops through each element in the matrix
                for (int col = 0; col < matrix[row].length; col++) {
                    letter = (char)('A' + rng2.nextInt(26)); // Randomly generates a character between A and Z
                    matrix[row][col] = String.valueOf(letter); // Converts the character to String and assisgns it to each position in the matrix
                }
            }      
            // Prints matrix
            /* for (String[] row : matrix) {
                System.out.println(Arrays.toString(row));
            } */ 
            return matrix;
        }
        
    
            
}

