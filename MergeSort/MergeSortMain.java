public class MergeSortMain {
    public static void main(String[] args) {
        int n=100000;
        Integer[] array=ArrayGenerator.generateRandomArray(n,n);
        SortingHelper.sortTest("MergeSort",array);
    }
}
