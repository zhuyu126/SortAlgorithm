import java.util.Arrays;

/**
 * @author robinson
 */
public class QuickSortMain {
    public static void main(String[] args) {
        int n=10000000;
//        int[] dataSize={1000000,10000000};
//        for (int n:dataSize){
            Integer[]array=ArrayGenerator.generateRandomArray(n,n);
            Integer[] array2= Arrays.copyOf(array,array.length);
            SortingHelper.sortTest("QuickSort",array);
            SortingHelper.sortTest("MergeSort",array2);
//        }
    }
}
