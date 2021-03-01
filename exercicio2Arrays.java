package exercicio2Arrays;

import java.util.Scanner;

public class exercicio2Arrays {

	public static void main(String[] args) {
		
		int[] vetor = new int[6];
		int[] par = new int[6];
		int[] impar = new int[6];
		int contpar=0,contimpar=0;
		double somageral=0.0,somapar=0.0,somaimpar=0.0,mediageral,mediapar,mediaimpar;
		Scanner entrada= new Scanner(System.in);
		
		for(int i=0; i < 6;i++)
		{
			System.out.println("Entre com um número: ");
			vetor[i]=entrada.nextInt();
		}
		for(int i=0; i <vetor.length; i++)
		{
			somageral = somageral + vetor[i];
			
			if(vetor[i]%2==0)
			{
				par[contpar]=vetor[i];
				somapar=somapar+par[contpar];
				contpar++;
			}
			else
			{
				impar[contimpar]=vetor[i];
				somaimpar=somaimpar+impar[contimpar];
				contimpar++;
			}
		}
		mediageral = somageral/vetor.length;
		mediapar = somapar/contpar;
		mediaimpar = somaimpar/contimpar;
		
		System.out.println("A soma dos números digitados é: "+somageral);
		System.out.println("A média dos números digitados é: "+mediageral);
		
		System.out.println("\nNúmeros pares digitados: ");
		for(int i=0; i<contpar; i++)
		{
			System.out.println(par[i]);
		}
		System.out.println("\nA soma dos pares digitados é: "+somapar);
		System.out.println("A média dos pares digitados é: "+mediapar);
		
		
		System.out.println("\nNúmeros ímpares digitados: ");
		for(int i=0; i<contimpar; i++)
		{
			System.out.println(impar[i]);
		}
		System.out.println("\nA soma dos ímpares digitados é: "+somaimpar);
		System.out.println("A média dos ímpares digitados é: "+mediaimpar);
		
	}

}
