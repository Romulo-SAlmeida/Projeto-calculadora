package Calculadora;
import java.util.Scanner;
public class CalculadoraComum{
	 Scanner scan = new Scanner(System.in);
	//Metodo da adi��o
	public void adicao(){
		System.out.println("Digite o primeiro valor");
		int a = scan.nextInt();
		System.out.println("   ");
		System.out.println("Digite o segundo valor");
		int b = scan.nextInt();
		System.out.println("   ");
		int c = a+b;
		System.out.println("O valor �: " + c);
	}
	
	//Metodo de subtra��o
	public void subtracao() {
		System.out.println("Digite o primeiro valor");
		int a = scan.nextInt();
		System.out.println("   ");
		System.out.println("Digite o segundo valor");
		int b = scan.nextInt();
		System.out.println("   ");
		int c = a-b;
		System.out.println("O valor �: " + c);
	}
	
	//Metodo de mutiplica��o
	public void mutiplicacao() {
		System.out.println("Digite o primeiro valor");
		int a = scan.nextInt();
		System.out.println("   ");
		System.out.println("Digite o segundo valor");
		int b = scan.nextInt();
		System.out.println("   ");
		int c = a*b;
		System.out.println("O valor �: " + c);
	}
	
	//Metodo de divis�o
	public void divisao() {
		System.out.println("Digite o primeiro valor");
		int a = scan.nextInt();
		System.out.println("   ");
		System.out.println("Digite o segundo valor");
		int b = scan.nextInt();
		 if( b == 0) {
		 System.out.println("O valor �: " + a);
		 }
		System.out.println("   ");
		int c = a/b;
		System.out.println("O valor �: " + c);
		
	}
		
		
	
	
	
	
}