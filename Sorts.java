import java.util.Arrays;

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
            //System.out.println(Arrays.toString(ary));
        }
    }

    public static void bubbleSort(int[] data) {
        //Starts from the back of the array to make one pass for every element
        boolean swapped = false;
        for (int i = data.length; i > 0; i--) {
            //Checks each element to see if it needs to be switched
            for (int j = 0; j < i - 1; j++) {
                //If an element is larger than the one after it, switch
                if (data[j] > data[j+1]) {
                    int smaller = data[j+1];
                    data[j+1] = data[j];
                    data[j] = smaller;
                    swapped = true;
                }
            }
            //If no element has been swapped, loop is stopped early
            if (swapped == false) {
                i = 0;
            } else {
                swapped = false;
            }
            //System.out.println(Arrays.toString(data));
        }
    }

    public static void insertionSort(int[] data) {
        int current;
        //boolean placed;
        //Loops through all elements starting from the second to insert them
        for (int i = 1; i < data.length; i++) {
            current = data[i];
            /*
            placed = false;
            for (int j = i - 1; j > 0; j--) {
                if (data[j] < current) {
                    data[j+1] = current;
                    j = -1;
                    placed = true;
                } else {
                    data[j+1] = data[j];
                }
            }
            if (! placed) {
                if (data[0] <= current) {
                    data[1] = current;
                } else {
                    data[1] = data[0];
                    data[0] = current;
                }
            }
            */
            int j = i;
            //Loops through sorted elements backwards until it finds an element smaller than current
            while (j > 0 && data[j-1] > current) {
              data[j] = data[j-1];
              j--;
            }
            data[j] = current;
            j = 0;
            //System.out.println(Arrays.toString(data));
        }
    }
}
