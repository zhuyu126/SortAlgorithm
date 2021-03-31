import java.util.Collections;
import java.util.LinkedList;

public class BucketSort2 {
    private BucketSort2(){};
    public static void sort(Integer[] array,int c){
        if(c <= 0) {
            throw new IllegalArgumentException("c must be > 0");
        }

        int Bucket = array.length / c + (array.length % c > 0 ? 1 : 0);

        LinkedList<Integer>[] buckets = new LinkedList[Bucket];
        for(int i = 0; i < Bucket; i ++) {
            buckets[i] = new LinkedList<>();
        }

        int maxv = Integer.MIN_VALUE, minv = Integer.MAX_VALUE;
        for(int e: array){
            maxv = Math.max(maxv, e);
            minv = Math.min(minv, e);
        }

        for(int e: array) {
            buckets[(e - minv) / c].add(e);
        }

        for(int i = 0; i < Bucket; i ++) {
            Collections.sort(buckets[i]);
        }

        int index = 0;
        for(int i = 0; i < Bucket; i ++) {
            for(int e: buckets[i]) {
                array[index ++] = e;
            }
        }
    }

    public static void main(String[] args) {
        int n = 1000000;
        Integer[] arr = ArrayGenerator.generateRandomArray(n, n);
        SortingHelper.sortTest("BucketSort2", arr);
    }
}
