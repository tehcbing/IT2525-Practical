package question2;

public class TestBookList {
	public static void main (String argv[]) {
		BookLinkedList list = new BookLinkedList();
		ListNode p;
		Book john = new Book ("1234", "John");
		Book eric = new Book ("5678", "Eric");
		Book phoon = new Book ("9999", "Phoon");
		
		list.insertFirst(john);
		list.insertFirst(eric);
		list.displayList(); // print the contents
		// (c)
		list.insertAfter(eric, phoon);
		
		p = list.find(new Book ("5678", "John")); // finding if there is a book object named phoon
		
		if (p != null)
			System.out.println("Found");
		else
			System.out.println("Not Found");
	}

}
