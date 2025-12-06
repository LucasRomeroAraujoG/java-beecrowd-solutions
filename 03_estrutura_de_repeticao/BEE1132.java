import java.util.Scanner;

public class BEE1132{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        int maior, menor, soma = 0;

        if(x > y){
            maior = x;
            menor = y;
        }
        else{
            maior = y;
            menor = x;
        }

        for(int i = menor;i<=maior;i++){
            if(i % 13 != 0){
                soma = soma + i;
            }
        }

        System.out.println(soma);
        sc.close();
    }
}