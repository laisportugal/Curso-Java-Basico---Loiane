package aula36.labs;

import java.util.Scanner;

public class Aluno {
	private String nome;
	private String matricula;
	private double[] notas;
	public double[] getNotas() {
		return notas;
	}

	public void setNotas(double[] notas) {
		this.notas = notas;
	}

	Scanner scan = new Scanner(System.in);
	private boolean aprovado;

	public boolean isAprovado() {
		return aprovado;
	}

	public void setAprovado(boolean aprovado) {
		this.aprovado = aprovado;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	
	public String obterInfo() {

		String info = "Nome Aluno = " + nome + "; ";
		info += "Matricula = " + matricula + "; ";
		info += "Notas: ";

		double soma = 0;
		for (double nota : notas) {
			soma += nota;
			info += nota + " ";
		}
		double media = soma / 4;
		info += "\n" + "Média = " + media + " - ";
		if (media >= 7) {
			info += "Aprovado!";
		} else {
			info += "Reprovado!";
		}

		return info;
	}

	public double obterMedia() {
		double soma = 0;
		for (double nota : notas) {
			soma += nota;
		}
		return soma / 4;
	}
	
	

}
