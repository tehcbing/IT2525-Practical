package question1and2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class FileController {
	private File FileName;
	
	public FileController (File FileName) {
		this.FileName = FileName;
	}
	// ((b)Is it possible to overlaod the readLine method in FileController class? Explain.
	// 
	public static ArrayList<String> readLine() {
		ArrayList<String> recordsList = new ArrayList <String>();
		
		String file = "output.txt";
		String line = null;
		String path = Paths.get("output.txt").toString();
		
		try{
		       FileReader fr = new FileReader (file);
		       Scanner sc = new Scanner(fr);

				 //read in the file line by line
		      // line = Files.readAllLines(Paths.get("output.txt")).get(0);
		      //  System.out.println("Retrieved line: " + line);
		       
		       while (sc.hasNextLine()) {
		    	   recordsList.add(sc.nextLine());
		       }

		       
		       fr.close();
		    }
		    catch (FileNotFoundException exception){
		       System.out.println ("The file " + file + " was not found.");
		    }
		    catch (IOException exception){
		       System.out.println (exception);
		    }
		
		return recordsList;
	}
	
	
	
	public static void writeLine (String input) throws IOException {
		String file = "output.txt";
		
		FileWriter fw = new FileWriter(file);
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter outFile = new PrintWriter(bw);
		
		outFile.println(input);
		
		outFile.close();
		
		System.out.println("Line added");
	}
	
	public static void writeLine (ArrayList<String> content) throws IOException {
		
		FileWriter fw = new FileWriter ("student.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter pw = new PrintWriter (bw);
		
		for (int i=0; i<content.size(); i++) {
			pw.println(content.get(i));
		
		}
		
	}
	
	public static void main (String[] args) throws IOException {
		System.out.println("Write Line Method Started...");
		String input = "This is a line written by the writeLine method";
		writeLine(input);
		
		System.out.println("=====================================");
		
		System.out.println("Read Line Method Started...");
		readLine();
		
	}
}