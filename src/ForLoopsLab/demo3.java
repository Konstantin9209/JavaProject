package ForLoopsLab;

import java.util.Scanner;

public class demo3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = "hello";

        for (int i = 0; i <= text.length() - 1; i++) {

            System.out.println(text.charAt(i));
        }
    }
}