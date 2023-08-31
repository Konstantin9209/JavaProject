package Exam;
import java.util.Scanner;

public class DeerOfSanta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int FatherXmasAbsence = Integer.parseInt(scanner.nextLine());
        int FoodLeftInKg = Integer.parseInt(scanner.nextLine());
        double foodForDeer1 = Double.parseDouble(scanner.nextLine());
        double foodForDeer2 = Double.parseDouble(scanner.nextLine());
        double foodForDeer3 = Double.parseDouble(scanner.nextLine());

        double FoodNeeded = (foodForDeer1 + foodForDeer2 + foodForDeer3) * FatherXmasAbsence;

        if (FoodLeftInKg >= FoodNeeded) {
            System.out.printf("%.0f kilos of food left.", Math.floor(FoodLeftInKg - FoodNeeded));
        } else {
            System.out.printf("%.0f more kilos of food are needed.", Math.ceil(FoodNeeded - FoodLeftInKg));
        }
    }
}
