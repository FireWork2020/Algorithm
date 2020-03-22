package per.gyx;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int arr[] = new int[]{3, 2, 1, 5, 2, 3, 3, 3, 6, 4};
        System.out.println("准备排序");
        new QuickSort().quickSort(arr, 0, arr.length - 1);
        for (int temp : arr) {
            System.out.println(temp);
        }
    }
}
