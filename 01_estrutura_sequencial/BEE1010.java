import java.util.Scanner;
/*
Desafio: Valor a pagar de uma compra

Neste problema, a tarefa é ler: 
- código do produto 1, quantidade de unidades do produto 1 e preço de uma unidade do produto 1, 
- código do produto 2, quantidade de unidades do produto 2 e preço de uma unidade do produto 2. 

Em seguida, calcule e mostre o valor total a ser pago.

Entrada:
- O arquivo de entrada contém duas linhas de dados. 
- Cada linha contém 3 valores: dois inteiros e um valor de ponto flutuante com 2 casas decimais.

Saída:
- O arquivo de saída deve conter uma mensagem no formato do exemplo, 
  onde "Valor a pagar" indica o valor total a pagar. 
- Lembre-se de manter o espaço após ":" e após o símbolo "R$". 
- O valor deve ser apresentado com 2 casas decimais.

Exemplo de saída:
VALOR A PAGAR: R$ 15.50
*/

public class BEE1010{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int codigoDoProduto1, unidadesDoProduto1, codigoDoProduto2, unidadesDoProduto2;
        double precoPorUnidadeDoProduto1, precoPorUnidadeDoProduto2, valorAPagar;
        //Entradas do primeiro produto
        codigoDoProduto1 = teclado.nextInt();
        unidadesDoProduto1 = teclado.nextInt();
        precoPorUnidadeDoProduto1 = teclado.nextDouble();
        //Entradas do segundo produto
        codigoDoProduto2 = teclado.nextInt();
        unidadesDoProduto2 = teclado.nextInt();
        precoPorUnidadeDoProduto2 = teclado.nextDouble();
        //Processamento dos produtos
        valorAPagar = (unidadesDoProduto1 * precoPorUnidadeDoProduto1) + (unidadesDoProduto2 * precoPorUnidadeDoProduto2);
        //Saida
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", valorAPagar);

        teclado.close();
    }
}