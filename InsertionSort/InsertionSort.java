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
    public static <E extends Comparable<E>> void sort2(E[] array){
        if (array.length==0){
            return;
        }
        for (int i=0;i<array.length;i++){
            E temp=array[i];
            int j;
            for (j=i;j-1>=0&&temp.compareTo(array[j-1])<0;j--){
                array[j-1]=array[j];
            }
            array[j]=temp;
        }
    }
    public static <E extends Comparable<E>> void sort3(E[] array){
        if (array.length==0){
            return;
        }
        for (int i=array.length-1;i>=0;i--){
            E temp=array[i];
            int j;
            for (j=i;j+1<array.length&&temp.compareTo(array[j+1])>0;j++){
                array[j]=array[j+1];
            }
            array[j]=temp;
        }
    }
    private static <E> void swap(E[] array,int i,int j){
        E temp=array[i];
        array[i]=array[j];
        array[j]=temp;
    }
}
