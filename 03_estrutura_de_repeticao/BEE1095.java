public class BEE1095{
    public static void main(String args[]){
        int i = 1;
   //ate o j ser 0, comeca com 60 e diminui de cinco em cinco
   //i aumenta de 3 em 3
        for(int j = 60; j>=0 ; j = j - 5){
            System.out.println("I=" + i + " J=" + j);
            i += 3;
        }
    }
}