import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int num = scanner.nextInt();
        if (num > 0) {
            System.out.println("O numero " + num + " e positivo");
        } else if (num < 0) {
            System.out.println("O numero " + num + " e negativo");
        } else {
            System.out.println("O numero " + num + " e neutro");
        }
    }
}