import java.util.Scanner;


public class BEE1080{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int maior = 0, valor = 0;
        int maiorPosicao = 0;

        for(int i = 1; i<=100;i++){
            valor = sc.nextInt();

            if(valor > maior){
                maior = valor;
                maiorPosicao = i;
            }
        }

        System.out.println(maior);
        System.out.println(maiorPosicao);

        sc.close();
    }
}