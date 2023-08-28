import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro numero: ");
        int n1 = scanner.nextInt();
        System.out.print("Digite o segundo numero: ");
        int n2 = scanner.nextInt();
        System.out.print("Digite o terceiro numero: ");
        int n3 = scanner.nextInt();

        if (n1 > n2 && n1 > n3){
            System.out.println("O numero " + n1 + " e o maior");
        } else if (n2 > n1 && n2 > n3) {
            System.out.println("O numero " + n2 + " e o maior");
        } else if (n3 > n1 && n3 > n2) {
            System.out.println("O numero " + n3 + " e o maior");
        }else {
            System.out.println("Os numeros sao iguais");
        }
    }
}