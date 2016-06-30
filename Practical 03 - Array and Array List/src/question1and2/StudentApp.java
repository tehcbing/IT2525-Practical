package question1and2;

import java.io.*;
import java.util.*;

public class StudentApp {
	public static void main (String[] args) throws IOException {
		// declare and instantiate a FileController object
		// for text file "student.txt"
		File file = new File ("student.txt");
		FileController fc = new FileController (file);
		

	
	ArrayList<String> recs = new ArrayList <String>();
	ArrayList<String> recsReturn;
	
	recs.add("031111A;Mary Tan;1/06/1981;100;100;90");
	recs.add("155555P;John Tan;3/08/1982;80;70;90");
	recs.add("170293B;Jane Lim;7/09/1983;90;80;70");
	// add 2 more records to the recs ArrayList
	
	// invoke the writeLine method in FileController
	// to write records to file

	fc.writeLine(recs);

	// invoke the readLine methods in FileController to read
	// records from file and stores the records in variable recsReturn
	
	
	// write a for loop to print out names of the students
	}
}

