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
		System.out.println("Digite o nome da calculadora que v�ce ultilizar�\n"
				+ "\nCalculadora comum(Adi��o, Subtra��o, Multiplica��o, Divis�o)"
				+ "\nCalculadora cientifica(Adi��o, Subtra��o, Multiplica��o, Divis�o, Expoente, Raiz"
				+ " Quadrada, Seno, Cosseno, Tangente e Logaritmo) ");
		String tipoCal = scan.next();
//		int tipo = scan.nextInt();
		if(tipoCal.equalsIgnoreCase("calculadora comum")) {
			System.out.println("***Bem vindo***");
		    System.out.println("  ");
		    System.out.println("Escolha o tipo de opera��o desejada pelo caracter\n");
		    System.out.println("+ = Adi��o\n"
		    		          +"- = Subtra��o\n"
		    		          + "* = Multiplica��o\n"
		    		          + "/ = Divis�o\n");
		    String caracter = scan.next();
		    if(caracter.equals("+") || caracter.equalsIgnoreCase("adi��o")) {
		    	cal3.adicao();
		    }else if(caracter.equals("-") || caracter.equalsIgnoreCase("subtra��o")) {
		    	cal3.subtracao();
		    }else if(caracter.equals("*") || caracter.equalsIgnoreCase("multiplica��o")) {
		    	cal3.mutiplicacao();
		    }else if (caracter.equals("/") || caracter.equalsIgnoreCase("divis�o")) {
		    	cal3.divisao();
		    }
		    
		
		
		
		}else if(tipoCal.equalsIgnoreCase("calculadora cientifica")){
			System.out.println("***Bem vindo***");
			
			
			
		}else {
			System.out.println("Nome incorreto");
		}
		
		
	}

}
