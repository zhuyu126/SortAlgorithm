public class InsertionSortMain {
    public static void main(String[] args) {
        int[] arr={23,12,34,67,11,75};
        System.out.println("排序前为:");
        dispay(arr);
        SimpleInsertionSort.sort(arr);
        System.out.println("排序后为:");
        for(int e: arr) {
            System.out.print(e + " ");
        }
        System.out.println();
//        SimpleSelectionSort.sort2(arr);
//        for(int e: arr) {
//            System.out.print(e + " ");
//        }
//        System.out.println();
    }

    public static<E> void dispay(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
