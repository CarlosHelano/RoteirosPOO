import java.util.Scanner;

public class ExercicioSala06_v1 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int n1,n2,n3;
        
        System.out.println("Informe n1");
        n1 = entrada.nextInt();
        System.out.println("Informe n2");
        n2 = entrada.nextInt();
        System.out.println("Informe n3");
        n3 = entrada.nextInt();
        
        if (n1 < n2 && n1 < n3)
        {
            System.out.println("Menor : " + n1);
        }

        if (n2 < n1 && n2 < n3)
        {
            System.out.println("Menor : " + n2);
        }

        if (n3 < n1 && n3 < n2)
        {
            System.out.println("Menor : " + n3);
        }
        
    }
}
