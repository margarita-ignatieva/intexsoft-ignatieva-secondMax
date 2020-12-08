package by.intexsoft.ignatieva;

public class NaiveSecondMax {
    public static int findSecondMax(int[] array) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        if (array == null) {
            throw new RuntimeException("Input array can't be null");
        }
        if (array.length == 0) {
            throw new RuntimeException("Input array can't be of length 0");
        }
        if (array.length == 1) {
            return array[0];
        }
        int step  = 0;
        for (int element : array) {
            if (max < element) {
                secondMax = max;
                max = element;
            } else if (secondMax < element && element != max){
                secondMax = element;
            }
            if (++step == array.length && secondMax == Integer.MIN_VALUE) {
                secondMax = element;
            }
        }
        return secondMax;
    }
}
