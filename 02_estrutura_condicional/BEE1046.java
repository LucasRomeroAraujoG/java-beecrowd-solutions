import java.util.Scanner;

/*Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.

Entrada
A entrada contém dois valores inteiros representando a hora de início e a hora de fim do jogo.

Saída
Apresente a duração do jogo conforme exemplo abaixo.*/

public class BEE1046{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int horaInicio, horaFim, duracao;
        //Entrada
        horaInicio = teclado.nextInt();
        horaFim = teclado.nextInt();
        //Processamento
        if(horaInicio < horaFim){
            duracao = horaFim - horaInicio;
        }
        else if(horaInicio > horaFim){
            duracao = Math.abs(horaInicio - 24) + horaFim;
        }
        else{
            duracao = 24;
        }
        //Saida
        System.out.printf("O JOGO DUROU %d HORA(S)", duracao);

        teclado.close();
    }
}