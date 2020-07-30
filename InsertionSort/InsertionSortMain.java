import java.util.Arrays;

public class InsertionSortMain {
    public static void main(String[] args) {
        int[] arr={23,12,34,67,11,75};
        System.out.println("排序前为:");
        dispay(arr);
        SimpleInsertionSort.sort(arr);
        System.out.println("排序后为:");
        System.out.print("sort:");
        for(int e: arr) {
            System.out.print(e + " ");
        }
        System.out.println();
        System.out.print("sort2:");
        SimpleSelectionSort.sort2(arr);
        for(int e: arr) {
            System.out.print(e + " ");
        }
        System.out.println();

        System.out.println("直接插入排序性能分析:");
        int[] dataSize = {10000, 100000};
        for(int n: dataSize){
            Integer[] array = ArrayGenerator.generateRandomArray(n, n);
            Integer[] array2= Arrays.copyOf(array,array.length);
            System.out.print("sort(未优化)"+"\t");
            SortingHelper.sortTest("InsertionSort", array);
            System.out.print("sort2(优化)"+"\t");
            SortingHelper.sortTest("InsertionSort2", array2);
        }
    }

    public static<E> void dispay(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
