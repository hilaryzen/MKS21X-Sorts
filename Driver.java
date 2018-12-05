import java.util.Arrays;

public class Driver {
    public static void main(String[] args) {
        int[] ary = {3, 2, 5, 6};
        Sorts.selectionSort(ary);
        System.out.println("Sorting [3,2,5,6]: " + Arrays.toString(ary));

        int[] ary1 = {-3, 2, 5, -6};
        Sorts.selectionSort(ary);
        System.out.println("Sorting [-3,2,5,-6]: " + Arrays.toString(ary1));
    }
}