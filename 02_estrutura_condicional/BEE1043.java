import java.util.Scanner;
/*Leia 3 valores reais (A, B e C) e verifique se eles formam ou não um triângulo. Em caso positivo, calcule o perímetro do triângulo e apresente a mensagem:


Perimetro = XX.X


Em caso negativo, calcule a área do trapézio que tem A e B como base e C como altura, mostrando a mensagem


Area = XX.X

Entrada
A entrada contém três valores reais.

Saída
O resultado deve ser apresentado com uma casa decimal.*/

public class BEE1043{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        double a, b, c, perimetro, area;
        //Entrada
        a = teclado.nextDouble();
        b = teclado.nextDouble();
        c = teclado.nextDouble();
        //Processamento e saida
        if(a + b > c && c + b > a && a + c > b){
            perimetro = a + b + c;
            System.out.printf("Perimetro = %.1f\n", perimetro);
        }
        else{
            area = ((a + b) * c) / 2;
            System.out.printf("Area = %.1f\n", area);
        }


        teclado.close();
    }
}