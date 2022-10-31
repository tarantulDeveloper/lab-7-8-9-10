package lab_8.task_5;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class TwentyNumbersSet {
    public static void main(String[] args) {
        Integer[] ints = new Integer[20];
        for(int i = 0; i < ints.length; i++) {
            ints[i] = i + 1;
        }
        System.out.println("Before putting into set: " + Arrays.toString(ints));
        Set<Integer> numsSet = new HashSet<>(List.of(ints));
        System.out.println("After putting into set: " + numsSet);

        Set<Integer> filteredSet = numsSet.stream().filter(x -> (x < 10)).collect(Collectors.toSet());
        System.out.println("After filtering: " + filteredSet);

    }
}
