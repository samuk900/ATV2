import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Em que turno você estuda? (m-matutino, v-vespertino, n-noturno): ");
        String turno = scanner.next();

        if (turno.equals("m")) {
            System.out.println("Bom Dia!");
        } else if (turno.equals("v")) {
            System.out.println("Boa Tarde!");
        } else if (turno.equals("n")) {
            System.out.println("Boa Noite!");
        } else {
            System.out.println("O valor inserido e invalido");
        }
    }
}