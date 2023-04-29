import java.util.Scanner;

public class NumTriangle {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int number = in.nextInt();
        in.close();

        for(int line =1;line<=number;line++)
        {
            for(int j=number; j>i; j--)
                System.out.print("   ");

            for(int k=1;k<=i;k++)
                System.out.print(" "+k+" ");
            
            for(int l=i-1; l>=1; l--)
                System.out.print(" "+l+" ");

            System.out.println();
            
        }
    }
}


/*


Enter Number: 7
                   1 
                1  2  1 
             1  2  3  2  1 
          1  2  3  4  3  2  1 
       1  2  3  4  5  4  3  2  1 
    1  2  3  4  5  6  5  4  3  2  1 
 1  2  3  4  5  6  7  6  5  4  3  2  1 
 
 */
