package Exercise2;

import java.util.Scanner;

public class Repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int plastic = Integer.parseInt(scanner.nextLine());
        int paint = Integer.parseInt(scanner.nextLine());
        int whiteSpirit = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());

        double expenses =((plastic + 2) * 1.5) + ((paint + paint * 0.1) * 14.5) + ((whiteSpirit * 5) + 0.4);
        double result = (expenses *  30 / 100)  * hours;
        double totalSum = expenses + result;
        System.out.println(totalSum);

    }
}
