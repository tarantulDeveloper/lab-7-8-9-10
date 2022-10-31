package lab_8.task_4;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TwentyWordsBeginsWithL {
    public static void main(String[] args) {
        String[] wordsWithL = {
                "ларингал",
                "ларингализация",
                "ларингит",
                "ларингография",
                "ларинголог",
                "ларингология",
                "ларингопатия",
                "ларингопластика",
                "ларингосклерома",
                "ларингоскоп",
                "ларингоскопия",
                "ларингоспазм",
                "ларингостеноз",
                "ларингостома",
                "ларингостомия",
                "ларингостробоскоп",
                "ларингостробоскопия",
                "ларинготомия",
                "ларинготрахеит",
                "ларинготрахеостомия"
        };
        System.out.println(wordsWithL.length + " words");
        Set<String> wordsSet = new HashSet<>(List.of(wordsWithL));
        System.out.println(wordsSet);
    }
}
