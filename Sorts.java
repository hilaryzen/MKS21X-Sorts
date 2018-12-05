public class Sorts {
    public static void selectionSort(int[] ary) {
        int index = 0;
        int min = ary[0];
        for (int i = 0; i < ary.length; i++) {
            for (int j = i; j < ary.length; j++) {
                if (ary[j] < min) {
                    min = ary[j];
                    index = j;
                }
            }
            if (ary[i] != min) {
                ary[index] = ary[i];
                ary[i] = min;
            }
        }
    }
}