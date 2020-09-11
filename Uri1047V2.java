import java.util.Scanner;
public class Uri1047V2{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int horaInic, minutoInic, horaFim, minutoFim, Inicio, Fim, Duracao;
        
        horaInic      = teclado.nextInt();
        minutoInic    = teclado.nextInt();
        horaFim       = teclado.nextInt();
        minutoFim     = teclado.nextInt();

        Inicio        = horaInic*60+minutoInic;
        Fim           = horaFim*60+minutoFim;
        Duracao       = Fim-Inicio;

        if (Duracao == 0){
            System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
        }
        else if (Duracao > 0){
            System.out.println("O JOGO DUROU "+(Duracao/60)+" HORA(S) E "+(Duracao%60)+" MINUTO(S)");
        }
        else if (Duracao < 0){
            System.out.println("O JOGO DUROU "+((Duracao+1440)/60)+" HORA(S) E "+((Duracao+1440)%60)+" MINUTO(S)");
        }
    }
}