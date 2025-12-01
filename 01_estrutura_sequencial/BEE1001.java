import java.util.Scanner;

/*
Desafio: Soma de dois números

Leia 2 variáveis inteiras, A e B, e calcule a soma destas variáveis, atribuindo o resultado à variável X.  
Imprima X no formato: "X = valor", seguido de uma quebra de linha.

Entrada:
- Dois números inteiros, A e B.

Saída:
- A letra X maiúscula, seguida de um espaço, sinal de igual, outro espaço e o valor de X.  
- Exemplo: X = 19
*/

public class BEE1001 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Entrada
        int A = teclado.nextInt();
        int B = teclado.nextInt();

        // Processamento
        int X = A + B;

        // Saída
        System.out.println("X = " + X);

        teclado.close();
    }
}
