public class StrStr {


    public int strStr(String haystack, String needle) {
        char[] chars = haystack.toCharArray();
        char[] chars1 = needle.toCharArray();
        if (needle.length() > haystack.length()) {
            return -1;
        }
        if (needle.equals("")) {
            return 0;
        }


        return -1;
    }

}
