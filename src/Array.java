public class Array {

    public static void main(String[] args) {

        int[][] array = new int[][] {
                new int[] { 11, 2, 4 },
                new int[] { 4, 5, 6 },
                new int[] { 10, 8, -12 } };

        int firstDiagnoal = 0;

        for (int i = 0; i < array.length; i++) {
            System.out.println("(Row: " + i + " index: " + i + ") " + array[i][i]);
            firstDiagnoal += array[i][i];
        }

        System.out.println(firstDiagnoal);
        System.out.println();

        int secondDiagonal = 0;

        int length = array.length;
        while (length > 0) {
            System.out.println("(Row: " + (3 - length) + " index: " + (length - 1) + ") " + array[3 - length][length - 1]);
            secondDiagonal += array[3 - length][length - 1];
            length--;
        }

        System.out.println(secondDiagonal);
        System.out.println();

        System.out.println("Subtract: " + (firstDiagnoal > secondDiagonal ? firstDiagnoal - secondDiagonal : secondDiagonal - firstDiagnoal));

    }

}
