import java.util.Scanner;

class ReverseNum
{
    public static void main(String[] args) {

        System.out.print("Enter number to reverse: ");
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int rem = 0;
        int rev = 0;
        sc.close();

        while(number!=0)
        {
            rem = number % 10;
            rev = rev * 10 + rem;
            number = number / 10;
        }

        System.out.println("Reverse Number = "+ rev);
    }

}

/*
Enter number to reverse: 1234
Reverse Number = 4321
*/
