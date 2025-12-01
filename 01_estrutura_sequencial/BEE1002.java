import java.util.Scanner;

/*
Desafio: Calcular a área de uma circunferência

Fórmula: A = π * R^2
Considerando π = 3.14159

Entrada:
- Um valor de ponto flutuante (double) representando o raio R.

Saída:
- Mostrar a mensagem "A=" seguida do valor da área com 4 casas decimais.
- Exemplo de saída: A=12.5664
*/

public class BEE1002 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Constante
        final double PI = 3.14159;

        // Entrada
        double R = teclado.nextDouble();

        // Processamento
        double A = PI * R * R;

        // Saída
        System.out.printf("A=%.4f\n", A);

        teclado.close();
    }
}
