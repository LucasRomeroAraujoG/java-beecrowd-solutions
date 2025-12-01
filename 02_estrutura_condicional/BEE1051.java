import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double valorSalario = sc.nextDouble();
        double imposto, resto;

        if(valorSalario <= 2000.00){
            System.out.println("Isento");
        }
        else if(valorSalario <= 3000.00){
            resto = valorSalario - 2000.00;
            imposto = resto * 0.08;
            System.out.println("R$ %.2f\n", imposto);
        }
        else if(valorSalario <= 4500.00){
            resto = valorSalario - 3000.00;
            imposto = resto * 0.18 + (1000.00 * 0.08);
            System.out.println("R$ %.2f\n", imposto);
        }
        else if(valor > 4500.00){
            resto = valorSalario - 4500.00;
            imposto = resto * 0.28 + (1000.00 * 0.08) + (1500 * 0.18);
            System.out.println("R$ %.2f\n", imposto);
        }

        sc.close();
    }
}