import java.util.Scanner;

/*
Leia 3 valores inteiros e ordene-os em ordem crescente. No final, mostre os valores em ordem crescente, uma linha em branco e em seguida, os valores na sequência como foram lidos.

Entrada
A entrada contem três números inteiros.

Saída
Imprima a saída conforme foi especificado.*/

public class BEE1042{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int valor1, valor2, valor3, n1, n2, n3;
        //Entrada
        valor1 = teclado.nextInt();
        valor2 = teclado.nextInt();
        valor3 = teclado.nextInt();
        //Processamento e saída
        if(valor1 > valor2 && valor1 > valor3){
            n1 = valor1;
            if(valor2 > valor3){
                n2 = valor2;
                n3 = valor3;
            }
            else{
                n2 = valor3;
                n3 = valor2;
            }
        }
        else if(valor2 > valor1 && valor2 > valor3){
            n1 = valor2;
            if(valor1 > valor3){
                n2 = valor1;
                n3 = valor3;
            }else{
                n2 = valor3;
                n3 = valor1;
            }

        }
        else{
            n1 = valor3;
            if(valor1 > valor2){
                n2 = valor1;
                n3 = valor2;
            }
            else{
                n2 = valor2;
                n3 = valor1;
            }
        }
        System.out.println(n3);
        System.out.println(n2);
        System.out.println(n1 + "\n");
        System.out.println(valor1);
        System.out.println(valor2);
        System.out.println(valor3);

        teclado.close();
    }
}