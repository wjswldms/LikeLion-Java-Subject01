package bonus00;

public class BinarySearch {
    public static int binarySearch(int[] array, int target, int left, int right) {
        if (right < left) {
            return -1;
        }

        int mid = (left + right) / 2;
        if (target == array[mid]) {
            return mid;
        } else if (target < array[mid]) {
            return binarySearch(array, target, left, mid - 1);
        } else {
            return binarySearch(array, target, mid + 1, right);
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[] {1, 2, 4, 5, 6};
        int target = 3;
        System.out.println("where is " + target + "?\n => index: " + binarySearch(arr, target, 0, 4));
    }
}
