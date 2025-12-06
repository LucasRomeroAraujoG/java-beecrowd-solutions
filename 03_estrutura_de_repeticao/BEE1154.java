import java.util.Scanner;

public class BEE1154{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int nInteiro = sc.nextInt();
        int somaDosInteiros = 0, contador = 0;
        double media = 0.0;

        while(nInteiro > 0){
            somaDosInteiros += nInteiro;
            nInteiro = sc.nextInt();
            contador++;
        }

        media = (double) somaDosInteiros / contador;

        System.out.printf("%.2f\n", media);

        sc.close();
    }
}