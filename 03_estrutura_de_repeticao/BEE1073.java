import java.util.Scanner;

public class BEE1073{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int resultado = 0;

        for(int i = 2; i<=n;i+=2){
            resultado = i * i;
            System.out.println(i + "^2 = " + resultado);
        }

        sc.close();
    }
}