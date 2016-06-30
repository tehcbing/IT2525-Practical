package question2and3;

import java.util.ArrayList;
import java.util.Collections;


//==============================================================
//Program Name:	StudentSort.java (Practical 5 Q 2)
// Description:	...
//==============================================================
//import java.util.*;

public class StudentSort {
	public static void main (String args[]){
		ArrayList <Student> studentList = new ArrayList<Student>();
		
		Student s1 = new Student("123456A", "Xavier", 19);
		Student s2 = new Student("131256C", "Xavier", 20 );
		Student s3 = new Student("123612T", "Tammy", 18);
		Student s4 = new Student("127362D", "Sophie", 17);
		Student s5 = new Student("128746Z", "Marcus", 20);
		
		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);
		studentList.add(s4);
		studentList.add(s5);
		
		Collections.sort(studentList);
		
		for (int i = 0; i < studentList.size(); i++) {
			System.out.println(studentList.get(i));
			}
		
	
	}
}