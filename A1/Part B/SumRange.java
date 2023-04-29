import java.util.Scanner;

public class SumRange {

    public static void main(String[] args) {

        int result =0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        sc.close();

        for(int i=num1; i<=num2; i++)
        { 
            result = result+i;
        }

        System.out.println("Addition of all the numbers between "+num1+" and "+num2+": "+result);
    
    }

    /*
        Enter first number: 1
        Enter second number: 10
        Addition of all the numbers between 1 and 10: 55
     */
    
}
