import java.util.Arrays;

/**
 * 选择排序
 */
public class SelectSort {

    public static void main(String[] args) {
        int[] A = Data.DATA;
        int n = A.length;
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (A[j] < A[min]) {//寻找最小数
                    min = j;//将最小数的索引赋值
                }
            }
            int temp = A[i];
            A[i] = A[min];
            A[min] = temp;
        }
        System.out.println(Arrays.toString(A));
    }

}
