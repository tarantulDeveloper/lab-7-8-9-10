package lab_7.task_3;

public class Test {
    public static void main(String[] args) {
        String[] arr1 = {"Cat", "Dog", "Mouse"};
        Integer[] arr2 = {1, 2, 3};

        Elements elements = new Elements();
        elements.<String>printElems(arr1);
        elements.<Integer>printElems(arr2);
    }
}
