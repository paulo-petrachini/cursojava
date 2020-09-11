import java.util.Scanner;
public class Uri1066{
    public static void main(String args[]){
        
        Scanner teclado = new Scanner(System.in);
        int valor, contador, totalPar, totalImpar, totalPositivo, totalNegativo;
        totalPar      = 0;
        totalImpar    = 0;
        totalPositivo = 0;
        totalNegativo = 0;
                
        for (contador=1 ; contador<=5; contador = contador + 1){
            valor = teclado.nextInt();
            if (valor % 2 == 0){
                totalPar = totalPar + 1;
            }
            else {
                totalImpar = totalImpar + 1;
            }
            if (valor > 0){
                totalPositivo = totalPositivo + 1;
            }
            else if (valor < 0){
                totalNegativo = totalNegativo + 1;
            }
        }
    System.out.println(totalPar+" valor(es) par(es)");
    System.out.println(totalImpar+" valor(es) impar(es)");
    System.out.println(totalPositivo+" valor(es) positivo(s)");
    System.out.println(totalNegativo+" valor(es) negativo(s)");
    }
}