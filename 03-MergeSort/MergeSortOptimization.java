import java.util.Arrays;

public class MergeSortOptimization {
    private MergeSortOptimization() {
    }
    public static <E extends Comparable<E>>void sort(E[] array){
        sort(array,0,array.length-1);
    }

    private static<E extends Comparable<E>> void sort(E[] array, int l, int r) {
        if (l>=r){
            return;
        }
        int mid = l + (r - l) / 2;
        sort(array, l,mid);
        sort(array,mid+1,r);
        // array[mid]<array[mid+1]则array数组从L到R已经是有序的了，不需要再做归并操作
        if (array[mid].compareTo(array[mid+1])>0){
            merge(array,l,mid,r);
        }
    }

    private static<E extends Comparable<E>> void merge(E[] array, int l, int mid, int r) {
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
