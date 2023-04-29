import java.util.Scanner;

public class ProductOfPositiveDigits {
    public static void main(String[] args) {
    
        int sum =1;
        int rem =0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = sc.nextInt();
        int temp = num;
        sc.close();

        while(num != 0)
        {
            rem = num % 10;
            sum = sum * rem;
            num = num / 10;
        }
        System.out.println("Product of Digits of the "+temp+" : "+sum);
    }
     
}

/*
    Enter Number: 12345
    Product of Digits of the 12345 : 120
 */