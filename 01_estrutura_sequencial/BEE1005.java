import java.util.Scanner;

/*
Desafio: Média ponderada de duas notas

Leia dois valores de ponto flutuante de precisão dupla (double), A e B, 
correspondentes às notas de um aluno. Em seguida, calcule a média do aluno,
considerando que a nota A tem peso 3.5 e a nota B tem peso 7.5.

Cada nota pode variar de 0 a 10, sempre com uma casa decimal. 
Não se esqueça de imprimir a quebra de linha ao final, caso contrário ocorrerá 
“Presentation Error”. Lembre-se também do espaço antes e depois do sinal de igual.

Entrada:
- O arquivo de entrada contém 2 valores de ponto flutuante com uma casa decimal.

Saída:
- Imprima a mensagem "MEDIA" seguida da média do aluno, com 5 casas decimais,
  e com um espaço antes e depois do sinal de igual.

Exemplo de saída:
MEDIA = 6.43182
*/

public class BEE1005{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        double A, B, Media;
        //Entrada
        A = teclado.nextDouble();
        B = teclado.nextDouble();
        //Processamento
        Media = (A * 3.5 + B * 7.5) / 11;
        //Saida
        System.out.printf("MEDIA = %.5f\n", Media);

        teclado.close();
    }
}