import java.util.Scanner;

public class Exercicio2b{
    public static void main(String args[]){
        Scanner teclado;    //declarei um componente do tipo Scanner (chamei de Teclado)
    teclado = new Scanner(System.in);  //Este componente vai ler dados do dispositivo de entrada

    int area,base,altura;

    System.out.println("por favor, digite o valor da base do retangulo");
    base = teclado.nextInt();

    System.out.println("por favor, digite o valor da altura do retangulo");
    altura = teclado.nextInt();

    area = base * altura;

    System.out.println("A area do retangulo vale "+area);
    }
}