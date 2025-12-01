import java.util.Scanner;

/*
Desafio: Volume de uma esfera

Faça um programa que calcule e mostre o volume de uma esfera a partir do valor 
do seu raio (R). A fórmula para calcular o volume é: (4/3) * π * R³. 
Considere π = 3.14159.

Dica: use (4/3.0) ou (4.0/3) na fórmula, pois em algumas linguagens a divisão 
entre dois inteiros retorna outro inteiro.

Entrada:
- A entrada contém um valor de ponto flutuante (double), que representa o raio R.

Saída:
- A saída deve conter a mensagem "VOLUME", com um espaço antes e depois do sinal de igual.
- O valor deve ser apresentado com 3 casas decimais.

Exemplo de saída:
VOLUME = 113.097
*/


public class BEE1011{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        final double PI = 3.14159;
        double raio, volume;
        //Entrada
        raio = teclado.nextDouble();
        //Processamento
        volume = (4.0/3.0) * PI * (raio * raio * raio);
        //Saida
        System.out.printf("VOLUME = %.3f\n", volume);

        teclado.close();
    }
}