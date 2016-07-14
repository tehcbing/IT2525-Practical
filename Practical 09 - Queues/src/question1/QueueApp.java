package question1;

import java.util.Scanner;

public class QueueApp {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		String name="";
		ListQueue lq = new ListQueue();
		
		
		System.out.println("Queue Operations Menu");
		System.out.println("1. Enqueue");
		System.out.println("2. Dequeue");
		System.out.println("3. Empty?");
		System.out.println("4. Count?");
		System.out.println("5. View Queue");
		System.out.println("0. Quit");
		
		do {System.out.print("Enter choice: ");
			choice = sc.nextInt();
			
			sc.nextLine();
			if (choice == 1) {
				System.out.print("Enter name to join queue:");
				name = sc.nextLine();
				
				lq.enqueue(name);
			}
			
			else if (choice == 2) {
				String result = (String)lq.dequeue();
				System.out.println(result + " has been removed from the queue.");
			}
			
			else if (choice == 3) {
				boolean result = lq.isEmpty();
				
				if (result == true) {
					System.out.println("The queue is empty");
				}
				
				else 
					System.out.println("The queue is not empty");
			}
			
			else if (choice == 4) {
				int result = lq.size();
				System.out.println("Total number of names in queue: " + result );
			}
			
			else if (choice == 5) {
			 lq.viewQueue();	
			}
			
			else 
				System.out.println("You have exited the program!");
				break;
			
		}
		
		while (choice != 0);
		
		
		
	}
}
