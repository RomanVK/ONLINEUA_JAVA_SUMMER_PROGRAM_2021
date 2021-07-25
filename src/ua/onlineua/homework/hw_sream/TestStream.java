package ua.onlineua.homework.hw_sream;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class TestStream {

    public static void main(String[] args) {
        int[] array = new int[]{3, 2, 0, 4, 5};
        int min;
        int[] arrayOut;

        System.out.println("Source array is : " + Arrays.toString(array));

        //1. Average value of the array's elements;
        System.out.println("1. Average: " + IntStream.of(array).average().getAsDouble());

        //2.1. Min element
        IntSummaryStatistics stats = IntStream.of(array).summaryStatistics();
        min = stats.getMin();
        System.out.format("2.1. Min element: %d%n", min);

        //2.2. Index of min element
        int indexMinElement = IntStream.range(0, array.length)
                .filter(i -> min == array[i])
                .findFirst()
                .getAsInt();
        System.out.println("2.2. Index min element: " + indexMinElement);

        //3. Quantity of element which equals 0
        long quantityZerosElement = IntStream.range(0, array.length)
                .filter(i -> array[i] == 0)
                .count();
        System.out.println("3. Quantity of element which equals 0: " + quantityZerosElement);

        //4. Quantity of element which bigger than zero
        long quantityElementsBiggerZero = IntStream.range(0, array.length)
                .filter(i -> array[i] > 0)
                .count();
        System.out.println("4. Quantity of element which bigger than zero: " + quantityElementsBiggerZero);

        //5. Multiply each element of the array by 10
        arrayOut = IntStream.range(0, array.length)
                .map(i -> array[i] *= 10)
                .toArray();
        System.out.println("5. Multiply each element of the array by 10. Output array is: "
                + Arrays.toString(arrayOut));
    }


}
