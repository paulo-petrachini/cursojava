import java.util.Scanner;
public class Uri2787{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int linha,coluna,cor,primeiraColuna;
        
        linha  = teclado.nextInt();
        coluna = teclado.nextInt();
      
        if (linha % 2 == 1){
            primeiraColuna = 0;
        }
        else {
            primeiraColuna = 1;
        }
        if (primeiraColuna == 0){
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