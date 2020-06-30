import java.util.Arrays;

/**
 * 冒泡排序
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] A = Data.DATA;
        for (int i = 0; i < A.length - 1; i++) {//外层循环控制排序趟数
            for (int j = 0; j < A.length - 1 - i; j++) {//内层循环控制每一趟排序多少次
                if (A[j] > A[j + 1]) {
                    int temp = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(A));
    }

}
