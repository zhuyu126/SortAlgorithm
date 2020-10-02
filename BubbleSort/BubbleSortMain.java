public class BubbleSortMain {
    public static void main(String[] args) {
        int n=100000;
        Integer[] array=ArrayGenerator.generateRandomArray(n,n);
        SortingHelper.sortTest("BubbleSort",array);
        SortingHelper.sortTest("AnotherBubbleSort",array);
    }
}
