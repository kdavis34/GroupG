/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class Matrix {
    
    int matrixWidth;
    int matrixHeight;
    String word;
    int orientation ;
    int wordLength;
    
    
    public Matrix( int x , int y , String w, int o , int wLength) {

        this.matrixWidth = x;
        this.matrixHeight = y;
        this.word = w;
        this.orientation = o;
        this.wordLength = wLength; 

}
    
    public int determineWordLength(int x, int y, int wordLength , int wl[][]) {
        
     
        wl = new int [x][y];
        
        
           for ( int i = 0; i <= wl[x].length; i++ ) {
              
              for ( int j = 1; j <= wl[y].length; j++ ) {
                  
                  wordLength =  Math.max(x,y); 
                  
              }
          }
        
           
    
        return wordLength;

}


    
            
}
