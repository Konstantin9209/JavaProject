package WhileLoops.lab;

import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int desiredSum = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        while (sum < desiredSum) {
            int number = Integer.parseInt(scanner.nextLine());
            sum += number;
        }
        System.out.println(sum);
    }
}
