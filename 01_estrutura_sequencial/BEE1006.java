import java.util.Scanner;
/*
Desafio: Média ponderada de três notas

Leia três valores (variáveis A, B e C), que correspondem às notas de um aluno.
Em seguida, calcule a média do aluno, considerando os seguintes pesos:
- Nota A: peso 2
- Nota B: peso 3
- Nota C: peso 5

Cada nota pode variar de 0 a 10.0, sempre com uma casa decimal.

Entrada:
- O arquivo de entrada contém 3 valores de ponto flutuante (double) com uma casa decimal.

Saída:
- Imprima a mensagem "MEDIA" seguida da média do aluno,
  com um espaço antes e depois do sinal de igual.

Exemplo de saída:
MEDIA = 6.3
*/

public class BEE1006{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        double A, B, C, Media;
        //Entrada
        A = teclado.nextDouble();
        B = teclado.nextDouble();
        C = teclado.nextDouble();
        //Processamento
        Media = (A * 2.0 + B * 3.0 + C * 5.0) / 10.0;
        //Saida
        System.out.printf("MEDIA = %.1f\n", Media);

        teclado.close();
    }
}