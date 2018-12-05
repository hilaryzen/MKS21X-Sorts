import java.util.Arrays;

public class Driver {
    public static void main(String[] args) {
        int[] ary = {3, 2, 5, 6};
        Sorts.selectionSort(ary);
        System.out.println(Arrays.toString(ary));
    }
}