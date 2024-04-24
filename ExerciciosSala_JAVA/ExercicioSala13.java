/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulas;

import java.util.Scanner;

public class ExercicioSala13 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in); 
        
        int max = 10;
        int vetor[] = new int[max];

        int x;
        int soma = 0;
        int i = 0;
        while (i < max)
        {
            System.out.println("Informe um numero");
            
            x = entrada.nextInt();
            if (x >= 0 && x <=10)
            {
              vetor[i] = x;
              soma = soma + x;
              i++;
            }
            else
            {
                System.out.println("Nota invalida");
            }
            
        }
        
        System.out.println("Soma = " + soma);
        double media = (double)soma/max;
        System.out.println("Media = " + media);
        

        System.out.println("Imprimindo todo o vetor");
        for ( i=0; i< max ; i++)
        {
              System.out.println("Posicao "+ i + " = " + vetor[i]);
        }


        int contAcima = 0;
        System.out.println("Imprimindo notas acima da media");
        for ( i=0; i< max ; i++)
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
