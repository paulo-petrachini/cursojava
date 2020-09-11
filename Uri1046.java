import java.util.Scanner;
public class Uri1046{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int horaInic, horaFim;
        
        horaInic      = teclado.nextInt();
        horaFim       = teclado.nextInt();

        if (horaInic == horaFim){
            System.out.println("O JOGO DUROU 24 HORA(S)");
        }
        else if (horaFim > horaInic) {
            System.out.println("O JOGO DUROU "+(horaFim-horaInic)+" HORA(S)");
        }
        else {
            System.out.println("O JOGO DUROU "+(24-horaInic+horaFim)+" HORA(S)");
        }
    } 
}