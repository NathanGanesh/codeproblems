import java.util.Arrays;

public class ReverseInteger {
    public static void main(String[] args) {
//        reverse(-10); //321
        reverse(123); // -321
//        System.out.println(reverse(120));
//        reverse(0);
    }

    public static int reverse(int x) {
        String number = String.valueOf(x);
        char[] digits1 = number.toCharArray();
        int amountOfLoops = digits1.length%2==0? digits1.length/2-1 :digits1.length/2;
        int i1 = digits1[0] == '-' ? 0 : -1;
        if (digits1.length == 1) {
            return x;
        }
        digits1 = recursiveZeroRemove(digits1, digits1.length + i1-1);
        for (int i = 0; i < amountOfLoops; i++) {
//            System.out.println(i);
            if (digits1[i] != '-') {
                char temp1 = digits1[i];
                digits1[i] = digits1[digits1.length + i1 - i];
                digits1[digits1.length + i1 - i] = temp1;
            }
        }
        int i = Integer.parseInt(String.valueOf(digits1));
        System.out.println(i);
        return i;
    }

    private static char[] recursiveZeroRemove(char[] digits1, int index) {
        if (digits1[index] == 0) {
            return recursiveZeroRemove(digits1, index - 1);
        } else {
            if (digits1.length - 1 == index) {
                return digits1;
            } else {
                char[] charArrWithoutZeros = new char[index];
                for (int i = 0; i < index; i++) {
                    charArrWithoutZeros[i] = digits1[i];
                }
                return charArrWithoutZeros;
            }
        }
    }

    public static int reverse2(int x){
        int rev = 0;
        while (x!=0){
            //3
            int pop = x%10;
            //12
            x = x/10;
            //3
            //3*10 + 2 = 32i
            if (rev>Integer.MAX_VALUE/10 || rev == Integer.MAX_VALUE/10 && pop>7 ){
return 0;
            }
            if (rev<Integer.MIN_VALUE/10 || rev == Integer.MIN_VALUE && pop < -8){
                return 0;
            }
            rev = rev * 10 + pop;
        }
        return rev;
    }
}
