public class BucketSort {
    private BucketSort(){};
    public static void sort(Integer[] array,int Bucket){
        if (Bucket<=1){
            throw new IllegalArgumentException("Bucket must > 1");
        }
        Integer[] temp = new Integer[array.length];
        sort(array,0,array.length-1,Bucket,temp);
    }
    private static void sort(Integer[] array,int left,int right,int Bucket,Integer[] temp){
        if (left>right){
            return;
        }
        int maxv=Integer.MIN_VALUE,minv=Integer.MAX_VALUE;
        for (int i=left;i<=right;i++){
            maxv=Math.max(maxv,array[i]);
            minv=Math.min(minv,array[i]);
        }
        if (maxv==minv){
            return;
        }
        int d=(maxv-minv+1)/Bucket+((maxv-minv+1)%Bucket>0?1:0);
        int[] cnt=new int[Bucket];
        int[] index=new int[Bucket+1];
        //O(n)
        for(int i = left; i <= right; i ++) {
            cnt[(array[i] - minv) / d] ++;
        }
        //O(R)
        for (int i=0;i<Bucket;i++){
            index[i+1]=index[i]+cnt[i];
        }
        //O(n)
        for (int i=left;i<=right;i++){
            int p=(array[i] - minv)/d;
            temp[index[p]+left]=array[i];
            index[p]++;
        }
        //O(n)
        for (int i=left;i<=right;i++){
            array[i]=temp[i];
        }
        //递归执行
        sort(array, left, left+index[0]-1, Bucket, temp);
        for (int i=0;i<Bucket-1;i++){
            sort(array, left+index[i], left+index[i+1]-1, Bucket, temp);
        }
    }

    public static void main(String[] args) {
        int n = 1000000;
        Integer[] arr = ArrayGenerator.generateRandomArray(n, n);
        SortingHelper.sortTest("BucketSort", arr);
    }
}
