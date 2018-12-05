public class Sorts {
    public static void selectionSort(int[] ary) {
        //Store the minimum value of the array and its position
        int index;
        int min;
        //Loops through all the elements to order them
        for (int i = 0; i < ary.length; i++) {
            index = i;
            min = ary[i];
            //Looks for the smallest value after current position
            for (int j = i + 1; j < ary.length; j++) {
                if (ary[j] < min) {
                    min = ary[j];
                    index = j;
                }
                //System.out.println(min);
            }
            //Switches values if the current one is not the minimum
            if (ary[i] != min) {
                ary[index] = ary[i];
                ary[i] = min;
            }
        }
    }
}