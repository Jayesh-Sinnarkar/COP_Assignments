import java.util.Scanner;

public class StarPattern{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int number = in.nextInt();
        in.close();

        for(int i=1;i<=number;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}

/*


Enter Number: 5
 * 
 *  * 
 *  *  * 
 *  *  *  * 
 *  *  *  *  * 
 

 */