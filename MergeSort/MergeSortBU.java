import java.util.Arrays;

/**
 * 迭代实现归并排序
 * @author robinson
 */
public class MergeSortBU {
    private MergeSortBU() {
    }

    /**
     * 迭代实现归并算法
     * @param array
     * @param <E>
     */
    public static <E extends Comparable<E>>void sort(E[] array){
        E[] temp = Arrays.copyOf(array, array.length );
        int n=array.length;

        /**
         * 使用插入排序优化
         * 遍历一遍，对所有 arr[i, i + 15] 的区间，使用插入排序法
         */
        for(int i=0;i<n;i+=16){
            InsertionSort.sort(array,i,Math.min(n-1,i+15));
        }

        /**
         * 合并的区间长度
         * 注意，size 从 16 开始
         */
        for (int size=16;size<n;size+=size){
            /**
             * 遍历合并两个区间的起始位置为i
             * 合并 [i, i + sz - 1] 和 [i + sz, Math.min(i + sz + sz - 1, n - 1)]
             */
            for (int i=0;i+size<n;i+=size+size){
                if (array[i+size-1].compareTo(array[i+size])>0){
                    merge(array,i,i+size-1,Math.min(i+size+size-1,n-1),temp);                }
            }
        }
    }
    private static <E extends Comparable<E>>void merge(E[] array,int l,int mid,int r,E[] temp){
        //利用系统的数组拷贝确保array 和 temp 中的数据一致，并且避免了temp数组与array之间的偏移量
        System.arraycopy(array,l,temp,l,r-l+1);
        int i=l;
        int j=mid+1;

        //为array[K]赋值
        for (int k=l;k<=r;k++){
            //越界处理
            if (i>mid){
                array[k] = temp[j];
                j++;
            }else if (j>r){
                array[k]=temp[i];
                i++;
            }
            //不越界比较
            else if (temp[i].compareTo(temp[j])<=0){
                array[k]=temp[i];
                i++;
            }else {
                array[k]=temp[j];
                j++;
            }
        }
    }
}
