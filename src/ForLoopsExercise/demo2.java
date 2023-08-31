package ForLoopsExercise;

import java.util.Scanner;

public class demo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int maxNumber = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int currentNumb = Integer.parseInt(scanner.nextLine());
            sum = sum + currentNumb;
            if(currentNumb > maxNumber) {
                maxNumber = currentNumb;

            }
        }
        sum = sum - maxNumber;
        if(maxNumber == sum){
            System.out.println("Yes");
            System.out.printf("Sum = %d", maxNumber);
        }else {
            System.out.println("no");
            System.out.printf("Diff = %d", Math.abs(sum-maxNumber));
        }
    }
}
