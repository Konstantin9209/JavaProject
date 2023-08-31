package AdvancedConditionalStatements;

import java.util.Scanner;

public class PersonalTitles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double age = Double.parseDouble(scanner.nextLine());

        String gender = scanner.nextLine();
        String result = "";

        if (age < 16) {

            if (gender.equals("m")) {
                result = "Master";
            } else {
                result = "Miss";
            }
        } else {

            if (gender.equals("m")) {
                result = "Mr.";
            } else {
                result = "Ms.";
            }

        }
        System.out.println(result);
    }
}

