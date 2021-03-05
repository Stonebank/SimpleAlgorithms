import java.util.Arrays;
import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("String to reverse:");

        String input = scanner.next();

        System.out.println("The bytes for " + input + " looks like: " + Arrays.toString(input.getBytes()));

        byte[] temp = input.getBytes();
        byte[] result = new byte[input.length()];

        for (byte i = 0; i < temp.length; i++)
            result[i] = temp[temp.length - i - 1];

        String string = new String(result);

        System.out.println(string);

    }

}
