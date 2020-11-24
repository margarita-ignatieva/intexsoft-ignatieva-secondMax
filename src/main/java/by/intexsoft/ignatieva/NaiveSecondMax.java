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
        int index = 0;
        while (index < array.length - 1) {
            if (array[index] > array[index + 1]) {
                if (max < array[index] && max > array[index + 1]) {
                    int temp = max;
                    max = array[index];
                    secondMax = temp;
                }
                if (max < array[index] && max < array[index + 1]) {
                    max = array[index];
                    secondMax = array[index + 1];
                }
            }
            if (array[index] < array[index + 1]) {
                if (max < array[index + 1] && max >= array[index]) {
                    int temp = max;
                    max = array[index + 1];
                    secondMax = temp;
                }
                if (max < array[index + 1] && max < array[index]) {
                    max = array[index + 1];
                    secondMax = array[index];
                }
            }
            if (array[index] == array[index + 1]) {
                if (max < array[index] && max == secondMax) {
                    max = array[index];
                    secondMax = array[index];
                    index++;
                }
            }
            index++;
        }
        return secondMax;
    }
}
