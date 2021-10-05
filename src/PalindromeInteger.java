public class PalindromeInteger {
    public static void main(String[] args) {
//        System.out.println(isPalindrome(123));
        System.out.println(isPalindrome(-121));
        System.out.println(isPalindrome(10));
        System.out.println(isPalindrome(-101));
        System.out.println(isPalindrome(101));
    }

    public static boolean isPalindrome(int x) {
        char[] chars = Integer.toString(x).toCharArray();
        int charsLength = chars.length;
        int loopLength = charsLength % 2 == 0 ? charsLength / 2 : charsLength / 2 + 1;
        if (charsLength < 1) {
            return false;
        }
        for (int i = 0; i < loopLength; i++) {
            if (chars[i]!=chars[charsLength-i-1]){
                return  false;
            }
        }
        return true;
    }
}
