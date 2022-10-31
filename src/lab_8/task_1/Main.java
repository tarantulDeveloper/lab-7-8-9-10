package lab_8.task_1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Bekzhan");
        names.add("Bekzhan");
        names.add("Bekzhan");
        names.add("Bekzhan");
        names.add("Perizat");
        names.add("Perizat");
        names.add("Perizat");
        names.add("RandomName");
        System.out.println("Before getSet(): " + names);
        System.out.println("After getSet(): " + getSet(names));
    }

    static <T> Set<T> getSet(Collection<T> collection) {
        return new HashSet<T>(collection);
    }
}
