import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor que voce recebe por hora de trabalho : ");
        double valorPorHora = scanner.nextDouble();
        System.out.print("Digite o numero de horas trabalhadas: ");
        double horasTrabalhadas = scanner.nextDouble();
        double salBruto = valorPorHora * horasTrabalhadas;

        if (salBruto <= 900){
            double fgts = 0.11 * salBruto;
            double sindicato = 0.03 * salBruto;
            double salLiquido = salBruto - sindicato;
            System.out.printf("Salario bruto: %.2f x %.2f      : R$%.2f", horasTrabalhadas, valorPorHora, salBruto);
            System.out.println();
            System.out.println("(-) IR (0%)                    : R$00,00");
            System.out.printf(" (-) Sindicato (3%%)            : R$%.2f", sindicato);
            System.out.println();
            System.out.printf("FGTS (11%%)                     : R$%.2f", fgts);
            System.out.println();
            System.out.printf("Total de descontos              : R$%.2f", sindicato);
            System.out.println();
            System.out.printf("Salário Líquido                 : R$%.2f", salLiquido);
        } else if (salBruto > 900 && salBruto <= 1500){
            double ir = 0.05 * salBruto;
            double fgts = 0.11 * salBruto;
            double sindicato = 0.03 * salBruto;
            double salLiquido = salBruto - sindicato - ir;
            double descontos = ir + sindicato;
            System.out.printf("Salario bruto: %.2f * %.2f      : R$%.2f", horasTrabalhadas, valorPorHora, salBruto);
            System.out.println();
            System.out.printf("(-) IR (5%%)                    : R$%.2f", ir);
            System.out.println();
            System.out.printf("(-) Sindicato (3%%)             : R$%.2f", sindicato);
            System.out.println();
            System.out.printf("FGTS (11%%)                     : R$%.2f", fgts);
            System.out.println();
            System.out.printf("Total de descontos              : R$%.2f", descontos);
            System.out.println();
            System.out.printf("Salário Líquido                 : R$%.2f", salLiquido);
        } else if (salBruto > 1500 && salBruto <= 2500){
            double ir = 0.10 * salBruto;
            double fgts = 0.11 * salBruto;
            double sindicato = 0.03 * salBruto;
            double salLiquido = salBruto - sindicato - ir;
            double descontos = ir + sindicato;
            System.out.printf("Salario bruto: %.2f * %.2f      : R$%.2f", horasTrabalhadas, valorPorHora, salBruto);
            System.out.println();
            System.out.printf("(-) IR (10%%)                   : R$%.2f", ir);
            System.out.println();
            System.out.printf("(-) Sindicato (3%%)             : R$%.2f", sindicato);
            System.out.println();
            System.out.printf("FGTS (11%%)                     : R$%.2f", fgts);
            System.out.println();
            System.out.printf("Total de descontos              : R$%.2f", descontos);
            System.out.println();
            System.out.printf("Salário Líquido                 : R$%.2f", salLiquido);
        } else if (salBruto > 2500){
            double ir = 0.20 * salBruto;
            double fgts = 0.11 * salBruto;
            double sindicato = 0.03 * salBruto;
            double salLiquido = salBruto - sindicato - ir;
            double descontos = ir + sindicato;
            System.out.printf("Salario bruto: %.2f * %.2f      : R$%.2f", horasTrabalhadas, valorPorHora, salBruto);
            System.out.println();
            System.out.printf("(-) IR (20%%)                   : R$%.2f", ir);
            System.out.println();
            System.out.printf("(-) Sindicato (3%%)             : R$%.2f", sindicato);
            System.out.println();
            System.out.printf("FGTS (11%%)                     : R$%.2f", fgts);
            System.out.println();
            System.out.printf("Total de descontos              : R$%.2f", descontos);
            System.out.println();
            System.out.printf("Salário Líquido                 : R$%.2f", salLiquido);
        }
    }
}