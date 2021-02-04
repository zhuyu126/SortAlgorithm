import java.util.Arrays;

public class MergeSortByInsertSort {
    public MergeSortByInsertSort() {
    }
    public static <E extends Comparable<E>>void sort(E[] array){
        sort(array,0,array.length-1);
    }

    /**
     * 递归实现递归排序
     * @param array 排序数组
     * @param l 左区间 起始索引
     * @param r 右区间 终止索引
     * @param <E> 泛型类
     */
    private static <E extends Comparable<E>>void sort(E[] array,int l,int r){
//        if (l>=r){
//            return;
//        }

        /**
         * 当数据规模小于16时采用插入排序
         */
        if (r-l<= 15){
            InsertionSort.sort(array,l,r);
            return;
        }

        int mid = l + (r - l) / 2;
        sort(array, l,mid);
        sort(array,mid+1,r);
        merge(array,l,mid,r);
    }
    //O(n)
    private static <E extends Comparable<E>>void merge(E[] array,int l,int mid,int r){
        E[] temp= Arrays.copyOfRange(array,l,r+1);
        int i=l;
        int j=mid+1;

        //为array[K]赋值
        for (int k=l;k<=r;k++){
            //越界处理
            if (i>mid){
                array[k] = temp[j - l];
                j++;
            }else if (j>r){
                array[k]=temp[i-l];
                i++;
            }
            //不越界比较
            else if (temp[i-l].compareTo(temp[j-l])<=0){
                array[k]=temp[i-l];
                i++;
            }else {
                array[k]=temp[j-l];
                j++;
            }
        }
    }
}
