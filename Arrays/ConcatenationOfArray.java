package Arrays;

import java.util.Arrays;

public class ConcatenationOfArray {

    public static void main(String[] args) {
    int[] arr = {1,2,3};
    int[] ans = concatedArray(arr);
    System.out.println(Arrays.toString(ans));
    }

    public static int[] concatedArray(int[] arr){

        int lengthOfNewArray = (arr.length)*2;

        int[] Conarray = new int[lengthOfNewArray];
        System.out.println(Conarray.length);

        for (int i = 0; i < arr.length; i++) {
            Conarray[i] = arr[i];
            Conarray[i+ arr.length] = arr[i];
        }

        return Conarray;
    }
}
