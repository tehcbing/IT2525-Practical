package question2and3;

//================================================================
// Program Name:	Student.java (Practical 5 Q 2)
// Description:		Student class implements Comparable Interface
//================================================================
import java.util.*;

// to use a Collections.sort, make sure that it is comparable 
public class Student implements Comparable<Student> { // comparable interface
														// relies on the compare
														// method.
	// comparing Student class to ArrayList<Student> objects.

	// Declare Instance variables
	private String adminNo;
	private String name;
	private int age;

	public Student(String adminNo, String name, int age) {
		this.adminNo = adminNo;
		this.name = name;
		this.age = age;
	}

	// ----------------------------------------------------------
	// Accessor methods to get and set attributes
	// ----------------------------------------------------------
	public String getAdminNo() {
		return adminNo;
	}

	public String getName() {
		return name;
	}

	public void setAdminNo(String adminNo) {
		this.adminNo = adminNo;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "Student [adminNo=" + adminNo + ", name=" + name + ", age=" + age + "]";
	}

	@Override
	// compareTo is an API. Passes in a student object, and renames it to s.
	public int compareTo(Student s) {
		int result;

		// comparing every single name in the ArrayList and scans thru it.
		result = name.compareTo(s.name);

		if (name.equals(s.name)) {
			if (age > s.age) {
				result = 1; // more than
			} else {
				result = -1; // less than
			}
			// result = 0 is equals to.
		}
		return result;
	}

}
