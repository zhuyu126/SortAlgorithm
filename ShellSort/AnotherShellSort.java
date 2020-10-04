public class AnotherShellSort {
    public static <E extends Comparable<E>>void anotherShellSort(E[] data){
        int gap=data.length/2;
        while(gap>=1){
            // 对 data[start, start + h, start + 2h, start + 3h ...], 进行插入排序
            for (int start=0;start<gap;start++){
                for (int i=start+gap;i<data.length;i+=gap){//使用当前gap进行组内插入排序
                    E temp=data[i];
                    int j;
                    for (j=i;j-gap>=0&& temp.compareTo(data[j-gap])<0;j-=gap){
                        data[j]=data[j-gap];
                    }
                    data[j]=temp;
                }
            }
            gap/=2;
        }
    }
    public static <E extends Comparable<E>>void anotherShellSort2(E[] data){
        int gap=data.length/2;
        while(gap>=1){
            // 对 data[start, start + h, start + 2h, start + 3h ...], 进行插入排序
                for (int i=gap;i<data.length;i++){//使用当前gap进行组内插入排序
                    E temp=data[i];
                    int j;
                    for (j=i;j-gap>=0&& temp.compareTo(data[j-gap])<0;j-=gap){
                        data[j]=data[j-gap];
                    }
                    data[j]=temp;
                }
            gap/=2;
        }
    }
    public static <E extends Comparable<E>>void anotherShellSort3(E[] data){
        int gap=1;
        while(gap<data.length/3){
            gap=gap*3+1; // <O(n^(3/2)) by Knuth,1973>: 1, 4, 13, 40, 121, ...
        }
        while(gap>=1){
            // 对 data[start, start + h, start + 2h, start + 3h ...], 进行插入排序
            for (int i=gap;i<data.length;i++){//使用当前gap进行组内插入排序
                E temp=data[i];
                int j;
                for (j=i;j-gap>=0&& temp.compareTo(data[j-gap])<0;j-=gap){
                    data[j]=data[j-gap];
                }
                data[j]=temp;
            }
            gap/=2;
        }
    }
}
