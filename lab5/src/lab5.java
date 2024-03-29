import java.util.Scanner;
import RequestPackage.executeRequest;

public class lab5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть номер місяця від 1 до 12: ");
        int month = scanner.nextInt();

        executeRequest.executeRequest(month);

        scanner.close();
    }
}
