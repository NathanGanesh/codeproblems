import java.util.HashMap;

public class Anagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("rat", "car"));
    }

    public static boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> hashMapS = createHashMapFromString(s);
        HashMap<Character, Integer> hashMapT = createHashMapFromString(t);
        if (hashMapS.entrySet().equals(hashMapT.entrySet())) {
            return true;
        }else{
            return false;
        }
    }

    public static HashMap<Character, Integer> createHashMapFromString(String stringToCreateHash) {
        char[] chars = stringToCreateHash.toCharArray();
        HashMap<Character, Integer> hashMapS = new HashMap<>();
        for (int i = 0; i < chars.length; i++) {
            if (hashMapS.containsKey(chars[i])) {
                hashMapS.put(chars[i], hashMapS.get(chars[i]) + 1);
            } else {
                hashMapS.put(chars[i], 1);
            }
        }
        return hashMapS;
    }
}

