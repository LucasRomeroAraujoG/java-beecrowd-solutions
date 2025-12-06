import java.util.Scanner;

public class BEE1071{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int maior, menor, soma = 0;
        int x = sc.nextInt();
        int y = sc.nextInt();

        if(x > y){
            maior = x;
            menor = y;
        }
        else{
            maior = y;
            menor = x;
        }

        if(menor == maior){
            soma = 0;
        }
        else{
            do{
            menor = menor + 1;
            if(menor % 2 != 0){
                soma = soma + menor;
            }
        }while(menor < maior - 1);
        }

        System.out.println(soma);
    

        sc.close();
    }
}