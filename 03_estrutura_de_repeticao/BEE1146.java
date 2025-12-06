import java.util.Scanner;

public class BEE1146{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int x = sc.nextInt();
        while(sc.hasNextInt()){
            if(x == 0){
                break;
            }

            for(int i = 1; i <=x; i++){
                if(i != x){
                    sb.append(i);
                    sb.append(" ");
                }
                else{
                    sb.append(i);
                }
            }

            x = sc.nextInt();
            if(x == 0){
                break;
            }
            sb.append("\n");
        }


        System.out.println(sb);

        sc.close();
    }
}