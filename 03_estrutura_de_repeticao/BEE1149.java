import java.util.Scanner;

public class BEE1149{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int soma = 0;

        int n = sc.nextInt();
        while(n < 0 || n == 0){
            n = sc.nextInt();
        }

        for(int i = 0;i<n;i++){
            soma += a + i;
        }

        System.out.println(soma);
  

        sc.close();
    }
}