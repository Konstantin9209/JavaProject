package Exercise;

import java.util.Scanner;
public class VacationBookList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pages = Integer.parseInt(scanner.nextLine());
        int pagesHour = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());

        int completedBook = pages / pagesHour;
        int completed = completedBook / days;

        System.out.println(completed);
    }
}
