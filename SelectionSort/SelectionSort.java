/**
 * 通用的选择排序
 * @author robinson
 */
public class SelectionSort {
    private SelectionSort() {
    }
    /**
     * 选择排序
     * @param array 待排序数组
     */
    public static <E extends Comparable<E>> void sort(E[] array){
        if (array.length==0){
            return;
        }
        for (int i=0;i<array.length;i++){
            int minIndex=i;
            for (int j=i;j<array.length;j++){
                if (array[j].compareTo(array[minIndex])<0){
                    minIndex=j;
                }
            }
            swap(array, i,minIndex);
        }
    }


    private static <E> void swap(E[] array,int i,int j){
        E temp=array[i];
        array[i]=array[j];
        array[j]=temp;
    }
}
