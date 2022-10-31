package lab_8.task_2;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String,String> tenMapArray = new HashMap<>();
        tenMapArray.put("арбуз", "ягода");
        tenMapArray.put("банан", "трава");
        tenMapArray.put("вишня", "ягода");
        tenMapArray.put("груша", "фрукт");
        tenMapArray.put("дыня", "овощ");
        tenMapArray.put("ежевика", "куст");
        tenMapArray.put("жень-шень", "корень");
        tenMapArray.put("земляника", "ягода");
        tenMapArray.put("ирис", "цветок");
        tenMapArray.put("картофель", "клубень");

        //printing elements of map
        for(Map.Entry<String, String> mapElement : tenMapArray.entrySet()) {
            System.out.println(mapElement.getKey() + " -- " + mapElement.getValue());
        }
    }

}
