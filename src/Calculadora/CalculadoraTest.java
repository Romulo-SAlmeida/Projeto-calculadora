package Calculadora;
import java.util.Scanner;
import Calculadora.CalculadoraComum;
import Calculadora.Calculadora;
import Calculadora.CalculadoraCientifica;


public class CalculadoraTest {

	public static void main(String[] args) {
	
//Extanciando as classes e metodos
		CalculadoraComum cal3 = new CalculadoraComum();
		Calculadora cal1 = new Calculadora();
		CalculadoraCientifica cal2 = new CalculadoraCientifica(0, 0, 0, 0, 0, 0, 0, 0, 0);
	
		Scanner scan = new Scanner(System.in);

	//Inicio do programa 
		System.out.println("Digite o nome da calculadora que vôce ultilizará\n"
				+ "\nCalculadora comum(Adição, Subtração, Multiplicação, Divisão)"
				+ "\nCalculadora cientifica(Adição, Subtração, Multiplicação, Divisão, Expoente, Raiz"
				+ " Quadrada, Seno, Cosseno, Tangente e Logaritmo) ");
		String tipoCal = scan.next();
//		int tipo = scan.nextInt();
		if(tipoCal.equalsIgnoreCase("calculadora comum")) {
			System.out.println("***Bem vindo***");
		    System.out.println("  ");
		    System.out.println("Escolha o tipo de operação desejada pelo caracter\n");
		    System.out.println("+ = Adição\n"
		    		          +"- = Subtração\n"
		    		          + "* = Multiplicação\n"
		    		          + "/ = Divisão\n");
		    String caracter = scan.next();
		    if(caracter.equals("+") || caracter.equalsIgnoreCase("adição")) {
		    	cal3.adicao();
		    }else if(caracter.equals("-") || caracter.equalsIgnoreCase("subtração")) {
		    	cal3.subtracao();
		    }else if(caracter.equals("*") || caracter.equalsIgnoreCase("multiplicação")) {
		    	cal3.mutiplicacao();
		    }else if (caracter.equals("/") || caracter.equalsIgnoreCase("divisão")) {
		    	cal3.divisao();
		    }
		    
		
		
		
		}else if(tipoCal.equalsIgnoreCase("calculadora cientifica")){
			System.out.println("***Bem vindo***");
			
			
			
		}else {
			System.out.println("Nome incorreto");
		}
		
		
	}

}
