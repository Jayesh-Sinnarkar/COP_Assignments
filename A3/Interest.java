import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Principle: ");
        int principle = in.nextInt();
        System.out.print("Enter Rate of Interest: ");
        double intrestRate = in.nextDouble();
        System.out.print("Enter total period in years: ");
        int years = in.nextInt();
        System.out.print("Enter Compounding Period: ");
        int cp = in.nextInt();
        in.close();

        double answer = 0;

        double temp = 1 + (intrestRate/100);
        double nt = cp * years;
   
        answer = (principle * (Math.pow(temp, nt)));
        System.out.println("Total Amount: "+answer);
        System.out.println("Total Principle: "+principle);
        System.out.println("Total Intrest Amount: "+(answer-principle));
    }    

}

/*
Enter Principle: 10000
Enter Rate of Interest: 10
Enter total period in years: 2
Enter Compounding Period: 1
Total Amount: 12100.000000000002
Total Principle: 10000
Total Intrest Amount: 2100.000000000002
 */