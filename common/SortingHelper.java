public class SortingHelper {
    private SortingHelper() {
    }

    /**
     * 判断数组是否有序
     * @param array 需判断的数组
     * @param <E> 泛型
     * @return boolean
     */
    public static <E extends Comparable<E>>boolean isSort(E[] array){
        for (int i=1;i<array.length;i++){
            if (array[i-1].compareTo(array[i])>0){
                return false;
            }
        }
        return true;
    }

    /**
     *排序方法的性能测试
     * @param sortName 排序名称
     * @param array 排序数组
     * @param <E> 泛型
     */
    public static <E extends Comparable<E>> void sortTest(String sortName,E[] array){
        long startTime=System.nanoTime();
        if (sortName.equals("SelectionSort")){
            SelectionSort.sort(array);
        }
        long endTime=System.nanoTime();
        double time = (endTime - startTime) / 1000000000.0;
        if (!SortingHelper.isSort(array)){
            throw new RuntimeException(sortName+"failed");
        }
        System.out.println(String.format("%s , 数据规模为 n = %d : 花费时间为 %f s", sortName, array.length, time));
    }
}
