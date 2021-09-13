import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(plusOne(new int[]{8,9,9,9})));
    }

    public static int[] plusOne(int[] digits) {
        if (digits.length == 1) {
            if (digits[0] == 9) {
                return new int[]{1, 0};
            } else {
                digits[0] = digits[0] + 1;
                return digits;
            }
        }
        return checkIf(digits, 0);
    }

    public static int[] checkIf(int[] arr, int index) {
        if ( index == 0) {
            if (arr[arr.length-1] < 9) {
                arr[arr.length - 1] = arr[arr.length - 1] + 1;
                return arr;
            }
        }
        if (arr.length  == index && arr[0] == 10) {
            int[] newArr = new int[arr.length + 1];
            newArr[0] = 1;
            for (int i = newArr.length - 1; 0 < i; i--) {
                newArr[i] = 0;
            }
            return newArr;
        }
        if (index >= 1) {
            if (arr[arr.length - index] == 10) {
                arr[arr.length - index - 1] = arr[arr.length - index - 1] + 1;
                arr[arr.length - index] = 0;
                index++;
                return checkIf(arr, index);
            }else{
                return arr;
            }
        }

        if (index == 0) {
            arr[(arr.length - 1) - index] = arr[(arr.length - 1) - index] + 1;
            index++;
            return checkIf(arr, index);
        }
        return arr;
    }
}
