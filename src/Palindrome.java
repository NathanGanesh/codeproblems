import java.util.Locale;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("0P"));
//        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }

    public static boolean isPalindrome(String s) {
        String s1 = s.toLowerCase();
        s1 = s1.replaceAll("[^a-z0-9]+", "");
        char[] chars = s1.toCharArray();
        if (chars.length==1){
            return true;
        }
        for (int i = 0; i < chars.length/2; i++) {
            if (chars[i] != chars[chars.length-i-1]) {
                return false;
            }
        }
        return true;
    }
}
