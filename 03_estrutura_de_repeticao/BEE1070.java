import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        for(int i=1;i<=6;i++){
            if(x % 2 == 0){
                x++;
            }
            System.out.println(x);
            x += 2;
        }
        sc.close();
    }
}