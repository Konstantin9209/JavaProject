package ForLoopsLab;

import java.util.Scanner;

public class newOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            System.out.println("Number is: " + num);
        }
        }
    }
