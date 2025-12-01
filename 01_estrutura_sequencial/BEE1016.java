import java.util.Scanner;

/*
Desafio: Distância entre dois carros

Dois carros (X e Y) partem na mesma direção:
- Carro X: velocidade constante de 60 km/h
- Carro Y: velocidade constante de 90 km/h

Em uma hora (60 minutos), o carro Y consegue se distanciar 30 km do carro X,
ou seja, ele se afasta 1 km a cada 2 minutos.

Leia a distância (em km) e calcule quanto tempo (em minutos) o carro Y leva 
para se distanciar essa distância em relação ao carro X.

Entrada:
- O arquivo de entrada contém 1 valor inteiro representando a distância em km.

Saída:
- Imprima o tempo necessário seguido da mensagem "minutos".

Exemplo de saída:
30 minutos
*/

public class BEE1016{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int distanciaKM, minutos;
        //Entrada
        distanciaKM = teclado.nextInt();
        //Processamento
        minutos = distanciaKM * 2;
        //Saida
        System.out.printf("%d minutos\n", minutos);


        teclado.close();
    }
}