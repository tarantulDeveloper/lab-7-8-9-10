package lab_7.task_1;

public class Test {

    public static void main(String[] args) {
        String[] strings = {"Hello", "World"};
        Integer[] integers = {1,2,3};
        Printer printer = new Printer();
        printer.<Integer>printArray(integers);
        printer.<String>printArray(strings);
    }
}
