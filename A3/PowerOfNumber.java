import java.util.Scanner;

public class PowerOfNumber {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.print("Enter a Number: ");
            int number = in.nextInt();
            System.out.print("Enter a Power: ");
            int power = in.nextInt();
            in.close();
            int res =1;

            for(int i=0;i<power;i++)
            {
                res = res * number;
            }

        System.out.println("Power of a number: "+res);
        }
    
}

/*
Enter a Number: 29
Enter a Power: 2
Power of a number: 841
 */