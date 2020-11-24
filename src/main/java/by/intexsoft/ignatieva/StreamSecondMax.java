package by.intexsoft.ignatieva;

import java.util.Arrays;
import java.util.Comparator;

public class StreamSecondMax {
    public static int findSecondMax(int[] array) {
        return Arrays.stream(array).boxed().sorted(Comparator.reverseOrder())
                .skip(1).findFirst().get();
    }
}
