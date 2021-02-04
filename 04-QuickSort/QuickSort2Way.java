import java.util.Random;

/**
 * 双路快排
 * @author robinson
 */
public class QuickSort2Way {
    private QuickSort2Way() {
    }
    public static <E extends Comparable<E>>void quickSort2Way(E[] array){
        Random random=new Random();
        sort(array,0,array.length-1,random);
    }
    public static <E extends Comparable<E>>void sort(E[] array, int l, int r, Random random){
        if (l>=r){
            return;
        }
        int p=partition2ways(array,l,r,random);
        sort(array,l,p-1, random);
        sort(array,p+1,r,random);
    }

    private static<E extends Comparable<E>> int partition2ways(E[] array, int l, int r, Random random) {
        int p=l+random.nextInt(r-l+1);
        swap(array,l,p);
        //arr[l+1...i-1] <= p; arr[j+1...r] >= p
        int i=l+1,j=r;
        while(i<=j){
            while(i<=j&& array[i].compareTo(array[l])<0){//坑2 从前往后找到比基准小的元素，插入到基准位置坑2
                i++;
            }
            while(i<=j&&array[j].compareTo(array[l])>0){//坑3 从后向前找到比基准大的元素，插入到基准位置坑3中
                j--;
            }
            if (i>j){
                break;
            }
            swap(array,i,j);
            i++;
            j--;

        }
        swap(array,l,j);
        return j;
    }

    private static<E> void swap(E[] array, int i, int j) {
        E temp=array[i];
        array[i]=array[j];
        array[j]=temp;
    }
}
