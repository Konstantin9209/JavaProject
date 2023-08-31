package ConditionalStatements;

import java.util.Scanner;

public class ExcellentGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int grade = Integer.parseInt(scanner.nextLine());
        boolean isGradeExcellent = 5 <= grade;
        if (isGradeExcellent) {
            System.out.println("Excellent!");
        }
    }
}