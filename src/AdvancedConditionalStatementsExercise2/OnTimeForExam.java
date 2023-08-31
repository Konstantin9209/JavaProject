package AdvancedConditionalStatementsExercise2;

import java.util.Scanner;

public class OnTimeForExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

                int examHour = Integer.parseInt(scanner.nextLine());
                int examMinute = Integer.parseInt(scanner.nextLine());
                int arrivalHour = Integer.parseInt(scanner.nextLine());
                int arrivalMinute = Integer.parseInt(scanner.nextLine());

                int examTime = examHour * 60 + examMinute;
                int arrivalTime = arrivalHour * 60 + arrivalMinute;

                if (arrivalTime > examTime) {
                    System.out.println("Late");
                    int minutesLate = arrivalTime - examTime;
                    int hours = minutesLate / 60;
                    int minutes = minutesLate % 60;
                    if (hours > 0) {
                        System.out.printf("%d:%02d hours after the start", hours, minutes);
                    } else {
                        System.out.printf("%d minutes after the start", minutes);
                    }
                } else if (arrivalTime >= examTime - 30) {
                    System.out.println("On time");
                    int minutesEarly = examTime - arrivalTime;
                    if (minutesEarly != 0) {
                        System.out.printf("%d minutes before the start", minutesEarly);
                    }
                } else {
                    System.out.println("Early");
                    int minutesEarly = examTime - arrivalTime;
                    int hours = minutesEarly / 60;
                    int minutes = minutesEarly % 60;
                    if (hours > 0) {
                        System.out.printf("%d:%02d hours before the start", hours, minutes);
                    } else {
                        System.out.printf("%d minutes before the start", minutes);
                    }
                }
            }
        }
