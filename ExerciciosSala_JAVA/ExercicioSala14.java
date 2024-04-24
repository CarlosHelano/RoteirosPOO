/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulas;

import java.util.Scanner;

public class ExercicioSala14 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in); 
        
        int max = 10;
        int vetor[] = new int[max]; 
        
        for (int i = 0; i < max; i++)
        {
            System.out.println("Informe um numero");
            vetor[i] = entrada.nextInt();
        }
        
        
        System.out.println("Informe um numero para pesquisa");
        int p;
        p = entrada.nextInt();

        int contPertence = 0;
        for (int i = 0; i < max ; i++)
        {
           if (p == vetor[i])
           { 
               contPertence++;
           }
        }
        
        if (contPertence > 0)
        {
            System.out.println("Pertence");
        }
        else
        {
            System.out.println("Não Pertence");
        }
        
    }
    
}
