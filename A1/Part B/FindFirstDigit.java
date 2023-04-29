import java.util.Scanner;

public class FindFirstDigit {

    public static void main(String[] args) {

        int digit = 0;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = sc.nextInt();
        sc.close();

        while(num!=0)
        {
            digit = num % 10;
            num = num/10;
        }

        System.out.println("First digit of the number: "+digit);
    }
    
}

/*
    Enter Number: 12345
    First digit of the number: 1
 */