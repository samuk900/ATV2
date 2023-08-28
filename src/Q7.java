import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o salário atual: R$ ");
        double salAtual = scanner.nextDouble();
        double percentAumento, valorAumento, novoSal;

        if (salAtual <= 280) {
            percentAumento = 1.20;
            novoSal = salAtual * percentAumento;
            valorAumento = novoSal - salAtual;
            System.out.printf("Salario anterior: %.2f | Percentual de Aumento: 20 | Valor de Aumento: %.2f | Novo Salario: %.2f", salAtual, valorAumento, novoSal);
        } else if (salAtual > 280 && salAtual <= 700) {
            percentAumento = 1.15;
            novoSal = salAtual * percentAumento;
            valorAumento = novoSal - salAtual;
            System.out.printf("Salario anterior: %.2f | Percentual de Aumento: 15 | Valor de Aumento: %.2f | Novo Salario: %.2f", salAtual, valorAumento, novoSal);
        } else if (salAtual > 700 && salAtual <= 1500) {
            percentAumento = 1.10;
            novoSal = salAtual * percentAumento;
            valorAumento = novoSal - salAtual;
            System.out.printf("Salario anterior: %.2f | Percentual de Aumento: 10 | Valor de Aumento: %.2f | Novo Salario: %.2f", salAtual, valorAumento, novoSal);
        } else {
            percentAumento = 1.05;
            novoSal = salAtual * percentAumento;
            valorAumento = novoSal - salAtual;
            System.out.printf("Salario anterior: %.2f | Percentual de Aumento: 5 | Valor de Aumento: %.2f | Novo Salario: %.2f", salAtual, valorAumento, novoSal);
        }
    }
}