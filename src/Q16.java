import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro numero: ");
        double n1 = scanner.nextDouble();
        System.out.print("Digite o segundo numero: ");
        double n2 = scanner.nextDouble();
        System.out.print("Digite o terceiro numero: ");
        double n3 = scanner.nextDouble();
        double resultado = somarTresNumeros(n1, n2, n3);
        System.out.println("A soma dos tres valores e: " + resultado);
    }

    public static double somarTresNumeros(double a, double b, double c) {
        return a + b + c;
    }
}