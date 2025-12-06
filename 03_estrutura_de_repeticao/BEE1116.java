import java.util.Scanner;

public class BEE1116{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //Ler dois numeros e imprimir o resultado da divisao do primeiro pelo segundo
        //Nao pode imprimir por zero, neste caso, mostrar "divisao impossivel"
        //A divisao tem que sia com 1 casa decimal.
        
        int n = sc.nextInt();
        Double primeiroNumero, segundoNumero;
        double resultado;

        for(int i = 1;i<=n;i++){
            primeiroNumero = sc.nextDouble();
            segundoNumero = sc.nextDouble();

            if(primeiroNumero == 0){
                System.out.println("divisao impossivel");
            }
            else{
                resultado = (double) primeiroNumero / segundoNumero;
                System.out.printf("%.1f\n", resultado);
            }

        }

        sc.close();
    }
}