public class Uri1155{
    public static void main(String args[]){
        
        double S,contador;
        S=0.0;

        for (contador = 1.0; contador <=100.0; contador=contador+1.0){
                S = S + 1/contador;
        }
        System.out.printf("%.2f\n",S);
    }
}