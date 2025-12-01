import java.util.Scanner;

public class BEE1049 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String palavra1 = sc.nextLine();
        String palavra2 = sc.nextLine();
        String palavra3 = sc.nextLine();

        // Em Java, Strings são objetos. O operador == compara referências (endereço de memória),
        // não o conteúdo da String. Para comparar textos corretamente, usamos .equals(). 
        // Caso você utilize o == para comparar as palavras, o bloco de código dentro do if não irá iniciar.


        if (palavra1.equals("vertebrado")) {

            if (palavra2.equals("ave")) {

                if (palavra3.equals("carnivoro")) {
                    System.out.println("aguia");
                } else { // onivoro
                    System.out.println("pomba");
                }

            } else { // mamifero

                if (palavra3.equals("onivoro")) {
                    System.out.println("homem");
                } else { // herbivoro
                    System.out.println("vaca");
                }
            }

        } else { // invertebrado

            if (palavra2.equals("inseto")) {

                if (palavra3.equals("hematofago")) {
                    System.out.println("pulga");
                } else { // herbivoro
                    System.out.println("lagarta");
                }

            } else { // anelidio

                if (palavra3.equals("hematofago")) {
                    System.out.println("sanguessuga");
                } else { // onivoro
                    System.out.println("minhoca");
                }
            }
        }

        sc.close();
    }
}