import java.util.Scanner;

public class Q20{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] sistemasOP = {
                "Windows Server",
                "Unix",
                "Linux",
                "Netware",
                "Mac OS",
                "Outro"};

        int[] votos = new int[sistemasOP.length];
        int totalVotos = 0;

        System.out.println("Qual o melhor Sistema Operacional para uso em servidores?");
        System.out.println("Digite o número correspondente à opção ou 0 para encerrar:");

        int voto;
        do {
            System.out.println("1- Windows Server\n2- Unix\n3- Linux\n4- Netware\n5- Mac OS\n6- Outro\n0- Encerrar");
            voto = scanner.nextInt();

            if (voto >= 1 && voto <= sistemasOP.length - 1) {
                votos[voto - 1]++;
                totalVotos++;
            } else if (voto != 0) {
                System.out.println("Opção inválida. Digite um número válido ou 0 para encerrar.");
            }
        } while (voto != 0);

        System.out.println("Sistema Operacional\tVotos\t%");
        System.out.println("-------------------\t-----\t---");

        int maisVotos = 0;
        int indiceMaisVotos = 0;

        for (int i = 0; i < sistemasOP.length; i++) {
            System.out.println(sistemasOP[i] + "\t\t\t" + votos[i] + "\t" + ((double) votos[i] / totalVotos * 100) + "%");

            if (votos[i] > maisVotos) {
                maisVotos = votos[i];
                indiceMaisVotos = i;
            }
        }

        System.out.println("-------------------\t-----\t---");
        System.out.println("Total\t\t\t\t" + totalVotos);

        System.out.println("\nO Sistema Operacional mais votado foi " + sistemasOP[indiceMaisVotos] + ", com " + maisVotos + " votos, correspondendo a " + ((double) maisVotos / totalVotos * 100) + "% dos votos.");
    }
}
