package by.intexsoft.ignatieva;

import java.util.Arrays;
import java.util.Collections;

public class StreamSecondMax {
    public static int findSecondMax(int[] array) {
        if (array == null) {
            throw new RuntimeException("Input array can't be null");
        }
        if (array.length == 0) {
            throw new RuntimeException("Input array can't be of length 0");
        }
        if (array.length == 1) {
            return array[0];
        }
        final int max = Arrays.stream(array).max().getAsInt();
        return Arrays.stream(array).boxed().sorted(Collections.reverseOrder()).filter(x -> x != max).findFirst().orElse(max);
    }
}
