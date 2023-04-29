import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = in.nextInt();
        in.close();

        System.out.println("Factorial of "+number+" is: "+ fact(number));

    }

public static int fact(int n) {    
    if (n==0)
        return 1;        
    
    else
       return n * fact(n-1);

    }
    
}
/*
Enter number: 0
Factorial of 0 is: 1

Enter number: 7
Factorial of 7 is: 5040
 */
