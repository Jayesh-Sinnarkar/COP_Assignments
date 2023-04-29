import java.util.Scanner;

public class SetMonthInDate 
{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Date: ");
        int date = sc.nextInt();
        System.out.println("Enter Month: ");
        int month = sc.nextInt();
        sc.close();
    
        SetMonthInDate.setMonthInDate(date, month);
        System.out.println("\nDate: "+date);
        System.out.println("\nMonth: "+month);
        System.out.println("Month in Binary: "+Integer.toBinaryString(month));

    }


public static int setMonthInDate(int date, int month){

    System.out.println("Date Binary Before Operation: "+Integer.toBinaryString(date));

    int mask = 15;

    mask = mask << 5;

    date = date & ~mask;

    month = month << 5;

    date = date | month;

    System.out.println("Date Binary after Operation: "+Integer.toBinaryString(date));
    return 0;
    }
    
}

/*
Enter Date: 31
Enter Month: 9

Date Binary Before Operation: 11111
Date Binary after Operation: 100111111

Date: 31
Month: 9
 */

