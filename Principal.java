import java.util.Scanner;

public class Principal {
/*
2. Uma empresa de pesquisas foi contratada para realizar uma pesquisa salarial em uma cidade. Para a realização da
pesquisa, a empresa lhe contratou para desenvolver um programa que leia, de cada entrevistado, o salário e número
de filhos. O programa deve realizar leituras consecutivas de cada entrevistado até que seja lido um salário com valor
menor que zero, o qual indica o final da pesquisa. Como resultado da mesma, o programa deve informar:
a. A média salarial dos entrevistados
b. O percentual de entrevistados com salário superior ao salário mínimo (considerar o valor de R$ 780,00 como sendo
o salário mínimo)
c. A média de filhos dos entrevistados. d. O menor e maior salário entre os entrevistados.


 */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int filhos, incremento;
        int conta = 0;
        int contaMaior = 0;
        int totalFilhos = 0;
        float salario, media, salarioMaior = 0, salarioMenor = 0;
        float mediaFilhos, totalSalario = 0, minimo = 780, percentualMaior;

        do {
            System.out.println("Digite o salário: ");
            salario = scanner.nextFloat();
            if (salario > 0) {
                System.out.println("Digite o número de filhos: ");
                filhos = scanner.nextInt();
                totalFilhos += filhos;
                totalSalario += salario;
                conta++;
                if (conta == 1) {
                    salarioMaior = salario;
                    salarioMenor = salario;

                }
                if (salario > minimo) {
                    contaMaior++;
                }

                if (salario > salarioMaior) {
                    salarioMaior = salario;

                }

                if (salario < salarioMenor) {
                    salarioMenor = salario;

                }
            }

        } while (salario > 0);


        if (conta > 0) {
            media = totalSalario / conta;
            mediaFilhos = (float) (totalFilhos / conta);
            percentualMaior = (float) ((contaMaior * 100) / conta);
            System.out.println("Total da soma dos salários: " + totalSalario);
            System.out.println("Total de entrevistados: " + conta);
            System.out.println("Média dos salários: " + media);
            System.out.println("Total de entrevistados com salário superior ao salário mínimo: " + contaMaior);
            System.out.println("Percentual de entrevistados com salário superior ao salário mínimo: " + percentualMaior);
            System.out.println("Média de filhos dos entrevistados: " + mediaFilhos);
            System.out.println("Maior salário: " + salarioMaior);
            System.out.println("Menor salário: " + salarioMenor);

        } else {
            System.out.println("Não há entrevistados");
        }



    }
}
