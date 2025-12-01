import java.util.Scanner;
/*
Desafio: Soma de dois números

Leia dois números inteiros, A e B, e calcule a soma entre eles, atribuindo o resultado à variável SOMA.  
Imprima SOMA no formato: "SOMA = valor", seguido de uma quebra de linha.

Entrada:
- Dois números inteiros A e B.

Saída:
- A palavra SOMA em letras maiúsculas, seguida de espaço, sinal de igual, outro espaço e o valor da soma.  
- Exemplo: SOMA = 19
*/


public class BEE1003{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int A, B, Soma;
        //Entrada
        A = teclado.nextInt();
        B = teclado.nextInt();
        //Processamento
        Soma = A + B;
        //Saída
        System.out.println("SOMA = " + Soma);


        teclado.close();
    }
}