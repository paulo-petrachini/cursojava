import java.util.Scanner;
public class Uri1157{
    public static void main(String args[]){
        
        Scanner teclado = new Scanner(System.in);
        int N, contador;

        N = teclado.nextInt();
        
        for (contador = 1; contador <=N; contador=contador+1){
                if (N % contador == 0){
                   System.out.println(contador);
                }
        }
    }
}