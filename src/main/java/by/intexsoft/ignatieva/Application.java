package by.intexsoft.ignatieva;

public class Application {
    public static void main(String args[]) {
        int[] exampleArray = new int[]{10,20,340,409,3456,78};
        System.out.println(NaiveSecondMax.findSecondMax(exampleArray));
        System.out.println(NaiveSecondMax.findSecondMax(null));
        System.out.println(NaiveSecondMax.findSecondMax(new int[]{122, 122, 120, 6, 125, 1, 19}));
        System.out.println(NaiveSecondMax.findSecondMax(new int[]{999,122}));
        System.out.println(NaiveSecondMax.findSecondMax(new int[]{121,999}));
        System.out.println(NaiveSecondMax.findSecondMax(new int[]{1, 122, 125}));
        System.out.println(NaiveSecondMax.findSecondMax(new int[]{111, 111, 111}));
        System.out.println(NaiveSecondMax.findSecondMax(new int[]{120, 6, 122, 1, 19122, 122}));
        System.out.println(StreamSecondMax.findSecondMax(exampleArray));

    }
}
