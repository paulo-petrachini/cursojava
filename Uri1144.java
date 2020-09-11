import java.util.Scanner;

public class Uri1144{
    public static void main(String args[]){
        
        Scanner teclado = new Scanner(System.in);
        int entrada, totLinhas, contador, col1, col2, col3, col4, col5, col6;
        entrada = teclado.nextInt();
        totLinhas = entrada*2;
        col1 = 1;
        col2 = 1;
        col3 = 1;
        col4 = 1;
        col5 = col2+1;
        col6 = col3+1;
        
        for (contador = 1; contador <= totLinhas; contador = contador + 2){
            System.out.println(col1+" "+col2+" "+col3);
            System.out.println(col4+" "+col5+" "+col6);
            col1 = col1 + 1;
            col2 = col1 * col1;
            col3 = col1 * col1 * col1;
            col4 = col1;
            col5 = col2+1;
            col6 = col3+1;
        }
    }
}