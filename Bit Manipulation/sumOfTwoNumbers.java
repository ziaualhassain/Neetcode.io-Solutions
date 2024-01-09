public class sumOfTwoNumbers {

    public static void main(String[] args) {
    int sol = sum(1,2);
    System.out.println(sol);
    }

    public static int sum(int a,int b){
        int ans = 0;
        while(a!=0 && b!=0){
            a = a & 1;
            b = b & 1;
            ans = a ^ b;
            a= a>>1;
            b = b>>1;
        }
        return ans;
    }
}
