package arrays4Exercicio;

import java.util.Scanner;

public class arrays4Exercicio {

	public static void main(String[] args) {
		double [][]A = new double[2][2];
		double [][]B = new double[2][2];
		double [][]C = new double[2][2];
		double constante;
		int opcao;
		Scanner entrada = new Scanner(System.in);

		for(int l=0;l<2;l++)
		{
			for(int c=0;c<2;c++)
			{
				System.out.printf("Entre com o elemento A[%d][%d] da matriz: ",l+1,c+1);
				A[l][c]=entrada.nextDouble();
			}
		}
		for(int l=0;l<2;l++)
		{
			for(int c=0;c<2;c++)
			{
				System.out.printf("Entre com o elemento B[%d][%d] da matriz: ",l+1,c+1);
				B[l][c]=entrada.nextDouble();
			}
		}
		System.out.println("\nDigite uma opção de escolha: \n1-Soma de matrizes;\n2-Subtração de matizes;\n3-Soma de constante a matriz;\n4-Imprimir matrizes.");
		opcao = entrada.nextInt();
		
		while(opcao<1 || opcao>4)
		{
			System.out.println("\nOpção inválida!");
			System.out.println("Digite uma opção de escolha: \n1-Soma de matrizes;\n2-Subtração de matizes;\n3-Soma de constante a matriz;\n4-Imprimir matrizes.");
			opcao = entrada.nextInt();
		}
		
		switch(opcao)
		{
		case 1 :
			System.out.println("A matriz C resultante da soma entre A e B é: ");
			for(int l=0;l<2;l++)
			{
				for(int c=0;c<2;c++)
				{
					C[l][c]=A[l][c]+B[l][c];
					System.out.printf("\t"+C[l][c]+"\t");
				}
				System.out.println();
			}
			break;
			
		case 2 :
			System.out.println("A matriz C resultante da subtração entre A e B é: ");
			for(int l=0;l<2;l++)
			{
				for(int c=0;c<2;c++)
				{
					C[l][c]=A[l][c]-B[l][c];
					System.out.printf("\t"+C[l][c]+"\t");
				}
				System.out.println();
			}
			break;
			
		case 3:
			System.out.println("Entre com um valor de constante: ");
			constante = entrada.nextDouble();
			System.out.println("\nA matriz A resultante é: ");
			for(int l=0;l<2;l++)
			{
				for(int c=0;c<2;c++)
				{
					A[l][c]=A[l][c]+constante;
					System.out.printf("\t"+A[l][c]+"\t");
				}
				System.out.println();
			}
			System.out.println("\nA matriz B resultante é: ");
			for(int l=0;l<2;l++)
			{
				for(int c=0;c<2;c++)
				{
					B[l][c]=B[l][c]+constante;
					System.out.printf("\t"+B[l][c]+"\t");
				}
				System.out.println();
			}
			break;
			
		case 4:
			System.out.println("\nA matriz A é: ");
			for(int l=0;l<2;l++)
			{
				for(int c=0;c<2;c++)
				{
					System.out.printf("\t"+A[l][c]+"\t");
				}
				System.out.println();
			}
			System.out.println("\nA matriz A é: ");
			for(int l=0;l<2;l++)
			{
				for(int c=0;c<2;c++)
				{
					System.out.printf("\t"+B[l][c]+"\t");
				}
				System.out.println();
			}
			break;
		}
	}
}
