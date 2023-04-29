import java.util.Scanner;

class PerfectNumber
{
    public static void main(String[] args) {

        int number=0;
        int sumOfFact=0;

		Scanner in = new Scanner(System.in);
		System.out.print("Enter Number: ");
		number = in.nextInt();
        in.close();

		
	  	for(int i=1; i< number; i++)
	  	{
	  		if(number % i == 0)
                sumOfFact = sumOfFact + i;  		
	  	}

        if(sumOfFact == number)
            System.out.println("Number is a perfect number.");
        else
            System.out.println("Number is not a perfect number.");
    }
}

/*
Enter Number: 12
Number is not a perfect number.

Enter Number: 6
Number is a perfect number.
 */