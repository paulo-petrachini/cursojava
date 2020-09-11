import java.util.Scanner;
public class Uri1010{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int codigo1,codigo2,numPecas1,numPecas2;
        double valPeca1,valPeca2,valPagar;

        codigo1 = teclado.nextInt();
        numPecas1 = teclado.nextInt();
        valPeca1 = teclado.nextDouble();
        codigo2 = teclado.nextInt();
        numPecas2 = teclado.nextInt();
        valPeca2 = teclado.nextDouble();
        
        
        valPagar = (numPecas1*valPeca1) + (numPecas2*valPeca2);

        System.out.printf("VALOR A PAGAR: R$ %.2f\n",valPagar);
    }
}