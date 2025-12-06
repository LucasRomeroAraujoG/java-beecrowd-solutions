import java.util.Scanner;

public class BEE1074{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int valor = 0;

        for(int i = 0; i<n;i++){
            valor = sc.nextInt();
            
            if(valor == 0){
                System.out.println("NULL");
            }
            else if(valor % 2 == 0){
                System.out.print("EVEN ");
            }
            else{
                System.out.print("ODD ");
            }

            if(valor > 0){
                System.out.println("POSITIVE");
            }
            else if(valor<0){
                System.out.println("NEGATIVE");
            }
        }

        sc.close();
    }
}