/*
02 - Elabore um algoritmo que verifique se um dado número inteiro positivo é par ou ímpar.
*/

import java.util.Scanner;

public class ExercicioSala02 {
   
   public static void main(String[] args){
        
        Scanner entrada = new Scanner(System.in);

        int x;
        
        System.out.println("Informe um valor para x");
        x = entrada.nextInt();
        
        if (x > 0)
        {
            if (x%2 == 0 )
            {
               System.out.println("PAR");
            }
            else
            {
                System.out.println("IMPAR");
            }
        }
        else
        {
            System.out.println("Numero invalido !");
        }

        
   }

}