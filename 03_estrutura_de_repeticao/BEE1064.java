import java.util.Scanner;

public class BEE1064{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        double valor;
        double media = 0;
        int numPos = 0;

        for(int i = 0; i <= 5; i++){
            valor = sc.nextDouble();
            if(valor > 0){
                numPos += 1;
                media = media + valor;
            }
        }

        media = media / numPos;

        System.out.println(numPos + " valores positivos");
        System.out.printf("%.1f\n", media);

        sc.close();
    }
}