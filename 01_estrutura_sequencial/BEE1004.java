import java.util.Scanner;
/*
Desafio: Produto de dois números

Leia dois valores inteiros. Em seguida, calcule o PRODUTO entre eles
e armazene o resultado em uma variável chamada PROD.

Entrada:
- O arquivo de entrada contém 2 números inteiros.

Saída:
- Imprima a mensagem "PROD" seguida de um espaço, sinal de igual, 
  outro espaço e o valor de PROD.
- Não se esqueça de imprimir a quebra de linha ao final, 
  caso contrário ocorrerá “Presentation Error”.

Exemplo de saída:
PROD = 30
*/

public class BEE1004{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int A, B, Prod;
        //Entrada
        A = teclado.nextInt();
        B = teclado.nextInt();
        //Processamento
        Prod = A * B;
        //Saida
        System.out.println("PROD = " + Prod);

        teclado.close();
    }

}
