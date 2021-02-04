import java.util.Arrays;

/**
 * MergeSort 内存优化
 * @author robinson
 */
public class MergeSortAdvancedOptimization {
    public MergeSortAdvancedOptimization() {
    }
    public static <E extends Comparable<E>>void sort(E[] array){
        //创建一个全局的temp数组 避免在递归执行中频繁的创建临时temp数组变量节省内存资源
        E[] temp= Arrays.copyOf(array,array.length);
        sort(array,0,array.length-1,temp);
    }

    /**
     * 递归实现递归排序
     * @param array 排序数组
     * @param l 左区间 起始索引
     * @param r 右区间 终止索引
     * @param <E> 泛型类
     */
    private static <E extends Comparable<E>>void sort(E[] array,int l,int r,E[] temp){
        if (l>=r){
            return;
        }
        int mid = l + (r - l) / 2;
        sort(array, l,mid,temp);
        sort(array,mid+1,r,temp);
        if (array[mid].compareTo(array[mid+1])>0){
            merge(array,l,mid,r,temp);
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
