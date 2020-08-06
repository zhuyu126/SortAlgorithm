import java.util.Arrays;

public class MergeSortMain {
    public static void main(String[] args) {
        int n=100000;
        Integer[] array=ArrayGenerator.generateRandomArray(n,n);
        SortingHelper.sortTest("MergeSort",array);
        System.out.println("选择排序&插入排序&归并排序性能比较分析:");
        int[] dataSize = {10000, 100000};
        for(int p: dataSize){
            Integer[] arrayTest = ArrayGenerator.generateRandomArray(p, p);
            Integer[] arrayTest2 = Arrays.copyOf(arrayTest, arrayTest.length);
            Integer[] arrayTest3 = Arrays.copyOf(arrayTest, arrayTest.length);
            SortingHelper.sortTest("SelectionSort", arrayTest);
            SortingHelper.sortTest("InsertionSort",arrayTest2);
            SortingHelper.sortTest("MergeSort",arrayTest3);
        }
        Integer [] arr={7, 1, 4, 2, 8, 3, 6, 5};
        SortingHelper.sortTest("MergeSortTrack",arr);
    }
}
