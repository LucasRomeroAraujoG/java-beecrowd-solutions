import java.util.Scanner;
/*A empresa ABC resolveu conceder um aumento de salários a seus funcionários de acordo com a tabela abaixo:

Salário	Percentual de Reajuste
0 - 400.00 = 15%
400.01 - 800.00 = 12%
800.01 - 1200.00 = 10%
1200.01 - 2000.00 = 7%
Acima de 2000.00 = 4%

Leia o salário do funcionário e calcule e mostre o novo salário, bem como o valor de reajuste ganho e o índice reajustado, em percentual.

Entrada
A entrada contém apenas um valor de ponto flutuante, com duas casas decimais.

Saída
Imprima 3 linhas na saída: o novo salário, o valor ganho de reajuste (ambos devem ser apresentados com 2 casas decimais) e o percentual de reajuste ganho, conforme exemplo abaixo.*/

public class BEE1048{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double salario, salarioComReajuste, reajuste;
        int percentualDeAumento;
        //Entrada
        salario = sc.nextDouble();
        //Processamento
        if(salario <= 400.00){
            percentualDeAumento = 15;
            reajuste = (salario * 0.15);
            salarioComReajuste = salario + reajuste;
        }
        else if(salario <= 800.00){
            percentualDeAumento = 12;
            reajuste = (salario * 0.12);
            salarioComReajuste = salario + reajuste;
        }
        else if(salario <= 1200.00){
            percentualDeAumento = 10;
            reajuste = (salario * 0.10);
            salarioComReajuste = salario + reajuste;
        }
        else if(salario <= 2000.00){
            percentualDeAumento = 7;
            reajuste = (salario * 0.07);
            salarioComReajuste = salario + reajuste;
        }
        else{
            percentualDeAumento = 4;
            reajuste = (salario * 0.04);
            salarioComReajuste = salario + reajuste;
        }
        //Saida
        System.out.printf("Novo salario: %.2f\n", salarioComReajuste);
        System.out.printf("Reajuste ganho: %.2f\n", reajuste);
        System.out.printf("Em percentual: %d %%\n", percentualDeAumento);



        sc.close();
    }
}