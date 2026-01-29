/**
 * Given an integer array nums and an integer k, return true if there are two distinct indices 
 * i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.
 */
import java.util.Set;
import java.util.HashSet;

public class ConatinsDuplicateII {
    public static boolean conatinsDuplicateII(int nums[], int k){
        //Instead of looping through an array twice (O(n^2)), store every seen number in a HashSet
        Set<Integer> set = new HashSet<>();

        for(int i = 0; i<nums.length; i++){
            if(set.contains(nums[i])){
                return true;
            }
            set.add(nums[i]);
            //If the set ever becomes larger than k, remove nums[i-k]
            if(set.size() > k){
                set.remove(nums[i-k]);
            }
        }
        return false;

    }
    public static void main(String args[]){
        int array[] = {1,2,3,1,2,3};
        int k = 2;

        System.out.println(conatinsDuplicateII(array, k));

    }
}
