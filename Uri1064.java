import java.util.Scanner;
public class Uri1064{
    public static void main(String args[]){
        
        Scanner teclado = new Scanner(System.in);
        int contador, positivo;
        Double valor, totalPositivo, media;
        positivo = 0;
        totalPositivo = 0.0;
                
        for (contador=1 ; contador<=6; contador = contador + 1){
            valor = teclado.nextDouble();
            if (valor > 0){
                positivo = positivo + 1;
                totalPositivo = totalPositivo + valor;
            }
        }
    media = totalPositivo/positivo;
    System.out.println(positivo+" valores positivos");
    System.out.printf("%.1f\n",media);
    }
}