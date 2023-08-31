package Exercise2;

import java.util.Scanner;

public class FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double chickenMenu = Double.parseDouble(scanner.nextLine());
        double fishMenu = Double.parseDouble(scanner.nextLine());
        double vegiMenu = Double.parseDouble(scanner.nextLine());

        double allMenus = (chickenMenu * 10.35) + (fishMenu * 12.40) + (vegiMenu * 8.15);
        double desert = allMenus * 0.2;
        double delivery = allMenus + desert +2.5;

        System.out.println(delivery);
    }
}
