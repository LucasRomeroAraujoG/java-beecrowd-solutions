import java.util.Scanner;

/*
Desafio: Distância entre dois pontos

Leia quatro valores correspondentes aos eixos x e y de dois pontos no plano:
- p1 (x1, y1) 
- p2 (x2, y2)

Em seguida, calcule a distância entre eles utilizando a fórmula da distância entre dois pontos no plano cartesiano.

Entrada:
- O arquivo de entrada contém duas linhas de dados:
  1. A primeira linha contém dois valores double: x1 y1
  2. A segunda linha contém dois valores double: x2 y2
- Todos os valores possuem uma casa decimal.

Saída:
- Calcule e imprima o valor da distância utilizando a fórmula fornecida,
  com 4 casas decimais.

Exemplo de saída:
5.0000
*/

public class BEE1015{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        double x1, y1, x2, y2, distancia;
        //Entrada
        x1 = teclado.nextDouble();
        y1 = teclado.nextDouble();
        x2 = teclado.nextDouble();
        y2 = teclado.nextDouble();
        //Processamento
        //Math.sqrt é usado para calcular a raiz quadrada.
        distancia = Math.sqrt(((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1)));
        //Saida
        System.out.printf("%.4f\n", distancia);

        teclado.close();
    }
}