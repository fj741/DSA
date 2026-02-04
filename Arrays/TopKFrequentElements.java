//Given an integer array nums and an integer k, 
// return the k most frequent elements. 
// You may return the answer in any order.
import java.util.Map;
import java.util.Objects;
import java.util.HashMap;
import java.util.Queue;
import java.util.PriorityQueue;

public class TopKFrequentElements{

    public static int[] topKFrequentElements(int[] nums, int k){
        int result[] = new int [k];

        Map<Integer, Integer> map = new HashMap<>();

        for(int i : nums){
            map.put(i, map.getOrDefault(i,0)+1);
        }

        Queue<Map.Entry<Integer,Integer>>pq = new PriorityQueue<>((a,b) -> Integer.compare(b.getValue(), a.getValue()));

        //Populate priority queue
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            pq.offer(entry);
        }

        for(int i = 0; i<k; i++){
            result[i] = Objects.requireNonNull(pq.poll().getKey());
        }
        return result;
    }

    public static void main(String args[]){
        int nums[] = {1,1,1,2,2,3};

        int k = 2;

        int result[] = topKFrequentElements(nums, k);

        for(int i : result){
            System.out.print(i + " ");
        }
    }
}