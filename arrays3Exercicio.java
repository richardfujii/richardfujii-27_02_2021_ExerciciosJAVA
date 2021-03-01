package arrays3Exercicio;

import java.util.Scanner;

public class arrays3Exercicio {

	public static void main(String[] args) {
		
			double [][]A = new double[3][3];
			int cont=0;
			Scanner entrada = new Scanner(System.in);
			
			for(int l=0;l<3;l++)
			{
				for(int c=0;c<3;c++)
				{
					System.out.println("Digite um número: ");
					A[l][c] = entrada.nextDouble();
				}
			}
			for(int l=0;l<3;l++)
			{
				for(int c=0;c<3;c++)
				{
					if(A[l][c]>10)
					{
						cont++;
						System.out.println("O elemento A["+l+"]["+c+"] = "+A[l][c]+" é maior que 10.");
					}
				}
			}
			System.out.println("Existem "+cont+" elementos maiores que 10.");
	}

}
