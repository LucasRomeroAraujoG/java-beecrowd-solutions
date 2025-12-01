import java.util.Scanner;

/*
Desafio: Conversão de tempo

Leia um valor inteiro, que representa a duração em segundos de um determinado evento 
em uma fábrica, e informe esse tempo expresso no formato horas:minutos:segundos.

Entrada:
- O arquivo de entrada contém um valor inteiro N (segundos).

Saída:
- Imprima o tempo correspondente em horas, minutos e segundos no formato:
  hh:mm:ss

Exemplo de saída:
2:2:2
*/


public class BEE1019{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int horas, minutos, segundos, resto;
        //Entrada
        segundos = teclado.nextInt();
        //Processamento
        horas = segundos / 3600;
        resto = segundos % 3600;
        minutos = resto / 60;
        resto %= 60;
        segundos = resto;
        //Saida
        System.out.printf("%d:%d:%d\n", horas, minutos, segundos);
    
        teclado.close();
    }
}