import java.util.Scanner;

/*Leia 3 valores de ponto flutuante e efetue o cálculo das raízes da equação de Bhaskara. 
Se não for possível calcular as raízes, mostre a mensagem correspondente “Impossivel calcular”
, caso haja uma divisão por 0 ou raiz de numero negativo.

Entrada
Leia três valores de ponto flutuante (double) A, B e C.

Saída
Se não houver possibilidade de calcular as raízes, apresente a mensagem "Impossivel calcular". 
Caso contrário, imprima o resultado das raízes com 5 dígitos após o ponto, 
com uma mensagem correspondente conforme exemplo abaixo. 
Imprima sempre o final de linha após cada mensagem.*/

public class BEE1036{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        double a, b, c, delta, r1, r2;
        //Entrada
        a = teclado.nextDouble();
        b = teclado.nextDouble();
        c = teclado.nextDouble();
        //Processamento
        delta = (b * b) - (4 * a * c);
        if(a == 0 || delta < 0){
            //Saída
            System.out.println("Impossivel calcular");
        }
        else{
            r1 = (-b + Math.sqrt(delta)) / (2 * a);
            r2 = (-b - Math.sqrt(delta)) / (2 * a);
            //Saída
            System.out.printf("R1 = %.5f\n", r1);
            System.out.printf("R2 = %.5f\n", r2);
        }

        teclado.close();
    }
}