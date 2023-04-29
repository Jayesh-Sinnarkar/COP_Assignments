//ASSIGNMENT 1 > Part-A > Question 2
//STATEMENT: Add two numbers.


import java.util.Scanner;
class Summation
{	

	private int firstOperand;
	private int secondOperand;
	private int result;
	
	public static void main(String[] args) {
		
		
		Summation sum = new Summation(); 
	
		Scanner in = new Scanner(System.in);
		
		System.out.print(" Enter first operand for addtion:");
		sum.firstOperand = in.nextInt();
		System.out.print("\n Enter second operand for addtion:");
		sum.secondOperand = in.nextInt();
		
	  	sum.result = sum.firstOperand + sum.secondOperand;
	  	
	  	System.out.println("\n Addition of "+sum.firstOperand+" and "+sum.secondOperand+" is: "+sum.result);
		in.close();
	}
	
}

/* **********OUTPUT****************

 Enter first operand for addtion:500

 Enter second operand for addtion:800

 Addition of 500 and 800 is: 1300


*/
