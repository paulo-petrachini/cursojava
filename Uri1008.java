import java.util.Scanner;
public class Uri1008{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int numFunc,horasWrk;
        double valhora,salario;

        numFunc = teclado.nextInt();
        horasWrk = teclado.nextInt();
        valhora = teclado.nextDouble();
        
        salario = valhora*horasWrk;

        System.out.println("NUMBER = "+numFunc);
        System.out.printf("SALARY = U$ %.2f\n",salario);
    }
}