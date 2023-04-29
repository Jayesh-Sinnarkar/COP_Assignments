import java.util.Scanner;


public class NumberToWords {
    public static void main(String[] args){
        String[][] digitsInWords = new String[][]{
            {"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"},
            {"Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeeen","Eighteen","Nineteen"},
            {"","","Twenty","Thirty","Fourty","Fifty","Sixty","Seventy","Eighty","Ninety"}
        };

        String[] placeValue = new String[]{"Hundred","Thousand","Million","Billion"};
        String outputStr = "";

        int num;
        int temp;
        int digitCount = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: " );
        num = sc.nextInt();

        if(num == 0)
            outputStr = "Zero";
        else{
            temp = num;
            while(temp != 0){
                digitCount++;
                temp = temp/10;
            }

            int rows = (int) Math.ceil((double)digitCount/3);
            int[][] numArr = new int[rows][3];

            //get the i/p num as array of [digitCount][3] such that the 3 least significant digits get the 0 the row
            //43221
            //
            //[2,2,1]
            //[0,4,3]

            temp = num;
            for(int i = 0; i < rows ; i++){
                for(int j = 2; j >= 0; j--){
                    numArr[i][j] = temp % 10;
                    temp = temp / 10;
                }
            }

            for(int i = rows - 1; i >= 0; i--){
                if(numArr[i][0] != 0)
                    outputStr = outputStr + digitsInWords[0][numArr[i][0]] + " " + placeValue[0] + " ";
                if(numArr[i][1] > 1){
                    outputStr = outputStr + digitsInWords[2][numArr[i][1]] + " ";
                    outputStr = outputStr + digitsInWords[0][numArr[i][2]] + " ";
                } else if(numArr[i][1] == 1){
                    outputStr = outputStr + digitsInWords[1][numArr[i][2]] + " ";
                } else {
                    outputStr = outputStr + digitsInWords[0][numArr[i][2]] + " ";
                }
                if(i>0)
                    outputStr = outputStr + placeValue[i] + " ";
            }    
        }
        System.out.println(outputStr);
        sc.close();
    }
}
