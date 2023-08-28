import java.util.Scanner;

public class Q19{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int TamanhoMaximo = 1000;
        double[] notas = new double[TamanhoMaximo];

        int quantidade = 0;
        double nota;

        do {
            System.out.print("Informe uma nota ou -1 para encerrar: ");
            nota = scanner.nextDouble();
            if (nota != -1) {
                notas[quantidade] = nota;
                quantidade++;
            }
        } while (nota != -1);

        System.out.println("Quantidade de valores lidos: " + quantidade);

        System.out.print("Valores informados: ");
        for (int i = 0; i < quantidade; i++) {
            System.out.print(notas[i] + " ");
        }
        System.out.println();

        System.out.println("Valores informados (ordem inversa):");
        for (int i = quantidade - 1; i >= 0; i--) {
            System.out.println(notas[i]);
        }

        double soma = 0;
        for (int i = 0; i < quantidade; i++) {
            soma += notas[i];
        }
        System.out.println("Soma dos valores: " + soma);

        double media = soma / quantidade;
        System.out.println("Média dos valores: " + media);

        int acimaDaMedia = 0;
        int abaixoDeSete = 0;
        for (int i = 0; i < quantidade; i++) {
            if (notas[i] > media) {
                acimaDaMedia++;
            }
            if (notas[i] < 7) {
                abaixoDeSete++;
            }
        }

        System.out.println("Quantidade de valores acima da média: " + acimaDaMedia);
        System.out.println("Quantidade de valores abaixo de sete: " + abaixoDeSete);

        System.out.println("Sistema Finalizado");
    }
}