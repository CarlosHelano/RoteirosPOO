

import java.util.Scanner;

public class ExemploVetor {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in); 
        
        int max = 10;
        int vetor[] = new int[max];

        int x;
        int soma = 0;
        for (int i = 0; i < max; i++)
        {
            System.out.println("Informe um numero");
            
            x = entrada.nextInt();
            if (x >= 0 && x <=10)
            {
              vetor[i] = x;
              soma = soma + x;
            }
            else
            {
                System.out.println("Nota invalida");
                i--;
            }
            
        }
        
        System.out.println("Soma = " + soma);
        double media = (double)soma/max;
        System.out.println("Media = " + media);
        

        System.out.println("Imprimindo todo o vetor");
        for (int i=0; i< max ; i++)
        {
              System.out.println("Posicao "+ i + " = " + vetor[i]);
        }


        int contAcima = 0;
        System.out.println("Imprimindo notas acima da media");
        for (int i=0; i< max ; i++)
        {
            if (vetor[i] > media)
            {
              System.out.println("Posicao "+ i + " = " + vetor[i]);
              contAcima++;
            }
        }
        System.out.println("contAcima = " + contAcima);
        
        
    }
    
}
