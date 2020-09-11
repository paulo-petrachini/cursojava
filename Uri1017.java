import java.util.Scanner;
public class Uri1017{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int tempoViagem,velMedia,distancia;
        double qtdeLitros,consumoMedio;

        tempoViagem  = teclado.nextInt();
        velMedia     = teclado.nextInt();
        consumoMedio = 12.0;
        distancia    = tempoViagem*velMedia;
                
        qtdeLitros   = distancia/consumoMedio;
        
        System.out.printf("%.3f\n",qtdeLitros);
    } 
}