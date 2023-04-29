//ASSIGNMENT 1 > Part-A > Question 3
//STATEMENT: Swap two numbers.

import java.util.Scanner;
class Swapper
{	

	private int firstOperand;
	private int secondOperand;
	private int temp;
	
	public static void main(String[] args) {
		
		
		Swapper obj = new Swapper(); 
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter first operand for swapping: ");
		obj.firstOperand = in.nextInt();
		System.out.print("Enter second operand for swapping: ");
		obj.secondOperand = in.nextInt();
		System.out.println("Numbers before swapping are firstOperand = "+obj.firstOperand+ " secondOperand = "+obj.secondOperand);
		
	  	obj.temp = obj.firstOperand;
	  	obj.firstOperand = obj.secondOperand;
	  	obj.secondOperand = obj.temp;
	  	
	  	System.out.println("Numbers after swapping are firstOperand = "+obj.firstOperand+ " secondOperand = "+obj.secondOperand);
		in.close();
	}
	
}

/* *********OUTPUT************
Enter first operand for swapping: 10
Enter second operand for swapping: 7
Numbers before swapping are firstOperand = 10 secondOperand = 7
Numbers after swapping are firstOperand = 7 secondOperand = 10

*/
