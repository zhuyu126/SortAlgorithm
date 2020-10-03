import java.util.Arrays;

public class BubbleSortMain {
    public static void main(String[] args) {
        int n=100000;
        Integer[] array=ArrayGenerator.generateRandomArray(n,n);
        Integer[] array2= Arrays.copyOf(array,array.length);
        System.out.println("RandomArray");
        SortingHelper.sortTest("BubbleSort",array);
        SortingHelper.sortTest("AnotherBubbleSort",array);
        SortingHelper.sortTest("BubbleSortOptimized",array2);
        System.out.println("OrderArray");
        array=ArrayGenerator.generateOrderArray(n);
        array2=Arrays.copyOf(array,array2.length);
        SortingHelper.sortTest("BubbleSort",array);
        SortingHelper.sortTest("BubbleSortOptimized",array2);
    }
}
