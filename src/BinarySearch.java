public class BinarySearch {


    public static void main(String[] args) {

        int[] list = new int[] { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97 };
        binarySearch(list, 17);

    }

    private static int binarySearch(int[] list, int target) {

        int min = 0;
        int max = list.length - 1;

        for (int i = 0; i < list.length; i++) {
            int guess = (int) Math.floor((max + min) / 2);
            System.out.println(list[guess]);
            if (list[guess] == target) {
                return guess;
            }
            if (list[guess] < target)
                min = guess + 1;
            else
                max = guess - 1;
        }

        return -1;

    }


}
