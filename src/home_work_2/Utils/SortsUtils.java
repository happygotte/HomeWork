package home_work_2.Utils;

public class SortsUtils {
    public static void main(String[] args) {
        int[] array = ArraysUtils2_1.arrayRandom(10, 100);
        bubble(array);
        shake(array);
    }

    /**
     * Сортировка массива чисел способом пузырьковой сортировки
     * @param arr массив чисел
     */
    public static void bubble(int[] arr) {
        int n = arr.length - 1;
        int x;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    x = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = x;
                }
            }
        }
    }

    /**
     * Сортировка массива чисел способом шейкерной сортировки
     * @param arr массив чисел
     */
    public static void shake(int[] arr) {
        int right = arr.length - 1;
        int left = 0;
        int x;
        while (left < right) {
            for (int i = left; i < right; i++) {
                if (arr[i] > arr[i + 1]) {
                    x = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = x;
                }
            }
            --right;
            for (int j = right; j > left; j--) {
                if (arr[j] < arr[j - 1]) {
                    x = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = x;
                }
            }
            ++left;
        }
    }
}
