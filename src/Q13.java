import java.util.Scanner;

public class Q13{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de n: ");
        int n = scanner.nextInt();
        double h = 0.0;
        for (int i = 1; i <= n; i++) {
            h += 1.0 / i;
        }
        System.out.println("O valor de H com " + n + " termos e: " + h);
    }
}