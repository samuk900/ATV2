import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro entre 1 e 10: ");
        int numero = scanner.nextInt();
        if (numero < 1 || numero > 10) {
            System.out.println("Valor inválido. Por favor, digite um número entre 1 e 10.");
        } else {
            System.out.println("Tabuada de " + numero + ":");
            for (int i = 1; i <= 10; i++) {
                int resultado = numero * i;
                System.out.println(numero + " X " + i + " = " + resultado);
            }
        }
    }
}