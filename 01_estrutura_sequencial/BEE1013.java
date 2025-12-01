import java.util.Scanner;

/*
Desafio: Maior entre três números

Faça um programa que leia 3 valores inteiros e apresente o maior seguido da mensagem
"eh o maior". Utilize a fórmula adequada para determinar o maior valor.

Entrada:
- O arquivo de entrada contém 3 valores inteiros.

Saída:
- Imprima o maior desses três valores seguido de um espaço e da mensagem 
  "eh o maior".

Exemplo de saída:
7 eh o maior
*/

public class BEE1013{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int a, b, c, maiorAB, maior;
        //Entrada
        a = teclado.nextInt();
        b = teclado.nextInt();
        c = teclado.nextInt();
        //Processamento 
        maiorAB = (a + b + Math.abs(a - b)) / 2;
        maior = (maiorAB + c + Math.abs(maiorAB - c)) / 2;
        //Saida
        System.out.println(maior + " eh o maior");


        teclado.close();
    }
}