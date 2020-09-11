import java.util.Scanner;
public class Uri1047{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int horaInic, minutoInic, horaFim, minutoFim;
        
        horaInic      = teclado.nextInt();
        minutoInic    = teclado.nextInt();
        horaFim       = teclado.nextInt();
        minutoFim     = teclado.nextInt();

        if (horaInic == horaFim && minutoInic == minutoFim){
            System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
        }
        else if (horaInic == horaFim && minutoFim > minutoInic){
            System.out.println("O JOGO DUROU "+(horaFim-horaInic)+" HORA(S) E "+(minutoFim-minutoInic)+" MINUTO(S)");
        }
        else if (horaInic == horaFim && minutoFim < minutoInic){
            System.out.println("O JOGO DUROU 23 HORA(S) E "+(60-minutoInic+minutoFim)+" MINUTO(S)");
        }
        else if (horaFim > horaInic && minutoFim >= minutoInic) {
            System.out.println("O JOGO DUROU "+(horaFim-horaInic)+" HORA(S) E "+(minutoFim-minutoInic)+" MINUTO(S)");
        }
        else if (horaFim > horaInic && minutoFim < minutoInic) {
            System.out.println("O JOGO DUROU "+(horaFim-horaInic-1)+" HORA(S) E "+(60-minutoInic+minutoFim)+" MINUTO(S)");
        }
        else if (horaFim < horaInic && minutoFim >= minutoInic){
            System.out.println("O JOGO DUROU "+(24-horaInic+horaFim)+" HORA(S) E "+(minutoFim-minutoInic)+" MINUTO(S)");
        }
        else {
            System.out.println("O JOGO DUROU "+(24-horaInic+horaFim-1)+" HORA(S) E "+(60-minutoInic+minutoFim)+" MINUTO(S)");
        }
    }
}