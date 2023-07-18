import java.util.Scanner;

public class RecursiveNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("N Sayısı: ");
        int n = scanner.nextInt();
        scanner.close();

        for (int i = n; i >= 0; i -= 5) {
            System.out.print(i + " ");
        }

        for (int i = 5; i <= n; i += 5) {
            System.out.print(i + " ");
        }
    }
}
