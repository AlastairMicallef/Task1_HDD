package HDD;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class main{
//create constant variabiles

//Read file Class

static void ReadFromTxt(){
	Scanner fileIn = null;
	try {
		fileIn = new Scanner(new File("DATA.txt"));
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	while(fileIn.hasNextLine() == true) {
	String word = fileIn.nextLine(); // Reads one line from the file
	
	System.out.println(word);
	}

}
//Display Class


public static void main(String[] args) {
	ReadFromTxt();
}
}