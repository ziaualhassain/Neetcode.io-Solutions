package Arrays;

import java.util.Arrays;

public class ReverseStringInplace {

    public static void main(String[] args) {

        char[] s = {'H','a','n','n','a','h'};
        reverseString(s);
        System.out.println(Arrays.toString(s));
    }

    public static void reverseString(char[] s) {
        int arrayLength = s.length;
        int start = 0;
        int end = arrayLength-1;
        while(start < (arrayLength)/2){
            swap(s,start,end);
            start++;
            end--;
        }
    }

    public static void swap(char[] arr,int first,int second){
        char temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
