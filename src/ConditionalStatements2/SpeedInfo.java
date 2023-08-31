package ConditionalStatements2;

import java.util.Scanner;

public class SpeedInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double numb = Double.parseDouble(scanner.nextLine());
        if (numb <= 10) {
            System.out.println("slow");
        }else if
            (numb <=50){
            System.out.println("average");
        }else if (numb <=150){
            System.out.println("fast");
        }else if (numb <=1000){
            System.out.println("ultra fast");
        }else{
            System.out.println("extremely fast");
        }
    }
}
