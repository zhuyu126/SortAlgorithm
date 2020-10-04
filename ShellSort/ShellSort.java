public class ShellSort {
    public static <E extends Comparable<E>>void shellSort(E[] data){
        int gap=data.length/2;
        for (;gap>0;gap/=2){//不断缩小gap，直到1为止
            // 对 data[start, start + h, start + 2h, start + 3h ...], 进行插入排序
            for (int start=0;start<gap;start++){
                for (int i=start+gap;i<data.length;i+=gap){
                    E temp=data[i];
                    int j;
                    for (j=i;j-gap>=0&& temp.compareTo(data[j-gap])<0;j-=gap){
                        data[j]=data[j-gap];
                    }
                    data[j]=temp;
                }
            }
        }
    }
    public static <E extends Comparable<E>>void shellSort2(E[] data){
        int gap=data.length/2;
        for (;gap>0;gap/=2){
            for (int i=gap;i<data.length;i++){
                E temp=data[i];
                int j;
                for (j=i;j>=gap&&temp.compareTo(data[j-gap])<0;j-=gap){
                    data[j]=data[j-gap];
                }
                data[j]=temp;
            }
        }
    }

    /**
     * increment sequence 对希尔排序的增量序列进行改动
     * @param data
     * @param <E>
     */
    public static <E extends Comparable<E>>void shellSort3(E[] data){
        int gap=1;
        while(gap<data.length/3){
            gap=gap*3+1; // <O(n^(3/2)) by Knuth,1973>: 1, 4, 13, 40, 121, ...
        }
        for (;gap>0;gap/=3){
            for (int i=gap;i<data.length;i++){
                E temp=data[i];
                int j;
                for (j=i;j>=gap&&temp.compareTo(data[j-gap])<0;j-=gap){
                    data[j]=data[j-gap];
                }
                data[j]=temp;
            }
        }
    }
}
