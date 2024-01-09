public class ContBitsUnsinged {
    public static void main(String[] args) {
        int n = -5;
        int ans = decimalToBinary(n);
        System.out.println(ans);

    }

    public static int decimalToBinary(int n){
        int count = 0;
        while (n != 0) {
            int lastBit = n & 1; //get the last bit
            if (lastBit == 1) {
                count = count + 1; //if one counr
            }
            n = n >>> 1; //unsigned right shift used for unsigned number too
        }
        return count;
    }
}
