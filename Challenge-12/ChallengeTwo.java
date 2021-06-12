package awschallenge;

import java.util.Scanner;

public class ChallengeTwo {
	
	static Node first;

	///////////////// Node Creation/////////////////////////////

	static class Node {
		String data;
		Node next;
		
		Node(String newData) {
		
			this.data = newData;
			next = null;
		}
	}
	
	public static void insert(String newData) {
			
			Node new_node = new Node(newData);
			if (first == null) {
				first = new Node(newData);
				return;
			}
			// new_node.next = null;
			Node n = first;
			while (n.next != null)
				n = n.next;
			n.next = new_node;
			return;
	
		}
	
	
		/*
		 * public String toString() { StringBuilder build = new StringBuilder();
		 * if(first==null) { build.append("[]"); } return build.toString(); }
		 */
    public void swap() {

    	Node temp = first;
    	
    	 while (temp != null && temp.next != null) {

    	      
    	        String k = temp.data;
    	        temp.data = temp.next.data;
    	        temp.next.data = k;
    	        temp = temp.next.next;
    	    }
    }
   
   
	public static void display() {
	
		Node n = first;
		
		while (n != null) { 
			System.out.print(n.data+" ");
			n = n.next;
		}
		
	}
	
	
	public static void main(String[] args) {
		
		ChallengeTwo  challenge = new ChallengeTwo();
		ChallengeTwo.first= new Node("");
		
		Scanner scan = new Scanner(System.in);
		/*
		 * //int n=scan.nextInt();
		 * 
		 * 
		 * for(int i =0;i<3;i++) { String element =scan.nextLine();
		 * ChallengeTwo.insert(element); }
		 * 
		 * challenge.swap();
		 * 
		 * ChallengeTwo.display();
		 */
		 int choice; do { System.out.
		 println("\n1.Insert\n2.Swap Nodes\n3.Display List\n\nEnter Your choice of Operation :");
		
		  
		  choice = scan.nextInt();
		  
		  switch(choice) { 
		  case 1:System.out.println("Enter node do you want to insert At first"); 
				 String element =scan.next(); 
				 ChallengeTwo.insert(element); 
				 break;
				  
		  case 2:challenge.swap(); break;
		  
		  case 3:challenge.display(); break;
		  
		  default: System.out.println(); 
		  } 
		 }while(choice<=3);
		 
	}

}
