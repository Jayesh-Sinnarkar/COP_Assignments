import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {

        System.out.print("Enter number: ");
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int temp = number;
        int rem = 0;
        int rev = 0;
        sc.close();

        while(number!=0)
        {
            rem = number % 10;
            rev = rev * 10 + rem;
            number = number / 10;
        }
        if(temp == rev)
        {
            System.out.println("Number is a palindrome.");
        }
        else
        {
            System.out.println("Number is not a palindrome.");
        }    

    }

}

/*
Enter number: 12321
Number is a palindrome.

Enter number: 123
Number is not a palindrome.
 */