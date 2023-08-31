package AdvancedConditionalStatements2;

import java.util.Scanner;

public class PersonalTitles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double age = Double.parseDouble(scanner.nextLine());
        String gender = scanner.nextLine();
        String result = "";

        switch (gender) {
            case "m":

                if (age < 16) {
                    result = "Master";
                }else{
                    result = "Mr.";
                }
                break;

            case "f":
                if (age <16){
                    result = "Miss";

                }else{
                    result = "Mrs.";
                }
                System.out.println(result);
        }

    }
}
