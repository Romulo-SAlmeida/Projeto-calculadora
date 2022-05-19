package Calculadora;

import java.util.Scanner;

public class Calculadora {
    Scanner scan = new Scanner(System.in); 
	private int adicao,subtracao, divisao, mutiplicacao;

	public int getAdicao() {
		return adicao;
	}

	public void setAdicao(int adicao) {
		this.adicao = adicao;
	}
	

	public int getSubtracao() {
		
		return subtracao;
	}

	public void setSubtracao(int subtracao) {
		this.subtracao = subtracao;
	}

	public int getDivisao() {
		return divisao;
	}

	public void setDivisao(int divisao) {
		this.divisao = divisao;
	}

	public int getMutiplicacao() {
		return mutiplicacao;
	}

	public void setMutiplicacao(int mutiplicacao) {
		this.mutiplicacao = mutiplicacao;
	}
	
}
