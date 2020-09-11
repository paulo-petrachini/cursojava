import java.util.Scanner;
public class Uri1164{
    public static void main(String args[]){
        
        Scanner teclado = new Scanner(System.in);
        int casosTeste;

        casosTeste = teclado.nextInt(); 
                               
        for (contador = 1; contador <=casosTeste; contador=contador+1){
            x = teclado.nextInt();
            y = teclado.nextInt();
            if (x % 2 == 0){
                pimpar = x+1;
            }
            else    {
                pimpar = x;
            }
            soma = 0;
            for (contador2 = 1; contador2 <= y; contador2 = contador2 + 1){
                soma = soma + pimpar;
                pimpar = pimpar + 2;
            }
            System.out.println(soma);
        }
    }
}