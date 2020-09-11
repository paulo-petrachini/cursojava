import java.util.Scanner;

public class Exercicio2g{
    public static void main(String args[]){
        Scanner teclado;    //declarei um componente do tipo Scanner (chamei de Teclado)
    teclado = new Scanner(System.in);  //Este componente vai ler dados do dispositivo de entrada

    int volume,lado;

    System.out.println("por favor, digite o valor do lado do cubo");
    lado = teclado.nextInt();

    volume = lado * lado * lado;

    System.out.println("O volume do cubo vale "+volume);
    }
}