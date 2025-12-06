import java.util.Scanner;

public class BEE1145{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int contador = 1;

        for(int i=1;i<=y;i++){
           if(contador == x){
            System.out.println(i);
            contador = 1;
           }
           else{
            System.out.print(i + " ");
            contador++;
           }
        }

        sc.close();
    }
}