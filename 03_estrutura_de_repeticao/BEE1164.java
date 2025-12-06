import java.util.Scanner;

public class BEE1164{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int qtdNumeros = sc.nextInt();

        for(int i = 0; i < qtdNumeros; i++){
            int n = sc.nextInt();
            int soma = 0;
            for(int j = n-1; j >= 1; j--){
                if(n % j == 0){
                    soma += j;
                }
            }

            if(soma == n){
                System.out.printf("%d eh perfeito\n", n);
            }
            else{
                System.out.printf("%d nao eh perfeito\n", n);
            }
        }

        sc.close();
    }
}