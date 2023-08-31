package Lab2;

import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double dogFood = Double.parseDouble(scanner.nextLine());
        int catFood = Integer.parseInt(scanner.nextLine());
double result = (dogFood * 2.5) + (catFood * 4);
        System.out.printf("%.2f lv.", result);

    }
}
