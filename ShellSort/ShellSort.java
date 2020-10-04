public class ShellSort {
    public static <E extends Comparable<E>>void shellSort(E[] data){
        int gap=data.length/2;
        for (;gap>0;gap/=2){//不断缩小gap，直到1为止
            for (int j=0;j+gap<data.length;j++){//使用当前gap进行组内插入排序
                for (int i=0;i+gap<data.length;i+=gap){
                    if (data[i].compareTo(data[i+gap])>0){
                        E temp=data[i+gap];
                        data[i+gap]=data[i];
                        data[i]=temp;
                    }
                }
            }
        }
    }

}
