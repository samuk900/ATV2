import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro numero: ");
        int n1 = scanner.nextInt();
        System.out.print("Digite o segundo numero: ");
        int n2 = scanner.nextInt();
        if (n1 > n2){
            System.out.println("O numero " + n1 + " e maior");
        } else if (n2 > n1) {
            System.out.println("O numero " + n2 + " e maior");
        }else {
            System.out.println("Os numeros sao iguais");
        }
    }
}