import java.util.Scanner;

public class Exercicio2f{
    public static void main(String args[]){
        Scanner teclado;    //declarei um componente do tipo Scanner (chamei de Teclado)
    teclado = new Scanner(System.in);  //Este componente vai ler dados do dispositivo de entrada

    int volume,altura,largura,profundidade;

    System.out.println("por favor, digite o valor da altura do paralelepipedo");
    altura = teclado.nextInt();

    System.out.println("por favor, digite o valor da largura do paralelepipedo");
    largura = teclado.nextInt();

    System.out.println("por favor, digite o valor da profundidade do paralelepipedo");
    profundidade = teclado.nextInt();

    volume = altura * largura * profundidade;

    System.out.println("O volume do paralelepipedo vale "+volume);
    }
}
