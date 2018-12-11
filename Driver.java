import java.util.Arrays;

public class Driver {
    public static void main(String[] artie) {
        /*
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
        */

        /*
        int[] randish = new int[Integer.parseInt(artie[0])];
        for(int i = 0 ; i < randish.length; i++){
            randish[i] =(int)(Math.random()*10000);
        }

        if(artie[1].equals("selection")){
            Sorts.selectionSort(randish);
        }
        if(artie[1].equals("bubble")){
            Sorts.bubbleSort(randish);
        }
        if(artie[1].equals("test")){
            int[] randish2 = Arrays.copyOf(randish,randish.length);
            int[] randish3 = Arrays.copyOf(randish,randish.length);
            Sorts.selectionSort(randish);
            Sorts.bubbleSort(randish2);
            Arrays.sort(randish3);
            if( Arrays.equals(randish,randish3)){
                System.out.println("Selection Correct!");
            } else {
                System.out.println("Selection BROKEN!!!!");
            }
            if( Arrays.equals(randish2,randish3)){
                System.out.println("Bubble Correct!");
            } else {
                System.out.println("Bubble BROKEN!!!!");
            }
        }
        */

        System.out.println("Sorting [6, 1, 2, 3, 4, 5]: ");
        int[] ary7 = {6, 1, 2, 3, 4, 5};
        Sorts.insertionSort(ary7);
        System.out.println(Arrays.toString(ary7));
    }
}
