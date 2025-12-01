import java.util.Scanner;

/*

Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A seguir, calcule e mostre o valor da conta a pagar.

Tabela de preços:
1 - Cachorro Quente  -> 4.00
2 - X-Salada         -> 4.50
3 - X-Bacon          -> 5.00
4 - Torrada simples  -> 2.00
5 - Refrigerante     -> 1.50

Entrada
O arquivo de entrada contém dois valores inteiros correspondentes ao código e à quantidade de um item conforme tabela acima.

Saída
O arquivo de saída deve conter a mensagem "Total: R$ " seguido pelo valor a ser pago, com 2 casas após o ponto decimal.
*/

public class BEE1038{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int codigo, quantidade;
        double valor;
        //Entrada
        codigo = teclado.nextInt();
        quantidade = teclado.nextInt();
        //Processamento
        switch(codigo){
            case 1:
                valor = quantidade * 4.00;
                break;
            case 2:
                valor = quantidade * 4.50;
                break;
            case 3:
                valor = quantidade * 5.00;
                break;
            case 4:
                valor = quantidade * 2.00;
                break;
            case 5:
                valor = quantidade * 1.50;
                break;
            default:
                valor = 0.0;
                break;
        }
        //Saida
        System.out.printf("Total: R$ %.2f\n", valor);
        teclado.close();
    }
}