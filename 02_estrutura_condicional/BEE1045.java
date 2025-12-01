import java.util.Scanner;
/*Leia 3 valores de ponto flutuante A, B e C e ordene-os em ordem decrescente, de modo que o lado A representa o maior dos 3 lados. A seguir, determine o tipo de triângulo que estes três lados formam, com base nos seguintes casos, sempre escrevendo uma mensagem adequada:

se A ≥ B+C, apresente a mensagem: NAO FORMA TRIANGULO
se A2 = B2 + C2, apresente a mensagem: TRIANGULO RETANGULO
se A2 > B2 + C2, apresente a mensagem: TRIANGULO OBTUSANGULO
se A2 < B2 + C2, apresente a mensagem: TRIANGULO ACUTANGULO
se os três lados forem iguais, apresente a mensagem: TRIANGULO EQUILATERO
se apenas dois dos lados forem iguais, apresente a mensagem: TRIANGULO ISOSCELES
Entrada
A entrada contem três valores de ponto flutuante de dupla precisão A (0 < A) , B (0 < B) e C (0 < C).

Saída
Imprima todas as classificações do triângulo especificado na entrada.*/

public class BEE1045{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int n1, n2, n3, a, b, c;
        //Entrada
        n1 = teclado.nextInt();
        n2 = teclado.nextInt();
        n3 = teclado.nextInt();
        if(n1 > n2 && n1 > n3){
            a = n1;
            if(n2 > n3){
                b = n2;
                c = n3;
            }
            else{
                b = n3;
                c = n2;
            }
        }
        else if(n2 > n1 && n2 > n3){
            a = n2;
            if(n1 > n3){
                b = n1;
                c = n3;
            }
            else{
                b = n3;
                c = n1;
            }
        }
        else{
            a = n3;
            if(n2 > n1){
                b = n2;
                c = n1;
            }
            else{
                b = n1;
                c = n2;
            }
        }

        if(a >= b + c){
            System.out.println("NAO FORMA TRIANGULO");
        }
        else if(Math.pow(a, 2) == Math.pow(b,2 ) + Math.pow(c,2)){
            System.out.println("TRIANGULO RETANGULO");
        }
        else if(Math.pow(a, 2) > Math.pow(b,2 ) + Math.pow(c,2)){
            System.out.println("TRIANGULO OBTUSANGULO");
        }
        else if(Math.pow(a, 2) < Math.pow(b,2 ) + Math.pow(c,2)){
            System.out.println("TRIANGULO ACUTANGULO");
        }

        if(a == b && a == c){
            System.out.println("TRIANGULO EQUILATERO");
        }
        else if(a == b || b == c || c == a){
            System.out.println("TRIANGULO ISOSCELES");
        }


        teclado.close();
    }
}