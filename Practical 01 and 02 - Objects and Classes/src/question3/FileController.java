package question3;

import java.io.*;
import java.nio.*;
import java.nio.file.*;
import java.util.Scanner;

public class FileController {
	private File FileName;
	
	public FileController (File FileName) {
		this.FileName = FileName;
	}
	
	public static String readLine() {
		String file = "output.txt";
		String line = null;
		String path = Paths.get("output.txt").toString();
		
		try{
		       FileReader fr = new FileReader (file);
		       Scanner sc = new Scanner(fr);

				 //read in the file line by line
		       line = Files.readAllLines(Paths.get("output.txt")).get(0);
		       System.out.println("Retrieved line: " + line);

		       fr.close();
		    }
		    catch (FileNotFoundException exception){
		       System.out.println ("The file " + file + " was not found.");
		    }
		    catch (IOException exception){
		       System.out.println (exception);
		    }
		
		return line;
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
	
	public static void main (String[] args) throws IOException {
		System.out.println("Write Line Method Started...");
		String input = "This is a line written by the writeLine method";
		writeLine(input);
		
		System.out.println("=====================================");
		
		System.out.println("Read Line Method Started...");
		readLine();
		
	}
}