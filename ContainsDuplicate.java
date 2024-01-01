import java.util.Arrays;
import java.util.HashSet;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        System.out.println(BruteForce(nums));
        System.out.println(SortedApproch(nums));
        System.out.println(HashMapApproch(nums));
    }

    public static boolean BruteForce(int[] nums){
      for(int i=0;i< nums.length;i++){
          for(int j = i+1;j< nums.length;j++ ){
              if(nums[i] == nums[j]){
                  return true;
              }
          }
      }
      return false;
    }

    public static boolean SortedApproch(int[] nums){
        boolean ans = false;
        Arrays.sort(nums);
        for(int i = 0;i< nums.length-1;i++){
            if(nums[i] == nums[i+1]){
                ans = true;
            }
        }
        return ans;
    }

    public static boolean HashMapApproch(int[] nums){

        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i< nums.length;i++){
            //set contains unique values only if adding not happend means element is alredy in set
            if(set.add(nums[i]) == false){
                return true;
            }
        }
        return false;
    }
}


