import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a primeira nota: ");
        double num1 = scanner.nextDouble();
        System.out.print("Digite a segunda nota: ");
        double num2 = scanner.nextDouble();
        if (((num1 + num2)/2) == 10) {
            System.out.println("Aprovado com distincao");
        } else if (((num1 + num2)/2) < 7) {
            System.out.println("Reprovado");
        } else {
            System.out.println("Aprovado");
        }
    }
}
