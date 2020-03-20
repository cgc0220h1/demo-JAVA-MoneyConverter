import java.util.Scanner;

public class Money {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double rate;
        double sourceMoney;
        double result;
        boolean isValid = false;

        do {
            System.out.print("Enter Convert rate: ");
            rate = scanner.nextDouble();
            System.out.print("Enter USD: ");
            sourceMoney = scanner.nextDouble();
            if (rate > 0 && sourceMoney > 0) {
                isValid = true;
            }
            if (!isValid) {
                System.out.println("Invalid input. Please enter again!");
            }
        } while (!isValid);

        result = sourceMoney * rate;
        System.out.printf("%.0f USD is equal %.0f VND", sourceMoney, result);
    }
}
