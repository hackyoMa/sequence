import java.util.Arrays;

/**
 * 归并排序
 */
public class MergeSort {

    public static void main(String[] args) {
        int[] A = Data.DATA;
        sort(A, 0, A.length - 1);
        System.out.println(Arrays.toString(A));
    }

    private static void sort(int[] a, int low, int high) {
        int mid = (low + high) / 2;
        if (low < high) {
            sort(a, low, mid);
            sort(a, mid + 1, high);
            merge(a, low, mid, high);
        }
    }

    private static void merge(int[] a, int low, int mid, int high) {
        int[] temp = new int[high - low + 1];
        int i = low;
        int j = mid + 1;
        int k = 0;
        // 将两数组中较小的放入temp
        while (i <= mid && j <= high) {
            if (a[i] < a[j]) {
                temp[k] = a[i];
                k++;
                i++;
            } else {
                temp[k] = a[j];
                k++;
                j++;
            }
        }
        // 将剩余的放入temp
        while (i <= mid) {
            temp[k] = a[i];
            k++;
            i++;
        }
        while (j <= high) {
            temp[k] = a[j];
            k++;
            j++;
        }
        // 用temp覆盖a
        for (int k2 = 0; k2 < temp.length; k2++) {
            a[k2 + low] = temp[k2];
        }
    }

}
