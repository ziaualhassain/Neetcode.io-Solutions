package Arrays;

import java.util.Arrays;

public class AllPositiveMissingNumbers {

    public static void main(String[] args) {
    int[] array = {4,3,2,7,8,2,3,1};
    int[] res = missing(array);
   // int[] res = cyclicSort(array);
    System.out.println(Arrays.toString(res));
    }

    public static int[] missing(int[] arr){
       cyclicSort(arr);
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != i+1){
                return new int[] {i,i+1};
            }
        }
        return new int[] {};
    }

    public static int[] cyclicSort(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correctIndex = arr[i] - 1;
            if(arr[i] != arr[correctIndex]){
                swap(arr,i,correctIndex);
            } else{
                i++;
            }
        }
        return arr;
    }

    public static void swap(int[] array , int first,int second){
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }

}

/*

        leetcode through <List>
        class Solution {
    public List<Integer> findDisappearedNumbers(int[] arr) {
        cyclicSort(arr);
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) {
                result.add(i + 1);
            }
        }

        return result;

        }



    public static int[] cyclicSort(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correctIndex = arr[i] - 1;
            if(arr[i] != arr[correctIndex]){
                swap(arr,i,correctIndex);
            } else{
                i++;
            }
        }
        return arr;
    }

    public static void swap(int[] array , int first,int second){
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }
}

 */
