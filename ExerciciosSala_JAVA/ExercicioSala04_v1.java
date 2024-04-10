import java.util.Scanner;


public class ExercicioSala04_v1 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        String nome;
        double n1,n2,n3,media;
        
        System.out.println("Informe o nome");
        nome = entrada.nextLine();
        System.out.println("Informe n1");
        n1 = entrada.nextDouble();
        System.out.println("Informe n2");
        n2 = entrada.nextDouble();
        System.out.println("Informe n3");
        n3 = entrada.nextDouble();
        
        int p1 = 3;
        int p2 = 4;
        int p3 = 4;
        
        media = ((n1*p1) + (n2*p2) + (n3*p3))/(p1+p2+p3);
        
        System.out.println("A media de " + nome + " foi " + media);
        
        
        if (media >= 7 && media <= 10)
        {
            System.out.println("Aprovado");
        }
        
        if (media >= 5 && media < 7)
        {
            System.out.println("Recuperacao");
        }
        
        if (media >= 0 && media < 5)
        {
            System.out.println("Reprovado");
        }
        
		
    }
    
}
