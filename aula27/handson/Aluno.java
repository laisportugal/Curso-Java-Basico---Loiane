package aula27.handson;

public class Aluno {

	String nome;
	String matricula;
	String curso;
	String nomeDisciplinas[];
	double notasDisciplinas[][];
	boolean aprovado;

	void mostrarInfo() {
		
		
		System.out.println("Nome: "+nome);
		System.out.println("Matrícula: "+matricula);
		System.out.println("Curso: "+curso);
		
		for (int j = 0; j < notasDisciplinas.length; j++) {
			System.out.println("Notas da disciplina" + nomeDisciplinas[j]);
			for (int i = 0; i < notasDisciplinas.length; i++) {
				System.out.println(notasDisciplinas[j][i] + " ");
			}
			System.out.println();
		}
	}

	boolean verificarAprovado(int indice) {

		if (obterMedia(indice) >= 7) {
			return true;
		}

		return false;
	}

	double obterMedia(int indice) {

		double soma = 0;

		for (int i = 0; i < notasDisciplinas[indice].length; i++) {
			soma += notasDisciplinas[indice][i];
		}

		double media = soma / 4;

		return media;
	}
}
