public class sumofarray{

    public static void main(String[] args){
        //initialize array

        int[] arr = new int[]{1, 2, 3, 4, 5};

        int sum = 0;
        //Loop through the array to calculate sum of elements

        for (int i = 0; i < arr.length; i++){

            sum = sum + arr[i];
        }
        System.out.println("sum of all the elements of an array: " + sum);
    }
}
