package question2;

import java.util.GregorianCalendar;
import java.util.Scanner;


import question1.MyCalendar;
public class Student {
	private String adminNo, name;
	private GregorianCalendar birthDate;
	private int test1, test2, test3;

	public Student (String adminNo, String name, String birthDate, int test1, int test2, int test3) {
		this.adminNo = adminNo;
		this.name = name;
		this.birthDate = question1.MyCalendar.convertDate(birthDate);
		this.test1 = test1;
		this.test2 = test2;
		this.test3 = test3;
	}
	
	public Student (String studentRecord) {
		Scanner sc = new Scanner (studentRecord);
		sc.useDelimiter (";");
		this.adminNo = sc.next();
		this.name = sc.next();
		this.birthDate = question1.MyCalendar.convertDate(sc.next());
		this.test1 = sc.nextInt();
		this.test2 = sc.nextInt();
		this.test3 = sc.nextInt();
		
	}

	public String getAdminNo() {
		return adminNo;
	}

	public void setAdminNo(String adminNo) {
		this.adminNo = adminNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public GregorianCalendar getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(GregorianCalendar birthDate) {
		this.birthDate = birthDate;
	}

	public int getTest1() {
		return test1;
	}

	public void setTest1(int test1) {
		this.test1 = test1;
	}

	public int getTest2() {
		return test2;
	}

	public void setTest2(int test2) {
		this.test2 = test2;
	}

	public int getTest3() {
		return test3;
	}

	public void setTest3(int test3) {
		this.test3 = test3;
	}
	
	// no need put parameter because it's an internal variable
	public double calAvgScore () {
		double total =  test1 + test2 + test3;
		double avgScore = total / 3;
		return avgScore;
	}
	
	public String toString() {
		return adminNo + "," + name + MyCalendar.formatDate(this.birthDate) + "," + calAvgScore();
	}

}


