import java.util.Set;
import java.util.HashSet;

public class ContainsDuplicate {
    public static boolean containsDuplicate(int array[]){
        Set<Integer> set = new HashSet<>();

        for(int x: array){
            if(set.contains(x)){
                return true;
            }
            set.add(x);
        }
        return false;
    }
    public static void main(String args[]){
        int array[] = {1,2,3,3,4,5};
        
        if(containsDuplicate(array)){System.out.println("True");}
        else{
            System.out.println("False");
        }
    }
    
}

//Space O(n)
//Time O(n)