package by.intexsoft.ignatieva;

public class NaiveSecondMax {
    public static int findSecondMax(int[] array) {
        int max = array[0];
        int secondMax = array[1];
        for (int index = 2; index < array.length; index++) {
            int temp = max;
            if (max < secondMax) {
                max = secondMax;
                secondMax = temp;
            }
            if (max < array[index]) {
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
