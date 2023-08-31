package Exercise;

import java.util.Scanner;
public class Repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nylon = Integer.parseInt(scanner.nextLine());
        int paint = Integer.parseInt(scanner.nextLine());
        int thinner = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());

        double priceForNylon = (nylon + 2) * 1.50;
        double priceForPaint = (paint + paint * 0.10) * 14.50;
        double priceForThinner = thinner * 5;
        double materialsPrice = priceForNylon + priceForPaint + priceForThinner + 0.40;
        double workersPrice = (materialsPrice * 0.30) * hours;

        double totalSum= materialsPrice + workersPrice;

        System.out.println(totalSum);

    }
}
