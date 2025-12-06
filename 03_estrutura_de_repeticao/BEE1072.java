import java.util.Scanner;

public class BEE1072{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int in = 0, out = 0, valor = 0;
        
        for(int i = 1; i<=n;i++){
            valor = sc.nextInt();
            if(valor >= 10 && valor <= 20){
                in++;
            }
            else{
                out++;
            }
        }

        System.out.println(in + " in");
        System.out.println(out + " out");

        sc.close();
    }
}