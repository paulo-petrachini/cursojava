import java.util.Scanner;
public class Uri1070{
    public static void main(String args[]){
        
        Scanner teclado = new Scanner(System.in);
        int valor, contador, continic, contfinal;

        valor = teclado.nextInt();
        if (valor % 2 == 1){
            continic = valor;
        }
        else {
            continic = valor+1;
        }
        contfinal = continic + 10;
                        
        for (contador=continic ; contador<=contfinal; contador = contador + 2){
                System.out.println(contador);
        }
    }
}