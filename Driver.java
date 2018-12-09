import java.util.Arrays;

public class Driver {
    public static void main(String[] args) {
        int[] ary = {3, 2, 5, 6};
        Sorts.selectionSort(ary);
        System.out.println("Sorting [3, 2, 5, 6]: " + Arrays.toString(ary));

        int[] ary1 = {-3, 2, 5, -6};
        Sorts.selectionSort(ary1);
        System.out.println("Sorting [-3, 2, 5, -6]: " + Arrays.toString(ary1));

        int[] ary2 = {3, 12, 34, 6, 1000, -9};
        Sorts.selectionSort(ary2);
        System.out.println("Sorting [3, 12, 34, 6, 1000, -9]: " + Arrays.toString(ary2));

        int[] ary3 = {7, 5, 4, 2};
        Sorts.selectionSort(ary3);
        System.out.println("Sorting [7, 5, 4, 2]: " + Arrays.toString(ary3));

        System.out.println("Sorting [5, 1, 12, -5, 16]: ");
        int[] ary4 = {5, 1, 12, -5, 16};
        Sorts.bubbleSort(ary4);

        System.out.println("Sorting [2, 3, 4, 5, 1]: ");
        int[] ary5 = {2, 3, 4, 5, 1};
        Sorts.bubbleSort(ary5);

        System.out.println("Sorting [6, 1, 2, 3, 4, 5]: ");
        int[] ary6 = {6, 1, 2, 3, 4, 5};
        Sorts.bubbleSort(ary6);
    }
}
