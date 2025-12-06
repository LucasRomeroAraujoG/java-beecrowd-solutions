import java.util.Scanner;

public class BEE1151 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int primeiroNumero = 0, segundoNumero = 1, soma = 0;
        int x = sc.nextInt();

        for(int i = 0; i < x - 3 ; i++){
            if(i == 0){
            soma = primeiroNumero + segundoNumero;
            System.out.printf("%d %d %d", primeiroNumero, segundoNumero, soma);
            primeiroNumero = segundoNumero;
            segundoNumero = soma;
            }

            soma = primeiroNumero + segundoNumero;
            primeiroNumero = segundoNumero;
            segundoNumero = soma;
            System.out.printf(" %d", soma);        
        }
        System.out.println();
        sc.close();
    }
}
