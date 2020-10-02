public class BubbleSort {
    public static <E extends Comparable<E>>void bubbleSort(E[] data){
        if (data.length==0||data==null){
            return;
        }
        for (int i=0;i<data.length-1;i++){
            for (int j=0;j<data.length-i-1;j++){
                if (data[j].compareTo(data[j+1])>0){
                    swap(data,j,j+1);
                }
            }
        }
    }
    private static <E> void swap(E[] array,int i,int j){
        E temp=array[i];
        array[i]=array[j];
        array[j]=temp;
    }
}
