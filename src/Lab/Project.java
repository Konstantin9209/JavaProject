package Lab;

import java.util.Scanner;
public class Project{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstName = scanner.nextLine();
        double hours = Double.parseDouble(scanner.nextLine());
        int projects = Integer.parseInt(scanner.nextLine());
        System.out.printf("The architect %s will need %.2f hours to complete %d project/s.", firstName, hours, projects);
    }
}

