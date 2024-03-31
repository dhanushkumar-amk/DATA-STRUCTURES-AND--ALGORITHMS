package BIT_WISE;

public class BitWiseOperator {
    public static void main(String[] args) {
       int x=5;//00000000000000000000000000110010  == 5
       x=~x;   //11111111111111111111111111001101  == -6
        System.out.println(x); // -6
  /*
 Decimal value of 5 in binary represent 00000000000000000000000000101
 Original:  00000000000000000000000000101
 ~ (invert operator) result 👇11111111111111111111111111111010
 Inverted value
 Will be converted to decimal automatically during run time
 it results -6 in decimal value as we know every decimal values are stored in binary format in computer
  we using bitwise invert operator ~ to  modify binary value
  Show that
  0 's are converted to 1's               
  1's are converted to 0's
         */
    }
}
