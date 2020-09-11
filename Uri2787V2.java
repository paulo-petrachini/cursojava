import java.util.Scanner;
public class Uri2787V2{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int linha,coluna,cor,primeiraColuna;
        
        linha  = teclado.nextInt();
        coluna = teclado.nextInt();
      
        if (linha % 2 == 1){
            primeiraColuna = 1;
        }
        else {
            primeiraColuna = 0;
        }
        if (primeiraColuna == 1){
            if (coluna % 2 == 1){
                cor = 1;
            }
            else {
                cor = 0;
            }
        }
        else {
            if (coluna % 2 == 1){
                cor = 0;
            }
            else {
                cor = 1;
            }
        }
        System.out.println(cor);
    }
}