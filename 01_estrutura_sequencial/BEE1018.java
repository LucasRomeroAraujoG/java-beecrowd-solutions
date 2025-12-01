import java.util.Scanner;

/*
Desafio: Decomposição em cédulas

Neste problema, você deve ler um valor inteiro e calcular o menor número possível 
de cédulas no qual o valor pode ser decomposto. As cédulas possíveis são: 100, 50, 
20, 10, 5, 2 e 1.

Entrada:
- O arquivo de entrada contém um valor inteiro N (0 < N < 1000000).

Saída:
- Imprima o número lido e a quantidade mínima de cada cédula necessária, 
  conforme o exemplo.  
- Não se esqueça de imprimir a quebra de linha após cada linha, caso contrário 
  ocorrerá “Presentation Error”.

Exemplo de saída:
576
5 nota(s) de R$ 100,00
1 nota(s) de R$ 50,00
1 nota(s) de R$ 20,00
0 nota(s) de R$ 10,00
1 nota(s) de R$ 5,00
0 nota(s) de R$ 2,00
1 nota(s) de R$ 1,00
*/

public class BEE1018{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int nota100, nota50, nota20, nota10, nota5, nota2, nota1, resto;
        //Entrada
        int valorInteiro = teclado.nextInt();
        //Processamento
        nota100 = valorInteiro / 100;
        resto = valorInteiro % 100;

        nota50 = resto / 50;
        resto %= 50;

        nota20 = resto / 20;
        resto %= 20;

        nota10 = resto / 10;
        resto %= 10;

        nota5 = resto / 5;
        resto %= 5;

        nota2 = resto / 2;
        resto %= 2;

        nota1 = resto;
        //Saida
        System.out.println(valorInteiro);
        System.out.printf("%d nota(s) de R$ 100,00\n", nota100);
        System.out.printf("%d nota(s) de R$ 50,00\n", nota50);
        System.out.printf("%d nota(s) de R$ 20,00\n", nota20);
        System.out.printf("%d nota(s) de R$ 10,00\n", nota10);
        System.out.printf("%d nota(s) de R$ 5,00\n", nota5);
        System.out.printf("%d nota(s) de R$ 2,00\n", nota2);
        System.out.printf("%d nota(s) de R$ 1,00\n", nota1);

        teclado.close();
    }
}
