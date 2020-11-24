package by.intexsoft.ignatieva;

public class NaiveSecondMax {
    public static int findSecondMax(int[] array) {
        int max = array[0];
        int secondMax = array[1];
        for (int index = 2; index < array.length; index++) {
            if (max < secondMax) {
                int temp = max;
                max = secondMax;
                secondMax = temp;
            }
            if (max < array[index]) {
                int temp = max;
                max = array[index];
                secondMax = temp;
            }
            if (max > array[index] && secondMax < array[index]) {
                secondMax = array[index];
            }
        }
        return secondMax;
    }
}
