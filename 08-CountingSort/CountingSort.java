public class CountingSort {
    //处理元素取值范围是【0，R）的计数排序
    public void sort(int[] nums) {
        int R=3;//R为数据的个数
        int [] cnt=new int[R];
        for ( int num:nums){
            cnt[num]++;
        }
        //[index[i],index[i+1])的值为i
        int[] index=new int[R+1];
        for (int i=0;i<R;i++){
            index[i+1]=index[i]+cnt[i];
        }
        //[index[i],index[i+1])的值为i
        for (int i=0;i+1<index.length;i++){
            for (int j=index[i];j<index[i+1];j++){
                nums[j]=i;
            }
        }
    }
}
