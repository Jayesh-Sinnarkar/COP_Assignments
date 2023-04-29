import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        
        int number=0;       
        int result = 0;
        int rem = 0;
        int count = 0;

		Scanner in = new Scanner(System.in);
		System.out.print("Enter Number: ");
		number = in.nextInt();
        int numCopy = number;
        int temp = number;

        in.close();

        do
        {
            numCopy = numCopy / 10;
            count++;     
        } while(numCopy != 0);

        for (;temp != 0; temp /= 10)
        {
            rem = temp % 10;
            result += Math.pow(rem, count);
        }
           
        if (number == result)
            System.out.println("Entered number is Armstrong Number");
        else
            System.out.println("Entered number is Not an Armstrong Number");
        

    }
}

/*
Enter Number: 153
Entered number is Armstrong Number

Enter Number: 154
Entered number is Not an Armstrong Number
 */