package Arrays;

import java.util.Arrays;

class lengthOfLastWordProblem {

    public static void main(String[] args) {
        String s = "Hello World";
        int ans = lengthOfLastWord(s);
        System.out.println(ans);
    }
    public static int lengthOfLastWord(String s) {
        int count = 0;

        String lower = s.toLowerCase();

        //System.out.println(lower);

        String[] splitted = lower.split(" ");

       // System.out.println(Arrays.toString(splitted));

        int last = splitted.length-1;
        //System.out.println(last);
        String lastWord = splitted[last];

       for (int i = 0;i<lastWord.length();i++){
           count+=1;
       }
        return count;
    }
}