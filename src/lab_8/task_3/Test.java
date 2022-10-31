package lab_8.task_3;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        Map<String, Cat> catsMap = new HashMap<>();
        Cat cat1 = new Cat("Philipp");
        Cat cat2 = new Cat("Masha");
        Cat cat3 = new Cat("Lena");
        Cat cat4 = new Cat("Bogdan");
        Cat cat5 = new Cat("Boris");
        Cat cat6 = new Cat("Kolya");
        Cat cat7 = new Cat("Ilya");
        Cat cat8 = new Cat("Dmitriy");
        Cat cat9 = new Cat("Anna");
        Cat cat10 = new Cat("Maya");

        catsMap.put(cat1.getName(), cat1);
        catsMap.put(cat2.getName(), cat2);
        catsMap.put(cat3.getName(), cat3);
        catsMap.put(cat4.getName(), cat4);
        catsMap.put(cat5.getName(), cat5);
        catsMap.put(cat6.getName(), cat6);
        catsMap.put(cat7.getName(), cat7);
        catsMap.put(cat8.getName(), cat8);
        catsMap.put(cat9.getName(), cat9);
        catsMap.put(cat10.getName(), cat10);

//        for (Map.Entry<String, Cat> cat : catsMap.entrySet()) {
//            System.out.println(cat.getKey() + " - " + cat.getValue());
//        }
        catsMap.forEach((k,v) -> System.out.println(
                k + " - " + v
        ));

    }
}
