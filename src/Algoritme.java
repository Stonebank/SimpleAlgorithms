public class Algoritme {

    public static void main(String[] args) {

        int[] array = new int[] {1, 4, 7, 3, 5, 6, 2, 10};

        int n = array.length - 1;

        int firstNumber = 0;
        int secondNumber = 0;

        for (int i = 0; i < n; i++) {
            if (array[i + 1] < array[i]) {
                firstNumber = array[i + 1];
                System.out.println("Stops at " + firstNumber);
                break;
            }

            for (int j = n - i; j > 0; j--) {
                if (array[j - 1] > array[j]) {
                    secondNumber = array[j];
                    System.out.println("Stops at " + secondNumber);
                    break;
                }

            }



        }


    }
}
