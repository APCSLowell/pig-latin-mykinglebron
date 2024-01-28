import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class PigLatin {
    
    public void tester() {
        String[] lines = {"beast","dough","happy","question","star","three","eagle","try"};
        String[] lines = new String[8]; 
        try{
            File myFile = new File("words.txt");
            Scanner myReader = new Scanner(myFile);
            int counter = 0;
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                lines[counter] = data;
                counter++;
            }
            myReader.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
	    System.out.println("there are " + lines.length + " lines");
	    for (int i = 0 ; i < lines.length; i++) {
	        System.out.println(pigLatin(lines[i]));
	    }
    }
    public int findFirstVowel(String sWord) {

if( sWord.length()>0){
  for(int i=0; i <sWord.length(); i++){
    if(sWord.charAt(i)=='a'||sWord.charAt(i)=='e'||sWord.charAt(i)=='i'||
    sWord.charAt(i)=='o'||sWord.charAt(i)=='u'){
   return i;
    }
  }
}

{
  return -1;
}
}

   public String pigLatin(String sWord) {
  int firstVowelPosition = findFirstVowel(sWord);

  if (firstVowelPosition == -1) {
    
    return sWord + "ay";
  } else if (firstVowelPosition == 0) {
    
    return sWord + "way";
  } else if (sWord.substring(0, 2).equalsIgnoreCase("qu")) {
   
    return sWord.substring(2) + "quay";
  } else {
    
    return sWord.substring(firstVowelPosition) + sWord.substring(0, firstVowelPosition) + "ay";
  }
}
