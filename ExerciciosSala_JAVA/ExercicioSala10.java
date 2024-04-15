
import java.util.Scanner;

public class ExercicioSala10 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int x;
        int contp = 0;
        int contn = 0;
        int somap = 0;
        int soman = 0;
        
        System.out.println("Informe o PRIMEIRO numero ou zero(0) para interromper");
        x = entrada.nextInt();
        
        while ( x != 0)
        {
            if (x > 0)
            {
                contp++;
                somap = somap + x;
            }
            else
            {
                contn++;
                soman = soman + x;
            }
            System.out.println("Informe o PROXIMO numero ou zero(0) para interromper");
            x = entrada.nextInt();
        }
        System.out.println("Qtde de positivos : " + contp);
        System.out.println("Qtde de negativos : " + contn);
        System.out.println("Soma dos positivos : " + somap);
        System.out.println("Soma dos negativos : " + soman);

        
    }
    
}
