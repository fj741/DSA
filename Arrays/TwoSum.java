import java.util.Map;
import java.util.HashMap;

public class TwoSum{
    public static int[] twoSum(int array[], int target){
        // I want to store each number as the key and the index as the value
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i<array.length; i++){
            int complement = target - array[i];

            if(map.containsKey(complement)){
                return new int[] {map.get(complement), i};
            }
            //Store the number and the index
            map.put(array[i], i);
        }

        return new int[] {};

    }
    public static void main(String args[]){
        int array[] = {1,2,5,7,8}; // can be changed 
        int target = 6; // can be changed

        int result[] = twoSum(array, target);

        for(int x: result){
            System.out.print(x+ " ");
        }


    }
}