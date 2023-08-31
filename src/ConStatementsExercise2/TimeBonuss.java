package ConStatementsExercise2;

import java.util.Scanner;

public class TimeBonuss {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        int totalMins = hours * 60 + minutes + 15;
        hours = totalMins / 60;
        minutes = totalMins % 60;

        if (hours > 23) {
            hours = 0;
        }
                System.out.printf("%d:%02d", hours, minutes);
            }
        }



