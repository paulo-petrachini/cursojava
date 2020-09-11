import java.util.Scanner;
public class Uri1065{
    public static void main(String args[]){
        
        Scanner teclado = new Scanner(System.in);
        int valor, contador, totalPares;
        totalPares = 0;
                
        for (contador=1 ; contador<=5; contador = contador + 1){
            valor = teclado.nextInt();
            if (valor % 2 == 0){
                totalPares = totalPares + 1;
            }
        }
    System.out.println(totalPares+" valores pares");
    }
}