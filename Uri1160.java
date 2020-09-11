import java.util.Scanner;

public class Uri1160{
    public static void main(String args[]){
        
        Scanner teclado = new Scanner(System.in);
        int casosTeste, contador, pA, pB, ano;
        double gA, gB;

        casosTeste = teclado.nextInt();

        pA = 0;
        pB = 0;
        gA = 0.0;
        gB = 0.0;
        ano = 0;
                
        for (contador = 1; contador <=casosTeste; contador = contador +1){
            pA = teclado.nextInt();
            pB = teclado.nextInt();
            gA = teclado.nextDouble();
            gB = teclado.nextDouble();
            ano = 1;
            for (ano = 1; ano <= 100; ano = ano+1){
                pA = (int)(pA*(1.0+(gA/100.0)));
                pB = (int)(pB*(1.0+(gB/100.0)));
                if (pA > pB){
                    System.out.println(ano+" anos.");
                    ano = 999;
                }
            }
            if (ano == 101){
                System.out.println("Mais de 1 seculo.");
            }
        }
    }
}