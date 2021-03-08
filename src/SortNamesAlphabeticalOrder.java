import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortNamesAlphabeticalOrder {

    public static void main(String[] args) throws FileNotFoundException {

        long startTime = System.currentTimeMillis();

        File name_file = new File("src/resources/names");
        ArrayList<String> nameArray = new ArrayList<>();
        Scanner scanner = new Scanner(name_file);

        while (scanner.hasNextLine())
            nameArray.add(scanner.nextLine());

        String[] names = nameArray.toArray(new String[0]);
        int n = names.length;
        String temp;
        int operation = 0;

        for (int i = 0; i < n; i++) {

            for (int j = i + 1; j < n; j++) {

                if (names[i].compareTo(names[j]) > 0) {
                    temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;

                }
                operation++;

            }
            operation++;

        }

        System.out.println("Names in sorted order:");
        for (String name : names)
            System.out.println(name);

        System.out.println(operation + " operations performed in " + (System.currentTimeMillis() - startTime) + " ms.");


    }

}
