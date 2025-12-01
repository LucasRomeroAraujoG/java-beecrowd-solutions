import java.util.Scanner;

/*
Desafio: Áreas geométricas

Faça um programa que leia três valores de ponto flutuante: A, B e C. 
Em seguida, calcule e mostre:

a) a área do triângulo retângulo que tem base A e altura C.  
b) a área do círculo de raio C (π = 3.14159).  
c) a área do trapézio que tem A e B como bases e C como altura.  
d) a área do quadrado que tem lado B.  
e) a área do retângulo que tem lados A e B.  

Entrada:
- O arquivo de entrada contém três valores de ponto flutuante (double) 
  com uma casa decimal.

Saída:
- O arquivo de saída deve conter 5 linhas de dados, cada uma correspondendo 
  a uma das áreas descritas acima.  
- Cada linha deve apresentar uma mensagem (em português) seguida de um espaço, 
  dois pontos, outro espaço e o valor calculado.  
- O valor deve ser apresentado com 3 casas decimais.

Exemplo de saída:
TRIANGULO: 7.500  
CIRCULO: 28.274  
TRAPEZIO: 12.500  
QUADRADO: 16.000  
RETANGULO: 30.000
*/

public class BEE1012{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        double A, B, C, triangulo, circulo, trapezio, quadrado, retangulo;
        final double PI = 3.14159;
        //Entrada
        A = teclado.nextDouble();
        B = teclado.nextDouble();
        C = teclado.nextDouble();
        //Processamento
        triangulo = A * C / 2;
        circulo = PI * (C * C);
        trapezio = ((A + B) * C) / 2;
        quadrado = B * B;
        retangulo = A * B;

        //Saida
        System.out.printf("TRIANGULO: %.3f\n", triangulo);
        System.out.printf("CIRCULO: %.3f\n", circulo);
        System.out.printf("TRAPEZIO: %.3f\n", trapezio);
        System.out.printf("QUADRADO: %.3f\n", quadrado);
        System.out.printf("RETANGULO: %.3f\n", retangulo);

        teclado.close();
    }
}