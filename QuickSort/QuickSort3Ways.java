import java.util.Random;

/**
 * 三路快排
 * @author robinson
 */
public class QuickSort3Ways {
    private QuickSort3Ways() {
    }
    public static <E extends Comparable<E>>void quickSort3Way(E[] array){
        Random random=new Random();
        sort(array,0,array.length-1,random);
    }
    public static <E extends Comparable<E>>void sort(E[] array, int l, int r, Random random){
        if (l>=r){
            return;
        }
        /**
         * 三路快速排序的 partition 过程
         */
        //生成 [l, r] 之间的随机基准值索引
        int p=l+random.nextInt(r-l+1);
        swap(array,l,p);
        //arr[l + 1, lt] < p, arr[lt + 1, i - 1] == p, arr[gt, r] > p
        int lt=l,gt=r+1,i=l+1;
        while(i<gt){
            if (array[i].compareTo(array[l])<0){
                lt++;
                swap(array,i,lt);
                i++;
            } else if (array[i].compareTo(array[l])>0){
                gt--;
                swap(array,i,gt);
            }else {//array[i]==array[l]
                i++;
            }
        }
        swap(array,l,lt);
        /** 三路快速排序的 partition 过程结束 **/
        sort(array,l,lt-1,random);
        sort(array,gt,r,random);
    }
    private static<E> void swap(E[] array, int i, int j) {
        E temp=array[i];
        array[i]=array[j];
        array[j]=temp;
    }

}
