package Exercise2;

import java.util.Scanner;

public class SuppliesForSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pens = Integer.parseInt(scanner.nextLine());
        int markers = Integer.parseInt(scanner.nextLine());
        int  liquid = Integer.parseInt(scanner.nextLine());
        int percentDiscount = Integer.parseInt(scanner.nextLine());

        double amountNeeded = (pens * 5.8) + (markers * 7.2) + (liquid * 1.2);
        double result = amountNeeded - (amountNeeded * percentDiscount / 100);

        System.out.println(result);
    }
}
