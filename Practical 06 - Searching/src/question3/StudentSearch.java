package question3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;



public class StudentSearch {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Student> studentList = Student.readStudent("student.txt");
		ArrayList<String> adminList = new ArrayList<String>();
		
		for (int i = 0; i < studentList.size(); i++) {
			// get all the studentList elements, then retrieve adminNo from it.
			adminList.add(studentList.get(i).getAdminNo());
		}
		
	System.out.println("Enter Admin Number: ");
	String input = sc.nextLine();
	
	while (!input.equals("quit")) {
		Collections.sort(adminList);
		int pos = Collections.binarySearch(adminList, input);
		
		if (pos < 0) {
			System.out.println("Student record not found. ");
		}
		
		else if (pos >=0) {
			System.out.println("Name: " + studentList.get(pos).getName());
			System.out.println("Test 1: " + studentList.get(pos).getTest1());
			System.out.println("Test 2: " + studentList.get(pos).getTest2());
			System.out.println("Test 3: " + studentList.get(pos).getTest3());
		}
		
		System.out.println("Enter Admin Number: ");
		input = sc.nextLine();
		
	}
		
		if (input.equals("quit")) {
			System.out.println("Goodbye!");
			System.exit(0);		}
		
	}

}
