import java.util.Random;

/**
 * 在对数据相等情况下进行排序时会产生性能退化
 * @author robinson
 */
public class QuickSort {
    private QuickSort() {
    }

    public static  <E extends Comparable<E>>void quickSort(E[] array){
        sort(array,0,array.length-1);
    }
    public static <E extends Comparable<E>>void sort(E[] array,int l,int r){
        if(l >= r) {
            return;
        }

        int p = partition(array, l, r);
        sort(array, l, p - 1);
        sort(array, p + 1, r);
    }

    /**
     * 快速排序算法——partition
     * @param array 排序数组
     * @param l 左闭区域值
     * @param r 右闭区域值
     * @param <E> 泛型
     * @return 基准pivot
     */
    private static<E extends Comparable<E>> int partition(E[] array, int l, int r) {
        //arr[l+1...j] < p ; arr[j+1...i] >= p
        /**
         * 生成 [l, r] 之间的随机基准值索引，进行交换，解决有序数组排序时的性能退化问题
         */
        int p=l+(new Random()).nextInt(r-l+1);
        swap(array,l,p);

        /**
         * 以L为一个基准索引
         */
        int j=l;
        for(int i=l+1;i<=r;i++){
            if (array[i].compareTo(array[l])<0){
                j++;
                swap(array,i,j);
            }
        }
        //基准点和J索引位置数据交换保证基准点左边的都是小于基准值
        swap(array,l,j);
        return j;
    }
    public static  <E extends Comparable<E>>void quickSort2(E[] array){
        Random random=new Random();
        sort2(array,0,array.length-1,random);
    }
    public static <E extends Comparable<E>>void sort2(E[] array,int l,int r,Random random){
        if(l >= r) {
            return;
        }

        int p = partition2(array, l, r, random);
        sort2(array, l, p-1, random);
        sort2(array, p + 1, r, random);
    }

    /**
     * 快速排序算法——partition
     * @param array 排序数组
     * @param l 左闭区域值
     * @param r 右闭区域值
     * @param <E> 泛型
     * @return 基准pivot
     */
    private static<E extends Comparable<E>> int partition2(E[] array, int l, int r,Random random) {

        /**
         * 生成 [l, r] 之间的随机基准值索引，进行交换，解决有序数组排序时的性能退化问题
         */
        int p=l+random.nextInt(r-l+1);
        swap(array,l,p);

        /**
         * 以L为一个基准索引
         */
        //arr[l+1...j] < p ; arr[j+1...i] >= p
        int j=l;
        for(int i=l+1;i<=r;i++){
            if (array[i].compareTo(array[l])<0){
                j++;
                swap(array,i,j);
            }
        }
        //基准点和J索引位置数据交换保证基准点左边的都是小于基准值
        swap(array,l,j);
        return j;
    }

    private static <E> void swap(E[] array, int i, int j) {
        E temp=array[i];
        array[i]=array[j];
        array[j]=temp;
    }
}
