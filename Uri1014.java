import java.util.Scanner;
public class Uri1014{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int distancia;
        double totalGasto,consumoMedio;

        distancia  = teclado.nextInt();
        totalGasto = teclado.nextDouble();
                
        consumoMedio = distancia/totalGasto;
        
        System.out.printf("%.3f km/l\n",consumoMedio);
    } 
}