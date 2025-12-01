import java.util.Scanner;

/*
Desafio: Salário do funcionário

Escreva um programa que leia o número de um funcionário, a quantidade de horas 
trabalhadas no mês e o valor que ele recebe por hora. Em seguida, calcule o salário
mensal do funcionário e imprima o número do funcionário e o salário com duas casas decimais.

Não se esqueça de imprimir a quebra de linha ao final, caso contrário ocorrerá 
“Presentation Error”. Lembre-se também do espaço antes e depois do sinal de igual 
e depois do "U$".

Entrada:
- O arquivo de entrada contém dois números inteiros e um valor de ponto flutuante,
  representando respectivamente: número do funcionário, quantidade de horas trabalhadas
  e valor recebido por hora.

Saída:
- Imprima o número do funcionário e o salário no formato do exemplo, com um espaço 
  antes e depois do sinal de igual.

Exemplo de saída:
NUMBER = 25
SALARY = U$ 550.00
*/

public class BEE1008{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int numeroDoFuncionario, quantidadeDeHorasTrabalhadas;
        double valorRecebidoPorHora, salarioFinal;
        //Entrada
        numeroDoFuncionario = teclado.nextInt();
        quantidadeDeHorasTrabalhadas = teclado.nextInt();
        valorRecebidoPorHora = teclado.nextDouble();
        //Processamento
        salarioFinal = quantidadeDeHorasTrabalhadas * valorRecebidoPorHora;
        //Saida
        System.out.println("NUMBER = " + numeroDoFuncionario);
        System.out.printf("SALARY = U$ %.2f\n", salarioFinal);


        teclado.close();
    }
}

