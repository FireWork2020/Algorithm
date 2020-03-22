package per.gyx;

public class QuickSort {
    public void quickSort(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }
        int mid = partion(arr, left, right);
        quickSort(arr, left, mid - 1);
        quickSort(arr, mid + 1, right);
    }

    public int partion(int[] arr, int i, int j) {
        int key = arr[i];
        while (i < j) {
            while (i < j && arr[j] >= key) {
                j--;
            }
            if (i < j && arr[j] < key) {
                arr[i] = arr[j];
                i++;
            }
            while (i < j && arr[i] <= key) {
                i++;
            }
            if (i < j && arr[i] > key) {
                arr[j] = arr[i];
                j--;
            }
        }
        arr[i] = key;
        return i;
    }
}
