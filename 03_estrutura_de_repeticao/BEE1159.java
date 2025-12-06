import java.util.Scanner;

public class BEE1159{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        while(x != 0){
            if(x % 2 != 0){
                x++;
            }
            int soma = 0;
            for(int i = 0; i < 5; i++){
                soma += x;
                x+=2;
            }
            System.out.println(soma);
            x = sc.nextInt();
        }

        sc.close();
    }
}