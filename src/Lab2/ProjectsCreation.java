package Lab2;

import java.util.Scanner;

public class ProjectsCreation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int projectCounts = Integer.parseInt(scanner.nextLine());
        int project = 3 * projectCounts;

        System.out.printf("The architect %s will need %d hours to complete %d project/s.", name, project, projectCounts);
    }
}
