import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {

        int[] array = new int[] { 64, 25, 12, 22, 11, 45, 48, 99, 82, 102, 382, 1000, 1101, 482, 212, 20, -9 };

        int n = array.length;

        int operation = 0;

        for (int i = 0; i < n - 1; i++) {

            int min_index = i;

            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[min_index]) {
                    min_index = j;
                    System.out.println("Swapping " + array[i] + " with " + array[min_index]);
                    operation++;
                }
            }

            int temp = array[min_index];
            array[min_index] = array[i];
            array[i] = temp;
            operation++;

        }

        System.out.println(Arrays.toString(array));
        System.out.println("operations: " + operation);

    }

}
