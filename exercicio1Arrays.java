package exercicio1Arrays;

import java.util.*;

public class exercicio1Arrays {
	
	public static void main(String args[])
	{
		//int[] A = new int[6];
		int[] A={1, 0, 5, -2, -5, 7};
		int soma=0;
		//Scanner entrada = new Scanner(System.in);
		
		soma = A[0]+A[1]+A[5];
		
		System.out.println("\nO vetor, inicialmente, possui os seguintes elementos: ");
		for (int i=0;i<A.length;i++)
		{
			System.out.println(A[i]);
		}
		
		System.out.println("\nA soma entre A[0] = "+A[0]+", A[1] = "+A[1]+", A[5] = "+A[5]+", é: "+ soma);
		
		System.out.println("\nModificarei o elemento A[4] e atribuirei o valor de 100, isto é: A[4]=100.");
		
		A[4] = 100;
		
		for (int i=0;i<A.length;i++)
		{
			if (A[i]==A[4])
			{
				System.out.println(A[i]+"\t <-- Valor que foi modificado");
			}
			else
			{
				System.out.println(A[i]);
			}
			
		}
	}

}
