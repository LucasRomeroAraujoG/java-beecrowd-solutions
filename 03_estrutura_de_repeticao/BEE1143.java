import java.util.Scanner;

public class BEE1143{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int qtdLinhas = sc.nextInt();

        for(int i=1;i<=qtdLinhas;i++){
            System.out.printf("%d %d %d\n", i, i * i, i * i * i);
        }

        sc.close();
    }
}