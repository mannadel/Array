
import java.util.* ;
public class Maxminelements {

    public static void main(String[] args) {        // initialize array

        int[] arr = new int[]{20, 35, 46, 57, 68};

        //MaxMin Variable

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {


            if (arr[i] < min) {

                min = arr[i];
            }
            if (arr[i] > max) {

                max = arr[i];
            }

        }
        System.out.println("Maximum element is : " + max);

        System.out.println("Minimum element is: " + min);

    }

}






