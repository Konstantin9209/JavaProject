package Lab;

import java.util.Scanner;

public class Projects {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String Name = scanner.nextLine();
        int hours = Integer.parseInt(scanner.nextLine());
        int neededHours = hours *3;
        System.out.printf("The architect %s will need %d hours to complete %d project/s.", Name, neededHours, hours);

    }
}
