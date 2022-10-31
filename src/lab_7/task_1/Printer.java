package lab_7.task_1;

public class Printer{
    <T> void printArray(T[] array) {
        System.out.println("The array of: " + array[0].getClass().getSimpleName());
        for(T element : array) {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }
}
