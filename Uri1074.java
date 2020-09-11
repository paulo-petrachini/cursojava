import java.util.Scanner;
public class Uri1074{
    public static void main(String args[]){
        
        Scanner teclado = new Scanner(System.in);
        int valor, contador, qtde;

        qtde = teclado.nextInt();

                        
        for (contador=1 ; contador<=qtde; contador = contador + 1){
            valor = teclado.nextInt();
            if (valor == 0){
                System.out.println("NULL");
            }
            else if 
                (valor > 0 && valor % 2 == 0){
                    System.out.println("EVEN POSITIVE");
                }
            else if 
                (valor > 0 && valor % 2 == 1){
                    System.out.println("ODD POSITIVE");  
                }
            else if 
                (valor < 0 && valor % 2 == 0){
                    System.out.println("EVEN NEGATIVE");
                }
            else {
                System.out.println("ODD NEGATIVE");
            }
           
        }
    
    }
}