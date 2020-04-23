import java.util.Scanner;
public class StrictlyIdentical {

	//https://github.com/ChrisAdkins24/ITSS3311
	
	/*
	 *
	Enter 5 elements of list1: 
	1
	2
	3
	4
	5
	Enter 5 elements of list2: 
	1
	2
	3
	4
	5	
	Two lists are strictly identical
	 * 
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creating two arrays of length 5
	 int[]list1 = new int[5];
	 int[]list2 = new int[5];
	 Scanner input = new Scanner(System.in); //Starting the Scanner System
	
	//Storing user input into first array
	 System.out.println("Enter 5 elements of list1: ");
	 for(int i= 0;i<5;i++) {
		 list1[i]= input.nextInt();
	 }
	 //Storing user input into second array 
	 System.out.println("Enter 5 elements of list2: ");
	 for(int i= 0;i<5;i++) {
		 list2[i]= input.nextInt();
	 }
	 //storing return from equals method into boolean variable test
	 boolean test = equals(list1,list2);
	 
	 //if statement for declaring whether or not the two arrays are strictly identical 
	 if(test == true) {
		 System.out.println("Two lists are strictly identical");
	 } 
	 else {
		 System.out.println("Two lists are not strictly identical");
	 }
	//closing scanner system
	 input.close();

		}
	//method for checking if arrays are strictly identical 
	public static boolean equals(int[]list1, int[]list2) {
		boolean check = true;
		for(int i= 0;i<5 && check == true; i++) {
			if (list1[i] != list2[i]) {
				check = false;
		}
		}	
		return check; 
		
	}

}
