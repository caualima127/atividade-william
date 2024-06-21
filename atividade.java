import java.util.Scanner;

public class ReajusteSalario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salário do colaborador: R$ ");
        double salarioAtual = scanner.nextDouble();

        scanner.close();

        double percentualAumento;
        double aumento;
        double novoSalario;
        double aumentoReal;

    
        if (salarioAtual <= 280.00) {
            percentualAumento = 20;
        } else if (salarioAtual <= 700.00) {
            percentualAumento = 15;
        } else if (salarioAtual <= 1500.00) {
            percentualAumento = 10;
        } else {
            percentualAumento = 5;
        }

        aumento = salarioAtual * (percentualAumento / 100);
        novoSalario = salarioAtual + aumento;

        
        double inflacao = 3.8;
        aumentoReal = aumento - (aumento * (inflacao / 100));

        System.out.printf("Salário antes do reajuste: R$ %.2f\n", salarioAtual);
        System.out.printf("Percentual de aumento aplicado: %.0f%%\n", percentualAumento);
        System.out.printf("Valor do aumento: R$ %.2f\n", aumento);
        System.out.printf("Novo salário após o aumento: R$ %.2f\n", novoSalario);
        System.out.printf("Valor do aumento real, descontada a inflação: R$ %.2f\n", aumentoReal);
    }
}
