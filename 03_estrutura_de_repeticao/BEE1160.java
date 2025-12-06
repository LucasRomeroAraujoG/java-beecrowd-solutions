import java.util.Scanner;

public class BEE1160 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        int pa, pb;
        double g1, g2;

        for (int i = 0; i < t; i++) {
            pa = sc.nextInt();
            pb = sc.nextInt();
            g1 = sc.nextDouble();
            g2 = sc.nextDouble();

            int anos = 0;

            while (pa <= pb) {
                pa += (pa * g1 / 100.0);
                pb += (pb * g2 / 100.0);
                anos++;

                if (anos > 100) {
                    break;
                }
            }

            if (anos > 100) {
                System.out.println("Mais de 1 seculo.");
            } else {
                System.out.println(anos + " anos.");
            }
        }

        sc.close();
    }
}
