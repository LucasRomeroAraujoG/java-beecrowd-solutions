public class BEE1097{
    public static void main(String args[]){
        int jota = 7;

        for(int i = 1;i<=9;i+=2){
            int menorValor = jota - 2;
            for(int j = jota; j >= menorValor ; j--){
                System.out.println("I="+ i+" J="+j);
            }
            jota = jota + 2;

        }
    }
}