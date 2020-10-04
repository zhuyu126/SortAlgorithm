public class SortingHelper {
    private SortingHelper() {
    }

    /**
     * 判断数组是否有序
     * @param array 需判断的数组
     * @param <E> 泛型
     * @return boolean
     */
    public static <E extends Comparable<E>>boolean isSort(E[] array){
        for (int i=1;i<array.length;i++){
            if (array[i-1].compareTo(array[i])>0){
                return false;
            }
        }
        return true;
    }

    /**
     *排序方法的性能测试
     * @param sortName 排序名称
     * @param array 排序数组
     * @param <E> 泛型
     */
    public static <E extends Comparable<E>> void sortTest(String sortName,E[] array){
        long startTime=System.nanoTime();
        if (sortName.equals("SelectionSort")){
            SelectionSort.sort(array);
        }
        if (sortName.equals("InsertionSort")){
            InsertionSort.sort(array);
        }
        if (sortName.equals("InsertionSort2")){
            InsertionSort.sort2(array);
        }
        if (sortName.equals("MergeSort")){
            MergeSort.sort(array);
        }
        if (sortName.equals("MergeSortOptimization")){
            MergeSortOptimization.sort(array);
        }
        if (sortName.equals("MergeSortTrack")){
            MergeSortTrack.sort(array);
        }
        if (sortName.equals("MergeSortByInsertSort")){
            MergeSortByInsertSort.sort(array);
        }
        if (sortName.equals("MergeSortAdvancedOptimization")){
            MergeSortAdvancedOptimization.sort(array);
        }
        if (sortName.equals("MergeSortBU")){
            MergeSortBU.sort(array);
        }
        if (sortName.equals("QuickSort")){
            QuickSort.quickSort2(array);
        }
        if (sortName.equals("AnotherMergeSort")){
            AnotherMergeSort.sort(array);
        }
        if (sortName.equals("QuickSort2Way")){
            QuickSort2Way.quickSort2Way(array);
        }
        if (sortName.equals("QuickSort3Ways")){
            QuickSort3Ways.quickSort3Way(array);
        }
        if (sortName.equals("HeapSort")){
            HeapSort.heapSort(array);
        }
        if (sortName.equals("BubbleSort")){
            BubbleSort.bubbleSort(array);
        }
        if (sortName.equals("AnotherBubbleSort")){
            BubbleSort.anotherBubbleSort(array);
        }
        if (sortName.equals("BubbleSortOptimized")){
            BubbleSort.bubbleSortOptimized(array);
        }if (sortName.equals("BubbleSortOptimized2")){
            BubbleSort.bubbleSortOptimized2(array);
        }
        if (sortName.equals("ShellSort")){
            ShellSort.shellSort(array);
        }
        if (sortName.equals("AnotherShellSort")){
            AnotherShellSort.anotherShellSort(array);
        }
        long endTime=System.nanoTime();
        double time = (endTime - startTime) / 1000000000.0;
        if (!SortingHelper.isSort(array)){
            throw new RuntimeException(sortName+" failed");
        }
        System.out.println(String.format("%s , 数据规模为 n = %d , 花费时间为 %f s", sortName, array.length, time));
    }
}
