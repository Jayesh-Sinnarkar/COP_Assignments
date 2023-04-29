//ASSIGNMENT 1 > Part-A > Question 2
//STATEMENT: Add two numbers.


import java.util.Scanner;
class AreaOfRectangle
{	

	private int length;
	private int breadth;
	private int result;
	
	public static void main(String[] args) {
		
		
		AreaOfRectangle obj = new AreaOfRectangle();
	
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter Length: ");
		
		obj.length = in.nextInt();
		
		System.out.print("\nEnter Breadth: ");
		
		obj.breadth = in.nextInt();
		
	  	obj.result = obj.length * obj.breadth;
	  	
	  	System.out.println("\nArea of rectangle is: "+obj.result);
		in.close();
	}
	
}

/* **********OUTPUT****************

Enter Length: 9

Enter Breadth: 7

Area of rectangle is: 63

*/
