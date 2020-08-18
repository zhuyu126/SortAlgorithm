import java.util.Arrays;

/**
 * @author robinson
 */
public class QuickSortMain {
    public static void main(String[] args) {
        int[] dataSize={1000000,10000000};
        for (int n:dataSize){
            Integer[]array=ArrayGenerator.generateRandomArray(n,n);
            Integer[] array2= Arrays.copyOf(array,array.length);
            System.out.println("无序数组");
            SortingHelper.sortTest("MergeSort",array);
            SortingHelper.sortTest("QuickSort",array2);
            System.out.println("有序数组");
            Integer[] array3=ArrayGenerator.generateOrderArray(n);
            Integer[] array4=Arrays.copyOf(array3,array3.length);
            SortingHelper.sortTest("MergeSort",array3);
            SortingHelper.sortTest("QuickSort",array4);
        }
    }
}
