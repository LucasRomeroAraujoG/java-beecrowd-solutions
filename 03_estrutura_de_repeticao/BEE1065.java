import java.util.Scanner;

public class BEE1065{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int valor;
        int par = 0;
        for(int cont = 1; cont <= 5 ; cont++){
            valor = sc.nextInt();
            if(valor % 2 == 0){
                par = par + 1;
            }
        }

        System.out.println(par + " valores pares");

        sc.close();
    }
}