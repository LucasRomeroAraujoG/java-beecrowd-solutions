import java.util.Scanner;

public class BEE1142{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int nLinhas = sc.nextInt();
        int numero = 0;

        for(int i = 1;i<=nLinhas;i++){
            System.out.printf("%d %d %d PUM\n", numero+1,numero+2,numero+3);
            numero += 4;
        }

        sc.close();
    }
}