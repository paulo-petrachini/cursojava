import java.util.Scanner;
public class Uri1067{
    public static void main(String args[]){
        
        Scanner teclado = new Scanner(System.in);
        int valor, contador;

        valor = teclado.nextInt();
                        
        for (contador=1 ; contador<=valor; contador = contador + 1){
            if (contador % 2 == 1){
                System.out.println(contador);
            }
        }
    }
}