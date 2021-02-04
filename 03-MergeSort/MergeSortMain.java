import java.util.Arrays;

public class MergeSortMain {
    public static void main(String[] args) {
        int n=1000000;
        System.out.println("Random Array : ");
        Integer[] array=ArrayGenerator.generateRandomArray(n,n);
        Integer[] array2=Arrays.copyOf(array,array.length);
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
            SortingHelper.sortTest("AnotherMergeSort",arrayTest3);

        }
        Integer [] arr={7, 1, 4, 2, 8, 3, 6, 5};
        SortingHelper.sortTest("MergeSortTrack",arr);


        SortingHelper.sortTest("MergeSortByInsertSort",array2);
        SortingHelper.sortTest("MergeSortAdvancedOptimization",array2);
        SortingHelper.sortTest("MergeSortOptimization",array2);
        SortingHelper.sortTest("MergeSortBU",array2);
        /**
         * 当数据有序的情况下，优化merge操作后，MergeSort的时间复杂度为O(n)
         * 是因为merge操作时的时间复杂度变为O(n)
         */
        System.out.println("\nOrdered Array : ");
        array=ArrayGenerator.generateOrderArray(n);
        array2=Arrays.copyOf(array,array.length);
        SortingHelper.sortTest("MergeSort",array);
        SortingHelper.sortTest("MergeSortOptimization",array2);
    }
}
