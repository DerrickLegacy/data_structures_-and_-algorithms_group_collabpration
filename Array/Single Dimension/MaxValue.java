public class MaxValue {
    public static double[] array = { 3.5, 78.3, 23.6, 81.3, 23.0 };
    public static double[] az;

    public static void getMax(double[] array) {
        if (array != null) {
            double currentMax = array[0];
            for (int i = 0; i < array.length; i++) {
                if (array[i] > currentMax) {
                    currentMax = array[i];
                }
                System.out.println(currentMax);
            }
        } else {
            System.out.println("Array is empty");
        }
    }

    public static void main(String[] args) {
        getMax(array);
        getMax(az);
    }
}