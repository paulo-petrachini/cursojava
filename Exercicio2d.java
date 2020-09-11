import java.util.Scanner;

public class Exercicio2d{
    public static void main(String args[]){
        Scanner teclado;    //declarei um componente do tipo Scanner (chamei de Teclado)
    teclado = new Scanner(System.in);  //Este componente vai ler dados do dispositivo de entrada

    int area,diag1,diag2;

    System.out.println("por favor, digite o valor da diagonal 1 do losango");
    diag1 = teclado.nextInt();

    System.out.println("por favor, digite o valor da diagonal 2 do losango");
    diag2 = teclado.nextInt();

    area = diag1 * diag2;

    System.out.println("A area do losango vale "+area);
    }
}
