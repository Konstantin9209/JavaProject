import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.nextLine();
        int hours = Integer.parseInt(scanner.nextLine());
        int pro = Integer.parseInt(scanner.nextLine());
        System.out.printf("The architect %s will need %d hours to complete %d project/s. ", firstName , hours ,pro);
    }
}
