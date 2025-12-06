import java.util.Scanner;

public class BEE1118{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int novoCalculo = 1;

        do{
            
            double notasValidas = 0.0, notas = 0.0, media = 0.0;
            int qtdNotas = 0;

            while(qtdNotas < 2){
            notas = sc.nextDouble();
            if(notas > 0 && notas <= 10){
                notasValidas += notas;
                qtdNotas = qtdNotas + 1;
            }
            else{
                System.out.println("nota invalida");
            }
            }


            media = notasValidas / 2.0;
            System.out.printf("media = %.2f\n", media);
            
            System.out.println("novo calculo (1-sim 2-nao)");
            novoCalculo = sc.nextInt();
            while(novoCalculo != 1 && novoCalculo != 2){
                System.out.println("novo calculo (1-sim 2-nao)");
                novoCalculo = sc.nextInt();
            }

        }while(novoCalculo != 2);

        sc.close();
    }
}