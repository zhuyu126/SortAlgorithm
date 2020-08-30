public class HeapSort {
    private HeapSort() {
    }
    public static<E extends Comparable<E>> void heapSort(E[] array){
        if (array.length<=1){
            return;
        }
        for (int i=(array.length-2)/2;i>=0;i--){
            max_heap(array,i,array.length);
        }
        for (int i=array.length-1;i>=0;i--){
            swap(array,0,i);
            max_heap(array,0,i);
        }
    }

    /**
     *  建立data[0, n)最大堆
     * @param array
     * @param k 索引K
     * @param n 数组长度索引
     * @param <E>
     */
    private static <E extends Comparable<E>>void max_heap(E[] array,int k,int n){
        while (2*k+1<n){//2*K+1 相当于左孩子索引
            int j=2*k+1;//在此轮循环中,data[k]和data[j]交换位置
            if (j+1<n && array[j+1].compareTo(array[j])>0){
                j++;
            }
            if (array[k].compareTo(array[j])>=0){
                break;
            }
            swap(array,k,j);
            k=j;
        }
    }
    private static<E> void swap(E[] array,int i,int j){
        E temp=array[i];
        array[i]=array[j];
        array[j]=temp;
    }
}
