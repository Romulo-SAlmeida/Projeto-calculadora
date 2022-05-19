package Calculadora;
import java.util.Scanner;
public class CalculadoraComum{
	 Scanner scan = new Scanner(System.in);
	//Metodo da adição
	public void adicao(){
		System.out.println("Digite o primeiro valor");
		int a = scan.nextInt();
		System.out.println("   ");
		System.out.println("Digite o segundo valor");
		int b = scan.nextInt();
		System.out.println("   ");
		int c = a+b;
		System.out.println("O valor é: " + c);
	}
	
	//Metodo de subtração
	public void subtracao() {
		System.out.println("Digite o primeiro valor");
		int a = scan.nextInt();
		System.out.println("   ");
		System.out.println("Digite o segundo valor");
		int b = scan.nextInt();
		System.out.println("   ");
		int c = a-b;
		System.out.println("O valor é: " + c);
	}
	
	//Metodo de mutiplicação
	public void mutiplicacao() {
		System.out.println("Digite o primeiro valor");
		int a = scan.nextInt();
		System.out.println("   ");
		System.out.println("Digite o segundo valor");
		int b = scan.nextInt();
		System.out.println("   ");
		int c = a*b;
		System.out.println("O valor é: " + c);
	}
	
	//Metodo de divisão
	public void divisao() {
		System.out.println("Digite o primeiro valor");
		int a = scan.nextInt();
		System.out.println("   ");
		System.out.println("Digite o segundo valor");
		int b = scan.nextInt();
		 if( b == 0) {
		 System.out.println("O valor é: " + a);
		 }
		System.out.println("   ");
		int c = a/b;
		System.out.println("O valor é: " + c);
		
	}
		
		
	
	
	
	
}