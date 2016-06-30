package question1;

// Sample code for creating and printing the linked list.
public class TestLinkedList {
	
	
	public static void main(String argv[]) {
		ListNode pHead = null;

		// inserting 10 numbers in the linked list
		for (int i = 1; i <= 10; i++) {
			ListNode newNode = new ListNode(i);
			newNode.next = pHead;
			pHead = newNode;

		}

		System.out.print("Linked List: ");
		ListNode pList = pHead;

		while (pList != null) {
			System.out.print(pList.data + " ");
			pList = pList.next;
		}
		System.out.println();
		
	
		}
	
	
	
	}


