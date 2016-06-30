package question1;

import java.util.*;


public class SortPhoneList{
	//-----------------------------------------------------------------
	//  Creates an array of Contact objects, sorts them, then prints
	//  them.
	//-----------------------------------------------------------------
	public static void main (String[] args){
		ArrayList <Contact> contactList = new ArrayList <Contact>();
		
		Contact c1 = new Contact ("John", "Tan", "98349821");
		Contact c2 = new Contact ("Xiao", "Ming", "84723461");
		Contact c3 = new Contact ("Ah", "Beng", "94623362");
		Contact c4 = new Contact ("Xiao", "Hua", "84623376");
		Contact c5 = new Contact ("Kim", "Tan", "84623376");
		
		contactList.add(c1);
		contactList.add(c2);
		contactList.add(c3);
		contactList.add(c4);
		contactList.add(c5);
		
		Collections.sort(contactList);

		for (int i = 0; i < contactList.size(); i++) {
		System.out.println(contactList.get(i));
		}
	}
}
