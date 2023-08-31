package Exercise;

import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());

        double percent = Double.parseDouble(scanner.nextLine());

        int litersInCm = length * width * height;
        double LitersInLiters = litersInCm * 0.001;
        double litersNeeded = LitersInLiters - (LitersInLiters * percent / 100);

        System.out.println(litersNeeded);
    }
}
