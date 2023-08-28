import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um numero inteiro: ");
        int numero = scanner.nextInt();
        System.out.print("Em que numero deve inciar a tabuada?: ");
        int inicio = scanner.nextInt();
        System.out.print("Em que numero deve finalizar a tabuada?: ");
        int fim = scanner.nextInt();

        System.out.println("Tabuada de " + numero + ":");
        for (int i = inicio; i <= fim; i++) {
            int resultado = numero * i;
            System.out.println(numero + " X " + i + " = " + resultado);
        }
    }
}
