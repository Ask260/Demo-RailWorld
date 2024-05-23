import java.io.*;
 class IntegerToBinary
 {
        static void decimalToBinary(int num)
        {
            System.out.println(Integer.toBinaryString(num));
        }

        public static void main(String[] args)
        {
            int num = 10;
            decimalToBinary(num);
        }
    }

