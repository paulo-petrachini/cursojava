import java.util.Scanner;

public class Exercicio2h{
    public static void main(String args[]){
        Scanner teclado;    //declarei um componente do tipo Scanner (chamei de Teclado)
    teclado = new Scanner(System.in);  //Este componente vai ler dados do dispositivo de entrada

    int diametro,altura,raio;

    System.out.println("por favor, digite o diametro do cilindro");
    diametro = teclado.nextInt();

    System.out.println("por favor, digite a altura do cilindro");
    altura = teclado.nextInt();

    double pi, volume;
    pi = 3.14;
    raio = diametro/2;

    volume = pi * raio * raio * altura;

    System.out.println("O volume do cilindro vale "+volume);
    }
}