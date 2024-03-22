/*
01 - Faça um programa que receba o salário-base de um funcionário, 
 calcule e mostre o salário a receber. 
 Sabendo-se que esse funcionário tem gratificação de 5% sobre o salário-base
 e paga imposto de 7% também sobre o salário-base.
*/

import java.util.Scanner;

public class ExercicioSala01 {
   
   public static void main(String[] args){
        
        Scanner entrada = new Scanner(System.in);

        double sb, imp, grat, sr;
	
	System.out.println("Informe o valor do salario");
	sb = entrada.nextDouble();
	
	imp = sb * 7/100;
	grat = sb * 5/100;
	sr = sb + grat - imp;
	
	System.out.println("Salario a receber = "+sr); 
   }

}