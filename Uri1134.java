import java.util.Scanner;

public class Uri1134{
    public static void main(String args[]){
        
        Scanner teclado = new Scanner(System.in);
        int valor,totAlcool,totGasolina,totDiesel;
        valor = 5;
        totAlcool = 0;
        totGasolina = 0;
        totDiesel = 0;

        while (valor != 4){
            valor = teclado.nextInt();
            if (valor == 1){
                totAlcool = totAlcool + 1;
            }
            else if (valor == 2){
                totGasolina = totGasolina + 1;
            }
            else if (valor == 3){
                totDiesel = totDiesel + 1;
            }
        }
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: "+totAlcool);
        System.out.println("Gasolina: "+totGasolina);
        System.out.println("Diesel: "+totDiesel);
    }
}