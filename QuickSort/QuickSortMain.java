import java.util.Arrays;

/**
 * @author robinson
 */
public class QuickSortMain {
    public static void main(String[] args) {
        int[] dataSize={100000,1000000};
        for (int n:dataSize){
            Integer[]array=ArrayGenerator.generateRandomArray(n,n);
            Integer[] array2= Arrays.copyOf(array,array.length);
            Integer[] array3= Arrays.copyOf(array,array.length);
            System.out.println("RandomArray:");
            SortingHelper.sortTest("MergeSort",array);
            SortingHelper.sortTest("QuickSort",array);
            SortingHelper.sortTest("QuickSort2Way",array2);
            SortingHelper.sortTest("QuickSort3Ways",array3);
            System.out.println();

            System.out.println("OrderArray");
            array=ArrayGenerator.generateOrderArray(n);
            array2=Arrays.copyOf(array,array.length);
            array3=Arrays.copyOf(array,array.length);
            SortingHelper.sortTest("MergeSort",array3);
            SortingHelper.sortTest("QuickSort",array);
            SortingHelper.sortTest("QuickSort2Way",array2);
            SortingHelper.sortTest("QuickSort3Ways",array3);
            System.out.println();

            System.out.println("Same Value Array");
            array=ArrayGenerator.generateRandomArray(n,1);
            array2=Arrays.copyOf(array,array.length);
            array3=Arrays.copyOf(array,array.length);
            SortingHelper.sortTest("QuickSort",array);
            SortingHelper.sortTest("QuickSort2Way",array2);
            SortingHelper.sortTest("QuickSort3Ways",array3);
            System.out.println();
        }
    }
}
