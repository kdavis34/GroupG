import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.List;
import java.util.ArrayList;
import java.io.IOException;
import java.util.Random;

public class WordDictionary {
        int wordLength;
        String word = "";
	public static List<String> threeLetterWords = new ArrayList<String>();
	public static List<String> fourLetterWords = new ArrayList<String>();
	public static List<String> fiveLetterWords = new ArrayList<String>();
	public static List<String> sixLetterWords = new ArrayList<String>();
	public static List<String> sevenLetterWords = new ArrayList<String>();
	public static List<String> eightLetterWords = new ArrayList<String>();
	public static List<String> nineLetterWords = new ArrayList<String>();
	public static List<String> tenLetterWords = new ArrayList<String>();
        
        public WordDictionary(int wordLength) {
            this.wordLength = wordLength;
            wordList();
            determineWord();
        }
	
        public void determineWord() {
            Random rng = new Random();
          
          if (wordLength <= 3) {
              word = threeLetterWords.get(rng.nextInt(20));
          }
          else if (wordLength == 4) {
              word = fourLetterWords.get(rng.nextInt(20));
          }
          else if (wordLength == 5) {
              word = fiveLetterWords.get(rng.nextInt(20));
          }
          else if (wordLength == 6) {
              word = sixLetterWords.get(rng.nextInt(20));
          }
          else if (wordLength == 7) {
              word = sevenLetterWords.get(rng.nextInt(20));
          }
          else if (wordLength == 8) {
              word = eightLetterWords.get(rng.nextInt(20));
          }
          else if (wordLength == 9) {
              word = nineLetterWords.get(rng.nextInt(20));
          }
          else if (wordLength >= 10) {
              word = tenLetterWords.get(rng.nextInt(20));
          }
            
        }
        
        public String getWord() {
            return word;
        }
	
	public void wordList() {
		try {
			BufferedReader reader = new BufferedReader(new FileReader("/Users/kristindavis/Documents/WordList.txt"));
			String line;
			while ((line = reader.readLine()) != null ) {
				switch(line.length()){
					case 3:		//if the line is 3 chars long
						threeLetterWords.add(line);
						continue;
					case 4:		//if the line is 4 chars long
						fourLetterWords.add(line);
						continue;
					case 5:		//if the line is 5 chars long
						fiveLetterWords.add(line);
						continue;
					case 6:		//if the line is 6 chars long
						sixLetterWords.add(line);
						continue;
					case 7:		//if the line is 7 chars long
						sevenLetterWords.add(line);
						continue;
					case 8:		//if the line is 8 chars long
						eightLetterWords.add(line);
						continue;
					case 9:		//if the line is 9 chars long
						nineLetterWords.add(line);
						continue;
					case 10:	//if the line is 10 chars long
						tenLetterWords.add(line);
						continue;
					default:
						break;
					}	
				}
			reader.close();			//closes the text file
		}
		catch (FileNotFoundException f) {			//catching if error in reading text file
			System.out.println("An error occurred reading the file.");
			f.printStackTrace();
		}
		catch (IOException e) {						//catching if error in I/O operations
			System.out.println("An error occurred when performing I/O operations.");
			e.printStackTrace();
		}
	}
}

