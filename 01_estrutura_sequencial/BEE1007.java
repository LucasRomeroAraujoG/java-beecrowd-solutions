import java.util.Scanner;
/*
Desafio: Diferença de produtos

Leia quatro valores inteiros, A, B, C e D. 
Calcule e imprima a diferença entre o produto de A e B pelo produto de C e D, ou seja:
DIFERENCA = (A * B - C * D)

Entrada:
- O arquivo de entrada contém 4 valores inteiros.

Saída:
- Imprima a mensagem "DIFERENCA" em letras maiúsculas, seguida de um espaço, 
  sinal de igual, outro espaço e o valor calculado.
- Exemplo de saída:
DIFERENCA = 12
*/

public class BEE1007{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int A,B,C,D,Diferenca;
        //Entrada
        A = teclado.nextInt();
        B = teclado.nextInt();
        C = teclado.nextInt();
        D = teclado.nextInt();
        //Processamento
        Diferenca  = A * B - C * D;
        //Saida
        System.out.println("DIFERENCA = " + Diferenca);

        teclado.close();
    }
}