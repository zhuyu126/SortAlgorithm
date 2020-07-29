import java.util.Random;

public class ArrayGenerator {
    private ArrayGenerator() {
    }

    /**
     * 生成一个顺序的数组
     * @param n 数组长度
     * @return
     */
    public static Integer[] generateOrderArray(int n){
        Integer[] arr = new Integer[n];
        for(int i = 0; i < n; i ++) {
            arr[i] = i;
        }
        return arr;
    }

    /**
     * 生成一个的随机数组
     * @param n 数组长度
     * @param bound 数字范围
     * @return 数组
     */
    public static Integer[] generateRandomArray(int n,int bound){
        Integer[] arr = new Integer[n];
        Random random=new Random();
        for (int i=0;i<n;i++){
            arr[i]=random.nextInt(bound);
        }
        return arr;
    }
}
