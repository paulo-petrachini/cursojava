import java.util.Scanner;

public class Uri1154{
    public static void main(String args[]){
        
        Scanner teclado = new Scanner(System.in);
        int valor;
        double somaIdade, totPessoas, mediaIdades;

        valor = 0;
        somaIdade = 0.0;
        totPessoas = 0.0;
        mediaIdades = 0.0;

        while (valor >= 0){
            valor = teclado.nextInt();
            if (valor >= 0){
                somaIdade = somaIdade + valor;
                totPessoas = totPessoas + 1;
            }
        }
        mediaIdades = somaIdade/totPessoas;
        System.out.printf("%.2f\n",mediaIdades);
    }
}