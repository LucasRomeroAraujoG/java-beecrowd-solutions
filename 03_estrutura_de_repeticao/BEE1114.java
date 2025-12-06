import java.util.Scanner;
public class BEE1114{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //Repitir a leitura de uma senha ate que ela seja valida
        //Na leitura incurreta, printar Senha Invalida
        //Senha correta, Acesso Permitido (2002)

        int senha;
        do{
            senha = sc.nextInt();
            if(senha == 2002){
                System.out.println("Acesso Permitido");
            }
            else{
                System.out.println("Senha Invalida");
            }
        }while(senha != 2002);

        sc.close();
    }
}