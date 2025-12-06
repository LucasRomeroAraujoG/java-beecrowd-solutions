import java.util.Scanner;

public class BEE1131{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int golsInter = 0, golsGremio = 0, novoGrenal = 0;
        int qtdGrenais = 0, vitoriasInter = 0, vitoriasGremio = 0, empates = 0;

        do{
            golsInter = sc.nextInt();
            golsGremio = sc.nextInt();

            if(golsInter > golsGremio){
                vitoriasInter++;
            }
            else if(golsGremio > golsInter){
                vitoriasGremio++;
            }
            else{
                empates++;
            }

            qtdGrenais++;

            System.out.println("Novo grenal (1-sim 2-nao)");
            novoGrenal = sc.nextInt();
            while(novoGrenal != 1 && novoGrenal != 2){
            System.out.println("Novo grenal (1-sim 2-nao)");
            novoGrenal = sc.nextInt();               
            }

        }while(novoGrenal != 2);

        System.out.printf("%d grenais\n", qtdGrenais);
        System.out.printf("Inter:%d\n", vitoriasInter);
        System.out.printf("Gremio:%d\n", vitoriasGremio);
        System.out.printf("Empates:%d\n", empates);
        if(vitoriasGremio > vitoriasInter){
            System.out.println("Gremio venceu mais");
        }
        else{
            System.out.println("Inter venceu mais");
        }

        sc.close();
    }
}