public class BEE1098 {
    public static void main(String[] args) {
        for (int i = 0; i <= 20; i += 2) {   // 0, 2, 4, ..., 20 → representando 0.0 até 2.0
            for (int j = 1; j <= 3; j++) {
                double I = i / 10.0;
                double J = j + I;

                if (i == 0 || i == 10 || i == 20) { 
                    // I é inteiro: imprimir sem casas decimais
                    System.out.printf("I=%.0f J=%.0f%n", I, J);
                } else {
                    // I não é inteiro: imprimir com uma casa decimal
                    System.out.printf("I=%.1f J=%.1f%n", I, J);
                }
            }
        }
    }
}
