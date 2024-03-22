/*
01 - Faça um programa que receba o salário-base de um funcionário, 
 calcule e mostre o salário a receber. 
 Sabendo-se que esse funcionário tem gratificação de 5% sobre o salário-base
 e paga imposto de 7% também sobre o salário-base.
*/

#include <stdio.h>

main()
{
	float sb, imp, grat, sr;
	
	printf("Informe o valor do salario");
	scanf("%f", &sb);
	
	imp = sb * 7/100;
	grat = sb * 5/100;
	sr = sb + grat - imp;
	
	printf("%f", sr);
}