import java.util.Scanner;

public class Exercicio2e{
    public static void main(String args[]){
        Scanner teclado;    //declarei um componente do tipo Scanner (chamei de Teclado)
    teclado = new Scanner(System.in);  //Este componente vai ler dados do dispositivo de entrada

    int area,basemaior,basemenor,altura;

    System.out.println("por favor, digite o valor da base maior do trapezio");
    basemaior = teclado.nextInt();

    System.out.println("por favor, digite o valor da base menor do trapezio");
    basemenor = teclado.nextInt();

    System.out.println("por favor, digite o valor da altura do trapezio");
    altura = teclado.nextInt();

    area = (basemaior + basemenor) * altura / 2;

    System.out.println("A area do losango vale "+area);
    }
}
