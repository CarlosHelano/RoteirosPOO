
import java.util.Scanner;

public class ExercicioSala09 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int a, b;
        
        System.out.println("Informe o valor inicial");
        a = entrada.nextInt();
        System.out.println("Informe o valor final");
        b = entrada.nextInt();
        
        if (a > b )
        {
            int aux;
            System.out.println("Intevalo invalido");
            aux = b;
            b = a;
            a = aux;
        }
        
        a++;
        while (a < b)
        {
            System.out.println("numero : " + a);
            a++;
        }
        
    }
}
