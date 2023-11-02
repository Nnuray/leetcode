package lecture;

public class task3 {
    static void generateSortedArrays(int[] arr1, int[] arr2, int m, int n, int[] result, int i, int j, boolean flag) {
        if (flag) {
            for (int k = 0; k < i; k++) {
                System.out.print(result[k] + " ");
            }
            System.out.println();
        }

        for (int k = j; k < n; k++) {
            if ((flag && arr2[k] > result[i - 1]) || (!flag && arr2[k] < result[i - 1])) {
                result[i] = arr2[k];
                generateSortedArrays(arr1, arr2, m, n, result, i + 1, k + 1, !flag);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {10, 15, 25};
        int[] arr2 = {1, 5, 20, 30};
        int m = arr1.length;
        int n = arr2.length;
        int[] result = new int[m + n];
        result[0] = Math.min(arr1[0], arr2[0]);
        generateSortedArrays(arr1, arr2, m, n, result, 1, 0, true);
    }
}
