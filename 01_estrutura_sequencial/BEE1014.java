import java.util.Scanner;

/*
Desafio: Consumo médio de um carro

Calcule o consumo médio de um carro, sendo fornecidos:
- a distância total percorrida (em Km) 
- o total de combustível gasto (em litros).

Entrada:
- O arquivo de entrada contém dois valores:
  1. Um valor inteiro X representando a distância total em Km.
  2. Um valor de ponto flutuante Y representando o total de combustível gasto,
     com uma casa decimal.

Saída:
- Apresente o valor que representa o consumo médio do carro com 3 casas decimais,
  seguido da mensagem "km/l".

Exemplo de saída:
10.000 km/l
*/

public class BEE1014{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int distanciaTotalKm;
        double combustivelGasto, consumoMedio;
        //Entrada
        distanciaTotalKm = teclado.nextInt();
        combustivelGasto = teclado.nextDouble();
        //Processamento
        consumoMedio = distanciaTotalKm / combustivelGasto;
        //Saida
        System.out.printf("%.3f km/l\n", consumoMedio);


        teclado.close();
    }
}