public class MSDSort {
    private MSDSort(){}
    public static void sort(String[] array){
        int N=array.length;
        String[] temp=new String[N];
        sort(array,0,N-1,0,temp);
    }
    //根据 r 位置的字符，处理 arr[left, right]
    private static void sort(String[] array,int left,int right,int r,String[] temp){
        if (left>=right){
            return;
        }
        int R =256;
        int[] cnt=new int[R+1];
        int[] index=new int[R+2];
        //O(n)
        for (int i=left;i<=right;i++){
            cnt[r >= array[i].length() ? 0 : (array[i].charAt(r) + 1)] ++;
        }
        //O(R)
        for (int i=0;i<R+1;i++){
            index[i+1]=index[i]+cnt[i];
        }
        //O(n)
        for (int i=left;i<=right;i++){
            int p=r>=array[i].length()? 0:(array[i].charAt(r)+1);
            temp[index[p]+left]=array[i];
            index[p]++;
        }
        //O(n)
        for (int i=left;i<=right;i++){
            array[i]=temp[i];
        }
        //递归执行
        for (int i=0;i<R;i++){
            sort(array, left+index[i], left+index[i+1]-1, r+1,temp);
        }
    }
    public static void main(String[] args) {

        String[] arr = {"BCA", "CBAA", "AC", "BADFE", "ABC", "CBA"};
        MSDSort.sort(arr);
        for(String s: arr) {
            System.out.println(s);
        }
    }
}
