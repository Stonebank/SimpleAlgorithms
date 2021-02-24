import java.util.Scanner;

public class Staircase {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter n (integer):");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print("#");
            }
            System.out.println();
        }

        scanner.close();

    }

}
