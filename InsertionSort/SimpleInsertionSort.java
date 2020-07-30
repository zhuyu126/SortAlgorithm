public class SimpleInsertionSort {
    private SimpleInsertionSort() {
    }

    public static void sort(int[] array){
        for (int i=0;i<array.length;i++){
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
    private static void swap(int[] array,int i,int j){
        int temp=array[i];
        array[i]=array[j];
        array[j]=temp;
    }
}
