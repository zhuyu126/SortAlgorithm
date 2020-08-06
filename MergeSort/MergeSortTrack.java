import java.util.Arrays;

public class MergeSortTrack {
    private MergeSortTrack() {
    }
    public static <E extends Comparable<E>>void sort(E[] array){
        sort(array,0,array.length-1,0);
    }
    private static <E extends Comparable<E>>void sort(E[] array,int l,int r,int depth){
        // 生成深度字符串
        String depthString = generateDepthString(depth);
        // 打印当前 sort 处理的数组区间信息
        System.out.print(depthString);
        System.out.println(String.format("MergeSort arr[%d, %d]", l, r));
        if (l>=r){
            return;
        }
        int mid = l + (r - l) / 2;
        sort(array, l,mid,depth+1);
        sort(array,mid+1,r,depth+1);
        // 打印这次 merge 要处理的区间范围
        System.out.print(depthString);
        System.out.println(String.format("merge arr[%d, %d] and arr[%d, %d]", l, mid, mid + 1, r));
        merge(array,l,mid,r);
        // 打印 merge 后的数组
        System.out.print(depthString);
        System.out.print(String.format("after MergeSort arr[%d, %d] :", l, r));
        for(E e: array) {
            System.out.print(e + " ");
        }
        System.out.println();
    }
    private static String generateDepthString(int depth){
        StringBuilder res = new StringBuilder();
        for(int i = 0 ; i < depth ; i ++) {
            res.append("--");
        }
        return res.toString();
    }
    private static <E extends Comparable<E>>void merge(E[] array,int l,int mid,int r){
        E[] temp= Arrays.copyOfRange(array,l,r+1);
        int i=l;
        int j=mid+1;

        //为array[K]赋值
        for (int k=l;k<=r;k++){
            //越界处理
            if (i>mid){
                array[k] = temp[j - l];
                j++;
            }else if (j>r){
                array[k]=temp[i-l];
                i++;
            }
            //不越界比较
            else if (temp[i-l].compareTo(temp[j-l])<=0){
                array[k]=temp[i-l];
                i++;
            }else {
                array[k]=temp[j-l];
                j++;
            }
        }
    }
}
