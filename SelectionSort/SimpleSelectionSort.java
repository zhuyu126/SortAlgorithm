/**
 * 简单的选择排序
 * 1. 从待排序序列中，找到关键字最小的元素；
 *2. 如果最小元素不是待排序序列的第一个元素，将其和第一个元素互换；
 * 3. 从余下的 N - 1 个元素中，找出关键字最小的元素，重复①、②步，直到排序结束。
 *    仅增量因子为1 时，整个序列作为一个表来处理，表长度即为整个序列的长度。
 * @author robinson
 */
public class SimpleSelectionSort {
    private SimpleSelectionSort() {
    }

    /**
     * 选择排序
     * @param array 待排序数组
     */
    public static void sort(int[] array){
        if (array.length==0){
            return;
        }
        for (int i=0;i<array.length;i++){
            int minIndex=i;
            for (int j=i;j<array.length;j++){
                if (array[j]<array[minIndex]){
                    minIndex=j;
                }
            }
            swap(array, i,minIndex);
        }
    }
    private static void swap(int[] array,int i,int j){
        int temp=array[i];
        array[i]=array[j];
        array[j]=temp;
    }
}
