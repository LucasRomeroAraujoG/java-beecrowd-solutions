import java.util.Scanner;

public class BEE1099{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int numeroDeTestes = sc.nextInt();
        int x = 0, y = 0;
        int maior, menor;
        int somaDosImpares = 0;

        for(int i = 1;i<=numeroDeTestes;i++){
            x = sc.nextInt();
            y = sc.nextInt();

            if(x > y){
                maior = x;
                menor = y;
            }
            else{
                maior = y;
                menor = x;
            }

            for(int j = menor+1;j<maior;j++){
                if(j % 2 != 0){
                    somaDosImpares += j;
                }
            }

            System.out.println(somaDosImpares);
            somaDosImpares = 0;
        }


        sc.close();
    }
}