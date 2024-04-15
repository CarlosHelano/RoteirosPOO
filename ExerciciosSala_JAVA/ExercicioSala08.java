
import java.util.Scanner;

public class ExercicioSala08 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int x;
        
        int soma = 0;
        double media = 0;
        int i;
        
        System.out.println("Informe 10 numeros ");
        for (i = 0; i < 10; i++)
        {
            x = entrada.nextInt();
            soma = soma + x;
            
        }
        System.out.println("Soma : " + soma);
        media = soma/i;
        System.out.println("Media : " + media);
    }
}
