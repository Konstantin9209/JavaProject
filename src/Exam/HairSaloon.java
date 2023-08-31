package Exam;

import java.util.Scanner;

public class HairSaloon {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int dailyTarget = Integer.parseInt(scanner.nextLine());

            int earnedMoney = 0;

            while (true) {
                String service = scanner.nextLine();
                if (service.equals("closed")) {
                    break;
                }

                int price = 0;
                switch (service) {
                    case "haircut":
                        String haircutType = scanner.nextLine();
                        switch (haircutType) {
                            case "mens":
                                price = 15;
                                break;
                            case "ladies":
                                price = 20;
                                break;
                            case "kids":
                                price = 10;
                                break;
                        }
                        break;
                    case "color":
                        String colorType = scanner.nextLine();
                        switch (colorType) {
                            case "touch up":
                                price = 20;
                                break;
                            case "full color":
                                price = 30;
                                break;
                        }
                        break;
                }

                earnedMoney += price;

                if (earnedMoney >= dailyTarget) {
                    System.out.println("You have reached your target for the day!");
                    break;
                }
            }

            if (earnedMoney < dailyTarget) {
                int moneyNeeded = dailyTarget - earnedMoney;
                System.out.printf("Target not reached! You need %dlv. more.%n", moneyNeeded);
            }

            System.out.printf("Earned money: %dlv.%n", earnedMoney);
        }
    }
