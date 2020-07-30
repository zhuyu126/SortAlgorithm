/**
 * 通用的直接插入排序实现
 * @author robinson
 */
public class InsertionSort {
    private InsertionSort() {
    }

    public static <E extends Comparable<E>> void sort(E[] array){
        if (array.length==0){
            return;
        }
        for (int i=0;i<array.length;i++){
            for (int j=i;j-1>=0&&array[j].compareTo(array[j-1])<0;j--){
                swap(array,j-1,j);
            }
        }
    }
    private static <E> void swap(E[] array,int i,int j){
        E temp=array[i];
        array[i]=array[j];
        array[j]=temp;
    }
}
