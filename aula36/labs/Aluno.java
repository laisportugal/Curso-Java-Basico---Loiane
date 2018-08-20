package aula36.labs;

import java.util.Scanner;

public class Aluno {
	private String nome;
	private String matricula;
	private int[] notas;
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

	public int[] getNotas() {
		return notas;
	}

	public void setNotas(int[] notas) {
		this.notas = notas;
	}

	public double media(double media, double soma) {

		for (int i = 0; i < notas.length; i++) {
			System.out.println("Digite a nota " + i);
			soma = soma + notas[i];
		}
		media = soma / notas.length;
		System.out.println("A média do aluno é" + media);

		if (media >= 7) {
			setAprovado(true);
			System.out.println("Aluno aprovado");
		} else {
			setAprovado(false);
			System.out.println("Aluno reprovado");

		}
		return media;
	}
	
	

}
