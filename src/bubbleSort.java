public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {10, 15, 54, 1, 23, 87, 46, 8, 4, 6, 78, 100};
        boolean flag = true;
        int count = 1;

        while (flag) {
            flag = false;
            for (int i = 0; i < array.length - count; i++) {
                if (array[i] > array[i + 1]) {
                    int tmp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = tmp;
                    flag = true;
                }
            }
        }
        count++;
    }
}
