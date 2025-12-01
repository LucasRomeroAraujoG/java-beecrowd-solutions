import java.util.Scanner;

/*
Desafio: Salário com bonus

Faça um programa que leia o nome de um vendedor, seu salário fixo e o total de vendas 
realizadas no mês (em dinheiro). Considerando que este vendedor recebe 15% de comissão 
sobre o total das vendas, calcule e escreva o salário final do vendedor ao final do mês, 
com duas casas decimais.

- Não se esqueça de imprimir a quebra de linha ao final, caso contrário ocorrerá 
  “Presentation Error”.
- Lembre-se de manter os espaços conforme o formato exigido.

Entrada:
- O arquivo de entrada contém: o primeiro nome do vendedor (texto) e dois valores 
  de ponto flutuante (double), representando o salário fixo e o total vendido no mês.

Saída:
- Imprima o salário total do vendedor no formato do exemplo.

Exemplo de saída:
TOTAL = R$ 645.75
*/


public class BEE1009{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        String nomeDoVendedor;
        double salarioFixo, totalDeVendas, percentualNasVendas, salarioFinal;
        //Entrada
        nomeDoVendedor = teclado.nextLine();
        salarioFixo = teclado.nextDouble();
        totalDeVendas = teclado.nextDouble();
        //Processamento
        percentualNasVendas = totalDeVendas * 0.15;
        salarioFinal = salarioFixo + percentualNasVendas;
        //Saida
        System.out.printf("TOTAL = R$ %.2f\n", salarioFinal);

        teclado.close();
    }
}