import java.util.Scanner;

public class BEE1134{
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int combustivelAbastecido = sc.nextInt();
    int alcool = 0, gasolina = 0, diesel = 0;

    while(combustivelAbastecido != 4){
        switch(combustivelAbastecido){
            case 1:
                alcool++;
                break;
            case 2:
                gasolina++;
                break;
            case 3:
                diesel++;
                break;
        }

        combustivelAbastecido = sc.nextInt();
        while(combustivelAbastecido < 1 && combustivelAbastecido > 4){
            combustivelAbastecido = sc.nextInt();
        }
    }

    System.out.println("MUITO OBRIGADO");
    System.out.println("Alcool: " + alcool);
    System.out.println("Gasolina: " + gasolina);
    System.out.println("Diesel: " + diesel);

    sc.close();
}
}
