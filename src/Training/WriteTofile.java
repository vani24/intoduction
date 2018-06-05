package Training;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteTofile {
	  
	public static void main(String[] args)throws IOException {
		
        WriteTofile writeread=new WriteTofile();
        writeread.writetofile();
        writeread.readfromfile();
	}
	void writetofile() {
		
		
        BufferedWriter bufferedWriter = null;
        try {
            String strContent = "This the example for adding content to the file and counting the number of charcters and number of words";
           File myFile = new File("C:\\Vani\\TestFile.txt");
            // check if file exist, otherwise create the file before writing
            if (!myFile.exists()) {
                myFile.createNewFile();
            }
            Writer writer = new FileWriter(myFile);
            bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write(strContent);
            //countChar();
           
        } catch (IOException e) {
            e.printStackTrace();
        } finally{
            try{
                if(bufferedWriter != null) bufferedWriter.close();
            } catch(Exception ex){
                 
            }
        }
    }
	
	void  readfromfile() {
int charCount = 0;
        
        int wordCount = 0;
         
        int lineCount = 0;
        BufferedReader reader = null;
        try { 
		  
		 reader = new BufferedReader(new FileReader("C:\\Vani\\TestFile.txt"));
         String currentLine = reader.readLine();
         while (currentLine != null)
         {
             //Updating the lineCount
             lineCount++;
              //Getting number of words in currentLine
              String[] words = currentLine.split(" ");
             //Updating the wordCount
              wordCount = wordCount + words.length;
           
             //Iterating each word
             for (String word : words)
             {
                 //Updating the charCount
                  
                 charCount = charCount + word.length();
             }
             //Reading next line into currentLine
             currentLine = reader.readLine();
         }
         //Printing charCount, wordCount and lineCount
         System.out.println("Number Of Chars In A File : "+charCount);
         System.out.println("Number Of Words In A File : "+wordCount);
         System.out.println("Number Of Lines In A File : "+lineCount);
        } catch (IOException e) {
            e.printStackTrace();
        } finally{
            try{
                if(reader != null) reader.close();
            } catch(Exception ex){
                 
            }
        }
		
	}
	
	

}
