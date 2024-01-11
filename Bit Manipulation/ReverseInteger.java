public class ReverseInteger {
    public static void main(String[] args) {
        int orgNum = -321;
        int revNum = reverse(orgNum);
        System.out.println(revNum);
    }

    public static int reverse(int n){
        if(n >= Integer.MAX_VALUE){
            return 0;
        }
        int ans = 0;
        while(n!=0){
            int rem = n % 10;
            n = n / 10;
            ans = ans * 10 + rem;
        }
        return ans;
    }
}
