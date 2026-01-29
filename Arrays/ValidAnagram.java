public class ValidAnagram{

    public static boolean validAnagram(String s, String t){
        // The length of t and s must be equal
        if(s.length() != t.length()){
            return false;
        }

        int count[] = new int [26];

        for(char c: s.toCharArray()){
            count[c - 'a']++;
        }

        for(char c: t.toCharArray()){
            count[c - 'a']--;
        }

        for(int x: count){
            if(x != 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        String s = "anagram";
        String t = "ganaram";

        System.out.println(validAnagram(s,t));
    }
}