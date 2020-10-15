import static java.lang.Character.*;

public class MatrixWordFunctions  {
    
    
    
    public void returnCorrectCase(char letters []) {
        
        
        
        for (int i = 0; i <= letters.length; i++ ) {
            
             
            if (letters[i] >='A' && letters[i] <='Z') {
               
                letters[i] =  Character.toUpperCase(letters[i]);
            }
            
            else if (letters[i] >='a' && letters[i] <='z') {
                
                letters[i] = Character.toLowerCase(letters[i]);
                
            }
        }
        
        
        
        
    }
    
    
    public String determineWord(int wordLength ) {
        String word = "";
        
    String wordList[]  = new String[] {""};
                
     int inputLength = 0;
        
        for (int i = 0; i <= wordList.length; i++) {
            
            inputLength = wordList[i].determineWordlength;
            
            
             if (inputLength == wordLength) {
                 
               word = wordList[i];
               break;
                
        }
             else {
                 System.out.println("No words satisfy the conditions");
             }
        
        
        
        return  word;
        
        
    }
    
     
    
     
          
        
           
    
      




