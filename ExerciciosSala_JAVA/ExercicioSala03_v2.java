/*
03 – Faça um algoritmo que leia 2 valores numéricos e um símbolo. 
Caso o símbolo seja um dos relacionados abaixo efetue a operação correspondente com os valores.
	“+”	“-”	“*”	“/”
*/

import java.util.Scanner;

public class ExercicioSala03_v2 {
   
   public static void main(String[] args){
        
        Scanner entrada = new Scanner(System.in);

        double n1, n2;
        char op; 
                
        System.out.println("Informe N1");
        n1 = entrada.nextDouble();
        System.out.println("Informe N2");
        n2 = entrada.nextDouble();
        System.out.println("Informe a operacao (+,-,*,/)");
        entrada.nextLine();
        op = entrada.next().charAt(0);
        
        System.out.println("Op = " + op);
        
        if (op == '+')
            System.out.println("Resultado = " + (n1+n2));
        else
        {
            if (op == '-')
               System.out.println("Resultado = " + (n1-n2)); 
            else
            {
                if (op == '*')
                    System.out.println("Resultado = " + (n1*n2));
                else
                {
                    if (op == '/')
                       System.out.println("Resultado = " + (n1/n2)); 
                    else
                       System.out.println("Oper invalida");
                }
                
            }
        
        }

        
   }

}