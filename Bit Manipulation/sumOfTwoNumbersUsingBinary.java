public class sumOfTwoNumbersUsingBinary {

    //we need to get the sum without using airthmetic operators
    //We can use the bitwise
    /*
        3 = 110
        3 = 110
    xor() =        for 1 ^ 1 we will get 2 which is 01 so we need to carry it
        so use the above hints to solve
     */

    public static void main(String[] args) {
    int sol = sum(3,3);
    System.out.println(sol);
    }
    public static int sum(int a, int b)
    {
        int sum = 0;
        int carry = 0;

        while(a!=0 || b!=0 || carry!=0)
        {
            int lastBitA = a & 1;
            int lastBitB = b & 1;
            // Calculate the bit for the current position
            a = a>>1;
            b = b>>1;

            System.out.println("Before xor: "+sum);
            sum = sum | (lastBitA ^ lastBitB ^ carry);
            System.out.println("After xor : "+sum);

            carry = (lastBitA & lastBitB) | (lastBitA & carry) | (lastBitB & carry);
            sum = sum << 1;
        }
        return sum;
    }
}
