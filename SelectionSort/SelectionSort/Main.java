/**
 * 用例测试
 * @author robinson
 */
public class Main {
    public static void main(String[] args) {
        int[] arr={23,12,34,67,11,75};
        System.out.println("排序前为:");
        dispay(arr);
        SimpleSelectionSort.sort(arr);
        System.out.println("排序后为:");
        for(int e: arr) {
            System.out.print(e + " ");
        }
        System.out.println();

        Student[] students = {new Student("Alice", 98),
                new Student("Lee", 100),
                new Student("Rey", 66)};
        SelectionSort.sort(students);
        for(Student student: students) {
            System.out.print(student + " ");
        }
        System.out.println();

    }

    public static void dispay(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
