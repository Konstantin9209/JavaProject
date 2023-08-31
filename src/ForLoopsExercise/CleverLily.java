package ForLoopsExercise;

import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

                int age = Integer.parseInt(scanner.nextLine());
                double washingMachinePrice = Double.parseDouble(scanner.nextLine());
                int toyPrice = Integer.parseInt(scanner.nextLine());
                int toysCount = 0;
                double money = 0;
                double brother = 0;

                for (int i = 1; i <= age; i++) {
                    if (i % 2 == 0) {
                        money += i * 10 / 2;
                        brother += 1;
                    } else {
                        toysCount++;
                    }
                }

                double toysSum = toysCount * toyPrice;
                double totalMoney = money - brother + toysSum;

                if (totalMoney >= washingMachinePrice) {
                    double diff = totalMoney - washingMachinePrice;
                    System.out.printf("Yes! %.2f", diff);
                } else {
                    double diff = washingMachinePrice - totalMoney;
                    System.out.printf("No! %.2f", diff);
                }
            }
        }
