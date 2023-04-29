import java.util.Scanner;

public class SumOfPositiveDigits {
    public static void main(String[] args) {
    
        int sum =0;
        int rem =0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = sc.nextInt();
        int temp = num;
        sc.close();

        while(num != 0)
        {
            rem = num % 10;
            sum = sum + rem;
            num = num / 10;
        }
        System.out.println("Sum of Digits of the "+temp+" : "+sum);
    }
    
}
/*
Enter Number: 1234
Sum of Digits of the 1234 : 10 
 */