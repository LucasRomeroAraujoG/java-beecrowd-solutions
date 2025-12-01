import java.util.Scanner;

/*
Desafio: Decomposição em notas e moedas

Leia um valor de ponto flutuante com duas casas decimais. Este valor representa 
um valor monetário. Em seguida, calcule o menor número possível de notas e moedas 
para decompor esse valor.

Notas disponíveis: 100, 50, 20, 10, 5, 2  
Moedas disponíveis: 1, 0.50, 0.25, 0.10, 0.05, 0.01

Entrada:
- O arquivo de entrada contém um valor de ponto flutuante N (0 ≤ N ≤ 1000000.00).

Saída:
- Imprima a mensagem "NOTAS:" seguida da lista de notas necessárias.  
- Imprima a mensagem "MOEDAS:" seguida da lista de moedas necessárias, 
  conforme o exemplo.

Exemplo de saída:
NOTAS:
5 nota(s) de R$ 100.00
1 nota(s) de R$ 50.00
1 nota(s) de R$ 20.00
0 nota(s) de R$ 10.00
1 nota(s) de R$ 5.00
0 nota(s) de R$ 2.00
MOEDAS:
1 moeda(s) de R$ 1.00
0 moeda(s) de R$ 0.50
1 moeda(s) de R$ 0.25
2 moeda(s) de R$ 0.10
0 moeda(s) de R$ 0.05
3 moeda(s) de R$ 0.01
*/

public class BEE1021{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        //Por organização declarei separado notas e moedas
        int nota100, nota50, nota20, nota10, nota5, nota2;
        int moeda1, moeda050, moeda025, moeda010, moeda005, moeda001;
        int resto;
        double valor;
        //Entrada
        valor = teclado.nextDouble();
        //Converter tudo pra centavos
        int valorCentavos = (int) Math.round(valor * 100);
        //Processamento das notas
        nota100 = valorCentavos / 10000;
        resto = valorCentavos % 10000;
        nota50 = resto / 5000;
        resto %= 5000;
        nota20 = resto / 2000;
        resto %= 2000;
        nota10 = resto / 1000;
        resto %= 1000;
        nota5 = resto / 500;
        resto %= 500;
        nota2 = resto / 200;
        resto %= 200;
        //Processamento das moedas
        moeda1 = resto / 100;
        resto %= 100;
        moeda050 = resto / 50;
        resto %= 50;
        moeda025 = resto / 25;
        resto %= 25;
        moeda010 = resto / 10;
        resto %= 10;
        moeda005 = resto / 5;
        resto %= 5;
        moeda001 = resto;
        //Saida
        System.out.println("NOTAS:");
        System.out.println(nota100 + " nota(s) de R$ 100.00");
        System.out.println(nota50 + " nota(s) de R$ 50.00");
        System.out.println(nota20 + " nota(s) de R$ 20.00");
        System.out.println(nota10 + " nota(s) de R$ 10.00");
        System.out.println(nota5 + " nota(s) de R$ 5.00");
        System.out.println(nota2 + " nota(s) de R$ 2.00");
        System.out.println("MOEDAS:");
        System.out.println(moeda1 + " moeda(s) de R$ 1.00");
        System.out.println(moeda050 + " moeda(s) de R$ 0.50");
        System.out.println(moeda025 + " moeda(s) de R$ 0.25");
        System.out.println(moeda010 + " moeda(s) de R$ 0.10");
        System.out.println(moeda005 + " moeda(s) de R$ 0.05");
        System.out.println(moeda001 + " moeda(s) de R$ 0.01");

        teclado.close();
    }
}