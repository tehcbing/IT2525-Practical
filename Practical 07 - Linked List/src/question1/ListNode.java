package question1;
import question2.Book;
// A node in the linked list consists of integer 
// data item and a reference to next node 
// in a singly-linked list

public class ListNode {		
	Book data;				
	ListNode next;		 	
	
	// Constructor	
	public ListNode (Book value) {		
		data = value;		
		next = null;	
	}
}
