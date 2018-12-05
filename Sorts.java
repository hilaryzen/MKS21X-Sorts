public class Sorts {
    public static void selectionSort(int[] ary) {
        int index;
        int min;
        for (int i = 0; i < ary.length; i++) {
            index = i;
            min = ary[i];
            for (int j = i + 1; j < ary.length; j++) {
                if (ary[j] < min) {
                    min = ary[j];
                    index = j;
                }
                System.out.println(min);
            }
            if (ary[i] != min) {
                ary[index] = ary[i];
                ary[i] = min;
            }
        }
    }
}