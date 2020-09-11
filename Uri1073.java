import java.util.Scanner;

public class Uri1073{
    public static void main(String args[]){
        
        Scanner teclado = new Scanner(System.in);
        int valor, contador;
        
        valor = teclado.nextInt();
                                                
        for (contador=2 ; contador<=valor; contador = contador + 2){
                System.out.println(contador+"^2 = "+(contador * contador));
        }
    }
}