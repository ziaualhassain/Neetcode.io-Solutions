package Arrays;

import java.util.Arrays;

class ValidAnagram {

    public static void main(String[] args) {
        System.out.println(isAnagram("anagram","nagaram"));
        System.out.println(isAnagram("rat","car"));
    }


    public static boolean isAnagram(String s, String t) {
        System.out.println(s.length());
        System.out.println(t.length());

        if (s.length() == t.length()) {
           String Lowercase1 =  s.toLowerCase();
            String[] StringArray1 = Lowercase1.split("");
            System.out.println(Arrays.toString(StringArray1));
            String Lowercase2 =  t.toLowerCase();
            String[] StringArray2 = Lowercase2.split("");
            System.out.println(Arrays.toString(StringArray2));

            Arrays.sort(StringArray1);
            System.out.println(Arrays.toString(StringArray1));
            Arrays.sort(StringArray2);
            System.out.println(Arrays.toString(StringArray2));

            return Arrays.equals(StringArray1, StringArray2);
        }
        return false;

    }
}
