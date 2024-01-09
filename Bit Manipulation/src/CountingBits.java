import java.util.Arrays;

public class CountingBits {
    public static void main(String[] args) {
        int n = 5;
        int[] res = countBits(n);
        System.out.println(Arrays.toString(res));
    }

    public static int[] countBits(int n) {
        int[] res = new int[n+1];
        for (int i = 0; i < n+1; i++) {
           // System.out.println("i value is : "+i);
            int ans = iToBinary(i);
           // System.out.println("ans is : "+ans);
            res[i] = ans;
        }
        return res;
    }

    public static int iToBinary(int n){
        int ans = 0;
        while(n!=0){
            int lastBit = n & 1;
           // System.out.println("n th last bit is: "+ lastBit);
            n = n>>1;
            /*
                when we get the individual digits(0,1) got add them cause we need the sum
                EG :  for 3 -> 101 -> add 1 + 0 + 1 = 2
             */
            ans = ans + lastBit;
           // System.out.println("ans is "+ans);
        }
        return ans;
    }
}
