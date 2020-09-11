import java.util.Scanner;
public class Uri1060{
    public static void main(String args[]){
        
        Scanner teclado = new Scanner(System.in);
        int contador, positivo;
        Double valor;
        positivo = 0;
                
        for (contador=1 ; contador<=6; contador = contador + 1){
            valor = teclado.nextDouble();
            if (valor > 0){
                positivo = positivo + 1;
            }
        }
    System.out.println(positivo+" valores positivos");
    }
}