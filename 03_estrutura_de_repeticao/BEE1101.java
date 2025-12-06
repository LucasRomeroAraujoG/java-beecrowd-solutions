import java.util.Scanner;

public class BEE1101{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int maior, menor, soma = 0;
        int m = sc.nextInt();
        int n = sc.nextInt();

        while(m > 0 && n > 0){
            if(m > n){
                maior = m;
                menor = n;
            }
            else{
                maior = n;
                menor = m;
            }

            for(int i = menor;i<=maior;i++){
                System.out.print(i + " ");
                soma = soma + i;
                if(i == maior){
                    System.out.println("Sum=" + soma);
                }
            }
            soma = 0;

            m = sc.nextInt();
            n = sc.nextInt();
        }


        sc.close();
    }
}