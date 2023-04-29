import java.util.Scanner;

public class CountOfaDigit {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
		System.out.print("Enter Number: ");
		int number = in.nextInt();
		System.out.print("Enter Digit to count in number: ");
        int digit = in.nextInt();
        int count = 0;
        int rem = 0;
        in.close();

        do
        {
            rem = number % 10;
            if (digit == rem)
                count++;
            number = number / 10;

        } while(number != 0);
        System.out.println("Number of "+digit+"'s in entered number is: "+count);
    }
    
}
/*
Enter Number: 1254125411
Enter Digit to count in number: 1
Number of 1's in entered number is: 4
 */
