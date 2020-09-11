import java.util.Scanner;

public class Exercicio2a{
    public static void main(String args[]){
    Scanner teclado;    //declarei um componente do tipo Scanner (chamei de Teclado)
    teclado = new Scanner(System.in);   //Este componente vai ler dados do dispositivo de entrada

    int lado,area;

    System.out.println("por favor, digite o valor do lado do quadrado");
    lado = teclado.nextInt();

    area = lado * lado;

    System.out.println("A area do quadrado vale "+area);
    }
}