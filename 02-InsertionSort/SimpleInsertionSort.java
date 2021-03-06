/**
 * 一个简单的直接插入排序实现
 *  1. 从第一个元素开始，该元素可以认为已经被排序
 *  2. 取出该一个元素的后一个元素，在已经排序的元素序列中从前向后扫描
 *  3. 如果该元素（已排序）大于新元素，将该元素移到后一位置
 *  4. 重复步骤3，直到找到已排序的元素小于或者等于新元素的位置
 *  5. 将新元素插入到该位置后
 *  6. 重复步骤2~5
 * @author robinson
 */
public class SimpleInsertionSort {
    private SimpleInsertionSort() {
    }

    /**
     * 从前向后扫描 从前向后扫描 每次对于某一个 array[i],在其前面找到插入位置
     * @param array 待排序数组
     */
    public static void sort(int[] array){
        if (array.length==0){
            return;
        }
        for (int i=0;i<array.length;i++){
            //将 arr[i] 插入到合适的位置
            for (int j=i;j-1>=0;j--){
                if (array[j]<array[j-1]){
                    swap(array,j-1,j);
                }
                else {
                    break;
                }
            }
        }
    }

    /**
     * 从前向后扫描 从前向后扫描 每次对于某一个 array[i],在其前面找到插入位置
     * @param array 待排序数组
     */
    public  static void sort2(int[] array){
        if (array.length==0){
            return;
        }
        for (int i=0;i<array.length;i++){
            int temp=array[i];
            int j;
            for (j=i;j-1>=0&&temp<array[j-1];j--){
                array[j-1]=array[j];
            }
            array[j]=temp;
        }
    }

    /**
     * 从后向前扫描 每次对于某一个 array[i],在其后面找到插入位置
     * @param array 待排序数组
     */
    public  static void sort3(int[] array){
        if (array.length==0){
            return;
        }
        for (int i=array.length-1;i>=0;i--){
            int temp=array[i];
            int j;
            for (j=i;j+1<array.length&&temp>array[j+1];j++){
                array[j]=array[j+1];
            }
            array[j]=temp;
        }
    }

    private static void swap(int[] array,int i,int j){
        int temp=array[i];
        array[i]=array[j];
        array[j]=temp;
    }
}
