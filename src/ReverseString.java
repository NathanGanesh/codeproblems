public class ReverseString {
    public static void main(String[] args) {
        String str = "\"A\",\" \",\"m\",\"a\",\"n\",\",\",\" \",\"a\",\" \",\"p\",\"l\",\"a\",\"n\",\",\",\" \",\"a\",\" \",\"c\",\"a\",\"n\",\"a\",\"l\",\":\",\" \",\"P\",\"a\",\"n\",\"a\",\"m\",\"a\"";
        reverseString("hello".toCharArray());
    }

    public static void reverseString(char[] s) {
//        System.out.println(s);
//        int i1 = s.length % 2 == 0 ? s.length / 2 - 1 : s.length / 2;
        for (int i = 0; i < s.length / 2; i++) {
            char temp = s[i];
            s[i] = s[s.length-i-1];
            s[s.length-i-1] = temp;
//            System.out.println(s[i]);
//            System.out.println(s[s.length-i-1]);
        }
        System.out.println(s);
    }
}
