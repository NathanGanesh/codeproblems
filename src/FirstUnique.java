import java.util.HashMap;
import java.util.HashSet;

public class FirstUnique {
    public static void main(String[] args) {
        firstUniqChar("aabb");
    }

    public static int firstUniqChar(String s) {
        HashMap<Character, Integer> stringIntege = new HashMap<>();
        char[] chars = s.toCharArray();
        for (char aChar : chars) {
            if (stringIntege.containsKey(aChar)) {
                stringIntege.put(aChar, stringIntege.get(aChar) + 1);
            } else {
                stringIntege.put(aChar, 1);
            }
        }
        for (int i = 0; i < chars.length; i++) {
            if (stringIntege.containsKey(chars[i])){
                if (stringIntege.get(chars[i])==1){
                    System.out.println(i);
                    return i;
                }
            };
        }

        return -1;
    }
}
