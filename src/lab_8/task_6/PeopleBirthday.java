package lab_8.task_6;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Calendar;
import java.util.stream.Collectors;

public class PeopleBirthday {
    public static void main(String[] args) {

        Map<String, Date> peoplesBirthdays = new HashMap<>();
        peoplesBirthdays.put("Nicolas",new Date(1991,Calendar.NOVEMBER, 23));
        peoplesBirthdays.put("Aybek",new Date(1990,Calendar.JULY, 1));
        peoplesBirthdays.put("Gulnara",new Date(1978,Calendar.AUGUST, 3));
        peoplesBirthdays.put("Tahmina",new Date(2021,Calendar.JUNE, 27));
        peoplesBirthdays.put("Perizat",new Date(2001,Calendar.FEBRUARY, 20));
        peoplesBirthdays.put("Bekzhan",new Date(1988,Calendar.JULY, 27));
        peoplesBirthdays.put("Mikael",new Date(1999,Calendar.JANUARY, 1));
        peoplesBirthdays.put("Michael",new Date(1954,Calendar.DECEMBER, 31));
        peoplesBirthdays.put("Ainash",new Date(1970,Calendar.JUNE, 23));
        peoplesBirthdays.put("Berdibek",new Date(1995,Calendar.MAY, 31));

        System.out.println("Before filtering:");
        int count = 1;
        for(Map.Entry<String, Date> people : peoplesBirthdays.entrySet()) {
            System.out.println(count + ") " + people.getKey() + " was born on {"
                    + people.getValue()
                    + "}");
            count++;
        }
        System.out.println();
        System.out.println("*************************************************");
        System.out.println();
        System.out.println("After filtering: ");

        Map<String, Date> filteredMap = peoplesBirthdays.entrySet()
                        .stream()
                .filter(p -> p.getValue().getMonth() > 4 && p.getValue().getMonth() < 8)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        int fCount = 0;
        for(Map.Entry<String, Date> people : filteredMap.entrySet()) {
            System.out.println(fCount + ") " + people.getKey() + " was born on {" + people.getValue() + "}");
            fCount++;
        }
    }
}
