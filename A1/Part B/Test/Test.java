import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int number = in.nextInt();
        in.close();

        String wordString = "";
        int rem = 0;

        String[] words ={ "Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine" };
        do 
        {
            rem = number % 10;
            number = number/10;

            wordString = words[rem]+ " " + wordString;

        }
        while (number != 0);
        System.out.println("Digits of Numbers in words: "+wordString);
    }    
}
    
	  	
	
	



