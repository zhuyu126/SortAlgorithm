import java.util.Arrays;

public class ShellSortMain {
    public static void main(String[] args) {
        int n=100000;
        Integer[] array=ArrayGenerator.generateRandomArray(n,n);
        Integer[] array2= Arrays.copyOf(array,array.length);
        Integer[] array3= Arrays.copyOf(array,array.length);
        SortingHelper.sortTest("ShellSort",array);
        SortingHelper.sortTest("ShellSort3",array);
        SortingHelper.sortTest("AnotherShellSort",array);
        SortingHelper.sortTest("AnotherShellSort3",array);
        SortingHelper.sortTest("MergeSort",array2);
        SortingHelper.sortTest("InsertionSort",array3);
    }
}
