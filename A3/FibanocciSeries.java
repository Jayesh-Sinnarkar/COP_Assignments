import java.util.Scanner;


public class FibanocciSeries {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int number = in.nextInt();
        in.close();
        int num1=0, num2=1, num3;

        System.out.print("Fibanocci Series: "+num1+" "+num2+" ");

        for(int i = 1; i<number; i++)
        {
            num3=num1+num2;
            num1=num2;
            num2=num3;
            System.out.print(num3+" ");

        }
    }
}

/*
Enter Number: 10
Fibanocci Series: 0 1 1 2 3 5 8 13 21 34 55
 */
