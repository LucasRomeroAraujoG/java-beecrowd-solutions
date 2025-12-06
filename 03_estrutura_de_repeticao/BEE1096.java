public class BEE1096{
    public static void main(String args[]){
        //i repete 3 vezes, apos repetir, soma 2.
        //j repete 3 vezes a sequencia sempre (7 6 5)
        
        for(int i = 1; i<=9;i+=2){
            for(int j = 7;j>=5;j--){
                System.out.println("I="+i+" J="+j);
            }
        }
    }
}