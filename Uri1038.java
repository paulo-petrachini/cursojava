import java.util.Scanner;
public class Uri1038{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int codigo,quantidade;
        
        codigo      = teclado.nextInt();
        quantidade  = teclado.nextInt();


        if (codigo == 1){
            System.out.printf("Total: R$ %.2f\n",4.00*quantidade);
        }
        else if (codigo == 2){
            System.out.printf("Total: R$ %.2f\n",4.50*quantidade);
        }
        else if (codigo == 3){
            System.out.printf("Total: R$ %.2f\n",5.00*quantidade);
        }
        else if (codigo == 4){
            System.out.printf("Total: R$ %.2f\n",2.00*quantidade);
        }
        else
            System.out.printf("Total: R$ %.2f\n",1.50*quantidade);
                
    } 
}