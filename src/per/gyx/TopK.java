package per.gyx;

public class TopK {
    public void topK(int[] arr) {
        if (arr.length <= 1) {
            return;
        }
        for (int i = (arr.length - 1) / 2; i >= 0; i--) {
            adjustHeap(arr, i, arr.length - 1);
        }
        for (int j = arr.length - 1; j > 0; j--) { //此处边界条件
            swap(arr, 0, j);
            adjustHeap(arr, 0, j - 1);
        }
    }

    public void adjustHeap(int[] arr, int i, int length) {
        int temp = arr[i];
        for (int j = i * 2 + 1; j <= length; j = j * 2 + 1) {
            if (j + 1 <= length && arr[j] < arr[j + 1]) {
                j++;
            }
            if (arr[j] > temp) {
                arr[i] = arr[j];
                i = j;
            } else {
                break;
            }
        }
        arr[i] = temp;
    }

    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
