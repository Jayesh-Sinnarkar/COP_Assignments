import java.util.Scanner;

class Factors
{	

	private int number;
	
	public static void main(String[] args) {
		
		
		Factors obj = new Factors(); 
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter Number:");
		obj.number = in.nextInt();
        in.close();

		
		
		System.out.print("Factors of "+obj.number+" :");	
		
	  	for(int i=1; i<= obj.number; i++)
	  	{
	  		if(obj.number % i ==0)
	  		System.out.print(i +" ");
	  	}
	  	
	}
	
}

/* *************OUTPUT***********

Enter Number:10
Factors of 10 :1 2 5 10 

*/
