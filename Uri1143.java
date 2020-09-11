import java.util.Scanner;

public class Uri1143{
    public static void main(String args[]){
        
        Scanner teclado = new Scanner(System.in);
        int totLinhas, contador, col1, col2, col3;
        totLinhas = teclado.nextInt();
        col1 = 1;
        col2 = 1;
        col3 = 1;
        
        for (contador = 1; contador <= totLinhas; contador = contador + 1){
            System.out.println(col1+" "+col2+" "+col3);
            col1 = col1 + 1;
            col2 = col1 * col1;
            col3 = col1 * col1 * col1;
        }
    }
}