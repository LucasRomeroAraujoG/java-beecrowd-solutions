import java.util.Scanner;

/*
Desafio: Conversão de idade em anos, meses e dias

Leia um valor inteiro correspondente à idade de uma pessoa (em dias) 
e imprima-a em anos, meses e dias, seguido das respectivas mensagens 
“ano(s)”, “mes(es)” e “dia(s)”.

Observação:
- Para facilitar o cálculo, considere o ano com 365 dias e cada mês com 30 dias.
- Nos casos de teste, nunca haverá situações que permitam 12 meses e alguns dias 
  (como 360, 363 ou 364). Este é apenas um exercício para praticar raciocínio 
  matemático simples.

Entrada:
- O arquivo de entrada contém 1 valor inteiro (idade em dias).

Saída:
- Imprima a idade em anos, meses e dias no formato do exemplo.

Exemplo de saída:
1 ano(s)
2 mes(es)
3 dia(s)
*/


public class BEE1020{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int ano, mes, dia, resto;
        //Entrada
        int idadeEmDias = teclado.nextInt();
        //Processamento
        ano = idadeEmDias / 365;
        resto = idadeEmDias % 365;
        mes = resto / 30;
        resto %= 30;
        dia = resto;
        //Saida
        System.out.println(ano + " ano(s)");
        System.out.println(mes + " mes(es)");
        System.out.println(dia + " dia(s)");

        teclado.close();
    }
}