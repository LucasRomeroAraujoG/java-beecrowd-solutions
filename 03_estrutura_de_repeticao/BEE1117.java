import java.util.Scanner;

public class BEE1117{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        double notas, notasValidas = 0, contador = 1, media;

        while(contador <= 2){
            notas = sc.nextDouble();
            if(notas > 0 && notas <= 10){
                notasValidas += notas;
                contador++;
            }
            else{
                System.out.println("nota invalida");
            }
        }
            media = notasValidas / 2.0;
            System.out.printf("media = %.2f\n", media);

        sc.close();
    }
}