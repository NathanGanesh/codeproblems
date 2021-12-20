package alertservice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Arrays;
import java.util.HashSet;

public class UniqueNumbers {
    public static Collection<Integer> findUniqueNumbers(Collection<Integer> numbers) {
        ArrayList<Integer> integers = new ArrayList<>();
        Object[] objects = numbers.toArray();
        for (int i = 0; i < objects.length; i++) {
            int object = (int) objects[i];
            if (!integers.contains(object)) {
                integers.add(object);
            }
        }

        return integers;
    }

    public static void main(String[] args) {

        Collection<Integer> numbers = Arrays.asList(1, 2, 1, 3);
        for (int number : findUniqueNumbers(numbers))
            System.out.println(number);
    }
}
