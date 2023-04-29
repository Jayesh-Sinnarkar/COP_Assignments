import java.util.Scanner;

public class BitCount {

    public static int countOneBits(byte num){
        int i;
        int count = 0;
        for(i = 1; i <= 64 ; i=2*i){
            if((num & i) != 0)
                count++;
        }
        return count;
    }

    public static byte setBitToOne(byte num, int bitPosition){
        byte mask = (byte) (1 << bitPosition);
        num = (byte) (num | mask);
        return num;                                                                                                                                                                              
    }

    public static byte getValueOfBit(byte num, int bitPosition){
        byte bitValue;
        byte mask = (byte) (1 << bitPosition);
        bitValue = (byte) (num & mask);
        return bitValue;
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Value: ");
        byte val = sc.nextByte();
        sc.close();

        String bino = Integer.toBinaryString(val);
        System.out.println("Value in Binary: "+bino);

        byte output;
        int count = countOneBits(val);
        System.out.println("Count of ones :"+count);
        
        output = setBitToOne(val, (byte)1);
        System.out.println("Set Bit to One :"+output);

        output = getValueOfBit(val, 1);
        System.out.println("Value of a bit: "+output);

    }
}