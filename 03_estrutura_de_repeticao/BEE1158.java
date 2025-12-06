import java.util.Scanner;


public class BEE1158{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0; i<n; i++){

            int x = sc.nextInt();
            int y = sc.nextInt();
            int soma = 0;
            int contador = 0;

            while(contador<y){
                if(x % 2 == 0){
                    x++;
                }
                else{
                    soma += x;
                    x+= 2;
                }

                contador++;
            }
            System.out.println(soma);
        }
        sc.close();
    }
}