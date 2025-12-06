import java.util.Scanner;

public class BEE1094{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        char rato = 'R', coelho = 'C',  sapo = 'S', validar;
        int cobaias = 0, totalDeCobaias = 0, totalDeRatos = 0 , totalDeCoelhos = 0, totalDeSapos = 0;
        double percentualRatos, percentualCoelhos, percentualSapos;

        int n = sc.nextInt();
        for(int i = 0; i<n; i++){
            cobaias = sc.nextInt();
            validar = sc.next().charAt(0);

            totalDeCobaias += cobaias;

            if(validar == 'R'){
                totalDeRatos = totalDeRatos + cobaias;
            }else if(validar == 'C'){
                totalDeCoelhos = totalDeCoelhos + cobaias;
            }
            else{
                totalDeSapos = totalDeSapos + cobaias;
            }
        }

        System.out.println("Total: " + totalDeCobaias + " cobaias");
        System.out.println("Total de coelhos: " + totalDeCoelhos);
        System.out.println("Total de ratos: " + totalDeRatos);
        System.out.println("Total de sapos: " + totalDeSapos);

        //Calculando o percentual
        percentualCoelhos = ((double) totalDeCoelhos / totalDeCobaias) * 100.0;
        System.out.printf("Percentual de coelhos: %.2f %%\n", percentualCoelhos);
        percentualRatos = ((double) totalDeRatos / totalDeCobaias) * 100.0;
        System.out.printf("Percentual de ratos: %.2f %%\n", percentualRatos);
        percentualSapos = ((double) totalDeSapos / totalDeCobaias) * 100.0;
        System.out.printf("Percentual de sapos: %.2f %%\n", percentualSapos);
        sc.close();
    }
}