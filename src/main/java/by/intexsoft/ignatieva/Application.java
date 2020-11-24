package by.intexsoft.ignatieva;

public class Application {
    public static void main(String args[]) {
        int[] exampleArray = new int[]{10,20,340,409,3456,78};
        System.out.println(NaiveSecondMax.findSecondMax(exampleArray));
        System.out.println(StreamSecondMax.findSecondMax(exampleArray));

    }
}
