import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;

public class GroupAnagrams {
    public static List<List<String>> groupAnagram(String[] strs){
        HashMap<String, List<String>>map = new HashMap<>();

        for(String s: strs){
            char c[] = s.toCharArray();
            Arrays.sort(c);

            String key = new String(c);

            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(s);
        }
        return new ArrayList<>(map.values());

    }
    public static void main(String args[]){
        String strs[] = {"eat","tea","tan","ate","nat","bat"};

        System.out.println(groupAnagram(strs));


    }
}
