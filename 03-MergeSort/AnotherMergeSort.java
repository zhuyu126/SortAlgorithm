import java.util.Arrays;

public class AnotherMergeSort {
    private AnotherMergeSort() {
    }
    // 自顶向下的归并排序
    public static <E extends Comparable<E>> void sort(E[] array){
        E[] temp= Arrays.copyOf(array,array.length);
        sort(array,0,array.length,temp);
    }
    //对 arr[l, r) 范围进行排序
    private static <E extends Comparable<E>>void sort(E[] array,int l,int r,E[] temp){
        if (r-l<=1){
            return;
        }
        int mid=l+(r-l)/2;
        sort(array,l,mid,temp);
        sort(array,mid,r,temp);
        if (array[mid-1].compareTo(array[mid])>0){
            merge(array,l,mid,r,temp);
        }
    }
    private static <E extends Comparable<E>>void merge(E[] array,int l,int mid,int r,E[] temp){
        System.arraycopy(array,l,temp,l, r-l+1);
        int i=l,j=mid;
        for (int k=l;k<r;k++){
            if (i>=mid){
                array[k]=temp[j];
            }else if(j>=r){
                array[k]=temp[i];
            }
            else if (temp[i].compareTo(temp[j])<=0){
                array[k]=temp[i];
            }else {
                array[k]=temp[j];
            }
        }
    }
}
