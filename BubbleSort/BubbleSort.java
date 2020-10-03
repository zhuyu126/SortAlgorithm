public class BubbleSort {
    public static <E extends Comparable<E>>void bubbleSort(E[] data){
        if (data==null||data.length==0){
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

    public static<E extends Comparable<E>>void bubbleSortOptimized(E[] data){
        if (data==null||data.length==0){
            return;
        }
        for (int i=0;i<data.length-1;i++){
            boolean isSwapped=false;
            for (int j=0;j<data.length-i-1;j++){
                if (data[j].compareTo(data[j+1])>0){
                    swap(data,j,j+1);
                    isSwapped=true;
                }
            }
            if (!isSwapped) {
                break;
            }
        }
    }
    public static<E extends Comparable<E>>void bubbleSortOptimized2(E[] data) {
        if (data == null || data.length == 0) {
            return;
        }
        for (int i = 0; i < data.length - 1; ) {
            int lastSwappedIndex = 0;
            for (int j = 0; j < data.length - i - 1; j++) {
                if (data[j].compareTo(data[j + 1]) > 0) {
                    swap(data, j, j + 1);
                    lastSwappedIndex = j + 1;
                }
            }
            i = data.length - lastSwappedIndex;
        }
    }
    public static <E extends  Comparable<E>>void anotherBubbleSort(E[] data){
        if (data==null||data.length==0){
            return;
        }
        for (int i=0;i<data.length-1;i++){
            for (int j=data.length-1;j>i;j--){
                if (data[j].compareTo(data[j-1])<0){
                    swap(data,j-1,j);
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
