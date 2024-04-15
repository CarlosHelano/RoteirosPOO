
import java.util.Scanner;


public class ExercicioSala11 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        double nota;
        double menor, maior;
        int cont = 0;
        double soma = 0;
        double media = 0;
        
        System.out.println("Informe uma nota ou -1 pata interromper");
        nota = entrada.nextDouble();
        
        menor = nota;
        maior = nota;
        
        while (nota != -1)
        {
            soma = soma + nota;
            cont++;
            
            if (nota < menor)
            {
                menor = nota;
            }
            
            if (nota > maior)
            {
                maior = nota;
            }
            
            System.out.println("Informe PROXIMA nota ou -1 pata interromper");
            nota = entrada.nextDouble();
        }
        
        if (cont > 0)
        {
          media = soma/cont;
          System.out.println("Media : " + media);
          System.out.println("Menor : " + menor);
          System.out.println("Maior : " + maior);
        }
        else
        {
            System.out.println("Não tivemos notas");
        }

        System.out.println("Cont : " + cont);
        System.out.println("Soma : " + soma);
        
        
        
        
    }
    
}
