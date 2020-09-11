import java.util.Scanner;
public class Uri1041{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        double coord1,coord2;
        
        coord1      = teclado.nextDouble();
        coord2      = teclado.nextDouble();


        if (coord1 == 0.0 && coord2 == 0.0){
            System.out.println("Origem");
        }
        else if (coord2 == 0.0){
            System.out.println("Eixo X");
        }
        else if (coord1 == 0.0){
            System.out.println("Eixo Y");
        }
        else if (coord1 > 0.0 && coord2 > 0.0){
            System.out.println("Q1");
        }
        else if (coord1 < 0.0 && coord2 > 0.0){
            System.out.println("Q2");
        }
        else if (coord1 < 0.0 && coord2 < 0.0){
            System.out.println("Q3");
        }
        else
            System.out.println("Q4");
                
    } 
}