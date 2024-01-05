package Arrays;

import java.util.Arrays;

class NextgreaterElement {

    public static void main(String[] args) {
        int[] array = {17,18,5,4,6,1};
        int[] ans = replaceElements(array);
        System.out.println(Arrays.toString(ans)); //18,
    }
    public static int[] replaceElements(int[] arr) {
        int size = arr.length;
        int[] res = new int[size];


        for (int i = 0; i < arr.length; i++) {

            //we need to assign the last one to -1 so take maxRight as -1
            int maxRight = -1;

            for(int j=i+1;j < arr.length;j++){

                //we need next greater so take max as i+1 here we take j casue j is already i+1 which is right of i
                if(arr[j] > maxRight){
                    //if we found other then the current maxRight while iterating update it
                    maxRight = arr[j];
                }
            }
            res [i] = maxRight; //add the maxRight to the ith element and add to the result array which we are returning
        }
        return res; //return answer
    }
}