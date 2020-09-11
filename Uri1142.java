import java.util.Scanner;

public class Uri1142{
    public static void main(String args[]){
        
        Scanner teclado = new Scanner(System.in);
        int totLinhas, contador, col1, col2, col3;
        totLinhas = teclado.nextInt();
        col1 = 1;
        col2 = 2;
        col3 = 3;
        
        for (contador = 1; contador <= totLinhas; contador = contador + 1){
            System.out.println(col1+" "+col2+" "+col3+" PUM");
            col1 = col1 + 4;
            col2 = col2 + 4;
            col3 = col3 + 4;
        }
    }
}