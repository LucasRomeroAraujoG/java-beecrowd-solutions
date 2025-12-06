import java.util.Scanner;

public class BEE1165 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
       
        for (int k = 0; k < n; k++) {

            int numPrimo = sc.nextInt();
            boolean primo = true;

            double raiz = Math.sqrt(numPrimo);
            int limite = (int)Math.round(raiz);

            for (int i = 2; i <= limite; i++) {
                if (numPrimo % i == 0) {
                    primo = false;
                    break;
                }
            }

            if (primo && numPrimo > 1) {
                System.out.println(numPrimo + " eh primo");
            } else {
                System.out.println(numPrimo + " nao eh primo");
            }
        }

        sc.close();
    }
}
