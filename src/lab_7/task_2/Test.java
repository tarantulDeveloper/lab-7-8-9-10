package lab_7.task_2;

public class Test {
    public static void main(String[] args) {
        //with int
        Integer[] intArray = {1,2,3,4,5,6,7};
        Math<Integer> math1 = new Math<Integer>(intArray);
        System.out.println("Integer array sum: " + (int) math1.sumNum());

        //with double
        Double[] doubleArray = {1d,2d,3d,4d,12d, 23d};
        Math<Double> math2 = new Math<>(doubleArray);
        System.out.println("Double array sum: " + math2.sumNum());

        //with floats
        Float[] floatsArray = {1.3f,2.3f,3.4f,5.6f};
        Math<Float> math3 = new Math<>(floatsArray);
        System.out.println("Float array sum: " + math3.sumNum());

    }
}
