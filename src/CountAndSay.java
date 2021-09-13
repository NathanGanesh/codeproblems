public class CountAndSay {
    public static void main(String[] args) {
        countAndSay(5);
    }

    public static String countAndSay(int n) {
        countAndSayRecursive(n, 0, "1".toCharArray(),0, 0 );
//        countAndSayRecursive(n, 0, "1123".toCharArray(),0, 0 );
//        countAndSay()
        return "1";
    }

    private static char[] countAndSayRecursive(int breakValue, int loopIndex, char[] resultArray, int streak, int forLoopIndex) {
        if (breakValue==loopIndex){
            return resultArray;
        }
        for (int i = resultArray.length-1; i>=0; i--) {
//            System.out.println(resultArray[i]);
            if (!(i-1 <0)){
//                if (resultArray[i] == resultArray[i-1]){
//                    countAndSayRecursive(breakValue, loopIndex+1, resultArray, streak+1, i);
//                }

            }else{

                for (int i1 = 0; i1 < resultArray.length; i1++) {

                }
            }
//            System.out.println(resultArray[i]);
        }

        return resultArray;
    }


//    public static String countAndSayRecurisve(int breakValue, int currentIndexValue, String currentArray) {
//        HashMap<Character, Integer> hashMap = new HashMap<>();
//        char[] chars = currentArray.toCharArray();
//        if (breakValue == currentIndexValue) {
//            return currentArray;
//        }
//        for (int i = 0; i < chars.length; i++) {
//            if (hashMap.get(chars[i]) == null) {
//                hashMap.put(chars[i], 1);
//            } else {
//                hashMap.put(chars[i], hashMap.get(chars[i]) + 1);
//            }
//        }
//        StringBuilder currentArrayBuilder = new StringBuilder();
//        for (Map.Entry<Character, Integer> characterIntegerEntry : hashMap.entrySet()) {
//            currentArrayBuilder.append(characterIntegerEntry.getKey());
//            currentArrayBuilder.append(characterIntegerEntry.getValue());
//        }
//        char[] chars1 = currentArrayBuilder.toString().toCharArray();
//        for (int i = chars1.length / 2; 0 <= i; i--) {
//            char temp = chars1[i];
//            chars1[i] = chars1[chars1.length - i - 1];
//            chars1[chars1.length - i - 1] = temp;
//        }
//        System.out.println(chars1);
//        return countAndSayRecurisve(breakValue, currentIndexValue + 1, String.valueOf(chars1));
//    }
}
