import java.util.Scanner;

public class Q12{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual o nome do(a) atleta: ");
        String nomeAtleta = scanner.nextLine();

        double[] saltos = new double[5];
        for (int i = 0; i < saltos.length; i++) {
            System.out.print("Digite a distancia do " + ordemSalto(i + 1) + " salto: ");
            saltos[i] = scanner.nextDouble();
        }

        double melhorSalto = saltos[0];
        double piorSalto = saltos[0];
        double somaSaltos = saltos[0];

        for (int i = 1; i < saltos.length; i++) {
            if (saltos[i] > melhorSalto) {
                melhorSalto = saltos[i];
            }
            if (saltos[i] < piorSalto) {
                piorSalto = saltos[i];
            }
            somaSaltos += saltos[i];
        }

        double mediaSaltos = (somaSaltos - melhorSalto - piorSalto) / 3;

        System.out.println("\nAtleta: " + nomeAtleta + "\n");
        for (int i = 0; i < saltos.length; i++) {
            System.out.println(ordemSalto(i + 1) + " Salto: " + saltos[i] + " m");
        }
        System.out.println("\nMelhor salto: " + melhorSalto + " m");
        System.out.println("Pior salto: " + piorSalto + " m");
        System.out.println("Media dos demais saltos: " + mediaSaltos + " m\n");
        System.out.println("Resultado:");
        System.out.println(nomeAtleta + ": " + mediaSaltos + " m");
    }

    public static String ordemSalto(int number) {
        if (number == 1) {
            return "Primeiro";
        } else if (number == 2) {
            return "Segundo";
        } else if (number == 3) {
            return "Terceiro";
        } else if (number == 4) {
            return "Quarto";
        } else if (number == 5) {
            return "Quinto";
        } return "";
    }
}
