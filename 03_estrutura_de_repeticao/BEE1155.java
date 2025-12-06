public class BEE1155{
    public static void main(String args[]){        
        double s = 1.0;
        double valor = 0.0;

        for(int i = 1; i <= 100 ; i++ ){
            valor += (s / i);
        }

        System.out.printf("%.2f\n", valor);
    }
}