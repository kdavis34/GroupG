import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.List;
import java.util.ArrayList;
import java.io.IOException;

public class Dictionary {
	public static List<String> threeLetterWords = new ArrayList<String>();
	public static List<String> fourLetterWords = new ArrayList<String>();
	public static List<String> fiveLetterWords = new ArrayList<String>();
	public static List<String> sixLetterWords = new ArrayList<String>();
	public static List<String> sevenLetterWords = new ArrayList<String>();
	public static List<String> eightLetterWords = new ArrayList<String>();
	public static List<String> nineLetterWords = new ArrayList<String>();
	public static List<String> tenLetterWords = new ArrayList<String>();
	
	public static void main(String[] args) {
		wordList();
	}
	
	static void wordList() {
		try {
			BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\bilstr\\Documents\\words.txt"));
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

