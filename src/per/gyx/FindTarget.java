package per.gyx;

public class FindTarget {
    public static int findTarget(int[] arr, int target) {
        int i = 0, j = arr.length - 1;
        int mid;
        while (i <= j) {
            mid = (i + j) / 2;
            if (arr[mid] > target) {
                j = mid - 1;
            } else if (arr[mid] < target) {
                i = mid + 1;
            } else {
                if (i == j) {
                    return i;
                } else {
                    j = mid;
                }
            }
        }
        return -1;
    }
}
