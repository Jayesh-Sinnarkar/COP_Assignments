import java.util.Scanner;
public class PrimeNumberInRange {
    
        public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        sc.close();
    
        System.out.print("Prime number between "+num1+ " and "+num2+" is ");
               while  (num1 < num2) {
                boolean flag = false;
    
                for(int i = 2; i <= num1/2; ++i) 
                {
                    if (num1 % i == 0)
                    {
                        flag = true;
                        break;
                    }
                }
    
                if (!flag && num1 != 0 && num1 != 1)
                {
                    System.out.print(num1 + " ");
                }
                ++ num1;
            }
    } 
}

/*
Enter first number: 1
Enter second number: 100
Prime number between 1 and 100 is 2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97 
 */