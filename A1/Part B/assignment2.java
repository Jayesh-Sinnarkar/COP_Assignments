
import java.util.Scanner;

class exec{


public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a number n : ");
    int n=sc.nextInt();

    int arrayOfNumber[];
    System.out.println("enter the elements in the array : ");
    for(int i=0;i<n;i++)
    {
        arrayOfNumber[i]=sc.nextInt();
    }

    int mulAns=1;
    int addAns=0;

    for(int i=0;i<n;i++)
    {
        mulAns=mulAns*arrayOfNumber[i];
        addAns=addAns+arrayOfNumber[i];

        System.out.println(i+" "+mulAns);
    }

    System.out.println("addition : "+addAns+" multiplication : "+mulAns);
    sc.close();



}
}