
import java.util.Arrays;

public class CalulateAverage {
    public static void main(String[] args) {
        int[] numbers = {18, 62, 38, 43,56,76,34,47};

        System.out.println("Original Arrays :" + Arrays.toString(numbers));
        double average = calculateAverage(numbers);

        System.out.println("Average of arrays value :" + average);
    }

    public static double calculateAverage(int[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];

    }
    return (double) sum / array.length;
}
}
