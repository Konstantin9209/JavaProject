package ForLoopsLab;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();

        while (!word.equals("Stop")) {

            System.out.println(word);

            word = scanner.nextLine();
        }
    }
}
