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
    /**
     * 生成一个随机的字符串数组
     * @param n 数组长度
     * @param w 字符串长度
     * @return 数组
     */
    public static String[] generateRandomStringArray(int n, int w){
        // https://www.ascii-code.com/
        // 33-126 可打印字符
        String[] arr = new String[n];
        Random rnd = new Random();
        for(int i = 0; i < n; i ++){
            StringBuilder sb = new StringBuilder();
            for(int j = 0; j < w; j ++) {
                sb.append((char)(rnd.nextInt(94) + 33));
            }
            arr[i] = sb.toString();
        }
        return arr;
    }

    /**
     * 数组交换
     * @param arr
     * @param i
     * @param j
     * @param <E>
     */
    private static <E> void swap(E[] arr, int i, int j){
        E t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
}
