import java.util.Arrays;
import java.util.Comparator;

public class LongestCommonPrefix {
    public static void main(String[] args) {
//        System.out.println(longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
//        System.out.println(longestCommonPrefix(new String[]{"dog", "racecar", "car"}));
//        System.out.println(longestCommonPrefix(new String[]{""}));
        System.out.println(longestCommonPrefix(new String[]{"a", "ac"}));
    }

    public static String longestCommonPrefix(String[] strs) {
        int n = 0;
        String currentPrefix = "";
        boolean prefix = true;
        String s = Arrays.stream(strs).max(Comparator.comparingInt(String::length)).orElse(null);
        if (strs[0].isEmpty()) {
            return "";
        }
        if (strs.length == 1) {
            return strs[0];
        }
        while (prefix) {
            n++;
            currentPrefix = s.substring(0, n);
            if (n == s.length()) {
                prefix = false;
            }
            for (int i = 0; i < strs.length; i++) {
                if ((strs[i].length() >= n)) {
                    if (!strs[i].substring(0, n).equals(currentPrefix)) {
                        n--;
                        prefix = false;
                        break;
                    }
                }else{
                    n--;
                    prefix = false;
                    break;
                }
            }

        }
        String substring = strs[0].substring(0, n);
//        System.out.println(substring);
        return substring.length() > 0 ? substring : "";
    }
}

