package Lab;

import java.util.Scanner;
public class Pro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int hours = Integer.parseInt(scanner.nextLine());
        int numb = Integer.parseInt(scanner.nextLine());

        System.out.print("The architect "  + name + " " + " will need "  + hours +   " hours to complete " +  numb  + " project/s.");
    }
}
