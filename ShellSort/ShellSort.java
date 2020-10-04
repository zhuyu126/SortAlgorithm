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

}
