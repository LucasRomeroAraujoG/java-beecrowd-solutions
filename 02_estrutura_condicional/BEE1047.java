import java.util.Scanner;

/*
Leia a hora inicial, minuto inicial, hora final e minuto final de um jogo.
A seguir calcule a duração completa do jogo.

Obs: O jogo tem duração mínima de 1 minuto e máxima de 24 horas.

Entrada:
Quatro números inteiros representando a hora de início e fim do jogo.

Saída:
“O JOGO DUROU XXX HORA(S) E YYY MINUTO(S)”
*/

public class BEE1047 {
    public static void main(String args[]) {

        Scanner teclado = new Scanner(System.in);

        int horaInicial, minutoInicial, horaFinal, minutoFinal;
        int duracaoHoras = 0;
        int duracaoMinutos = 0;

        // Entrada
        horaInicial = teclado.nextInt();
        minutoInicial = teclado.nextInt();
        horaFinal = teclado.nextInt();
        minutoFinal = teclado.nextInt();

        /*
         A lógica correta para este problema é transformar TUDO em minutos, calcular a diferença, e só depois voltar para horas/minutos.
         Isso evita todos os casos confusos de empréstimo de minutos e virada de dia.
         */

        // Converte hora e minuto inicial para minutos totais
        int inicio = horaInicial * 60 + minutoInicial;

        // Converte hora e minuto final para minutos totais
        int fim = horaFinal * 60 + minutoFinal;

        // Se o final for menor ou igual ao início, significa que virou o dia
        // (ou deu exatamente 24h)
        if (fim <= inicio) {
            fim += 24 * 60;  // adiciona 24h em minutos
        }

        // Calcula a duração total em minutos
        int duracaoTotal = fim - inicio;

        // Converte minutos totais em horas e minutos
        duracaoHoras = duracaoTotal / 60;
        duracaoMinutos = duracaoTotal % 60;

        // Saída
        System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", duracaoHoras, duracaoMinutos);

        teclado.close();
    }
}
