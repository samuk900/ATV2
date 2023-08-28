import java.util.Scanner;

public class Q17{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double Prestacoes = 0.0;
        int PrestacoesPagas = 0;

        while (true) {
            System.out.print("Digite o valor da prestação (ou 0 para sair): ");
            double valorPrestacao = scanner.nextDouble();

            if (valorPrestacao == 0) {
                break;
            }

            System.out.print("Digite o numero de dias em atraso: ");
            int diasAtraso = scanner.nextInt();
            double Pagar = Pagamento(valorPrestacao, diasAtraso);
            Prestacoes += Pagar;
            PrestacoesPagas++;
            System.out.println("Valor a ser pago: " + Pagar + "\n");
        }

        System.out.println("Relatorio do dia:");
        System.out.println("Quantidade de prestacoes pagas: " + PrestacoesPagas);
        System.out.println("Valor total recebido: " + Prestacoes);
    }

    public static double Pagamento(double Prestacao, int diasAtraso) {
        if (diasAtraso <= 0) {
            return Prestacao;
        } else {
            double multa = Prestacao * 0.03;
            double juros = Prestacao * (0.001 * diasAtraso);
            return Prestacao + multa + juros;
        }
    }
}