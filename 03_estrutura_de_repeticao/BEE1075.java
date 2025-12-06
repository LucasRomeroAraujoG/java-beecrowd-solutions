import java.util.Scanner;

public class BEE1075{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int firstNumber = 1;
        int maxNumber = 10000;


        //Decidi fazer com while por curiosidade, prolly easier com o for. 

        while(firstNumber < maxNumber){
            if(firstNumber % n == 2){
                System.out.println(firstNumber);
            }
            firstNumber = firstNumber + 1;
        }
        
        sc.close();
    }
}