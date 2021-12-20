package removekFromList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class MergeNames {

    public static String[] uniqueNames(String[] names1, String[] names2) {
        ArrayList<String>
                mergedNames = new ArrayList<>();
        for (String s : names1) {
            if (!mergedNames.contains(s)) {
                mergedNames.add(s);
            }
        }
        for (String s : names2) {
            if (!mergedNames.contains(s)) {
                mergedNames.add(s);
            }
        }
        return mergedNames.toArray(new String[mergedNames.size()]);
    }

    public static void main(String[] args) {
        String[] names1 = new String[]{"Ava", "Emma", "Olivia"};
        String[] names2 = new String[]{"Olivia", "Sophia", "Emma"};
        System.out.println(String.join(", ", MergeNames.uniqueNames(names1, names2))); // should print Ava, Emma, Olivia, Sophia
    }
}