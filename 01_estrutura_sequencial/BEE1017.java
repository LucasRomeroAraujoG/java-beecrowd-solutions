import java.util.Scanner;

/*
Desafio: Consumo de combustível em uma viagem

Little John quer calcular e mostrar a quantidade de litros de combustível 
gastos em uma viagem, utilizando um carro que faz 12 Km/L.

Para isso, leia:
- O tempo gasto na viagem (em horas)
- A velocidade média durante a viagem (em km/h)

Com esses dados, calcule a distância percorrida e, em seguida, a quantidade
de litros necessários para a viagem. Apresente o resultado com três casas decimais.

Entrada:
- O arquivo de entrada contém dois valores inteiros:
  1. Tempo gasto na viagem (horas)
  2. Velocidade média durante a viagem (km/h)

Saída:
- Imprima a quantidade de litros necessária para a viagem, com três casas decimais.

Exemplo de saída:
10.500
*/


public class BEE1017{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int tempoGastoEmHoras, velocidadeMediaEmKMH; 
        double quantidadeDeLitrosNecessario;
        //Entrada
        tempoGastoEmHoras = teclado.nextInt();
        velocidadeMediaEmKMH = teclado.nextInt();
        //Processamento
        quantidadeDeLitrosNecessario = (velocidadeMediaEmKMH / 12.0) * tempoGastoEmHoras;
        //Saida
        System.out.printf("%.3f\n", quantidadeDeLitrosNecessario);

        teclado.close();
    }
}