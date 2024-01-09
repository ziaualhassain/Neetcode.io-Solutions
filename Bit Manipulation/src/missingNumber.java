public class missingNumber {

    public static void main(String[] args) {
        int[] arr = {0,1};

        /*
            using bruteForce
            int ans = missingNo(arr);
            System.out.println(ans);
         */
            //using Cyclic
            int ans = missingNumber(arr);
            System.out.println(ans);


    }

    public static int missingNo(int[] arr){ //3,0,2
        int ans = 0;
        int n = arr.length;
        int nSum = n * (n+1) /2 ;
        for(int i=0;i<arr.length;i++){
            ans += arr[i];
        }
        return nSum - ans;
    }

    //using cyclic sort

    //swap
    public static void swap(int[] array,int first,int second){
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }


    public static int missingNumber(int[] nums) {

      int i = 0;

      while(i<nums.length){
          //int correctIndex = nums[i];
          int corInd = nums[i];

          if(nums[i] < nums.length && nums[i] != nums[corInd]){
              swap(nums,i,corInd);
          }else{
              i++;
          }
      }

        //search for missed Element
        int j;
        for(j=0;j<nums.length;j++){
            if(nums[j] != j){
                break;
            }
        }
        return j;
    }
}


