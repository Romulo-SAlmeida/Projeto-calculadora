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
	
	//Metodo de raiz
	public void raiz() {
		int raiz = 0;
		System.out.println("Digite o valor da raiz");
		int valor = scan.nextInt();
		raiz = (int) Math.sqrt(valor);
		System.out.println("O resultado é "+ raiz);
	}
	
	//Metodo da potencia
	public void potencia() {
		System.out.print("Digite o valor da base: ");
        double a = scan.nextDouble();
        System.out.println("Digite o valor do expoente: ");
        double b = scan.nextDouble();

        System.out.println("Resultado: " + Math.pow(a, b));
    }
	
	//Metodo de seno
	public void seno() {
		System.out.print("\nDigite o angulo: ");
        int angulo = scan.nextInt();
        double rad = (Math.PI/180) * angulo;
        double seno = Math.sin(rad);
        System.out.println("\nO Seno do angulo " + angulo + " e: " + Math.sin(rad));
        System.out.print("\nDigite a Hipotenusa: ");
        double hip = scan.nextDouble();
        System.out.println("\nO Resultado final e: " + seno * hip );
	}
		
	//Metodo do Cosseno
	public void cosseno() {
		System.out.print("\nDigite o angulo: ");
        int angulo = scan.nextInt();
        double rad = (Math.PI/180) * angulo;
        double cosseno = Math.cos(rad);
        System.out.println("\nO Cosseno do angulo " + angulo + " e: " + Math.cos(rad));
        System.out.print("\nDigite a Hipotenusa: ");
        double hip = scan.nextDouble();
        System.out.println("\nO Resultado final e: " + cosseno * hip );
	}
	
	//Metodo da tangente
	public void tangente() {
		System.out.print("\nDigite o angulo: ");
        int angulo = scan.nextInt();
        double rad = (Math.PI/180) * angulo;
        double tangente = Math.tan(rad);
        System.out.println("\nA Tangente do angulo " + angulo + " e: " + Math.tan(rad));
        System.out.print("\nDigite o Cateto Adjacente: ");
        double ca = scan.nextDouble();
        System.out.println("\nO Resultado final e: " + tangente * ca );
	}
	//Metodo de logaritmo
	public void logartimo() {
		   System.out.println("Informe um número inteiro: ");
	       int numero = scan.nextInt();

	        if (numero <= 0) {
	            System.out.println("Número invalido");
	        } else {
	            double logaritmo = Math.log(numero);
	            System.out.println("Logaritmo de " + numero + " = " + logaritmo);
	        }
	}
		
	
	
	
	
}