public class MergeSortMain {
    public static void main(String[] args) {
        int n=100000;
        Integer[] array=ArrayGenerator.generateRandomArray(n,n);
        SortingHelper.sortTest("MergeSort",array);
        Integer [] arr={7, 1, 4, 2, 8, 3, 6, 5};
        SortingHelper.sortTest("MergeSortTrack",arr);
    }
}
