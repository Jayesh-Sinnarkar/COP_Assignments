import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
    
        int sum =0;
        int rem =0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = sc.nextInt();
        int temp = num;
        sc.close();

        if(num>=0)
        {
        while(num != 0)
        {
            rem = num % 10;
            sum = sum + rem;
            num = num / 10;
        }
        System.out.println("Sum of Digits of the "+temp+" : "+sum);
    }
    else
    {
        num = num * -1;
        while(num != 0)
        {
            rem = num % 10;
            sum = sum + rem;
            num = num / 10;
        }
        System.out.println("Sum of Digits of the "+temp+" : "+sum);
    }

    }  
}
/*
Enter Number: 321
Sum of Digits of the 321 : 6

Enter Number: -325
Sum of Digits of the -325 : 10
 */