package lab_7.task_2;

public class Math <T extends Number> {
    private T[] numArray;

    public Math(T[] numArray) {
        this.numArray = numArray;
    }

    public double sumNum() {
        double sum = 0;
        for(T num : numArray) {
            sum += num.doubleValue();
        }
        return sum;
    }

}
