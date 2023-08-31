package Lab2;

import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double area = Double.parseDouble(scanner.nextLine());
        double finalPrice = area * 7.61;
        double discount = finalPrice * 0.18;
        double result = finalPrice - discount;


        System.out.printf("The final price is: %.2f lv.\n", result);
        System.out.printf("The discount is: %.2f lv.", discount);
    }
}
