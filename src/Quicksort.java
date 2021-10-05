public class Quicksort {
    public static void main(String[] args) {
        quicksort(new String[]{"Aan", "Kaan", "Baan", "Sosa"});
    }

    public static String[] quicksort(String[] arr) {
        //first quicksort array from the first element.
        arr = quicksortHelper(arr, 0, arr.length - 1);
        return arr;
    }

    public static String[] quicksortHelper(String[] arr, int begin, int end) {
        if (begin > end) {
            return new String[]{};
        }
        int rightIndex = end;
        int pivotIndex = begin;
        int leftIndex = begin + 1;
        boolean leftSubArrayIsSmaller;
        while (rightIndex >= leftIndex) {
            //if left element(10) is greater pivot(6) and element on the right(3) then swap left(10) and right(3)
            if (arr[leftIndex].compareTo(arr[pivotIndex]) > 0 && arr[rightIndex].compareTo(arr[pivotIndex]) < 0) {
                swap(leftIndex, rightIndex, arr);
            }
            // left index smaller than pivot move to next index
            if (arr[leftIndex].compareTo(arr[pivotIndex]) <= 0) {
                leftIndex += 1;
            }
            // right index bigger then index
            if (arr[rightIndex].compareTo(arr[pivotIndex]) > 0) {
                rightIndex -= 1;
            }
        }
        swap(pivotIndex, rightIndex, arr);
        return null;
//        leftSubArrayIsSmaller =
//        (persons.get(loopIndex).getVoornaam().compareTo(persons.get(loopIndex - 1).getVoornaam()
        // if element is
    }

    public static String[] swap(int i, int j, String[] arr) {
        String temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return arr;
    }
}
