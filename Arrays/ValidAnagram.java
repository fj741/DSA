public class ValidAnagram{
    public static boolean isValidAnagram(String s, String t){
        int array[] = new int [26];

        for(char c : s.toCharArray()){
            array[c-'a']++;
        }
        for(char c : t.toCharArray()){
            array[c -'a']--;
        }

        for(int i : array){
            if(i != 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]){
        String s = "navan";
        String t = "avnan";

        System.out.print(isValidAnagram(s, t));
    }
}