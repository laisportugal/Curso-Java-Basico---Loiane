package aula33.handson;

public class Aluno {
	private String nome;
	private String matricula;
	private String curso;
	private String nomeDisciplinas[];
	private double notasDisciplinas[][];
	private boolean aprovado;

	
	public Aluno() {
		this.nomeDisciplinas = new String[3];
		this.notasDisciplinas = new double[3][4];
	}

	public Aluno(String nome, String matricula, String curso, String[] nomeDisciplinas, double[][] notasDisciplinas,
			boolean aprovado) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.curso = curso;
		this.nomeDisciplinas = nomeDisciplinas;
		this.notasDisciplinas = notasDisciplinas;
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

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String[] getNomeDisciplinas() {
		return nomeDisciplinas;
	}

	public void setNomeDisciplinas(String[] nomeDisciplinas) {
		this.nomeDisciplinas = nomeDisciplinas;
	}

	public double[][] getNotasDisciplinas() {
		return notasDisciplinas;
	}

	public void setNotasDisciplinas(double[][] notasDisciplinas) {
		this.notasDisciplinas = notasDisciplinas;
	}

	public boolean isAprovado() {
		return aprovado;
	}

	public void setAprovado(boolean aprovado) {
		this.aprovado = aprovado;
	}

	public void mostrarInfo() {

		System.out.println("Nome: " + nome);
		System.out.println("Matr�cula: " + matricula);
		System.out.println("Curso: " + curso);

		for (int j = 0; j < notasDisciplinas.length; j++) {
			System.out.println("Notas da disciplina" + nomeDisciplinas[j]);
			for (int i = 0; i < notasDisciplinas.length; i++) {
				System.out.println(notasDisciplinas[j][i] + " ");
			}
			System.out.println();
		}
	}

	public boolean verificarAprovado(int indice) {

		if (obterMedia(indice) >= 7) {
			return true;
		}

		return false;
	}

	private  double obterMedia(int indice) {

		double soma = 0;

		for (int i = 0; i < notasDisciplinas[indice].length; i++) {
			soma += notasDisciplinas[indice][i];
		}

		double media = soma / 4;

		return media;
	}
	
	public void setnomeDisciplinaPos (int pos, String nomeDisciplina) {
		this.nomeDisciplinas[pos]= nomeDisciplina;
	}
	
	public void setnotaDisciplinaPos (int posI, int posJ, double nota) {
		this.notasDisciplinas[posI][posJ]= nota;
	}
}
