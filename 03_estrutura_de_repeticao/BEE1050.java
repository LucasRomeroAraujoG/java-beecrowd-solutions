import java.util.Scanner;

public class BEE1050{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        while(y <= x){
            y = sc.nextInt();
        }

        int qtdNumerosInteiros = 0, soma = 0;
        for(int i=x;i<y;i++){
            soma = soma + i;
            qtdNumerosInteiros++;
            if(soma > y){
                break;
            }
        }

        System.out.println(qtdNumerosInteiros);

        sc.close();
    }
}