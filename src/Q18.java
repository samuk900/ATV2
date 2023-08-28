import java.util.Scanner;

public class Q18{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] perguntas = {
                "Telefonou para a vitima?",
                "Esteve no local do crime?",
                "Mora perto da vitima?",
                "Devia para a vitima?",
                "Ja trabalhou com a vitima?"};

        int Sim = 0;
        for (String pergunta : perguntas) {
            System.out.println("Responda apenas 'Sim' ou 'Nao'");
            System.out.println(pergunta);
            String resposta = scanner.nextLine();
            if (resposta.equals("sim")){
                Sim++;
            }
        }
        if (Sim == 2) {
            System.out.println("Classificação: Suspeita");
        } else if (Sim == 3 || Sim == 4) {
            System.out.println("Classificação: Cúmplice");
        } else if (Sim == 5) {
            System.out.println("Classificação: Assassino");
        } else {
            System.out.println("Classificação: Inocente");
        }
    }
}